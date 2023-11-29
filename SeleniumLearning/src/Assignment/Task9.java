package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/free-online-trial");
		Thread.sleep(3000);
		driver.findElement(By.id("FirstName")).sendKeys("Karan");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("Jena");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("karan8386@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Company")).sendKeys("Tatamotors");
		
	}
	

}
