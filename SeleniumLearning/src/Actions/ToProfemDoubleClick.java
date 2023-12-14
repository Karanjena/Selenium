package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ToProfemDoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		WebElement addbutton = driver.findElement(By.id("add"));
		
		 Actions action=new Actions(driver);
		 action.doubleClick(addbutton).perform();
		 
	}

}
