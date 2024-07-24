package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import testcases.BaseClass;

public class HomePage {
	
	WebDriver driver = BaseClass.driver;

	//==================== Locators ======================

		@FindBy(xpath = "//div[text()='Products']")
		WebElement producttitle;
		
		public HomePage() {

			PageFactory.initElements(driver, this);

		}

		
		public String verifyHomePage() {
		String productText=producttitle.getText();
		return productText;	
			
		}
		
		

}
