package WebDrive_Method;

import org.openqa.selenium.chrome.ChromeDriver;

public class TothenavigaateoftheBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.instagram.com/");
	}

}
