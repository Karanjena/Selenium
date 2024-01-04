package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_006 extends BaseClass{

	
	@Test
	public void toCheckJewelryPage() {
		driver.findElement(By.partialLinkText("Jewelry")).click();
		Reporter.log("TstCase 006 got executed Successfully", true);
		boolean Logo = driver.findElement(By.xpath("//h1[text()='Jewelry']")).isDisplayed();
		if (Logo == true) {
			System.out.println("Jewelry Logo is Displayed");
		} else {
			System.out.println("Jewelry Logo is Not Displayed");
		}

	}
}
