package advanceSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class BaseClass {
	WebDriver driver;
	String ExpectedUsername = "Karan78@gmail.com";
	String ExpectedPassword = "Karan@123";

	@Parameters("browserName")
	@BeforeClass
	public void tolunch(String bName) {
		if (bName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (bName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		Reporter.log("Browser Lunched Successfully", true);
		driver.manage().window().maximize();
		Reporter.log("Browser got Maximize", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@BeforeMethod
	public void toLogin() {
		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.linkText("Log in")).click();
		WebElement usernamefiled = driver.findElement(By.id("Email"));
		usernamefiled.clear();
		usernamefiled.sendKeys(ExpectedUsername);
		String acturalUsername = usernamefiled.getAttribute("value");
		if (acturalUsername.equals(ExpectedUsername)) {
			Reporter.log("Userfiled Successfully accepted Data", true);
		} else {
			Reporter.log("Userfiled Failed accept Data", true);
		}
		// password
		WebElement passwordfiled = driver.findElement(By.id("Password"));
		passwordfiled.clear();
		passwordfiled.sendKeys(ExpectedPassword);
		String acturalPassword = passwordfiled.getAttribute("value");
		if (acturalPassword.equals(ExpectedPassword)) {
			Reporter.log("Passwordfiled Successfully accepted Data", true);
		} else {
			Reporter.log("Passwordfiled Failed accept Data", true);
		}

		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@AfterMethod
	public void toLogout() {
		driver.findElement(By.linkText("Log out")).click();

	}

	@AfterClass
	public void toCloseBrowser() {
		Reporter.log("Browser got close Successfully", true);
		driver.quit();
	}

}
