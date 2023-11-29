package WebDrive_Method;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureSourceCode {

	public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();
		driver.get("");
		String sourcecode = driver.getPageSource();
	}

}
