package Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.get("https://demoapps.qspiders.com/?scenario=1");

		
		
		driver.findElement(By.linkText("Link")).click(); 
		///Bug in Deafult link
		//Not Working Back
		driver.findElement(By.linkText("Contact Us")).click();
		driver.navigate().back();
//		driver.findElement(By.linkText("About Us")).click();		
//		driver.navigate().back();
//		driver.findElement(By.linkText("Career")).click();	
//		driver.navigate().back();
//		driver.findElement(By.linkText("Payments")).click();	
//		driver.navigate().back();
//		driver.findElement(By.linkText("Shippings")).click();	
//		driver.navigate().back();
//		driver.findElement(By.linkText("Cancellation & Returns")).click();		
//		driver.navigate().back();
//		driver.findElement(By.linkText("FAQ")).click();		
//		driver.navigate().back();
//		driver.findElement(By.linkText("Return Policy")).click();		
//		driver.navigate().back();
//		driver.findElement(By.linkText("Terms of use")).click();	
//		driver.navigate().back();
//		driver.findElement(By.linkText("Security")).click();		
//		driver.navigate().back();
//		driver.findElement(By.linkText("Privacy")).click();		
//		driver.navigate().back();
//		driver.findElement(By.linkText("Facebook")).click();		
//		driver.navigate().back();
//		driver.findElement(By.linkText("Twitter")).click();		
//		driver.navigate().back();
//    	driver.findElement(By.linkText("Youtube")).click();		
//   	driver.navigate().back();
	
//		driver.findElement(By.linkText("Link in New Tab")).click();
//		driver.findElement(By.linkText("Contact Us")).click();
	
	}

}
