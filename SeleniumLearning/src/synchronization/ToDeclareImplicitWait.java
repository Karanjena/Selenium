package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToDeclareImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.name("username")).sendKeys("Karanjena");
		driver.findElement(By.name("password")).sendKeys("Karan@123");
	}

}
