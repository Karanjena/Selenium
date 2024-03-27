package Home;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetStringUrl {

	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/emailsignup/?hl=en");
	}
}
