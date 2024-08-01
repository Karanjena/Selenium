package Home;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemowebShop_Register {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/notebooks?orderby=10&pagesize=12&viewmode=list&specs=6");
		
		driver.findElement(By.xpath("(//a[text()='14.1-inch Laptop'])[2]/../../..//input[@value='Add to cart']")).click();
		driver.close();
	}
}
