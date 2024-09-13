package Home;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemowebShop_Register {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://radaruat.sisainfosec.com/");
		driver.findElement(By.xpath("//input[@id='usernameOrEmailAddress']")).sendKeys("selenium@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//button[@id='LoginButton']")).click();
		
		driver.close();
	}
}
