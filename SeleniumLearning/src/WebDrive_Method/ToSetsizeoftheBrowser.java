package WebDrive_Method;

import java.awt.Dimension;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetsizeoftheBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().setSize(new org.openqa.selenium.Dimension(500, 500));
		 
	}

}
