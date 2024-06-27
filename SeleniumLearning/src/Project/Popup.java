package Project;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) throws InterruptedException {

		// ExeceptedData

		String ExeceptedTitle = "DemoApps | Qspiders";
		String execeptdemail = "Karan@gmail.com";
		String execeptedpassword = "Karan@000";
		String execeptedconfirmpassword = "Karan@000";

		// Lunch The Browser

		WebDriver driver = new ChromeDriver();
		System.out.println("Successfully Lunch The Browser");
		driver.manage().window().maximize();
		System.out.println("Successfully MAximize The Browser");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Url
		driver.get("https://demoapps.qspiders.com/");
		WebElement quickButton = driver.findElement(By.xpath("//button[text()='Quick Start']"));
		quickButton.click();
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		if (actualTitle.equals(ExeceptedTitle)) {
			System.out.println("successful Quick Button clicked");
		} else {
			System.out.println("fail Quick Button Clicked");
		}
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();

		// Arlet Popup
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert arlet = driver.switchTo().alert();
		System.out.println(arlet.getText());
		arlet.accept();

		// Conmfimation Popup
		driver.findElement(By.linkText("Confirm")).click();
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Alert confirmation = driver.switchTo().alert();
		System.out.println(confirmation.getText());
		confirmation.accept();

		// Promt Popup
		driver.findElement(By.linkText("Prompt")).click();
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		Alert promt = driver.switchTo().alert();
		promt.sendKeys("Karan");
		System.out.println(promt.getText());
		promt.accept();

		// Browser Window POpup

		// new window
		driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
		String parent = driver.getWindowHandle();
		driver.findElement(By.linkText("Open in new window")).click();
		Set<String> allwindow = driver.getWindowHandles();
		for (String id : allwindow) {
			driver.switchTo().window(id);
			if (driver.getTitle().contains("Demoapps | Qspider")) {
				driver.switchTo().window(id);

				// Email TextFiled
				WebElement email = driver.findElement(By.id("email"));
				email.clear();
				email.sendKeys(execeptdemail);
				String actualemail = email.getAttribute("value");
				if (actualemail.equals(execeptdemail)) {
					System.out.println("email Textfiled successful accepted data");
				} else {
					System.out.println("email Textfiled fail accepted data");
				}

				// Password TextFiled
				WebElement password = driver.findElement(By.id("password"));
				password.clear();
				password.sendKeys(execeptedpassword);
				String actualpassword = password.getAttribute("value");
				if (actualpassword.equals(execeptedpassword)) {
					System.out.println("Password Textfiled successful accepted data");
				} else {
					System.out.println("Password Textfiled fail accepted data");
				}

				// confirm Text Filed
				WebElement confirm = driver.findElement(By.id("confirm-password"));
				confirm.clear();
				confirm.sendKeys(execeptedconfirmpassword);
				String actualconfirmPassword = confirm.getAttribute("value");
				if (actualconfirmPassword.equals(execeptedconfirmpassword)) {
					System.out.println("ConfirmPassword Textfiled successful accepted data");
				} else {
					System.out.println("ConfirmPassword Textfiled Fail accepted data");
				}

				WebElement SingupButton = driver.findElement(By.xpath("//button[@type='submit']"));
				SingupButton.click();
				System.out.println("Home Page Displyed");

				driver.close();
				System.out.println("Successful Close The Child window");

			}
		}
		
		//Authotication Popup
		driver.get("https://demoapps.qspiders.com/ui/auth");
		
//		String AuthenticationParent = driver.getWindowHandle();
//		
//		driver.findElement(By.linkText("Login")).click();
//		Set<String> alwindow = driver.getWindowHandles();
//		for(String id:alwindow) {
//			driver.switchTo().window(id);
//			driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
//			if (driver.getTitle().contains(id)) {
//				driver.switchTo().window(id);
//				driver.close();
//			}
//		}

		driver.quit();

	}

}
