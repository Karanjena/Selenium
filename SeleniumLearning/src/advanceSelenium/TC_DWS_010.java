package advanceSelenium;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_010 extends BaseClass{

	
	@Test
	public void toCheckWishlistPage() {
		driver.findElement(By.linkText("Wishlist")).click();
		Reporter.log("TstCase 010 got executed Successfully", true);
		boolean Logo = driver.findElement(By.xpath("//h1[text()='Wishlist']")).isDisplayed();
		if (Logo == true) {
			System.out.println("Wishlist Logo is Displayed");
		} else {
			System.out.println("Wishlist Logo is Not Displayed");
		}

	}
}
