package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout_Page extends Base_Page{

	public Checkout_Page(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='BillingNewAddress_FirstName']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_LastName']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_Email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_Company']")
	private WebElement company;
	

	@FindBy(xpath="//input[@id='BillingNewAddress_City']")
	private WebElement city;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_Address1']")
	private WebElement address1;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_Address2']")
	private WebElement address2;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_ZipPostalCode']")
	private WebElement zipPostalCode;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_PhoneNumber']")
	private WebElement phoneNumber;
	
	@FindBy(xpath="//input[@id='BillingNewAddress_FaxNumber']")
	private WebElement faxNumber;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getZipPostalCode() {
		return zipPostalCode;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getFaxNumber() {
		return faxNumber;
	}
	
	
	
	
}
