package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToperformDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		
		

		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement image3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement image4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement  trash= driver.findElement(By.id("trash"));
		WebElement gallery = driver.findElement(By.id("gallery"));
		
		
		Actions action=new Actions(driver);
		action.dragAndDrop(image1, trash).perform();
		Thread.sleep(1000);
		action.dragAndDrop(image2, trash).perform();
		Thread.sleep(1000);
		action.dragAndDrop(image3, trash).perform();
		Thread.sleep(1000);
		action.dragAndDrop(image4, trash).perform();
		
		Thread.sleep(3000);
		
		action.dragAndDrop(image1, gallery).perform();
		Thread.sleep(1000);
		action.dragAndDrop(image2, gallery).perform();
		Thread.sleep(1000);
		action.dragAndDrop(image3, gallery).perform();
		Thread.sleep(1000);
		action.dragAndDrop(image4, gallery).perform();
		
		
	
	
	}

}
