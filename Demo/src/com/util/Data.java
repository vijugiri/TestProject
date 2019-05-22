package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Data {
	/*@DataProvider(name = "patientData")
	public Object[][] PatientDataProvider() throws InterruptedException, IOException {

		File path = new File("D:\\patientData.xlsx");
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rows = sheet.getLastRowNum() - sheet.getFirstRowNum();
		rows=rows+1;
		System.out.println("======================"+rows);
		rows=rows+1;
		Object[][] data = new Object[rows][4];
		
		for (int i = 1; i <rows; i++) {
			if(sheet.getRow(i)!=null) {
			 for(int j=0; j<4; j++) {
			  data[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			 }
			}
		}

		return data;
		

	}*/

	
	
//	@DataProvider(name = "patientData")
	public static void  main(String [] args) throws IOException{

		File path = new File("D:\\Application\\Mydata.xlsx");
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		sheet.getRow(1).createCell(1).setCellValue("Pass");
		sheet.getRow(1).createCell(2).setCellValue("fail");
		
		
		FileOutputStream fout=new FileOutputStream(path);
		workbook.write(fout);
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		/*int rows = sheet.getLastRowNum() - sheet.getFirstRowNum();
		rows=rows+1;
		System.out.println("======================"+rows);
		rows=rows+1;
		Object[][] data = new Object[rows-1][4];
		Integer k=0;
		for (int i = 1; i <rows; i++) {
			
			 for(int j=0; j<4; j++) {
				// System.out.println("Dara======================"+sheet.getRow(i).getCell(j).getStringCellValue());
			data[k][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			
		}
			 k++;
		}
		
		return data;*/
		

	}

}
