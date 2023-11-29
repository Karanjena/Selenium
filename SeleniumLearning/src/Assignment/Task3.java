package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://global.kfc.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
}
