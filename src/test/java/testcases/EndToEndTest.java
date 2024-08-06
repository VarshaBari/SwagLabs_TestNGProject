package testcases;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.CheckOutOverviewPage;
import pages.CheckoutInfoPage;
import pages.CheckoutPage;
import pages.ConfirmationPage;
import pages.HomePage;
import pages.LoginPage;

public class EndToEndTest extends BaseClass {

	@Test
	public void TC01_EndToEndScenario() {

		LoginPage lp = new LoginPage();
		lp.LoginFunction("standard_user", "secret_sauce");

		HomePage hp = new HomePage();

		hp.addToshoppingCart();

		CheckoutPage cp = new CheckoutPage();
		cp.clickonCheckout();

		CheckoutInfoPage cf = new CheckoutInfoPage();
		String infotext = cf.checkoutinfoText();
		System.out.println(infotext);
		Assert.assertEquals("Checkout: Your Information", infotext);

		cf.checkOutInfoDetails("Neel", "Ambani", "411008");

		CheckOutOverviewPage cop = new CheckOutOverviewPage();

		String overviewText = cop.verifyheaderovervieText();

		Assert.assertEquals("Checkout: Overview", overviewText);

		cop.finalcheckOut();

		ConfirmationPage confirm = new ConfirmationPage();
		String confirmOrdertext = confirm.orderConfirmationMassage();
		Assert.assertTrue(confirmOrdertext.equalsIgnoreCase("THANK YOU FOR YOUR ORDER"));

	}

}
