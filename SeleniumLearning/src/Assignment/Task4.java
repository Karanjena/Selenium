package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String sourcecode = driver.getPageSource();
		System.out.println(sourcecode);
	}

}
