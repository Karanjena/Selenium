package WebDrive_Method;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureSessionId {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dominos.co.in/");
		
		Thread.sleep(2000);
		String session = driver.getWindowHandle();
		System.out.println(session);
	}

}
