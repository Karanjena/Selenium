package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseTheNameLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Karan@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Karan@123");
	}

}
