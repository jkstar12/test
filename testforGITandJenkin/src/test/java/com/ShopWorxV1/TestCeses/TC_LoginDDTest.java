package com.ShopWorxV1.TestCeses;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ShopWorxV1.PageObjects.LoginPage;
import com.ShopWorxV1.Utility.XLUtil;

public class TC_LoginDDTest extends BaseClass 
{
	@AfterMethod
	 public void BrowseNotice()
	 {
		 driver.findElement(By.xpath("//a[@title='Browse Notices']")).click();
		 	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtKeywords']")).clear(); 
	 }
	@AfterMethod
	public void XMLreport() throws ParserConfigurationException
	{
		driver.findElement(By.xpath("//a[@id='ctl00_Header_lnkSignIn']")).click();
		 
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	@Test(dataProvider="LoginData")
	public void loginDDT(String user,String pwd) throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.clickSubmit();
		lp.setUserName(user);
		logger.info("user name provided");
		lp.setPassword(pwd);
		logger.info("password provided");
		lp.clickLogin();
		
		Thread.sleep(3000);
	
	}
	
	
	@DataProvider(name="LoginData")
	String [] [] getData () throws IOException
	{
		String path = "C:\\Users\\user1\\git\\Assignment\\Sample\\src\\test\\java\\com\\ShopWorxV1\\TestData\\LoginData.xls";
		int rownum = XLUtil.gerRowCount(path, "Sheet1");
		int cellnum = XLUtil.getCellCount(path, "Sheet1", 1);
		
		String [] [] logindata= new String [rownum][cellnum];
		for(int i=1;i<rownum;i++)
		{
			for(int j=0;j<cellnum;j++)
			{
				logindata[i-1][j]=XLUtil.getCellData(path,"Sheet1", i,j);//1 0
			}
		}
		return logindata;
	}
}
