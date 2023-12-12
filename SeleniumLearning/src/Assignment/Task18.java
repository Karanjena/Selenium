package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task18 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).submit();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[text()='Get It by Tomorrow']/../../..//input[@type='checkbox']")).click();
		WebElement ele = driver.findElement(By.xpath("//span[text()='Get It by Tomorrow']"));
	    System.out.println(ele.isSelected());
	    ele.click();
	    System.out.println(ele.isSelected());
	}

}
