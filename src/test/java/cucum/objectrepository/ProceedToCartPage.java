package cucum.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucum.resources.Base;

public class ProceedToCartPage extends Base {
	public ProceedToCartPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Proceed to Checkout']")
	private WebElement proceed;
	public WebElement getProceed() {
		return proceed;
	}
	

}
