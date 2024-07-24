package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testcases.BaseClass;

public class LoginPage {

	WebDriver driver = BaseClass.driver;

//==================== Locators ======================

	@FindBy(id = "user-name")
	WebElement UserName;

	@FindBy(id = "password")
	WebElement Password;

	@FindBy(id = "login-button")
	WebElement LoginBtn;
	
	@FindBy(xpath="//h3[@data-test='error']")
	WebElement errorText;
	
	

	public LoginPage() {

		PageFactory.initElements(driver, this);

	}

	// ====================== Functions =====================

	public void LoginFunction(String UserNameVal, String PwdVal) {

		UserName.sendKeys(UserNameVal);

		Password.sendKeys(PwdVal);

		LoginBtn.click();
		

	}
	
	public String ValidateErrorMsg() {

		String ActMsg = errorText.getText();
		return ActMsg;
	}
	

}
