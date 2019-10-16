package cucum.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucum.resources.Base;

public class SelectItem extends Base{
	public SelectItem() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//img[@id='407528']")
	private WebElement imgClick;
	public WebElement getImgClick() {
		return imgClick;
	}

}
