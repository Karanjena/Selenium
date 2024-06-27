package validatiion;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartAddToCart {

	public static void main(String[] args) {

		// Step:-1 Execepted Data
		String ExeceptedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		String ExeceptedSarchTextField = "Iphone";
		String ExeceptedTitleOfChildWindow = "APPLE iPhone 14 Plus ( 128 GB Storage ) Online at Best Price On Flipkart.com";

		String ExeceptedTitleOfShoppingCart = "APPLE iPhone 14 Plus ( 128 GB Storage ) Online at Best Price On Flipkart.com";
		
		
		
		// Step:-2 Open The Browser
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser got Lunch Successfully");
		driver.manage().window().maximize();
		System.out.println("Browser got Maximize Successfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Step:-3 Put The Url
		driver.get("https://www.flipkart.com/");
		String acturalPageTitle = driver.getTitle();
		if (acturalPageTitle.equals(ExeceptedTitle)) {
			System.out.println("Successful Open The WebPage");
		} else {
			System.out.println("Fail open The WebPage");
		}

		// Step:-4 Scarch TextField
		WebElement SarchTextField = driver.findElement(By.xpath("//input[@type='text']"));
		SarchTextField.clear();
		SarchTextField.sendKeys("Iphone");
		String actualSarchTextFiels = SarchTextField.getAttribute("value");
		if (actualSarchTextFiels.equals(ExeceptedSarchTextField)) {
			System.out.println("Successfully Scarch TextField Acepted Data");
		} else {
			System.out.println("Fail Scarch TextField Acepted Data");
		}

		// Step:-5 Enter Action
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
		System.out.println("Successful Enter The TextField");

		// Step:-6 Find The Product
		String parent = driver.getWindowHandle();
		WebElement Product = driver.findElement(By.xpath("//div[text()='Apple iPhone 14 Plus (Starlight, 128 GB)']"));
		Product.click();
		System.out.println(Product.getText());
		Set<String> allwindow = driver.getWindowHandles();
		for (String id : allwindow) {
			driver.switchTo().window(id);
			if (driver.getTitle().contains(id)) {
				driver.switchTo().window(id);

			}
		}
		String ActualTitleOfParentWindow = driver.getTitle();
		if (ActualTitleOfParentWindow.equals(ExeceptedTitleOfChildWindow)) {
			System.out.println("Successful Open The Parent Window");
		} else {
			System.out.println("Fail Open The Parent Window");
		}
		
		
		// Step:-7 Add To Cart		
		WebElement AddTocart = driver.findElement(By.xpath("//span[text()='Apple iPhone 14 Plus (Starlight, 128 GB)']/../../../../../..//button[text()='Add to cart']"));  
		AddTocart.click();
		
	
		String AuctalTitleOfShopingCart = driver.getTitle();
		if (AuctalTitleOfShopingCart.equals(ExeceptedTitleOfShoppingCart)) {
			System.out.println("Successfully AddToCart");
		} else {
			System.out.println("Fail AddToCart");
		}
		
		
		//Step:-8 Close The Browser
		System.out.println("Successfully Browser closed");
		driver.quit();
	}

}
