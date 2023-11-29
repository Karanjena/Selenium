package WebDrive_Method;

import org.openqa.selenium.chrome.ChromeDriver;

public class TotheCloseoftheWebpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.close();
	}

}
