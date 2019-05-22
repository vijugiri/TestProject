package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Util {

	
	@DataProvider(name = "patientDataFromExcel")
	public Object[][] PatientDataProvider() throws InterruptedException, IOException {

		File path = new File("D:\\patientData.xlsx");
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rows = sheet.getLastRowNum() - sheet.getFirstRowNum();
		rows=rows+1;
		System.out.println("======================"+rows);
		/*rows=rows+1;*/
		Object[][] data = new Object[rows-1][4];
		Integer k=0;
		for (int i = 1; i <rows; i++) {
			
			 for(int j=0; j<4; j++) {
				// System.out.println("Dara======================"+sheet.getRow(i).getCell(j).getStringCellValue());
			data[k][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			
		}
			 k++;
		}
		
		return data;
		

	}


	
	
	}
