package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Digital_Download extends Base_Page {

	
	public Digital_Download(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//a[.='3rd Album']/../../../..//input[@value='Add to cart']")
	private WebElement addtocart_1;
	
	@FindBy(xpath="//a[.='Music 2']/../../../..//input[@value='Add to cart']")
	private WebElement addtocart_2;
	
	@FindBy(xpath="(//input[@type='button'])[5]")
	private WebElement addtocart_3;

	public WebElement getAddtocart_1() {
		return addtocart_1;
	}
	
	public WebElement getAddtocart_2() {
		return addtocart_2;
	}

	public WebElement getAddtocart_3() {
		return addtocart_3;
	}

}
