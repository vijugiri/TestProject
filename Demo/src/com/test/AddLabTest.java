package com.test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.main.Base;
import com.main.BaseClass;
import com.sun.jna.platform.win32.ObjBase;
import com.util.Data;
import com.util.Util;
import com.util.Utility;
import com.util.WriteDatainExcel;



public class AddLabTest extends Base {



	Base objBase = new Base();
	Data objData = new Data();
	Util objUtil = new Util();
	WriteDatainExcel objWriteData;
	BaseClass objBaseClass= new BaseClass();
	

	

	@BeforeClass
	public void login() throws InterruptedException {
		
		objBaseClass.LocalBrowserInit("http://qa.drline.in/drline-webapp-qa/");
		// user id
		objBaseClass.setText("//input[@id='userName']", "8999100336");
		
		// pass
		objBaseClass.setText("//input[@id='password']", "12345");
		// login button
		Thread.sleep(2000);
		objBaseClass.click("//button[@type='submit']");
		Thread.sleep(2000);
		objBaseClass.mouseHover("//button[contains(text(),'Yes')]");
		Thread.sleep(2000);
		objBaseClass.clickUsingJavaScripter("//span[contains(text(),' Test management')]");
		Thread.sleep(1000);
		
		objBaseClass.mouseHover("//li[@id='Add/Edit test']");
		
		
		
	
	}
	
	
	@Test(priority = 1, dataProvider = "DataAdd")
	public void Addtest(String srNo,String TestName,String Price,String Minimumsellingprice,String Costoftest) throws InterruptedException, IOException
	
	{
		objBaseClass.clickUsingJavaScripter("//button[contains(text(),'Add test')]");
		Thread.sleep(1000);
		objBaseClass.setText("//input[@id='testNameEdit']", TestName);
		objBaseClass.setText("//input[@id='testPriceEdit']", Price);
		objBaseClass.setText("//input[@id='minSellingPriceEdit']", Minimumsellingprice);
		objBaseClass.setText("//input[@id='costOfTestEdit']", Costoftest);
		objBaseClass.clickUsingJavaScripter("//input[@id='testtype']");
		objBaseClass.clickUsingJavaScripter("//button[@id='submitButton']");
		
		
		
		WebElement popup = (driver.findElement(By.xpath("//button[contains(text(),'Got It')]")));
		Thread.sleep(2000);
		if (popup.isDisplayed()) {
			WriteDatainExcel.writeDatainExcel("Test Added sucessfully", "D:\\patientData.xlsx", srNo);
			
		}
		
		objBaseClass.mouseHover("//button[contains(text(),'Got It')]");
		
		
		
		
		
		
		
	}
	
	

}
