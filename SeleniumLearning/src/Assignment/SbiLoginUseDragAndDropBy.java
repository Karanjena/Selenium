package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SbiLoginUseDragAndDropBy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		driver.findElement(By.id("password")).sendKeys("Karan@123");
		WebElement eyebutton= driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		
		 Actions action=new Actions(driver);
		action.moveByOffset(1212, 302).perform();
		 
		 //action.clickAndHold(eyebutton).perform();
		 //Thread.sleep(3000);
		// action.release(eyebutton).perform();
	}

}
