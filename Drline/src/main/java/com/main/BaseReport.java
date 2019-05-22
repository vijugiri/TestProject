package com.main;

import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;

public class BaseReport {
	 public static ExtentReports htmlReporter;
	 public static ExtentReports ExtentHtmlReporter;
	
	@BeforeSuite
	public void setUp()
	{
		
		//htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"./test-output/MyOwnReport.html");
	}

}
