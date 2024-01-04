package Cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLunchBMW {

	
	@Test(groups="smoke")
	public void bmw() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.bmw.com/");
	Reporter.log("Ferrari got executed",true);
	driver.quit();
	}
}
