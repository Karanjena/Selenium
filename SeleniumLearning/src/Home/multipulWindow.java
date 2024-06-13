package Home;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipulWindow {

	
		public static void main(String[] args) throws InterruptedException {

			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://demowebshop.tricentis.com/");
			String parentwindow = driver.getWindowHandle();
			// click on the facebook link on the webpage
			driver.findElement(By.linkText("Facebook")).click();
			Thread.sleep(3000);

			Set<String> allwindow = driver.getWindowHandles();

			for (String window : allwindow) {
				driver.switchTo().window(window);
				if (driver.getTitle().contains("Facebook")) {
					break;
				}
			}
			driver.switchTo().window(parentwindow);		
			driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
			driver.findElement(By.xpath("//input[@value='Search']")).click();
			driver.close();

		}


	}


