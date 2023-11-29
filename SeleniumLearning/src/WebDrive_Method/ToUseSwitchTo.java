package WebDrive_Method;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseSwitchTo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///c:");
		Thread.sleep(2000);
		String parents = driver.getWindowHandle();
		System.out.println(parents);
		
	}

}
