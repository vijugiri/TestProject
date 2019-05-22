/*package com.extenrreport;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.main.BaseClass;

public class generateReport extends BaseClass {

	//ExtentReports extent;
	
	@BeforeTest
	public void login() throws IOException 
	{
	
		System.out.println("Hello viju");
		ExtentHtmlReporter reporter= new ExtentHtmlReporter(System.getProperty("user.dir")+"./ExtentReport/MyReport.html");
	
		
	     ExtentReports extent = new ExtentReports();
	   
	 
	     
	     
	 	extent.addSystemInfo("HostName", "Vijay")
		.addSystemInfo("Enviroment", "QA")
		.addSystemInfo("User Name", "Vijay Giri");
		extent.loadConfig(new File(System.getProperty("user.dir")+"extent-config.xml"));
	     
	     
	     extent.attachReporter(reporter);
	     
	  ExtentTest logger=   extent.createTest("login test");
	  logger.log(Status.INFO, "Login Sucessfully");
	  logger.log(Status.PASS, "Titel verify");
	  
	  extent.flush();
	     
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
		
	}
}
*/