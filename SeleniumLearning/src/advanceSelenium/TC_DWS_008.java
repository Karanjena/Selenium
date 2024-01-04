package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_008 extends BaseClass{

	
	@Test
	public void toCheckTricentissPage() {
		driver.findElement(By.linkText("Tricentis")).click();
		Reporter.log("TstCase 008 got executed Successfully", true);
		boolean Logo = driver.findElement(By.xpath("//h1[text()='Tricentis']")).isDisplayed();
		if (Logo == true) {
			System.out.println("Tricentis Logo is Displayed");
		} else {
			System.out.println("Tricentis Logo is Not Displayed");
		}

	}
}
