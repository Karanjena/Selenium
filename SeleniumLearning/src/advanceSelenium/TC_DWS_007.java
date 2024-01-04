package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_007 extends BaseClass{

	@Test
	public void toCheckGiftCardsPage() {
		driver.findElement(By.partialLinkText("Gift Cards")).click();
		Reporter.log("TstCase 007 got executed Successfully", true);
		boolean Logo = driver.findElement(By.xpath("//h1[text()='Gift Cards']")).isDisplayed();
		if (Logo == true) {
			System.out.println("Gift Cards Logo is Displayed");
		} else {
			System.out.println("Gift Cards Logo is Not Displayed");
		}

	}
}
