package Home;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/emailsignup/?hl=en");
		String gettiteofWebpage = driver.getTitle();
		System.out.println(gettiteofWebpage);
		driver.quit();
		
	}
}
