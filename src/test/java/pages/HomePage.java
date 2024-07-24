package pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import testcases.BaseClass;

public class HomePage {

	WebDriver driver = BaseClass.driver;

	// ==================== Locators ======================

	@FindBy(xpath = "//div[text()='Products']")
	WebElement producttitle;

	@FindBy(xpath = "//div[@class=\"inventory_item_name\"]")
	List<WebElement> productlist;

	@FindBy(xpath = "//button[text()='ADD TO CART']")
	WebElement ATCbutton;

	@FindBy(css = "div.shopping_cart_container")
	WebElement shoppingCart;
	
	@FindBy(css=".fa-layers-counter.shopping_cart_badge")
	WebElement cartcounter;

	public HomePage() {

		PageFactory.initElements(driver, this);

	}

	public String verifyHomePage() {
		String productText = producttitle.getText();
		return productText;

	}

	public void getProduct() {
		
	String[] itemsNeeded={"Sauce Labs Backpack","Sauce Labs Bike Light"};

		for (int i = 0; i < productlist.size(); i++) {

			
			
			String productsnames = productlist.get(i).getText();
			
			List<String> itemsneededList=Arrays.asList(itemsNeeded);
	

			if (itemsneededList.contains(productsnames)) {

				String initialText = ATCbutton.getText();

				ATCbutton.click();

				String newText = ATCbutton.getText();

			}

		}

	}

	public void addToshoppingCart() {
		shoppingCart.click();
		
	}

}
