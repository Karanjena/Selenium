package DropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleTheSingleSelect {

	public static void main(String[] args) {
		
	    //Empty browser Lunch
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Navigate to FaceBook Application 
		driver.get("https://www.facebook.com/signup");
		
		// dropdown
		WebElement daydropdown = driver.findElement(By.id("day"));
		WebElement monthdropdown = driver.findElement(By.id("month"));
		WebElement yeardropdown = driver.findElement(By.id("year"));

		// select class to hendle
		Select dayselect = new Select(daydropdown);
		Select monthselect = new Select(monthdropdown);
		Select yearselect = new Select(yeardropdown);

		// call the metthod
		dayselect.selectByIndex(10);
		monthselect.selectByValue("9");
		yearselect.selectByVisibleText("2001");

		// To feath all option
		List<WebElement> allmethod = monthselect.getOptions();
		for (WebElement month : allmethod) {
			System.out.println(month.getText());
			monthselect.selectByVisibleText(month.getText());//magic2001
		}

	}

}
