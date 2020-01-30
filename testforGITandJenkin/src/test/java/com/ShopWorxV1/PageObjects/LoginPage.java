package com.ShopWorxV1.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(xpath=("//a[@id='ctl00_Header_lnkSignIn']"))
	
	WebElement Login;
	
	@FindBy(xpath=("//input[@type='text']"))
	
	WebElement txtUserName;
	
	@FindBy(xpath=("//input[@type='password']"))

	WebElement txtPassword;
	
	@FindBy(xpath=("//input[@type='submit']"))
	
	WebElement btnLogin;
		
	public void clickSubmit()
	{
		Login.click();
	}	
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
		
	public void clickLogin()
	{
		btnLogin.click();
	}
}
