package Handlingframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class W3Schools {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//iframe[@id='iframeResult']")).click();
	}

}
