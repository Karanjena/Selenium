package Home;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Polar_Bear {

	public static void main(String[] args) throws InterruptedException {
		 
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://polarbear.co.in/franchisee/");
		Thread.sleep(2000);
		String Title = driver.getTitle();
		Thread.sleep(2000);
		System.out.println(Title);
		Thread.sleep(2000);
		driver.close();
	}
}
