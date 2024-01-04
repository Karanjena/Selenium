package advanceSelenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnDependsonMethod {

	
	@Test
	public void createAccount() {
		Reporter.log("Account created Successfully",true);
	}
	
	//@Test(dependsOnMethods ="createAccount" )
	public void editAccount() {
		Reporter.log("Account Edited Successfully",true);
	}
	
	
	//@Test(dependsOnMethods ="editAccount" )
	@Test(dependsOnMethods ={"createAccount","editAccount" })
	public void deleteAccount() {
		Reporter.log("Account Deleted Successfully",true);
	}
}
