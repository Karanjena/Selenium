package WebDrive_Method;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToTheFullscreenofthewebpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().fullscreen();
		
	}

}
