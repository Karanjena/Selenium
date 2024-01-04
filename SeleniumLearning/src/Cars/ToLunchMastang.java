package Cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLunchMastang {

	
	@Test(groups="system")
	public void mastangGT() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ford.com/");
	Reporter.log("Mastang GT got executed",true);
	driver.quit();

	}
}
