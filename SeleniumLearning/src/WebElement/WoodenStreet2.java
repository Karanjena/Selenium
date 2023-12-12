package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WoodenStreet2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(3000);
		
		driver.findElements(By.xpath("//a[text()='Sofas']/../../..//nav[@class='menu']"));
	}

}
