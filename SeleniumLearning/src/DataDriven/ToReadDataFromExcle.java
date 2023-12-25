  package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromExcle {

	
		// TODO Auto-generated method stub

		
		public static void main(String[] args) throws IOException {
			//Create Obj Of FIS/FS
			FileInputStream fis=new FileInputStream("./textData/textData.properties");
			//Create an Object
			Properties prop=new Properties();
			//call Method
			prop.load(fis);
			
			String url = prop.getProperty("url");
			String usernamne = prop.getProperty("username");
			String password = prop.getProperty("password");
			
			
			//Automation
			
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.get(url);
			driver.findElement(By.id("email")).sendKeys(usernamne);
			driver.findElement(By.id("pass")).sendKeys(password); 
	}

}
