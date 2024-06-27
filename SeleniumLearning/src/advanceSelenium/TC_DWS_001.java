package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_001 extends BaseClass{

	@Test
	
	public void toCheckBooksPage() {
		driver.findElement(By.partialLinkText("Books")).click();
		Reporter.log("TestCase 001 got executed Successfully", true);
		boolean Logo = driver.findElement(By.xpath("//h1[text()='Books']")).isDisplayed();
		if (Logo == true) {
			System.out.println("Book Logo is Displayed");
		} else {
			System.out.println("Book Logo is Not Displayed");
		}
		
	}
}
