package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(5000);   
		//driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		
	
	}

}
