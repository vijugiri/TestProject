package com.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteDatainExcel {
//public static void main(String[] args) throws IOException {
	@Test
	public static  void writeDatainExcel(String result,String path, String srNo) throws IOException {
	//File path = new File("D:\\patientData.xlsx");
	FileInputStream fis = new FileInputStream(path);
	FileOutputStream fos=null;
	
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheetAt(0);
	
	XSSFRow row =null;
	XSSFCell cell=null;
	
	int colNum= -1;
	row = sheet.getRow(0);
	for(int i=0; i<row.getLastCellNum();i++)
	{
		if(row.getCell(i).getStringCellValue().trim().equals("Result"));
		{
				colNum=i;
		}
		
	}
	 	row= sheet.getRow(Integer.parseInt(srNo));
	 							if(row==null) {
		 
	 							row=sheet.createRow(Integer.parseInt(srNo));
		 
	 							cell =row.getCell(colNum);
	 						
	 							}
	 					if(cell==null)
	 						{
	 							cell = row.createCell(colNum);
	 							cell.setCellValue(result);
	 							fos = new FileOutputStream(path);
	 							workbook.write(fos);
	 							fos.close();
	 							System.out.println("file closed");
	 						}
		 
	 						
	 	}
	
}



/*
File path = new File("D:\\patientData.xlsx");
FileInputStream fis = new FileInputStream(path);
FileOutputStream fout=null;

XSSFWorkbook workbook = new XSSFWorkbook(fis);
XSSFSheet sheet = workbook.getSheetAt(0);
int rows = sheet.getLastRowNum() - sheet.getFirstRowNum();
rows=rows+1;
System.out.println("======================"+rows);


}*/

