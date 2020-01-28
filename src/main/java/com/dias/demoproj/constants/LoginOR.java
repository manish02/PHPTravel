package com.dias.demoproj.constants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dias.demoproj.WebdriverInstance;

public class LoginOR extends WebdriverInstance {
	
	//public static final By MYACC_BTN= By.cssSelector("#header-waypoint-sticky  li:nth-child(3) > div");
	//public static final By LOGIN_BTN= By.xpath("//*[@id='header-waypoint-sticky']//a[contains(text(),'Login')]");
	//public static final By USR_NM= By.name("username");
	//public static final By PASSWORD= By.name("password");
	//public static final By SUBMIT_BTN= By.xpath("//button[@type='submit']");
	
	public LoginOR(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//@FindBy(css="#header-waypoint-sticky  li:nth-child(3) > div")//*[@id="dropdownCurrency"]
	@FindBy(xpath="//div[contains(@class,'dropdown dropdown-login dropdown-tab')]")
	private WebElement MYACC_BTN;
	@FindBy(xpath="//*[@id='header-waypoint-sticky']//a[contains(text(),'Login')]")
	private WebElement LOGIN_BTN;
	@FindBy(name="username")
	private WebElement USR_NM;
	@FindBy(name="password")
	private WebElement PASSWORD;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement SUBMIT_BTN;
	
	public void signlogin() 
	{
		System.out.println("Hello Dear Good morning");
		this.MYACC_BTN.click();
		this.LOGIN_BTN.click();
		this.USR_NM.sendKeys("user@phptravels.com");
		this.PASSWORD.sendKeys("demouser");
		this.SUBMIT_BTN.click();
	}
	
	

}
