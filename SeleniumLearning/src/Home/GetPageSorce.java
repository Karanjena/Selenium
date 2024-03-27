package Home;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSorce {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/emailsignup/?hl=en");
		String PageSorce = driver.getPageSource();
		System.out.println(PageSorce);
		driver.quit();
	}

}
