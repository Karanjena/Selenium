package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathByIndex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.dunzo.com/bangalore");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[text()='Search']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Search for item or a store']")).sendKeys("Mango");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//p[text()='Maaza Mango Juice'])[3]/../..//button[text()='ADD']")).click();
	}

}
