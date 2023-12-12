package Assignment;

import java.io.File;
import java.io.IOException;

import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Task20 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/bangalore/collections");
		Thread.sleep(3000);
		File temp = driver.findElement(By.xpath("//img[@alt='Zomato']")).getScreenshotAs(OutputType.FILE);
        File scr = new File("./errorSorts/zomato.png");
        FileHandler.copy(temp, scr);
	}

}
