package Home;

import java.net.URI;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v114.page.model.NavigatedWithinDocument;

import WebDrive_Method.TothetoUrlUriOfTheBrowser;

public class Olive {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(2000);
		Dimension size = driver.manage().window().getSize();
		Thread.sleep(2000);
		System.out.println(size);
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(500,500));
		Thread.sleep(2000);
		driver.close();
	}
}
