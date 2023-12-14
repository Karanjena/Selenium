package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AddToCartInWoodenStreet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.id("loginclose1")).click();
		
		//item 1
		driver.findElement(By.linkText("Sofas")).click();
		driver.findElement(By.xpath("//p[text()='Wooden Sofa Sets']")).click();	
		driver.findElement(By.linkText("Winster 3 Seater Printed Fabric Wooden Sofa (Honey Cream Checkered)")).click();
		//WebElement add = driver.findElement(By.id("plus"));
		//Actions action=new Actions(driver);
		//action.doubleClick(add).perform();
		driver.findElement(By.xpath("//h1[text()='Winster 3 Seater Printed Fabric Wooden Sofa ']/..//a[@id='button-cart-buy-now']")).click();
		
		//item2
		driver.findElement(By.linkText("Living")).click();
		driver.findElement(By.xpath("//img[@title='Lounge Chairs']")).click();	
		driver.findElement(By.xpath("(//a[text()='Carolina Lounge Chair (Ginger Bread)'])[1]")).click();
		driver.findElement(By.xpath("//h1[text()='Carolina Lounge Chair ']/..//a[@id='button-cart-buy-now']")).click();
		
		//item3
		driver.findElement(By.partialLinkText(" Study & Office ")).click();
		driver.findElement(By.xpath("(//img[@title='Study Tables'])[2]")).click();	
		driver.findElement(By.xpath("(//a[text()='Calisto Engineered Wood Study Table (Exotic Teak Frosty White)'])[1]")).click();
		driver.findElement(By.xpath("//h1[text()='Calisto Engineered Wood Study Table ']/..//a[@id='button-cart-buy-now']")).click();
		
        //WebElement move = driver.findElement(By.xpath("//a[text()='Winster 3 Seater Printed Fabric Wooden Sofa (Honey Cream Checkered)']/../..//p[text()='Quick View']"));
        //Actions action=new Actions(driver);
        //action.moveToElement(move).perform();
		
	}

}
