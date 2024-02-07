package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Welcome_Text extends Base_class{
 
	@Test(priority = 1)
	public void register() {
		WelcomePage w=new WelcomePage(driver);
		w.getRegister_Link().click();
		 
		RegisterPage r=new RegisterPage(driver);
		r.getFirstName().sendKeys("Karan");
		r.getLastName().sendKeys("Jena");
		r.getEmail().sendKeys("jenakaran5@gmail.com");
		r.getPassword().sendKeys("Karan@000");
		r.getConfirmPassword().sendKeys("Karan@000");
		r.getRegisterlink().click();
		
	}
	
	@Test(priority = 2)
	public void login() {
		WelcomePage w=new WelcomePage(driver);
		w.getLog_in().click();
		 
		Login_Page l=new Login_Page(driver);
		l.getUsername().sendKeys("jenakaran3@gmail.com");
		l.getPassword().sendKeys("Karan@000");
		l.getLoginlink().click();
	}
	
	@Test(priority = 3)
	public void digital() {
		WelcomePage w=new WelcomePage(driver);
		w.getDigital_Download().click();
		
		Digital_Download d=new Digital_Download(driver);
		d.getAddtocart_1().click();
		d.getAddtocart_2().click();
		d.getAddtocart_3().click();
	}
	
	@Test(priority = 4)
	public void shopping() {
		WelcomePage w=new WelcomePage(driver);
		w.getShopping_cart().click();
		
		Shopping_Cart_Page s=new Shopping_Cart_Page(driver);
		s.getItem_1().click();
		s.getItem_2().click();
		s.getItem_3().click();
		s.getTerms_condition().click();
		
	}
	@Test(priority = 5)
	public void checkout() {
		WelcomePage w=new WelcomePage(driver);
		w.getCheckout().click();
		
		Checkout_Page c=new Checkout_Page(driver);
		c.getFirstname().sendKeys("Karan");
		c.getLastname().sendKeys("Jena");
		c.getEmail().sendKeys("jenakran79@gmail.com");
		c.getCompany().sendKeys("Qspider");
		c.getCity().sendKeys("Banglore");
		c.getAddress1().sendKeys("Murgeshpallya");
		c.getAddress2().sendKeys("Ninja_colin");
		c.getZipPostalCode().sendKeys("7567789");
		c.getPhoneNumber().sendKeys("9337671293");
		c.getFaxNumber().sendKeys("9937708221");
	}
}
