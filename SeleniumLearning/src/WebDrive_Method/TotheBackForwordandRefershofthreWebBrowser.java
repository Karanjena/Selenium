package WebDrive_Method;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotheBackForwordandRefershofthreWebBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.olivegarden.com/home");
		
		Thread.sleep(2000);
		
	Navigation nav = driver.navigate();
	nav.back();
	Thread.sleep(2000);
	nav.forward();
	Thread.sleep(2000);
	nav.refresh();
	}

}
