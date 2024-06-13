package Pratices;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo6thTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com/");

		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("")).click();
		
		Set<String> allwindow = driver.getWindowHandles();
		for(String id:allwindow) {
			if(!id.equals(parent)) {
				driver.switchTo().window(id);
			}
		}
		
		
		
	}

}
