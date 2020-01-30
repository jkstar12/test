package com.ShopWorxV1.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{
static Properties pro;  //create object pro of property class
	
	public ReadConfig()   // create constructor 
	{
		File src = new File("./Configuration/config.properties");   // load path of config.properties file

		try {
			FileInputStream fis = new FileInputStream(src);  //use fileinputstream for to read data from property file
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public static String getApplicationURL()   //create method url
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public static String getUsername()   //create method for user name
	{
	String username=pro.getProperty("username"); 
	return username;
	}
	
	public static String getPassword()
	{
	String password=pro.getProperty("password");
	return password;
	}
	
}
