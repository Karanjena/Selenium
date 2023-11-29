package WebDrive_Method;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToTheManageoftheWebpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		String totitel = driver.getTitle();
	}

}
