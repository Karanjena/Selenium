package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseTheIdLocators {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("9337671293");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Sonu@000");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		

	}

}
