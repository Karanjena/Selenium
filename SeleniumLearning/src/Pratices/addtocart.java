package Pratices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class addtocart {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.id("loginclose1")).click();
		//item 1
		driver.findElement(By.linkText("Sofas")).click();
		driver.findElement(By.xpath("//p[text()='Wooden Sofa Sets']")).click();	
		driver.findElement(By.xpath("(//p[text()='Quick View'])[1]")).click();
		driver.findElement(By.xpath("//h1[text()='Winster 3 Seater Wooden Sofa ']/..//a[@id='button-cart-buy-now']")).click();
		driver.navigate().back();
		//item 2
		driver.findElement(By.linkText("Living")).click();
		driver.findElement(By.xpath("//img[@title='Lounge Chairs']")).click();	
		driver.findElement(By.xpath("(//p[text()='Quick View'])[1]")).click();
		driver.findElement(By.xpath("//h1[text()='Adoree Lounge Chair ']/..//a[@id='button-cart-buy-now']")).click();
		driver.navigate().back();
		//item 3
		driver.findElement(By.linkText("Bedroom")).click();
		driver.findElement(By.xpath("//img[@title='Bedside Tables']")).click();
		driver.findElement(By.xpath("(//p[text()='Quick View'])[1]")).click();
		driver.findElement(By.xpath("//h1[text()='Adolph Bedside Table ']/..//a[@id='button-cart-buy-now']")).click();
		
		
		
		
	}
}
