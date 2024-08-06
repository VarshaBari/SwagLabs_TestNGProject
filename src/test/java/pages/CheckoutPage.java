package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import testcases.BaseClass;

public class CheckoutPage {

	WebDriver driver = BaseClass.driver;

	public CheckoutPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(css = ".btn_action.checkout_button")
	WebElement buttonCheckout;

	@FindBy(xpath = "//div[text()='Your Cart']")
	WebElement checkOutHeaderText;

	public void clickonCheckout() {
		buttonCheckout.click();

	}

	public String verifyCheckoutPage() {
		Assert.assertTrue(checkOutHeaderText.isDisplayed());
		String headerText = checkOutHeaderText.getText();

		return headerText;
	}
}
