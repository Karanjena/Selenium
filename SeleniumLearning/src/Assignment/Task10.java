package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class Task10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Karan");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("Jena");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("karanjena234@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("Karan@123");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Karan@123");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
	}

}
