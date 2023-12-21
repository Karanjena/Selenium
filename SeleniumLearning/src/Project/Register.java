package Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Register {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.get("https://demoapps.qspiders.com/?scenario=1");

		// Register
		driver.findElement(By.id("name")).sendKeys("Karan Jena");
		driver.findElement(By.id("email")).sendKeys("sonujena256@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Karan@000");
		Actions action = new Actions(driver);
		action.moveByOffset(1034, 423).click().click().perform();
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		Thread.sleep(2000);
	}
}
