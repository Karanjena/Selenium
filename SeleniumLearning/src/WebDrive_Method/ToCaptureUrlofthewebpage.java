package WebDrive_Method;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureUrlofthewebpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

}
