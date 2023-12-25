package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */
public class FacebookLoginTextCase {

	public static void main(String[] args) {
		
		
		//Expected Data
		String ExpectedLoginPageTitle = "Facebook - login in or sign up";
		String ExpectedUsername = "Karan78@gmail.com";
		String ExpectedPassword = "Karan@123";
		
		//Step 1:-Open The Browser
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser got launched Successfully");
		driver.manage().window().maximize();
		System.out.println("Browser got ,maximize Successfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Step 2:- Enter The Url
		driver.get("https://www.facebook.com/login/");
		String actualLoginPageTitle= driver.getTitle();
		if(actualLoginPageTitle.equals(ExpectedLoginPageTitle)) {
			System.out.println("Successfully navigated Login page");
		}else {
			System.out.println("Failed to navigated Login Page");
		}
		
		//Step 3:- Enter The Username
		WebElement EmailTextField = driver.findElement(By.id("email"));
		EmailTextField.clear();
		EmailTextField.sendKeys(ExpectedUsername);
		String actualUsername = EmailTextField.getAttribute("value");
		if(actualUsername.equals(ExpectedUsername)) {
			System.out.println("EmailTextField Successfully accepted data");
		}else {
			System.out.println("EmailTextField Failed accept data");
		}
		
		//Step 4:- Enter The Password
		WebElement PasswordTextField = driver.findElement(By.id("pass"));
		PasswordTextField.clear();
		PasswordTextField.sendKeys(ExpectedPassword);
		String actualPassword = PasswordTextField.getAttribute("value");
		if(actualPassword.equals(ExpectedPassword)) {
			System.out.println("PasswordTextField Successfully accepted data");
		}else {
			System.out.println("PasswordTextField Failed accept data");
		}
		
		//Step 5:- To click The Login Button
		
		WebElement loginbutton = driver.findElement(By.name("login"));
		loginbutton.click();
		
		
		//Display Logo
		
		boolean Logo = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		if(Logo==true) {
			System.out.println("Facebook Logo is Displayed");
		}else {
			System.out.println("Facebook Logo is Not Displayed");
		}
		
		//To Close Browser
		
		System.out.println("Browser got Successfully Close");
		driver.quit();
	}

}
