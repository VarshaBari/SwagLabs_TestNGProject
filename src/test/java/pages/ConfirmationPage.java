package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.BaseClass;

public class ConfirmationPage {
	
	WebDriver driver = BaseClass.driver;

	public ConfirmationPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(css = ".complete-header")
	WebElement confirmationText;
	
	public String orderConfirmationMassage() {
		
	return	confirmationText.getText();
	}

}
