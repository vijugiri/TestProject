package com.extenrreport;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;

import net.sourceforge.htmlunit.corejs.javascript.ErrorReporter;


public class BaseReportTest {
	 public static  com.relevantcodes.extentreports.ExtentReports extent;
   	public static ErrorReporter htmlreporter;
	public static com.relevantcodes.extentreports.ExtentTest test;

	/*
	@BeforeTest
	public void setUp()
	{

		
	
		ExtentHtmlReporter reporter= new ExtentHtmlReporter(System.getProperty("user.dir")+"./ExtentReport/MyReport.html");
	
		 extent = new ExtentReports();
		  extent.attachReporter(reporter);  
		
	}
	
	
	@AfterMethod
	public void getResult(ITestResult result) 
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
		
			test.fail(MarkupHelper.createLabel(result.getName()+"Test Case Fail", ExtentColor.RED));
			test.fail(result.getThrowable());
			
		}
		
		
		else if(result.getStatus()==ITestResult.SUCCESS) 
		{
			test.pass(MarkupHelper.createLabel(result.getName()+"Test Case Passed ", ExtentColor.GREEN));
		}
		

		else 
		{
			test.skip(MarkupHelper.createLabel(result.getName()+"Test Case Skipped ", ExtentColor.YELLOW));
			test.skip(result.getThrowable());
		}
		
		
		
	}
	
	
	

	
	
	
	
	*/
	
	
	
	
	
	
	
}