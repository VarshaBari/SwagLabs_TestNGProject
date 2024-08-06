package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseClass {

	@Test
	public void TC01_LoginSuccessTest() {

		LoginPage lp = new LoginPage();
		HomePage hp = new HomePage();
	
		lp.LoginFunction("standard_user", "secret_sauce");
		String text = hp.verifyHomePage();
		// System.out.println(text);
		Assert.assertEquals("Products", text);
		

	}

	@Test
	public void TC02_LoginFailureTest() {

		LoginPage lp = new LoginPage();
		lp.LoginFunction("standard_user", "secret");
		// lp.ValidateErrorMsg("Epic sadface: Username and password do not match anys user in this service");
		String errormassage = lp.ValidateErrorMsg();
		//System.out.println(errormassage);
		Assert.assertEquals("Epic sadface: Username and password do not match any user in this service", errormassage);

	}
	
	@Test
	public void TC03_LockedUserTest() {
		
		LoginPage lp= new LoginPage();
		lp.LoginFunction("locked_out_user", "secret_sauce");
		String errorMassage=lp.ValidateErrorMsg();
		System.out.println(errorMassage);
	    Assert.assertEquals("Epic sadface: Sorry, this user has been locked out.", errorMassage);
	
		
		
	}

}
