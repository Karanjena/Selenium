package Home;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class barbequenation {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.barbequenation.com/");
		String id = driver.getWindowHandle();
		System.out.println(id);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		driver.quit();
	}
}
