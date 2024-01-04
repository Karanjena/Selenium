package advanceSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnDataProvider {

	
	@DataProvider(name="cred")
	public String[][] sendData(){
		
		String[][] data= {
				
				{"Karan@gmail.com","Karan@123"},
				{"Smaranika@gmail.com","Smara@123"},
				{"Kavya@gmail.com","Kavya@123"},
		};
		return data;
	}
	
	@Test(dataProvider="cred")
	
	public void toLogin(String email,String password) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
	}
}
