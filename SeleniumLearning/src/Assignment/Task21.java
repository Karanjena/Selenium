package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task21 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement un = driver.findElement(By.name("username"));
		un.sendKeys("karanjena");
		un.sendKeys(Keys.CONTROL +"a");
		un.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Show']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Hide']")).sendKeys(Keys.ENTER);
		
	}

}
