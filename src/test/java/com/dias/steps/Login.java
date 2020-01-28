package com.dias.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.dias.demoproj.Setup;
import com.dias.demoproj.constants.LoginOR;

public class Login extends Setup {
	
	@Test
	public void logintest()
	{
	//driver.findElement(LoginOR.MYACC_BTN).click();
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS); 
	//driver.findElement(LoginOR.LOGIN_BTN).click();
	//driver.findElement(LoginOR.USR_NM).sendKeys("user@phptravels.com");
	//driver.findElement(LoginOR.PASSWORD).sendKeys("demouser");
	//driver.findElement(LoginOR.SUBMIT_BTN).click();
		
		LoginOR l1=new LoginOR(driver);
		l1.signlogin();
	
	}

}
