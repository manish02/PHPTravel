package com.dias.demoproj.constants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dias.demoproj.WebdriverInstance;

public class SignupOR extends WebdriverInstance {
	
	public SignupOR(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//div[contains(@class,'dropdown dropdown-login dropdown-tab')]")
	private WebElement MYACC_BTN;
	@FindBy(xpath="//*[@id='header-waypoint-sticky']//a[contains(text(),'Sign Up')]")
	private WebElement SIGNUP_BTN;
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement FIRSTNAMETXTBOX;
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement LASTNAMETXTBOX;
	@FindBy(xpath="//input[@name='phone']")
	private WebElement PHONETXTBOX;
	@FindBy(xpath="//input[@name='email']")
	private WebElement EMAILTXTBOX;
	@FindBy(xpath="//input[@name='password']")
	private WebElement PASSWORDBOX;
	@FindBy(xpath="//input[@name='confirmpassword']")
	private WebElement CONFIRMPASSWORDBOX;
	@FindBy(xpath="//*[@type='submit']")
	private WebElement SUBMIT_BTN;
	
	public void signup() 
	{
		System.out.println("Hello Dear in Signup");
		this.MYACC_BTN.click();
		this.SIGNUP_BTN.click();
		this.FIRSTNAMETXTBOX.sendKeys("Mani");
		this.LASTNAMETXTBOX.sendKeys("Goswami");
		this.PHONETXTBOX.sendKeys("8899123456");
		this.EMAILTXTBOX.sendKeys("hello@gmail.com");
		this.PASSWORDBOX.sendKeys("Abc12345");
		this.CONFIRMPASSWORDBOX.sendKeys("Abc12345");
		this.SUBMIT_BTN.click();
	}
	

}
