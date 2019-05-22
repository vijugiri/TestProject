package com.test;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.main.Base;
import com.util.Data;
import com.util.Util;
import com.util.Utility;
import com.util.WriteDatainExcel;

public class AddPatientData extends Base {

	Base objBase = new Base();
	Data objData = new Data();
	Util objUtil = new Util();
	WriteDatainExcel objWriteData;


	
	@BeforeClass
	public void setup() throws InterruptedException {

		//objBase.BrowserInit();
		
			
	//objBase.LocalBrowserInit("http://qa.drline.in/drline-webapp-qa/global_register/add-external-patient");
    objBase.LocalBrowserInit("http://admin.drline.in/drline-webapp/global_register/add-external-patient");

	}

	@Test(priority = 1, dataProvider = "patientData")
	public void AddData(String srNo, String Clinicid, String BranchId, String PatientName, String MobileNo)
			throws InterruptedException, IOException {

		// Write clinic id  ,String Result,String firstName,String lastname

		driver.navigate().refresh();
		
				
		
		driver.findElement(By.xpath("//input[@id='clinicId']")).sendKeys(Clinicid);

		// Write Branch id
		driver.findElement(By.xpath("//input[@id='branchId']")).sendKeys(BranchId);
		
	
			//driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Email);
			
		//	driver.findElement(By.xpath("//input[@id='age']")).sendKeys(Age);
			
		
	
		
		
		
		
			driver.findElement(By.xpath("//input[@id='fullName']")).sendKeys(PatientName);
		

	/*	// Write patient name

		try {
			Thread.sleep(1000);

			driver.findElement(By.xpath("//input[@id='fullName']")).sendKeys(PatientName);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/
		// Write mobile number

		try {
			Thread.sleep(1000);

			if (MobileNo.length() < 9) {
				driver.navigate().refresh();
			}

			else {
				driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(MobileNo);
			}
			

		}
		

		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		
		
		// Mobile number is already exist..!! then

		WebElement numalready = (driver.findElement(By.xpath("//span[@id='contactPersonerr1']")));
		Thread.sleep(2000);
		if (numalready.isDisplayed()) {
		
			WriteDatainExcel.writeDatainExcel("AlreadyAdded", "D:\\patientData.xlsx", srNo);
			Utility.capturescreenshotofpatient(MobileNo + " AlreadyAdded");
			Thread.sleep(2000);
			driver.navigate().refresh();
		}
		
		
		
		// click on save button
		else {

			// SAVE BUTTON
			//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/div[2]/div/div/button")).click();
		
			WriteDatainExcel.writeDatainExcel("Pass", "D:\\patientData.xlsx", srNo);	
			Thread.sleep(1000);	
			
			// due to white label we Redirect url 
			
			driver.get("http://admin.drline.in/drline-webapp/global_register/add-external-patient");
			
			/*WebElement mousehoverElement = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]"));

			Actions action = new Actions(driver);
			action.moveToElement(mousehoverElement).click().build().perform();
		
				driver.get("http://admin.drline.in/drline-webapp/global_register/add-external-patient");
			
			
			Alert alertOK = driver.switchTo().alert();
			alertOK.accept();*/
			

			
		
		}

		driver.navigate().refresh();
	}

}

/*
 * @Test(priority=10) public void teardown() {
 * 
 * objBase.TearDown();
 * 
 * }
 */
