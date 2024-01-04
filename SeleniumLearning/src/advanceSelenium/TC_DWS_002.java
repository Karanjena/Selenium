package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_002 extends BaseClass{

	@Test

	public void toCheckComputerPage() {
		driver.findElement(By.partialLinkText("Computers")).click();
		Reporter.log("TstCase 002 got executed Successfully", true);
		boolean Logo = driver.findElement(By.xpath("//h1[text()='Computers']")).isDisplayed();
		if (Logo == true) {
			System.out.println("Computers Logo is Displayed");
		} else {
			System.out.println("Computers Logo is Not Displayed");
		}

	}
}
