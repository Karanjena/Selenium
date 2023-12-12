package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathByDependentAndLndependent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://shoppersstack.com/");
		Thread.sleep(30000);
		driver.findElement(By.xpath("//span[text()='SAMSUNG Galaxy Z Flip4 ']/../..//button[@type='button']")).click();
		
	}

}
