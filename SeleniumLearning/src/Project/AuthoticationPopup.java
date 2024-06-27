package Project;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthoticationPopup {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/auth");
		String parent = driver.getWindowHandle();
		driver.findElement(By.linkText("Login")).click();
		Set<String> allwindow = driver.getWindowHandles();
		for(String id:allwindow) {
			driver.switchTo().window(id);
            driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
			
		}

	}

}
