package testcases;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends BaseClass{
	
	@Test
	
	public void TC01_productList() {
		
		LoginPage lp= new LoginPage();
		lp.LoginFunction("standard_user", "secret_sauce");
		
		
		HomePage hp=new HomePage();
	
		hp.getProduct();
		
		hp.addToshoppingCart();
	
		
	
	}

}
