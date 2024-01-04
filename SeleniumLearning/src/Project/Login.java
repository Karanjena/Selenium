package Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {

		String exceptedusername = "sonujena256@gmail.com";
		String exceptedpassword = "Karan@000";
        //Step:-1
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser got launched Successfully");
		driver.manage().window().maximize();
		System.out.println("Browser got ,maximize Successfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Step:-2
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		System.out.println("Successfully navigate the login page");
        //Step:-3
		WebElement loginbutton = driver.findElement(By.partialLinkText("Login Now"));
		loginbutton.click();

		// Step:-4
		WebElement username = driver.findElement(By.id("email"));
		username.clear();
		username.sendKeys(exceptedusername);
		String acturalusername = username.getAttribute("value");
		if (acturalusername.equals(exceptedusername)) {
			System.out.println("username Successfully accepted data");
		} else {
			System.out.println("username Failed accept data");
		}

		// Step:-5
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys(exceptedpassword);
		String acturalpassword = password.getAttribute("value");
		if (acturalpassword.equals(exceptedpassword)) {
			System.out.println("Password Successfully accepted data");
		} else {
			System.out.println("Password Failed accept data");
		}
        //Step:-6
		WebElement submitbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		submitbutton.submit();
		
		//Step:-7
		System.out.println("Close The Browser");
		driver.quit();

	}
}
