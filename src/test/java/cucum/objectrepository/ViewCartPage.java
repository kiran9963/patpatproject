package cucum.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucum.resources.Base;

public class ViewCartPage extends Base {
	public ViewCartPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[text()='View Cart'])[2]")
	private WebElement viewcart;
	public WebElement getViewcart() {
		return viewcart;
	}

}
