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
		
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Karan");
		driver.findElement(By.id("LastName")).sendKeys("Jena");
		driver.findElement(By.id("Email")).sendKeys("sonujena657@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Karan@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Karan@123");
		driver.findElement(By.id("register-button")).click();
		driver.close();
	}
}
