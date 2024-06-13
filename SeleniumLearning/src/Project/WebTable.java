    package Project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		System.out.println("Browser got launched Successfully");
		driver.manage().window().maximize();
		System.out.println("Browser got ,maximize Successfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.get("https://demoapps.qspiders.com/?scenario=1");
		System.out.println("Successfully navigate the login page");
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();
		System.out.println("Successfully Open The WebTable");
		
		
		/*List<WebElement> allmethod = monthselect.getOptions();
		for(WebElement month:allmethod) {
			System.out.println(month.getText());
			monthselect.selectByVisibleText(month.getText());*/
		}

	}