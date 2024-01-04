package advanceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTextNg {

	//@Test(priority = 1)
	
	@Test(enabled = false)
	public void cricbuzz() {   //test case
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("Cricbuzz got executed",true);//test steps
		driver.quit();
	}
	
	//@Test(invocationCount = 2,threadPoolSize = 2)
	@Test(invocationCount = 2)
	public void baskinRobbins() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://baskinrobbinsindia.com/");
		Reporter.log("BaskinRobbins got executed",true);
		driver.quit();
	}
	
	@Test(priority = 3,invocationCount = 2)
	public void amazon() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Reporter.log("Amazon got executed",true);
		driver.quit();
	}
}
