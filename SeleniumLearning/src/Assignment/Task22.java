package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task22 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.xpath("//option[@value='25']")).click();
		driver.findElement(By.xpath("(//option[@value='3'])[2]")).click();
		driver.findElement(By.xpath("//option[@value='2001']")).click();
		
	}
}
