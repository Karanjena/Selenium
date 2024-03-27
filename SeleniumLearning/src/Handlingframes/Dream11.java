package Handlingframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dream11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.dream11.com/");

		// driver.switchTo().frame(0);
		// driver.switchTo().frame("send-sms-iframe");
		WebElement frame = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("regEmail")).sendKeys("9337671293");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("About Us"));
	}

}
