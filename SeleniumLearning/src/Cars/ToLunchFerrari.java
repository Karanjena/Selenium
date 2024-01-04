package Cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLunchFerrari {

	@Test(groups="smoke")
	public void Ferrari() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ferrari.com/");
	Reporter.log("Ferrari got executed",true);
	driver.quit();
	}
}
