package Pratices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Zomato {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/india");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Karan Jena']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h5[text()='Bengaluru Restaurants']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Karan']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Profile']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[text()='My addresses']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Add address']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='CHANGE']")).click();
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Start typing to search']"));
		search.sendKeys("Murgeshpalya"+ Keys.ENTER);
	}

}
