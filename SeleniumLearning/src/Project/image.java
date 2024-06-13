package Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class image {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		System.out.println("Successfully navigate the login page");
		
		driver.findElement(By.xpath("//button[text()='Quick Start']")).click();
		System.out.println("Successfully click on Quick Start");
		
		driver.findElement(By.xpath("//section[text()='Image']")).click();
		
		
		
		//Link Image
		driver.findElement(By.linkText("Link Image")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@alt='broken image'])[1]")).click();
		WebElement image1 = driver.findElement(By.xpath("//h1[text()='This is men clothing section']"));
		System.out.println(image1);
		
		
	}

}
