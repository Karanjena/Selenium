package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_009 extends BaseClass{

	
	@Test
	public void toCheckShoppingcartPage() {
		driver.findElement(By.linkText("Shopping cart")).click();
		Reporter.log("TstCase 009 got executed Successfully", true);
		boolean Logo = driver.findElement(By.xpath("//h1[text()='Shopping cart']")).isDisplayed();
		if (Logo == true) {
			System.out.println("Shopping cart Logo is Displayed");
		} else {
			System.out.println("Shopping cart Logo is Not Displayed");
		}

	}
}
