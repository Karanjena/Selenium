package Assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Create Obj Of FIS/FS
				FileInputStream fis=new FileInputStream("./textData/textDataDemoWebShop.properties");
				//Create an Object
				Properties prop=new Properties();
				//call Method
				prop.load(fis);
				
				
				String url = prop.getProperty("url");
				String gender= prop.getProperty("Male");
				String firstname= prop.getProperty("FirstName");
				String lastname = prop.getProperty("lastName");
				String email = prop.getProperty("Email");
				String password = prop.getProperty("Password");
				String Confirmpassword = prop.getProperty("Confirmpassword");
				
				
				
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
				driver.get(url);
				driver.findElement(By.linkText("Register")).click();
				driver.findElement(By.id("gender-male")).click();
				driver.findElement(By.id("FirstName")).sendKeys(firstname);
				driver.findElement(By.id("LastName")).sendKeys(lastname);
				driver.findElement(By.id("Email")).sendKeys(email);
				driver.findElement(By.id("Password")).sendKeys(password);
				driver.findElement(By.id("ConfirmPassword")).sendKeys(Confirmpassword);
				
	}
}
