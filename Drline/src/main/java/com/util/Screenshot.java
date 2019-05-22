package com.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import com.main.BaseClass;

public class Screenshot extends BaseClass {
	
	public static void capturescreenshot(String screenshotName) 
		{
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(source, new File("./ErrorScreenshot/"+screenshotName+".png"));
			
			System.out.println("screenshot takes sucessfully");
		} catch (Exception e) {
			System.out.println("Exception while taking screenshot "+e.getMessage());
			
		} 

		
		}

	

}
