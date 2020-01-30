package com.ShopWorxV1.Utility;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;

public class XLUtil 
{
	public static FileInputStream file;
	public static HSSFWorkbook workbook;
	public static HSSFSheet sheet;
	public static HSSFRow row;
	public static HSSFCell cell;
	
	public static int gerRowCount(String xlfile, String xlsheet) throws IOException
	{
		file = new FileInputStream(xlfile);
		workbook = new HSSFWorkbook(file);
		sheet = workbook.getSheet(xlsheet);
		int rowcount = sheet.getLastRowNum();
		workbook.close();
		file.close();
		return rowcount;
	}
	
	public static int getCellCount(String xlfile, String xlsheet, int rownum) throws IOException
	{
		file = new FileInputStream(xlfile);
		workbook = new HSSFWorkbook(file);
		sheet = workbook.getSheet(xlsheet);
		row = sheet.getRow(rownum);
		int cellcount = row.getLastCellNum();
		workbook.close();
		file.close();
		return cellcount;
		
	}
	public static String getCellData(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{
		file=new FileInputStream(xlfile);
		workbook=new HSSFWorkbook(file);
		sheet=workbook.getSheet(xlsheet);
		row=sheet.getRow(rownum);
		cell=row.getCell(colnum);
		String data;
		try 
		{
			DataFormatter formatter = new DataFormatter();
            String cellData = formatter.formatCellValue(cell);
            return cellData;
		}
		catch (Exception e) 
		{
			data="";
		}
		workbook.close();
		file.close();
		return data;
	}
	
}
