package WebDrive_Method;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class TothetoUrlUriOfTheBrowser {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to(new URL("https://www.olivegarden.com/home"));
	}

}
