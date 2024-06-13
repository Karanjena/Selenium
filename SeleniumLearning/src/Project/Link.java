package Project;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.get("https://demoapps.qspiders.com/?scenario=1");
		System.out.println("Successfully navigate the login page");
		
		driver.findElement(By.xpath("//button[text()='Quick Start']")).click();
		System.out.println("Successfully click on Quick Start");
		
		
		//To click on link button
		driver.findElement(By.linkText("Link")).click(); 
		System.out.println("Successfully click on Link Button");
		
		
		
		
//		//To click on All Links
		WebElement Contact = driver.findElement(By.linkText("Contact Us"));
		Contact.click();
		driver.navigate().back();
		WebElement About = driver.findElement(By.linkText("About Us"));	
		About.click();	
		driver.navigate().back();
		WebElement Career = driver.findElement(By.linkText("Career"));
		Career.click();	
		driver.navigate().back();
		WebElement Payments = driver.findElement(By.linkText("Payments"));
		Payments.click();
		driver.navigate().back();
		WebElement Shippings = driver.findElement(By.linkText("Shippings"));
		Shippings.click();
		driver.navigate().back();
		WebElement Returns = driver.findElement(By.xpath("//a[contains(text(),'Cancellation')]"));
		Returns.click();
		driver.navigate().back();
		WebElement FAQ = driver.findElement(By.linkText("FAQ"));
		FAQ.click();
		driver.navigate().back();
		WebElement Policy = driver.findElement(By.linkText("Return Policy"));	
		Policy.click();
		driver.navigate().back();
		WebElement Terms = driver.findElement(By.linkText("Terms of use"));	
		Terms.click();
		driver.navigate().back();
		WebElement Security = driver.findElement(By.linkText("Security"));
		Security.click();
		driver.navigate().back();
		WebElement Privacy = driver.findElement(By.linkText("Privacy"));
		Privacy.click();
		driver.navigate().back();
		WebElement Facebook = driver.findElement(By.linkText("Facebook"));	
		Facebook.click();
		driver.navigate().back();
		WebElement Twitter = driver.findElement(By.linkText("Twitter"));		
		Twitter.click();
		driver.navigate().back();
		WebElement Youtube = driver.findElement(By.linkText("Youtube"));	
		Youtube.click();
   	    driver.navigate().back();
   	    System.out.println("Successfully click on all link button");
		
//	//To click on link and open the New Tab
		driver.findElement(By.linkText("Link in New Tab")).click();
    	
		String parent = driver.getWindowHandle();
		
		driver.findElement(By.linkText("Contact Us")).click();
		
		 Set<String> allwindiwids = driver.getWindowHandles();
		 for(String window:allwindiwids) {
			  driver.switchTo().window(window);
			 if(driver.getTitle().contains(parent)) {
				 driver.close();
				 System.out.println("Successful Traves Back To Parent Window"); 
			 }
		 }
		 
    	
