package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_003 extends BaseClass{

	
	@Test
	public void toCheckElectronicsPage() {
		driver.findElement(By.partialLinkText("Electronics")).click();
		Reporter.log("TstCase 003 got executed Successfully", true);
		boolean Logo = driver.findElement(By.xpath("//h1[text()='Electronics']")).isDisplayed();
		if (Logo == true) {
			System.out.println("Electronics Logo is Displayed");
		} else {
			System.out.println("Electronics Logo is Not Displayed");
		}

	}
}
