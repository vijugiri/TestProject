package com.main;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class GenerateExtentReports {
	ExtentReports extent;
	ExtentTest test;
	ExtentReports htmlReporter;
	
	
	
	
	@BeforeTest
	public void startReports()
	{
		extent = new ExtentReports(System.getProperty("user.dir")+"./test-output/MyOwnReport.html",true);
		
		extent.addSystemInfo("HostName", "Vijay")
		.addSystemInfo("Enviroment", "QA")
		.addSystemInfo("User Name", "Vijay Giri");
		extent.loadConfig(new File(System.getProperty("user.dir")+"extent-config.xml"));
		
		
	}
	@Test
	public void demoreportPass()
	{
		test = extent.startTest("demoreportPass");
		Assert.assertTrue(true);
		
		test.log(LogStatus.PASS, "Assert pass as condition is True");
	}

	
	@Test
	public void demoReportFail()
	{
		test = extent.startTest("demoReportFail");
		Assert.assertTrue(false);
		test.log(LogStatus.FAIL, "Assert pass as condition is False");
	}
	
	
	@AfterMethod
	public void getResult(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE) 
		{
			test.log(LogStatus.FAIL, result.getThrowable());
		}
		extent.endTest(test);
	}
	
	@AfterTest
	public void endReport() 
	{
		extent.flush();
		extent.close();
	}
	
}
