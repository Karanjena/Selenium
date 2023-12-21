package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleWoodenSteelPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.id("loginclose1")).click();
		
		String parent = driver.getWindowHandle();
		
		driver.findElement(By.linkText("Stores")).click();
		
		 Set<String> allwindiwids = driver.getWindowHandles();
		 for(String id:allwindiwids) {
			 if(!id.equals(parent)) {
				 driver.switchTo().window(id);
			 }
		 }
		driver.findElement(By.partialLinkText("Bangalore")).click();
	 
	}

}
