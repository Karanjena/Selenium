package Cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TolunchSupra {

	
	@Test(groups="system")
	public void supra() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.toyota.com/");
	Reporter.log("Cricbuzz got executed",true);
	driver.quit();

	}
}
