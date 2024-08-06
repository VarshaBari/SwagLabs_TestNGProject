package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.BaseClass;

public class CheckOutOverviewPage {
	
	WebDriver driver= BaseClass.driver;
	
	public CheckOutOverviewPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".subheader")
	WebElement overviewHeaderText;
	
	
	@FindBy(xpath="//a[text()='FINISH']")
	WebElement btnFinish;
	
	public void finalcheckOut() {
		btnFinish.click();
	}
	
	public String verifyheaderovervieText() {
	return	overviewHeaderText.getText();
	}
	
	
	

}
