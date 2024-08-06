package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.BaseClass;

public class CheckoutInfoPage {

	WebDriver driver = BaseClass.driver;

	public CheckoutInfoPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[text()='Checkout: Your Information']")
	WebElement checkoutInfoText;

	@FindBy(id = "first-name")
	WebElement firstname;

	@FindBy(id = "last-name")
	WebElement lastname;

	@FindBy(id = "postal-code")
	WebElement postalCode;

	@FindBy(xpath = "//input[@value=\"CONTINUE\"]")
	WebElement btnContinue;

	public String checkoutinfoText() {
		String checkInfotext = checkoutInfoText.getText();
		return checkInfotext;
	}

	public void checkOutInfoDetails(String FirstName, String LastNAme, String PostalCode) {

		firstname.sendKeys(FirstName);
		lastname.sendKeys(LastNAme);
		postalCode.sendKeys(PostalCode);
		btnContinue.click();

		
	}

}
