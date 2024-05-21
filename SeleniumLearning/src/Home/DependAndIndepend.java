package Home;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependAndIndepend {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("Iphone");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		String parent = driver.getWindowHandle();

		driver.findElement(By.xpath("//div[text()='Apple iPhone 14 (Blue, 128 GB)']")).click();

		Set<String> allwindiwids = driver.getWindowHandles();
		for (String id : allwindiwids) {
			if (!id.equals(parent)) {
				driver.switchTo().window(id);
			}
		}

		driver.findElement(By.xpath("//span[text()='Apple iPhone 14 (Blue, 128 GB)']/../../../../../..//button[text()='Add to cart']")).click();

	}
}
