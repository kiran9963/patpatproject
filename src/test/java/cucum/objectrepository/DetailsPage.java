package cucum.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucum.resources.Base;

public class DetailsPage extends Base {
	public DetailsPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement fname;
	
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lname;
	
	@FindBy(xpath="//select[@name='country']")
	private WebElement country;
	
	@FindBy(xpath="//input[@name='address']")
	private WebElement address1;
	
	@FindBy(xpath="//input[@name='suburb']")
	private WebElement address2;
	
	@FindBy(xpath="//input[@name='region']")
	private WebElement village;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement city;
	
	@FindBy(xpath="//select[@name='state']")
	
	private WebElement state;
	
@FindBy(xpath="//input[@name='postcode']")
	
	private WebElement postalcode;

@FindBy(xpath="//input[@name='email']")

private WebElement email;

@FindBy(xpath="//input[@name='phonenumber']")

private WebElement phone;

@FindBy(xpath="//input[@aria-label='input card number']")

private WebElement card;

@FindBy(xpath="//select[@name='Month']")

private WebElement expMonth;

@FindBy(xpath="//select[@name='Year']")

private WebElement expYear;

@FindBy(xpath="//input[@aria-label='input cart cvv']")

private WebElement cvv;



public WebElement getExpMonth() {
	return expMonth;
}

public WebElement getExpYear() {
	return expYear;
}

public WebElement getCvv() {
	return cvv;
}

public WebElement getFname() {
	return fname;
}

public WebElement getLname() {
	return lname;
}

public WebElement getCountry() {
	return country;
}

public WebElement getAddress1() {
	return address1;
}

public WebElement getAddress2() {
	return address2;
}

public WebElement getVillage() {
	return village;
}

public WebElement getCity() {
	return city;
}

public WebElement getState() {
	return state;
}

public WebElement getPostalcode() {
	return postalcode;
}

public WebElement getEmail() {
	return email;
}

public WebElement getPhone() {
	return phone;
}

public WebElement getCard() {
	return card;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
