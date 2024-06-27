package Home;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLunchTheEmptyBrowser {

	public static void main(String[] args){
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("SeleniumM3@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.linkText("My account")).click();
		WebElement actualData = driver.findElement(By.xpath("//h1[text()='My account - Customer info']"));
		System.out.println(actualData.getText());
		
		driver.quit();
		
	}
}
