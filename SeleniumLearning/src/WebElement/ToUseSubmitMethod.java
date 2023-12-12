package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseSubmitMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(4000);
		driver.findElement(By.name("")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.name("")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.xpath(""));
	}

}
