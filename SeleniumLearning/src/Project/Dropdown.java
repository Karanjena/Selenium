package Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.language.Selection;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		driver.findElement(By.linkText("Single Select")).click();
		WebElement select = driver.findElement(By.id("select1"));
		Select Cuntryselect = new Select(select);
		Cuntryselect.selectByVisibleText("+91");
		
		driver.findElement(By.id("phone")).sendKeys("9337671293");
		
		WebElement Gender = driver.findElement(By.id("select2"));
		Select Genderselect = new Select(Gender);
		Genderselect.selectByVisibleText("Male");
		
		WebElement cuntry = driver.findElement(By.id("select3"));
		Select cuntryName = new Select(cuntry);
		cuntryName.selectByVisibleText("India");
		
		WebElement state = driver.findElement(By.id("select5"));
		Select stateSelect = new Select(state);
		stateSelect.selectByVisibleText("Odisha");
		
		WebElement Dist = driver.findElement(By.id("select4"));
		Select DistSelect = new Select(Dist);
		DistSelect.selectByVisibleText("Puri");

	}

}
