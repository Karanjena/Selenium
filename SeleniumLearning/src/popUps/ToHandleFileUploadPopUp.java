package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUploadPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.naukri.com/registration/createAccount?");
		
		Actions action=new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\Karan\\Desktop\\Karan\\Karan_Jena_Resume_30-07-2023-22-37-54.pdf");
	}

}
