package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUseDrgaAndDropInGlobalSqa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.findElement(By.xpath("//li[@id='Accepted Elements']")).click();
		WebElement iframe = driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[2]"));
		driver.switchTo().frame(iframe);
		WebElement ele1 = driver.findElement(By.id("draggable"));
		WebElement ele2 = driver.findElement(By.id("draggable-nonvalid"));
		WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));

		Actions action = new Actions(driver);
		action.dragAndDrop(ele1, droppable).perform();
		//action.moveToLocation(120, 355).clickAndHold().moveToLocation(400, 380).release().perform();
		Thread.sleep(1000);
		action.dragAndDrop(ele2, droppable).perform();
		//action.moveToLocation(278,435).clickAndHold().moveToLocation(450, 460).release().perform();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//li[@id='Propagation']")).click();
		WebElement iframe2 = driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[3]"));
		driver.switchTo().frame(iframe2);
		WebElement ele3 = driver.findElement(By.id("draggable"));
		WebElement droppable2 = driver.findElement(By.xpath("//div[@id='droppable']"));
		WebElement droppable3 = driver.findElement(By.xpath("//div[@id='droppable-inner']"));
		WebElement droppable4 = driver.findElement(By.xpath("//div[@id='droppable2']"));
		WebElement droppable5 = driver.findElement(By.xpath("//div[@id='droppable2-inner']"));
		
		
		action.dragAndDrop(ele3, droppable2).perform();
		Thread.sleep(1000);
		action.dragAndDrop(droppable2, droppable3).perform();
		Thread.sleep(1000);
		action.dragAndDrop(droppable3, droppable4).perform();
		Thread.sleep(1000);
		action.dragAndDrop(droppable4, droppable5).perform();
		

	}

}
