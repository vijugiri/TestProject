package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import com.main.BaseClass;


public class GetScreenShot extends BaseClass  {
	
	public static String capture(String screenshotName) throws IOException {
		
		TakesScreenshot ts =(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir") + "TestCaseScreenshot/" + screenshotName + ".png";
		File destination = new File(dest);
		FileUtils.copyFile(source, destination);
	//	/FailedScreenShot/
	//	ErrorScreenshot
		return dest;
		
	}
	
	

}
