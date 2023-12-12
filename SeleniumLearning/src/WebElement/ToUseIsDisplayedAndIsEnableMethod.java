package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseIsDisplayedAndIsEnableMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(4000);
		System.out.println("Before Entering the data");
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
	    System.out.println(loginbutton.isDisplayed());
	    System.out.println(loginbutton.isEnabled());
	    System.out.println("====================");
	    System.out.println("After Entering the Data");
	    driver.findElement(By.name("username")).sendKeys("9878688790");
	    Thread.sleep(2000);
	    driver.findElement(By.name("password")).sendKeys("989878987");
	    System.out.println(loginbutton.isDisplayed());
	    System.out.println(loginbutton.isEnabled());
	}

}
