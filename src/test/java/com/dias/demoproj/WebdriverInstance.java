package com.dias.demoproj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WebdriverInstance extends Setup {
	
	WebDriver driver;
	
	public WebdriverInstance(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
