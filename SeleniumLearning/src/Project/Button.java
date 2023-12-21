package Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.get("https://demoapps.qspiders.com/?scenario=1");
		
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.xpath("(//button[text()='Yes'])[1]")).click();
		driver.findElement(By.xpath("(//button[text()='No'])[2]")).click();
		driver.findElement(By.id("btn7")).click();

		Actions action=new Actions(driver);
		// Right Click Button
		driver.findElement(By.linkText("Right Click")).click();
		WebElement Rightclick = driver.findElement(By.id("btn30"));
		action.contextClick(Rightclick).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Yes']")).click();
		Thread.sleep(1000);
		action.contextClick(Rightclick).perform();
		driver.findElement(By.xpath("//div[text()='No']")).click();
		WebElement Rightclick2 = driver.findElement(By.id("btn31"));
		
		action.contextClick(Rightclick2).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Yes']")).click();
		Thread.sleep(1000);
		action.contextClick(Rightclick2).perform();
		driver.findElement(By.xpath("//div[text()='No']")).click();
		WebElement Rightclick3 = driver.findElement(By.id("btn32"));
		
		action.contextClick(Rightclick3).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='1']")).click();
		Thread.sleep(1000);
		action.contextClick(Rightclick3).perform();
		driver.findElement(By.xpath("//div[text()='2']")).click();
		Thread.sleep(1000);
		action.contextClick(Rightclick3).perform();
		driver.findElement(By.xpath("//div[text()='3']")).click();
		Thread.sleep(1000);
		action.contextClick(Rightclick3).perform();
		driver.findElement(By.xpath("//div[text()='4']")).click();
		Thread.sleep(1000);
		action.contextClick(Rightclick3).perform();
		driver.findElement(By.xpath("//div[text()='5']")).click();

		// Double Click Button
		driver.findElement(By.linkText("Double Click")).click();
		WebElement Doubleclick = driver.findElement(By.id("btn20"));
		action.doubleClick(Doubleclick).perform();
		Thread.sleep(500);
		WebElement Doubleclick2 = driver.findElement(By.id("btn21"));
		action.doubleClick(Doubleclick2).perform();
		Thread.sleep(500);
		WebElement Doubleclick3 = driver.findElement(By.id("btn22"));
		action.doubleClick(Doubleclick3).perform();
		Thread.sleep(500);
		WebElement Doubleclick4 = driver.findElement(By.id("btn23"));
		action.doubleClick(Doubleclick4).perform();
		Thread.sleep(500);
		WebElement Doubleclick5 = driver.findElement(By.id("btn24"));
		action.doubleClick(Doubleclick5).perform();
		Thread.sleep(500);
		WebElement Doubleclick6 = driver.findElement(By.id("btn25"));
		action.doubleClick(Doubleclick6).perform();
		Thread.sleep(500);
		WebElement Doubleclick7 = driver.findElement(By.id("btn26"));
		action.doubleClick(Doubleclick7).perform();
		Thread.sleep(500);
		WebElement Doubleclick8 = driver.findElement(By.id("btn27"));
		action.doubleClick(Doubleclick8).perform();
		Thread.sleep(500);
		WebElement Doubleclick9 = driver.findElement(By.id("btn28"));
		action.doubleClick(Doubleclick9).perform();
		Thread.sleep(500);

		//Submit Click Button
		driver.findElement(By.linkText("Submit Click")).click();
		driver.findElement(By.xpath("//label[text()='Yes']/..//input[@id='sat1']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//label[text()='No'])[1]/..//input[@type='radio']")).click();
		driver.findElement(By.id("btn40")).click();
		driver.findElement(By.xpath("(//label[text()='Yes'])[2]/..//input[@id='prob1']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//label[text()='No'])[2]/..//input[@type='radio']")).click();
		driver.findElement(By.id("btn41")).click();
		
		driver.findElement(By.xpath("(//label[text()='1'])/..//input[@type='radio']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//label[text()='2'])/..//input[@type='radio']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//label[text()='3'])/..//input[@type='radio']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//label[text()='4'])/..//input[@type='radio']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//label[text()='5'])/..//input[@type='radio']")).click();
		Thread.sleep(500);
		driver.findElement(By.id("btn42")).click();
		
		//Disabled Button
		driver.findElement(By.linkText("Disabled")).click();
		driver.findElement(By.id("btn10")).click();
		WebElement DisabledButton = driver.findElement(By.id("btn10"));
		System.out.println(DisabledButton.isEnabled());
		
		driver.findElement(By.id("btn11")).click();
		WebElement DisabledButton2 = driver.findElement(By.id("btn11"));
		System.out.println(DisabledButton2.isEnabled());
		
		driver.findElement(By.id("btn12")).click();
		WebElement DisabledButton3 = driver.findElement(By.id("btn12"));
		System.out.println(DisabledButton3.isEnabled());
		
		driver.findElement(By.id("btn13")).click();
		WebElement DisabledButton4 = driver.findElement(By.id("btn13"));
		System.out.println(DisabledButton4.isEnabled());
		
		driver.findElement(By.xpath("//button[@id='btn15' and text()='1']")).click();
		WebElement DisabledButton5 = driver.findElement(By.xpath("//button[@id='btn15' and text()='1']"));
		System.out.println(DisabledButton5.isEnabled());
		
		driver.findElement(By.id("btn15")).click();
		WebElement DisabledButton6 = driver.findElement(By.id("btn15"));
		System.out.println(DisabledButton6.isEnabled());
		
		driver.findElement(By.id("btn16")).click();
		WebElement DisabledButton7 = driver.findElement(By.id("btn16"));
		System.out.println(DisabledButton7.isEnabled());
		
		driver.findElement(By.id("btn17")).click();
		WebElement DisabledButton8 = driver.findElement(By.id("btn17"));
		System.out.println(DisabledButton8.isEnabled());
		
		driver.findElement(By.id("btn18")).click();
		WebElement DisabledButton9 = driver.findElement(By.id("btn18"));
		System.out.println(DisabledButton9.isEnabled());
		
		driver.findElement(By.id("btn19")).click();
		WebElement DisabledButton10 = driver.findElement(By.id("btn19"));
		System.out.println(DisabledButton10.isEnabled());
	}

}
