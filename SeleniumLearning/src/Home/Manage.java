package Home;

import java.awt.Dimension;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/emailsignup/?hl=en");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		org.openqa.selenium.Dimension getsize = driver.manage().window().getSize();
		System.out.println(getsize);
		Thread.sleep(2000);
        driver.manage().window().setSize(new org.openqa.selenium.Dimension(200,200));
        Thread.sleep(2000);
        Point getpossition = driver.manage().window().getPosition();
        System.out.println(getpossition);
        Thread.sleep(2000);
        driver.manage().window().setPosition(new Point(600, 500));
        Thread.sleep(2000);
        driver.quit();
	
		
	}
}
