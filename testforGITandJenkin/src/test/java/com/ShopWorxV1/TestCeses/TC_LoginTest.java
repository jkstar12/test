package com.ShopWorxV1.TestCeses;

import java.io.IOException;
import org.testng.annotations.Test;
import com.ShopWorxV1.PageObjects.LoginPage;

public class TC_LoginTest extends BaseClass
{
	@Test
	public void loginTest() throws IOException 
	{
			
		
		
		LoginPage lp=new LoginPage(driver);
		lp.clickSubmit();
		logger.info("clicked on login button");
		
		lp.setUserName(username);
		logger.info("username entered");
			
		lp.setPassword(password);
		logger.info("password enterd");
		
		lp.clickLogin();
		logger.info("click on login");
		
		captureScreen(driver,"Login Page");
		logger.info("screen shot is taken for login page");
		
	}
}
