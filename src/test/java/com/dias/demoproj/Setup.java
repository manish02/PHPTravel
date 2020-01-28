package com.dias.demoproj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Setup {
	/**
	 * @author Manish Goswami
	 * This class provides you the driver setup.
	 */
	
	//public WebDriver driver = null;
	protected static WebDriver driver = null;
	
	public final String  CHROME_PROPERTY_KEY = "webdriver.chrome.driver";
	public final String CHROME_VALUE = "..//GoodMorningMani//src//test//resources//chromedriver.exe";
	
	@BeforeSuite
	
	public void setDriver() throws Exception{
		System.setProperty(CHROME_PROPERTY_KEY, CHROME_VALUE);
		
		driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/");
		driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
	}
	
	public WebDriver getDriver()
	{
		return (driver);
		
	}
	

}
