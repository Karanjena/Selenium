package Pratices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//FirefoxDriver driver=new FirefoxDriver();
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("I am so lonely");
		driver.findElement(By.id("search-icon-legacy")).click();
		driver.findElement(By.xpath("//a[@title=\"Arash  I am So Lonely Slowed x Reverbed Version || Full Chill Music\"]")).click();
		driver.findElement(By.xpath("//button[@aria-label=\"Clear search query\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("zara zara bahekta hai");
		driver.findElement(By.id("search-icon-legacy")).click();
		driver.findElement(By.xpath("//a[@title=\"Zara Zara Bahekta Hai | JalRaj | RHTDM | Male Version | Latest Hindi Cover 2020\"]")).click();
	   
	    for(;;) {
	    try {
	    	 driver.findElement(By.id("ad-text:7")).click();
			 break;

			
	    }	
			catch(Exception e) {
				Thread.sleep(5000);
			}
	    }
	}
	
}

//driver.findElement(By.xpath("(//div[@class='yt-spec-touch-feedback-shape__fill'])[43]")).click();

