package Cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLunchThar {

	@Test(groups="integration")
	public void Thar() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://auto.mahindra.com/");
	Reporter.log("Thar got executed",true);
	driver.quit();
	}
}
