package Assignment;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToHandleMyntraNotificationPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeOptions setting=new ChromeOptions();
		setting.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(setting);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.myntra.com/");
	}

}
