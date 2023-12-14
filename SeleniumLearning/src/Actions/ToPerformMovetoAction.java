package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformMovetoAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.id("loginclose1")).click();
		WebElement move = driver.findElement(By.linkText("Dining & Kitchen"));
		
		Actions action=new Actions(driver);
		action.moveToElement(move).perform();
	}

}
