package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_004 extends BaseClass{

	
	@Test
	public void toCheckApparel_ShoesPage() {
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
		Reporter.log("TstCase 004 got executed Successfully", true);
		boolean Logo = driver.findElement(By.xpath("//h1[text()='Apparel & Shoes']")).isDisplayed();
		if (Logo == true) {
			System.out.println("Apparel & Shoes Logo is Displayed");
		} else {
			System.out.println("Apparel & Shoes Logo is Not Displayed");
		}

	}
}
