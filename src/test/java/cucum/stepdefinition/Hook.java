package cucum.stepdefinition;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucum.resources.Base;
import cucumber.api.java.Before;

public class Hook  {
	

	@Before
	public void I_want_to_launch_the_Browser() throws AWTException {
		System.out.println("before");
		
		
		Base.getDriver();
		Base.loadurl("https://www.patpat.com");
		Base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		
}
	@Test
	public void test() {
		System.out.println("test1");
	}
} 