package cucum.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucum.resources.Base;

public class SearchPage extends Base {
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//input[@aria-label='search']")
private WebElement text;

@FindBy(xpath="//button[@aria-label='search']")
private WebElement clicksearch;

public WebElement getText() {
	return text;
}

public WebElement getClicksearch() {
	return clicksearch;
}

}
