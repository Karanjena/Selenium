package DropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleTheDeSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement listbox = driver.findElement(By.id("cars"));
		
		//select class
		
		Select multiSelect=new Select(listbox);
		System.out.println(multiSelect.isMultiple());
		
		//To select
		
		multiSelect.selectByIndex(0);
		multiSelect.selectByValue("199");
		Thread.sleep(3000);
		
		//To deselect
		multiSelect.deselectAll();
	}

}
