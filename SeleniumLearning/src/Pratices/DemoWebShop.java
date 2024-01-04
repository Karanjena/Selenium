package Pratices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class DemoWebShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.partialLinkText("Books")).click();
		Reporter.log("Book link got executed Successfully", true);
		boolean Logo = driver.findElement(By.xpath("//h1[text()='Books']")).isDisplayed();
		if (Logo == true) {
			System.out.println("Book Logo is Displayed");
		} else {
			System.out.println("Book Logo is Not Displayed");
		}

		WebElement SortBydropdown = driver.findElement(By.id("products-orderby"));

		Select Sortselect = new Select(SortBydropdown);
		Sortselect.selectByVisibleText("Price: Low to High");
		Reporter.log("Price: Low to High is clickable", true);

	}

}
