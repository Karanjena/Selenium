package Pratices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddToCartWoodenStreet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.id("loginclose1")).click();
		
		WebElement sofa = driver.findElement(By.linkText("Sofas"));
		Actions action=new Actions(driver);
		action.moveToElement(sofa).perform();
		action.click(sofa).perform();
		
		WebElement sofaset = driver.findElement(By.xpath("//p[text()='Wooden Sofa Sets']"));
	    action.moveToElement(sofaset).perform();
	    action.click(sofaset).perform();
	    
	    WebElement quick = driver.findElement(By.xpath("(//a[text()='Winster 3 Seater Printed Fabric Wooden Sofa (Honey Cream Checkered)'])[1]/../..//p[text()='Quick View']"));
	    action.moveToElement(quick).perform();
	    action.click(quick).perform();
	    
	    WebElement addtocart = driver.findElement(By.xpath("//h1[text()='Winster 3 Seater Printed Fabric Wooden Sofa ']/..//a[@id='button-cart-buy-now']"));
	    action.moveToElement(addtocart).perform();
	    action.click(addtocart).perform();
	    Thread.sleep(1000);
	    action.click(addtocart).perform();
	    
	    WebElement add = driver.findElement(By.xpath("//input[@id='plus70490']"));
	    action.click(add).perform();
	    action.click(add).perform();
	}

}
