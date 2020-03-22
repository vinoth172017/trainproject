package com.taskmanagement.excelutilitty;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExelUlities {
	//To get count of rows form excel
	public int row_count() throws IOException
	{
		FileInputStream fil = new FileInputStream(new File("src//test//resources//Testdata//TestData.xlsx"));
		XSSFWorkbook workbook=new XSSFWorkbook(fil);
		XSSFSheet sheet=workbook.getSheet("LoginDeatils");
		int rowcount=sheet.getLastRowNum();
		System.out.println(rowcount);
		
		return rowcount;
	}
	
	//To read the username and return
	public  String Task_Management_username(int a) throws IOException {
		  
		  FileInputStream fil = new FileInputStream(new File("src//test//resources//Testdata//TestData.xlsx"));
		  XSSFWorkbook workbook = new XSSFWorkbook(fil);
		  XSSFSheet sheet=workbook.getSheet("LoginDeatils");
			  XSSFRow row =sheet.getRow(a);
			  XSSFCell cell=row.getCell(0);
			  String usern=cell.getStringCellValue();
		return usern;
}
	//To read and return password
	public  String Task_Management_password(int b) throws IOException {
		  
		  FileInputStream fil = new FileInputStream(new File("src//test//resources//Testdata//TestData.xlsx"));
		  XSSFWorkbook workbook = new XSSFWorkbook(fil);
		  XSSFSheet sheet=workbook.getSheet("LoginDeatils");
			  XSSFRow row =sheet.getRow(b);
			  XSSFCell cell1=row.getCell(1);
			  String paswd=cell1.getStringCellValue();
			  return paswd;
}
}
