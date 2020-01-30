package com.ShopWorxV1.TestCeses;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.ShopWorxV1.Utility.ReadConfig;
import com.ShopWorxV1.Utility.TestResultXMLUtility;

public class BaseClass 
{
	
	public WebDriver ldriver;
	 //create a new instance of Test Result Xml Utility Object
	 TestResultXMLUtility testResultXmlUtility=new TestResultXMLUtility();
	 //create a list object that will contain number of test cases
	 List<TestCases> testcases=new ArrayList<TestCases>();
	 	
	ReadConfig readconfig=new ReadConfig();
	
	public String baseURL=ReadConfig.getApplicationURL();
	public String username=ReadConfig.getUsername();
	public String password=ReadConfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	@BeforeSuite
	public void setup()
	{			
		System.setProperty("webdriver.chrome.driver","D:\\velocity sw testing\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		logger =  Logger.getLogger("Sample");
		PropertyConfigurator.configure("log4j.properties");
		// you can also write other browser code here
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(baseURL);
	}
	
	@AfterSuite
	public void tearDown() 
	{
		driver.findElement(By.xpath("//a[@id='ctl00_Header_lnkSignIn']")).click();
		 
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 driver.close();
		 //quit the driver
		 driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname +"."+timestamp+ ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
}
