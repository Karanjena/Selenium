package WebDrive_Method;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToTheSetPositionOftheBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		driver.manage().window().setPosition(new Point(150, 130));
	}

}
