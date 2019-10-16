package cucum.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucum.resources.Base;

public class AddTocartPage extends Base {
	public AddTocartPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Add to Cart']")
	private WebElement addtocart;
	public WebElement getAddtocart() { 
		return addtocart;
	}

}
