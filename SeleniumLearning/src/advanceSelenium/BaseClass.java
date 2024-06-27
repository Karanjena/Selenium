package advanceSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;





public class BaseClass {

	public WebDriver driver;
	String expectedHomepageTitel = "Demo Web Shop";
	
	@Parameters("browserName")
	@BeforeClass
	public void Tolaunch(@Optional("chrome")String bname) {
		if(bname.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if(bname.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}else if(bname.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		Reporter.log("browser launch sucessefully", true);
		driver.manage().window().maximize();
		Reporter.log("browser maximise sucessefully", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
		
	@BeforeMethod
		public void tologin() {
		driver.get("https://demowebshop.tricentis.com");
		String actualhomepageTitel = driver.getTitle();
		if(actualhomepageTitel.equals(expectedHomepageTitel)) {
			Reporter.log("navigate to DWS homepage sucessfully", true);
			}else {
				Reporter.log("Navigeted to DWS Homepage failed", true);
				}
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("seleniumM2@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("selenium@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		}
		@AfterMethod
		public void tologout() {
			Reporter.log("Logged out Successfully", true);
			driver.findElement(By.linkText("Log out")).click();
	}
		@AfterClass
		public void toclose() {
			Reporter.log("Browser successfully Closed", true);
			driver.quit();
		}


}
