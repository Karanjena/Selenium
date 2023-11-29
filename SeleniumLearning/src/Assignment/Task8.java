package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.olivegarden.com/home");
	}

}
