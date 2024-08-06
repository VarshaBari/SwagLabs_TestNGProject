package testcases;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.CheckoutInfoPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage;

public class CheckoutPageTest extends BaseClass {

	@Test

	public void TC01_clickonCkeckout() {
		LoginPage lp = new LoginPage();
		lp.LoginFunction("standard_user", "secret_sauce");

		HomePage hp = new HomePage();

		hp.addToshoppingCart();

		CheckoutPage cp = new CheckoutPage();
		cp.clickonCheckout();
	}

	
	
		@Test
	public void TC03_verifyCheckOutHeaderText() {
		LoginPage lp = new LoginPage();
		lp.LoginFunction("standard_user", "secret_sauce");

		HomePage hp = new HomePage();

		hp.addToshoppingCart();

		CheckoutPage cp = new CheckoutPage();

		String headerName = cp.verifyCheckoutPage();
		System.out.println(headerName);
		Assert.assertEquals("Your Cart", headerName);
	} 

}
