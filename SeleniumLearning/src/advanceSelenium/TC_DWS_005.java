package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_005 extends BaseClass{

	
	@Test
	public void toCheckDigitaldownloadsPage() {
		driver.findElement(By.partialLinkText("Digital downloads")).click();
		Reporter.log("TstCase 005 got executed Successfully", true);
		boolean Logo = driver.findElement(By.xpath("//h1[text()='Digital downloads']")).isDisplayed();
		if (Logo == true) {
			System.out.println("Digital downloads Logo is Displayed");
		} else {
			System.out.println("Digital downloads Logo is Not Displayed");
		}

	}
}
