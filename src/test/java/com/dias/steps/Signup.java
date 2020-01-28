package com.dias.steps;

import org.testng.annotations.Test;

import com.dias.demoproj.Setup;
import com.dias.demoproj.constants.LoginOR;
import com.dias.demoproj.constants.SignupOR;

public class Signup extends Setup {
	
	@Test
	public void logintest()
	{
	
		SignupOR l1=new SignupOR(driver);
		l1.signup();
	
	}

}
