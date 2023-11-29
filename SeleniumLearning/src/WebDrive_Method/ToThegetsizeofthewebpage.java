package WebDrive_Method;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class ToThegetsizeofthewebpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		
		Dimension togetsize = driver.manage().window().getSize();
		System.out.println(togetsize);
		System.out.println(togetsize.height);
		System.out.println(togetsize.width);
	}

}
