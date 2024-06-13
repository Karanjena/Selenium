package Pratices;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Praties {

	

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		
		//Entair WebPage
//		TakesScreenshot ts=(TakesScreenshot) driver;
//		File temp=ts.getScreenshotAs(OutputType.FILE);
//		File src=new File("./errorSorts/demo.jpeg");
//		org.openqa.selenium.io.FileHandler.copy(temp, src);
		
		//Web Element
		
//		File temp=driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).getScreenshotAs(OutputType.FILE);
//		File src=new File("./errorSorts/Demo2.png");
//		FileHandler.copy(temp, src);
		
		
		
	
		
	}

}
