package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClearMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm");
		Thread.sleep(4000);
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("Karan");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("Karan@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
