package Pratices;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Demo {

	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.youtube.com/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File srs=new File("./errorSorts/y2.jpeg");
		FileHandler.copy(temp, srs);
	}
}
