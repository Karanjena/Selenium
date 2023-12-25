package TakeScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class ToCaptureEntireWebpage {

	public static void main(String[] args) throws InterruptedException, IOException {
		
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.youtube.com/");
	Thread.sleep(3000);
	
	//TakeScreenshot Entire Webpage
	TakesScreenshot ts=(TakesScreenshot) driver;//type casting
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File src = new File("./errorSorts/youtube.jpeg");
	FileHandler.copy(temp, src);
		
	}

}
