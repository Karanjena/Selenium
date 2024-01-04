package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseIsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//option[text()='INR 50 - INR 99 ( 1 ) ']"));

		System.out.println(ele.isSelected());
		ele.click();
		System.out.println(ele.isSelected());
	}

}
