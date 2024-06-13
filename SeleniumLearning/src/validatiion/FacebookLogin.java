package validatiion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		
		
		//Execepted data
		String Execeptedtitle = "Facebook – log in or sign up";
		String Execeptedusername = "Karan@gmail.com";
		String Execeptedpassword = "Karan@123";
		
		
		//step 1:- open the browser
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser got lunched successfully");
		driver.manage().window().maximize();
		System.out.println("Browser got maximixed successfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//step 2:- Enter the url
	    driver.get("https://www.facebook.com/");
	    String actualloginPageTitle = driver.getTitle();
	    System.out.println(actualloginPageTitle);
	    if (actualloginPageTitle.equalsIgnoreCase(Execeptedtitle)) {
			System.out.println("Login Page is Display");
		} else {
			System.out.println("Login page not Display");
		}
	    
	    //step :-3  Username TextFiled
		WebElement Usernametextfiled = driver.findElement(By.id("email"));
		Usernametextfiled.clear();
		Usernametextfiled.sendKeys(Execeptedusername);
		String actualUsername = Usernametextfiled.getAttribute("value");
		if(actualUsername.equals(Execeptedusername)) {
			System.out.println("UsernameTextfiled successful accepted data");
		}else {
			System.out.println("UsernameTextfiled fail accepted data");
		}
		
		
		//step:-3  Password Textfiled
		WebElement PasswordTextFiled = driver.findElement(By.id("pass"));
		PasswordTextFiled.clear();
		PasswordTextFiled.sendKeys(Execeptedpassword);
		String actualPassword = PasswordTextFiled.getAttribute("value");
		if (actualPassword.equals(Execeptedpassword)) {
			System.out.println("Password TextFiled Successfully accepted data");
		}else {
			System.out.println("Password TextFiled fail accepted data");
		}
		
		
		//step:-4  click on login button
		WebElement loginbutton = driver.findElement(By.name("login"));
		loginbutton.click();
		System.out.println("Home page Displayed");
		
		//step :-5 close the browser
		System.out.println("Successful Close The Browser");
		driver.quit();
		
	  
	    
	}

}
