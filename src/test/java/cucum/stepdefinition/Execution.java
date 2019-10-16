package cucum.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucum.objectrepository.AddTocartPage;
import cucum.objectrepository.DetailsPage;
import cucum.objectrepository.ProceedToCartPage;
import cucum.objectrepository.SearchPage;
import cucum.objectrepository.SelectItem;
import cucum.objectrepository.ViewCartPage;
import cucum.resources.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Execution extends Base {
static Robot r;
	@When("I want to enter the product name")
	public void i_want_to_enter_the_product_name() throws AWTException {
 r=new Robot();
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		SearchPage sp = new SearchPage();
		sendKeys(sp.getText(), "Baby girl");
		click(sp.getClicksearch());

	}

	@When("I want to click the img")
	public void i_want_to_click_the_img() {
		SelectItem si=new SelectItem();
	click(si.getImgClick());
	
		
	}
	
	@When("I want to click the Addtocart")
	public void i_want_to_click_the_Addtocart() {
		AddTocartPage add=new AddTocartPage();
		click(add.getAddtocart());
	
}
	@When("I want to click the Viewcart")
	public void i_want_to_click_the_Viewcart() throws Throwable {
		Base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Thread.sleep(8000);
		/*r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);	
		r.keyRelease(KeyEvent.VK_ENTER);*/
		ViewCartPage v=new ViewCartPage();
		click(v.getViewcart());
		System.out.println("ok");
		/*WebDriverWait w= new WebDriverWait(driver, 100);
		WebElement ele = w.until(ExpectedConditions.elementToBeClickable(By.xpath("viewcart")));*/
		
	}
	@When("I want to click the ProceedToCart")
	public void i_want_to_click_the_ProceedToCart() throws Throwable {
	
		ProceedToCartPage pr=new ProceedToCartPage();
		click(pr.getProceed());
			
	}
	@Then("I want provide the details")
	public void i_want_provide_the_details() throws Throwable {
		DetailsPage dp=new DetailsPage();
		sendKeys(dp.getFname(), "Kiran");
		sendKeys(dp.getLname(),"kk");
		select(dp.getCountry(), "India");
		sendKeys(dp.getAddress1(),"chennai1");
		sendKeys(dp.getAddress2()," chennai2");
		sendKeys(dp.getVillage(), "thoripakam");
		sendKeys(dp.getCity(), "Town");
		select(dp.getState(), "Andhra Pradesh");
		sendKeys(dp.getPostalcode(), "1122334455");
		sendKeys(dp.getEmail(), "kk@gmail.com");
		sendKeys(dp.getPhone(), "998877665544");
		sendKeys(dp.getCard(), "00112233445566");
		select(dp.getExpMonth(), "02");
		select(dp.getExpYear(), "2022");
		sendKeys(dp.getCvv(), "001");
	
	
	}
	
	
	
	
}