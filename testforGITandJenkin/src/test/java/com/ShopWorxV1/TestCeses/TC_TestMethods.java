package com.ShopWorxV1.TestCeses;

import java.io.IOException;
//import java.util.concurrent.TimeUnit;
import javax.xml.parsers.ParserConfigurationException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TC_TestMethods extends BaseClass
{
	@AfterMethod
	 public void BrowseNotice()
	 {
		 driver.findElement(By.xpath("//a[@title='Browse Notices']")).click();
		 	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtKeywords']")).clear(); 
	 }
	@Test
	  public void TC001() throws IOException
		{
	 		driver.findElement(By.xpath("//a[@title='Browse Notices']")).click();
		 	driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtKeywords']")).clear();
		    driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtKeywords']")).sendKeys("EU thresholds");
			driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
			driver.findElement(By.linkText("SDP - Introduction to Tender Perth")).click();
			captureScreen(driver,"MAR347241");
			driver.findElement(By.xpath("//a[@id='Tab2']")).click();
			
			for (int second = 0;; second++) 
			{
		        if (second >= 60) Assert.fail("timeout");
		        try { 
		          Assert.assertEquals("Perth & Kinross Council", driver.findElement(By.xpath("//p[@style='margin-left:3em;']")).getText());
		          //add test case to the testcases list as pass
		          testcases.add(new TestCases("001","https://www.publiccontractsscotland.gov.uk/search/Search_AuthProfile.aspx?ID=AA00372","AGraham@pkc.gov.uk"));
		         // testResultXmlUtility.WriteTestResultToXml("TestResult.xml", testcases);
		          break;
		        	} 
		        catch (Exception e) 
		        {
		        	System.out.println(e.getMessage());
		        }
		     }		
	 	 }
//	@Test
//	 public void TC002() throws IOException
//	 {
//		 	
//			driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtKeywords']")).sendKeys("stage 2 ");
//			driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
//			driver.findElement(By.linkText("NAC/5013 New Build Primary School, Kilbirnie")).click();
//			captureScreen(driver,"JAN377614");
//			
//			driver.findElement(By.xpath("//a[@id='Tab2']")).click();
//			for (int second = 0;; second++) {
//		        if (second >= 60) Assert.fail("timeout");
//		        try { 
//		          Assert.assertEquals("North Ayrshire Council", driver.findElement(By.xpath("//p[@style='margin-left:3em;']")).getText());
//		          //add test case to the testcases list as pass
//		          testcases.add(new TestCases("002","https://www.publiccontractsscotland.gov.uk/search/Search_AuthProfile.aspx?ID=AA00337","procurement@north-ayrshire.gov.uk"));
//		         // 
//		          
//		          break;
//		     } 
//		        catch (Exception e) {
//		        	System.out.println(e.getMessage());
//		        }
//		          
//		        }		 
//	 }
//	 @Test
//	 public void TC003() throws IOException
//	 {
//		 
//			driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtKeywords']")).sendKeys("stage 2 ");
//			driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
//			driver.findElement(By.linkText("Domestic Smoke and CO Detection Installation / Upgrade Programme")).click();
//			captureScreen(driver,"JAN376934");
//			
//			driver.findElement(By.xpath("//a[@id='Tab2']")).click();
//			for (int second = 0;; second++) {
//		        if (second >= 60) Assert.fail("timeout");
//		        try { 
//		          Assert.assertEquals("Langstane Housing Association Ltd", driver.findElement(By.xpath("//p[@style='margin-left:3em;']")).getText());
//		          //add test case to the testcases list as pass
//		          testcases.add(new TestCases("003","https://www.publiccontractsscotland.gov.uk/search/Search_AuthProfile.aspx?ID=AA14482","info@langstane-ha.co.uk"));
//		          
//		          
//		          break;
//		     } 
//		        catch (Exception e) {
//		        	System.out.println(e.getMessage());
//		        }
//		          
//		        }	
//	 }
//	 @Test
//	 public void TC004() throws IOException
//	 {
//		
//			driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtKeywords']")).sendKeys("stage 2 ");
//			driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
//			driver.findElement(By.linkText("Burrell Renaissance - IT Hardware")).click();
//			captureScreen(driver,"JAN376653");
//			driver.findElement(By.xpath("//a[@id='Tab2']")).click();
//		 
//			for (int second = 0;; second++) {
//		        if (second >= 60) Assert.fail("timeout");
//		        try { 
//		          Assert.assertEquals("Glasgow City Council", driver.findElement(By.xpath("//p[@style='margin-left:3em;']")).getText());
//		          //add test case to the testcases list as pass
//		          testcases.add(new TestCases("004","https://www.publiccontractsscotland.gov.uk/search/Search_AuthProfile.aspx?ID=AA00196","sandra.maclennan@glasgow.gov.uk"));
//		          
//		          break;
//		     } 
//		        catch (Exception e) {
//		        	System.out.println(e.getMessage());
//		        }
//		          		        }	
//			 }
//	 @Test
//	 public void TC005() throws IOException
//	 {
//		    driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtKeywords']")).sendKeys("stage 2 ");
//			driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
//			driver.findElement(By.linkText("Stage 3 Adaptations 2019-2023")).click();
//			captureScreen(driver,"JAN376346");
//	 			driver.findElement(By.xpath("//a[@id='Tab2']")).click();
//		 
//			for (int second = 0;; second++) {
//		        if (second >= 60) Assert.fail("timeout");								
//		        try { 
//		          Assert.assertEquals("Caledonia Housing Association", driver.findElement(By.xpath("//p[@style='margin-left:3em;']")).getText());
//		          //add test case to the testcases list as pass
//		          testcases.add(new TestCases("005","https://www.publiccontractsscotland.gov.uk/search/Search_AuthProfile.aspx?ID=AA17204","grant.kaye@caledoniaha.co.uk"));
//		          
//		          break;
//		     } 
//		        catch (Exception e) {
//		        	System.out.println(e.getMessage());
//		        }
//		          		       }	
//		 }
//	 @Test
//	 public void TC006() throws IOException
//	 {    
//		driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtKeywords']")).sendKeys("stage 2 ");
//			driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
//			driver.findElement(By.linkText("King's Theatre Transformation - Contractor (Two Stage Traditional)")).click();
//			captureScreen(driver,"DEC376010");
//			driver.findElement(By.xpath("//a[@id='Tab2']")).click();
//		 
//			for (int second = 0;; second++) {
//		        if (second >= 60) Assert.fail("timeout");								
//		        try { 
//		          Assert.assertEquals("Capital Theatres King's Limited", driver.findElement(By.xpath("//p[@style='margin-left:3em;']")).getText());
//		          //add test case to the testcases list as pass
//		          testcases.add(new TestCases("006","https://www.publiccontractsscotland.gov.uk/search/Search_AuthProfile.aspx?ID=AA30290","brian.loudon@capitaltheatres.com"));
//		          
//		          break;
//		     } 
//		        catch (Exception e) {
//		        	System.out.println(e.getMessage());
//		        }
//		          		       }	
//		 }
//	 @Test
//	 public void TC007() throws IOException
//	 {
//		 	driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtKeywords']")).sendKeys("stage 2 ");
//			driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
//			driver.findElement(By.linkText("Insurance and Related Services 2020")).click();
//			captureScreen(driver,"DEC375803");
//			driver.findElement(By.xpath("//a[@id='Tab2']")).click();
//		 
//			for (int second = 0;; second++) {
//		        if (second >= 60) Assert.fail("timeout");								
//		        try { 
//		          Assert.assertEquals("Almond Housing Association", driver.findElement(By.xpath("//p[@style='margin-left:3em;']")).getText());
//		          //add test case to the testcases list as pass
//		          testcases.add(new TestCases("007","https://www.publiccontractsscotland.gov.uk/search/Search_AuthProfile.aspx?ID=AA10285","maureenmbatten@gmail.com"));
//		          
//		          break;
//		     } 
//		        catch (Exception e) {
//		        	System.out.println(e.getMessage());
//		        }
//		         		       }	
//		 }
//	 @Test
//	 public void TC008() throws IOException
//	 {
//			driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtKeywords']")).sendKeys("stage 2 ");
//			driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
//			driver.findElement(By.linkText("THA insurance and related services 2020")).click();
//			captureScreen(driver,"DEC374854");
//			driver.findElement(By.xpath("//a[@id='Tab2']")).click();
//		 
//			for (int second = 0;; second++) {
//		        if (second >= 60) Assert.fail("timeout");								
//		        try { 
//		          Assert.assertEquals("Tollcross Housing Association Limited", driver.findElement(By.xpath("//p[@style='margin-left:3em;']")).getText());
//		         //add test case to the testcases list as pass
//		          testcases.add(new TestCases("008","https://www.publiccontractsscotland.gov.uk/search/Search_AuthProfile.aspx?ID=AA12162","tom.hastings@tollcross-ha.org.uk"));
//		          
//		          driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
//		          break;
//		     } 
//		        catch (Exception e) {
//		        	System.out.println(e.getMessage());
//		        }
//		          		       }	
//		 }
//	 @Test
//	 public void TC009() throws IOException
//	 {
//			driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtKeywords']")).sendKeys("stage 2 ");
//			driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
//			driver.findElement(By.linkText("Highland Employability Pipeline Third Sector Challenge Fund")).click();
//			captureScreen(driver,"DEC373863");
//			driver.findElement(By.xpath("//a[@id='Tab2']")).click();
//		 
//			for (int second = 0;; second++) {
//		        if (second >= 60) Assert.fail("timeout");								
//		        try { 
//		          Assert.assertEquals("The Highland Council", driver.findElement(By.xpath("//p[@style='margin-left:3em;']")).getText());
//		          //add test case to the testcases list as pass
//		          testcases.add(new TestCases("009","https://www.publiccontractsscotland.gov.uk/search/Search_AuthProfile.aspx?ID=AA00045"," employability@highland.gov.uk"));
//		          
//		          break;
//		     } 
//		        catch (Exception e) {
//		        	System.out.println(e.getMessage());
//		        }
//		          		       }	
//		 }
//	 @Test
//	 public void TC010() throws IOException
//	 {
//			driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtKeywords']")).sendKeys("stage 2 ");
//			driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
//			driver.findElement(By.linkText("Landscape Maintenance 2020/21 - Stage 2")).click();
//			captureScreen(driver,"NOV373238");
//			driver.findElement(By.xpath("//a[@id='Tab2']")).click();
//		 
//			for (int second = 0;; second++) {
//		        if (second >= 60) Assert.fail("timeout");								
//		        try { 
//		          Assert.assertEquals("Oak Tree Housing Association Ltd", driver.findElement(By.xpath("//p[@style='margin-left:3em;']")).getText());
//		          //add test case to the testcases list as pass
//		          testcases.add(new TestCases("010","https://www.publiccontractsscotland.gov.uk/search/Search_AuthProfile.aspx?ID=AA14342","craig.hotchkiss@alliedsurveyorsscotland.com"));
//		          
//		          break;
//		     } 
//		        catch (Exception e) {
//		        	System.out.println(e.getMessage());
//		        }
//		         		       }	
//		 }
//	 @Test
//	 public void TC011() throws IOException
//	 {
//		 	driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtKeywords']")).sendKeys("stage 2 ");
//			driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
//			driver.findElement(By.linkText("Burrell Renaissance Project - Object Mounts")).click();
//			captureScreen(driver,"NOV372294");
//			driver.findElement(By.xpath("//a[@id='Tab2']")).click();
//		 
//			for (int second = 0;; second++) {
//		        if (second >= 60) Assert.fail("timeout");								
//		        try { 
//		          Assert.assertEquals("Glasgow City Council", driver.findElement(By.xpath("//p[@style='margin-left:3em;']")).getText());
//		          //add test case to the testcases list as pass
//		          testcases.add(new TestCases("011","https://www.publiccontractsscotland.gov.uk/search/Search_AuthProfile.aspx?ID=AA00196","sandra.maclennan@glasgow.gov.uk"));
//		          
//		          break;
//		     } 
//		        catch (Exception e) {
//		        	System.out.println(e.getMessage());
//		        }
//		          		       }	
//		 }
//	 @Test
//	 public void TC012() throws IOException
//	 {
//		 	driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtKeywords']")).sendKeys("stage 2 ");
//			driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
//			driver.findElement(By.linkText("Scape National Consultancy Framework - Scotland")).click();
//			captureScreen(driver,"NOV372267");
//			driver.findElement(By.xpath("//a[@id='Tab2']")).click();
//		 
//			for (int second = 0;; second++) {
//		        if (second >= 60) Assert.fail("timeout");								
//		        try { 
//		          Assert.assertEquals("Scape Procure Scotland Ltd", driver.findElement(By.xpath("//p[@style='margin-left:3em;']")).getText());
//		          //add test case to the testcases list as pass
//		          testcases.add(new TestCases("012","nickt@scapegroup.co.uk","nickt@scapegroup.co.uk"));
//		          
//		          break;
//		     } 
//		        catch (Exception e) {
//		        	System.out.println(e.getMessage());
//		        }
//		          	       }	
//		 }
//	 @Test
//	 public void TC013() throws IOException
//	 {
//			driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtKeywords']")).sendKeys("stage 2 ");
//			driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
//			driver.findElement(By.linkText("External Audit Services 2020 - 2025")).click();
//			captureScreen(driver,"NOV371849");
//			driver.findElement(By.xpath("//a[@id='Tab2']")).click();
//		 
//			for (int second = 0;; second++) {
//		        if (second >= 60) Assert.fail("timeout");								
//		        try { 
//		          Assert.assertEquals("Grampian Housing Association Ltd", driver.findElement(By.xpath("//p[@style='margin-left:3em;']")).getText());
//		          //add test case to the testcases list as pass
//		          testcases.add(new TestCases("013","https://www.publiccontractsscotland.gov.uk/search/Search_AuthProfile.aspx?ID=AA14462","info@grampianhousing.co.uk"));
//		          
//		          break;
//		     } 
//		        catch (Exception e) {
//		        	System.out.println(e.getMessage());
//		        }
//		          		       }	
//		 }
//	 @Test
//	 public void TC014() throws IOException
//	 {
//			driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtKeywords']")).sendKeys("stage 2 ");
//			driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
//			driver.findElement(By.linkText("Employability Fund 2020-21")).click();
//			captureScreen(driver,"OCT370494");
//			driver.findElement(By.xpath("//a[@id='Tab2']")).click();
//		 
//			for (int second = 0;; second++) {
//		        if (second >= 60) Assert.fail("timeout");								
//		        try { 
//		          Assert.assertEquals("The Skills Development Scotland Co. Limited", driver.findElement(By.xpath("//p[@style='margin-left:3em;']")).getText());
//		          //add test case to the testcases list as pass
//		          testcases.add(new TestCases("014","https://www.publiccontractsscotland.gov.uk/search/Search_AuthProfile.aspx?ID=AA12862","procurement@sds.co.uk"));
//		          
//		          break;
//		     } 
//		        catch (Exception e) {
//		        	System.out.println(e.getMessage());
//		        }
//		         		       }	
//		 }
//	 @Test
//	 public void TC015() throws IOException
//	 {
//			driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtKeywords']")).sendKeys("stage 2 ");
//			driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
//			driver.findElement(By.linkText("QCHA Insurance & Related Services 2020")).click();
//			captureScreen(driver,"OCT370466");
//			driver.findElement(By.xpath("//a[@id='Tab2']")).click();
//		 
//			for (int second = 0;; second++) {
//		        if (second >= 60) Assert.fail("timeout");								
//		        try { 
//		          Assert.assertEquals("Queens Cross Housing Association Ltd", driver.findElement(By.xpath("//p[@style='margin-left:3em;']")).getText());
//		          //add test case to the testcases list as pass
//		          testcases.add(new TestCases("015","https://www.publiccontractsscotland.gov.uk/search/Search_AuthProfile.aspx?ID=AA11502","maureenmbatten@gmail.com"));
//		          
//		          break;
//		     } 
//		        catch (Exception e) {
//		        	System.out.println(e.getMessage());
//		        }
//		          		       }	
//		 }
//	 @Test
//	 public void TC016() throws IOException
//	 {
//		 	driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtKeywords']")).sendKeys("stage 2 ");
//			driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
//			driver.findElement(By.linkText("Active Travel - Lochgilphead Front Green to Crinan Canal")).click();
//			captureScreen(driver,"OCT369793");
//			driver.findElement(By.xpath("//a[@id='Tab2']")).click();
//		 
//			for (int second = 0;; second++) {
//		        if (second >= 60) Assert.fail("timeout");								
//		        try { 
//		          Assert.assertEquals("Argyll and Bute Council", driver.findElement(By.xpath("//p[@style='margin-left:3em;']")).getText());
//		          //add test case to the testcases list as pass
//		          testcases.add(new TestCases("016"," https://www.publiccontractsscotland.gov.uk/search/Search_AuthProfile.aspx?ID=AA00063","Alistair.Macvicar2@argyll-bute.gov.uk"));
//		          
//		          break;
//		     } 
//		        catch (Exception e) {
//		        	System.out.println(e.getMessage());
//		        }
//		         		       }	
//		 }
//	 @Test
//	 public void TC017() throws IOException
//	 {
//		 	driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtKeywords']")).sendKeys("stage 2 ");
//			driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
//			driver.findElement(By.linkText("ACHA and subsidiary companies - Insurance and Related Services 2020")).click();
//			captureScreen(driver,"OCT367910");
//			driver.findElement(By.xpath("//a[@id='Tab2']")).click();
//		 
//			for (int second = 0;; second++) {
//		        if (second >= 60) Assert.fail("timeout");								
//		        try { 
//		          Assert.assertEquals("Argyll Community Housing Association Limited", driver.findElement(By.xpath("//p[@style='margin-left:3em;']")).getText());
//		          //add test case to the testcases list as pass
//		          testcases.add(new TestCases("017","https://www.publiccontractsscotland.gov.uk/search/Search_AuthProfile.aspx?ID=AA10562","maureenmbatten@gmail.com"));
//		          
//		          break;
//		     } 
//		        catch (Exception e) {
//		        	System.out.println(e.getMessage());
//		        }
//		         		       }	
//		 }
//	 @Test
//	 public void TC018() throws IOException
//	 {
//			driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtKeywords']")).sendKeys("stage 2 ");
//			driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
//			driver.findElement(By.linkText("Park and Ride Bus Shuttle Service for the Solheim Cup")).click();
//			captureScreen(driver,"JUL358834");
//			driver.findElement(By.xpath("//a[@id='Tab2']")).click();
//		 
//			for (int second = 0;; second++) {
//		        if (second >= 60) Assert.fail("timeout");								
//		        try { 
//		          Assert.assertEquals("Transport Scotland", driver.findElement(By.xpath("//p[@style='margin-left:3em;']")).getText());
//		          //add test case to the testcases list as pass
//		          testcases.add(new TestCases("018","https://www.publiccontractsscotland.gov.uk/search/Search_AuthProfile.aspx?ID=AA00099","Ronnie.Mellis@transport.gov.scot"));
//		          
//		          break;
//		     } 
//		        catch (Exception e) {
//		        	System.out.println(e.getMessage());
//		        }
//		          		       }	
//		 } 
//	 @Test
//	 public void TC019() throws IOException
//	 {
//			driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtKeywords']")).sendKeys("stage 2 ");
//			driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
//			driver.findElement(By.linkText("Provision of Banking & Merchant Services")).click();
//			captureScreen(driver,"JUN357219");
//			driver.findElement(By.xpath("//a[@id='Tab2']")).click();
//		 
//			for (int second = 0;; second++) {
//		        if (second >= 60) Assert.fail("timeout");								
//		        try { 
//		          Assert.assertEquals("North Ayrshire Council", driver.findElement(By.xpath("//p[@style='margin-left:3em;']")).getText());
//		          //add test case to the testcases list as pass
//		          testcases.add(new TestCases("019","http://www.north-ayrshire.gov.uk","procurement@north-ayrshire.gov.uk"));
//		          
//		          break;
//		     } 
//		        catch (Exception e) {
//		        	System.out.println(e.getMessage());
//		        }
//		          		       }	
//		 }
	@AfterMethod
	public void XMLreport() throws ParserConfigurationException
	{
		testResultXmlUtility.WriteTestResultToXml("TestResult.xml", testcases);
	}
}
