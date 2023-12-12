package Pratices;

import java.awt.Window;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.bouncycastle.crypto.MaxBytesExceededException;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://demowebshop.tricentis.com/");
		 Thread.sleep(2000);
		 
		 //Get title
		 String gettitle = driver.getTitle();
		 System.out.println(gettitle);
		 
		 //Get current url
		 String url = driver.getCurrentUrl();
		 System.out.println(url);
		 
		 //get page scorce
		 String pagescorce = driver.getPageSource();
		 System.out.println(pagescorce);
		 driver.close();
		 driver.quit();
		 
		 
		 //setSize
		 driver.manage().window().setSize(new Dimension(300, 400));
		 
		 //getSize
		 Dimension size = driver.manage().window().getSize();
		 System.out.println(size);
		 
		 //set Position
		 driver.manage().window().setPosition(new Point(400, 400));
		 
		 //get position
		 Point position = driver.manage().window().getPosition();
		 System.out.println(position);
		 
		 
	}

}