//    	
//    	//To get the text of all the links
		 driver.findElement(By.linkText("Link in New Tab")).click();
		 WebElement Contact1 = driver.findElement(By.linkText("Contact Us"));
        System.out.println(Contact1.getText());
    	WebElement About1 = driver.findElement(By.linkText("About Us"));	
    	System.out.println(About1.getText());
    	WebElement Career1 = driver.findElement(By.linkText("Career"));
    	System.out.println(Career1.getText());
    	WebElement Payments1 = driver.findElement(By.linkText("Payments"));
    	System.out.println(Payments1.getText());
    	WebElement Shippings1 = driver.findElement(By.linkText("Shippings"));
    	System.out.println(Shippings1.getText());
    	WebElement Returns1 = driver.findElement(By.xpath("//a[contains(text(),'Cancellation')]"));
    	System.out.println(Returns1.getText());
    	WebElement FAQ1 = driver.findElement(By.linkText("FAQ"));
    	System.out.println(FAQ1.getText());
    	WebElement Policy1 = driver.findElement(By.linkText("Return Policy"));
    	System.out.println(Policy1.getText());
    	WebElement Terms1 = driver.findElement(By.linkText("Terms of use"));	
    	System.out.println(Terms1.getText());
    	WebElement Security1 = driver.findElement(By.linkText("Security"));
    	System.out.println(Security1.getText());
    	WebElement Privacy1 = driver.findElement(By.linkText("Privacy"));
    	System.out.println(Privacy1.getText());
    	WebElement Facebook1 = driver.findElement(By.linkText("Facebook"));
    	System.out.println(Facebook1.getText());
    	WebElement Twitter1 = driver.findElement(By.linkText("Twitter"));	
    	System.out.println(Twitter1.getText());
    	WebElement Youtube1 = driver.findElement(By.linkText("Youtube"));
    	System.out.println(Youtube1.getText());
    	System.out.println(" Successfull print all text");
    	
    	// count the links are present on the webpage
    	List<WebElement> tag = driver.findElements(By.tagName("a"));
    	System.out.println("No of Links :- "+tag.size());
    	
    	
    	//To  get each page Title
    	driver.findElement(By.linkText("Link in New Tab")).click();
    	driver.findElement(By.linkText("Contact Us")).click();
    	String titleOfContact = driver.getTitle();
    	System.out.println(titleOfContact);
    	
    	driver.findElement(By.linkText("About Us")).click();
    	String titleOfAbout = driver.getTitle();
    	System.out.println(titleOfAbout);
    	
    	driver.findElement(By.linkText("Career")).click();
    	String titleOfCareer = driver.getTitle();
    	System.out.println(titleOfCareer);
    	
    	driver.findElement(By.linkText("Payments")).click();
    	String titleOfPayments = driver.getTitle();
    	System.out.println(titleOfPayments);
    	
    	driver.findElement(By.linkText("Shippings")).click();
    	String titleOfShippings = driver.getTitle();
    	System.out.println(titleOfShippings);
    	
    	driver.findElement(By.xpath("//a[contains(text(),'Cancellation')]")).click();
    	String titleOfCancellation = driver.getTitle();
    	System.out.println(titleOfCancellation);
    	
    	driver.findElement(By.linkText("FAQ")).click();
    	String titleOfFAQ = driver.getTitle();
    	System.out.println(titleOfFAQ);
    	
    	driver.findElement(By.linkText("Return Policy")).click();
    	String titleOfPolicy = driver.getTitle();
    	System.out.println(titleOfPolicy);
    	
    	driver.findElement(By.linkText("Terms of use")).click();
    	String titleOfTerms = driver.getTitle();
    	System.out.println(titleOfTerms);
    	
    	driver.findElement(By.linkText("Security")).click();
    	String titleOfSecurity = driver.getTitle();
    	System.out.println(titleOfSecurity);
    	
    	driver.findElement(By.linkText("Privacy")).click();
    	String titleOfPrivacy = driver.getTitle();
    	System.out.println(titleOfPrivacy);
    	
    	driver.findElement(By.linkText("Facebook")).click();
    	String titleOfFacebook = driver.getTitle();
    	System.out.println(titleOfFacebook);
    	
    	driver.findElement(By.linkText("Twitter")).click();
    	String titleOfTwitter = driver.getTitle();
    	System.out.println(titleOfTwitter);
    	
    	driver.findElement(By.linkText("Youtube")).click();
    	String titleOfYoutube = driver.getTitle();
    	System.out.println(titleOfYoutube);
    	
    	System.out.println("Successfull get all the title");
    	
    	
    	
    	//To  get each page URL
    	String uriOfContact=driver.getCurrentUrl();
    	System.out.println(uriOfContact);
    	
    	String uriOfAbout=driver.getCurrentUrl();
    	System.out.println(uriOfAbout);
    	
    	String uriOfCareer=driver.getCurrentUrl();
    	System.out.println(uriOfCareer);
    	
    	String uriOfPayments=driver.getCurrentUrl();
    	System.out.println(uriOfPayments);
    	
    	String uriOfShippings=driver.getCurrentUrl();
    	System.out.println(uriOfShippings);
    	
    	String uriOfCancellation=driver.getCurrentUrl();
    	System.out.println(uriOfCancellation);
    	
    	String uriOfFAQ=driver.getCurrentUrl();
    	System.out.println(uriOfFAQ);
    	
    	String uriOfPolicy=driver.getCurrentUrl();
    	System.out.println(uriOfPolicy);
    	
    	String uriOfTerms=driver.getCurrentUrl();
    	System.out.println(uriOfTerms);
    	
    	String uriOfSecurity=driver.getCurrentUrl();
    	System.out.println(uriOfSecurity);
    	
    	String uriOfPrivacy=driver.getCurrentUrl();
    	System.out.println(uriOfPrivacy);
    	
    	String uriOfFacebook=driver.getCurrentUrl();
    	System.out.println(uriOfFacebook);
    	
    	String uriOfTwitter=driver.getCurrentUrl();
    	System.out.println(uriOfTwitter);
    	
    	String uriOfYoutube=driver.getCurrentUrl();
    	System.out.println(uriOfYoutube);
    	System.out.println("Successful get all the Url");
    	
	}

}
