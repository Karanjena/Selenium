package WebDrive_Method;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchGetMethod {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		String titelOfWebpage = driver.getTitle();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		String titelOfWebpagee = driver.getTitle();
		System.out.println(titelOfWebpage);
		System.out.println(titelOfWebpagee);
	}

}
