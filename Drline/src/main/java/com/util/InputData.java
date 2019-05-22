package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.main.BaseClass;

public class InputData extends BaseClass{
	
	

	
//@DataProvider(name="InputData")
@Test (priority =1)
	public Object[][] InputDataProvider() throws InterruptedException, IOException {

		File path = new File("D://InputData.xls");
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rows = sheet.getLastRowNum() - sheet.getFirstRowNum();
		rows=rows+1;
		System.out.println("======================"+rows);
		/*rows=rows+1;*/
		Object[][] data = new Object[rows-1][5];
		Integer k=0;
		for (int i = 1; i <rows; i++) {
			
			 for(int j=0; j<5; j++) {
				// System.out.println("Dara======================"+sheet.getRow(i).getCell(j).getStringCellValue());
			data[k][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			
		}
			 k++;
		}
		
		return data;
		

	}


}
