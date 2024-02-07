package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page extends Base_Page {

	public Login_Page(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//input[@id='Email']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement loginlink;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLoginlink() {
		return loginlink;
	}

}
