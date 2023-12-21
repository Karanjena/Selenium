package Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public static void main(String[] args) {
		

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

	driver.get("https://demoapps.qspiders.com/?scenario=1");
	
	
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sonujena256@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Karan@000");
	driver.findElement(By.xpath("//button[@type='submit']")).submit();

	
	}
}
