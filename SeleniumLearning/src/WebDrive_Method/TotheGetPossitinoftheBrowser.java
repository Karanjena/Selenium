package WebDrive_Method;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotheGetPossitinoftheBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Point pos = driver.manage().window().getPosition();
		System.out.println(pos);
	}

}
