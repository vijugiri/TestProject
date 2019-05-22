package com.setting;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.appointment.AddpatientPage;
import com.appointment.AddpatientView;
import com.dashboard.DashboardPage;
import com.login.LoginPage;
import com.main.BaseClass;


import org.openqa.selenium.WebElement;
import Treatment.treatmentpage;

public class SettingView extends BaseClass {
	
	LoginPage objLoginPage=new LoginPage();
	BaseClass objBaseClass= new BaseClass();

	AddpatientPage objAddpatientPage= new AddpatientPage();
	treatmentpage objtreatmentpage = new treatmentpage();
AddpatientView objAddpatientView= new AddpatientView();
DashboardPage objDashboardPage=new DashboardPage();
SetingPage objSetingPage= new SetingPage();


	String strval=null;
	String strval3=null;
	String strval4=null;
	String strval2=null;
	
	private boolean isElementPresent(By by) {
		  try {
		    driver.findElement(by);
		    return true;
		  } catch (NoSuchElementException e) {
		    return false;
		  }
		}
	
	public void clickSettingMenu() throws InterruptedException {
		
		
		objDashboardPage.clickSettingMenuis();
	}
	
	
	public void unSelectTreatmentproperties() throws InterruptedException {
		
		this.clickOnTreatmentProp();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 // objSetingPage.UnselectOwnProperties();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
			if(driver.findElement(By.xpath("//input[@id='clinicPropertiesId_330']")).isSelected())
			{
				driver.findElement(By.xpath("//input[@id='clinicPropertiesId_330']")).click();
			}
			
this.closeokPopup();


			
	}
	
	
	

	public void SelectTreatmentproperties() throws InterruptedException {
		
		this.clickOnTreatmentProp();
		Thread.sleep(4000);
	 // objSetingPage.UnselectOwnProperties();
		Thread.sleep(2000);
	  
		if(!driver.findElement(By.xpath("//input[@id='clinicPropertiesId_330']")).isSelected())
		{
			
			//objBaseClass.mouseHover("//input[@id='clinicPropertiesId_330']");
			driver.findElement(By.xpath("//input[@id='clinicPropertiesId_330']")).click();
		}
		
this.closeokPopup();
	}
	
	public void clickOnTreatmentProp() throws InterruptedException {
		objBaseClass.scrollToView("//*[@id='Treatment Properties']/a/span/i");
		Thread.sleep(2000);
		WebElement  element=driver.findElement(By.xpath("//*[@id='Treatment Properties']/a/span/i"));   
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		  ex.executeScript("arguments[0].click()", element);
	}
public void closeokPopup() throws InterruptedException
{

	boolean autosearch = isElementPresent(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div/div[1]/button"));

	//WebElement autosearch=driver.findElement(By.xpath("//div[@class='autocomplete-suggestions']"));
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(autosearch==true)
	{
		Thread.sleep(1000);
		WebElement  element1=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div/div[1]/button"));   
		JavascriptExecutor ex1=(JavascriptExecutor)driver;
		  ex1.executeScript("arguments[0].click()", element1);
	
	} 
}
			public void dashboardSetting() throws InterruptedException
			{
				Thread.sleep(2000);
		
			
				
					objSetingPage.clickDashboardSett();
					objBaseClass.isdisplayed("//h4[contains(text(),'Dashboard Settings :')]");					
					objBaseClass.selectDropDown("//select[@id='employeeId']", "viju");
					Thread.sleep(1000);
					objBaseClass.selectCheckbox("//input[@id='propertiesValue_1235']");
					Thread.sleep(1000);
					objBaseClass.selectCheckbox("//input[@id='propertiesValue_1236']");
					
					Thread.sleep(1000);
					objBaseClass.selectCheckbox("//input[@id='propertiesValue_1237']");
					Thread.sleep(1000);
					objBaseClass.selectCheckbox("//input[@id='propertiesValue_1238']");
					
					Thread.sleep(1000);
					objBaseClass.selectCheckbox("//input[@id='propertiesValue_1239']");
					Thread.sleep(1000);
					objBaseClass.scrollToView("//button[contains(text(),'Save')]");
					objBaseClass.mouseHover("//button[contains(text(),'Save')]");
		
			}


			
			
			
			public void verifyDashboardSetting() {
				
				
				objDashboardPage.VerifyAllPatientText();
				objDashboardPage.VerifyTODAYS_WAITINGPATIENTText();
				objDashboardPage.VerifyTODAYS_PROCESSEDPATIENTText();
				objDashboardPage.VerifyTODAYS_COLLECTIONText();
				objDashboardPage.VerifyAVAILABLE_BALANCEText();
			}
			
			
			
			
			
			public void RollAccessSetting() throws InterruptedException
			{
				Thread.sleep(2000);
			objSetingPage.clickRoleAccessSetting();
			objBaseClass.refresh();
			objBaseClass.selectDropDown("//select[@id='roleId']", "Receptionist");
			objBaseClass.refresh();
			Thread.sleep(2000);
			objBaseClass.refresh();
			// all menu
			objBaseClass.selectCheckbox("//input[@alt='main_00']");
			Thread.sleep(2000);
			//add branch in master
			objBaseClass.scrollToView("//input[@value='12-19']");
			Thread.sleep(2000);
			objBaseClass.selectCheckbox("//input[@value='12-19']");
			//objBaseClass.mouseHover("//div[@class='form-group']//input[@value=' 12-19']");
			
			Thread.sleep(4000);
			objBaseClass.scrollToView("//button[contains(text(),'Update')]");
			Thread.sleep(4000);
			objBaseClass.mouseHover("//button[contains(text(),'Update')]");
			Thread.sleep(4000);
			objBaseClass.mouseHover("/html/body/div[5]/div/div/div[1]");
			
			
			
			
			}
			
			
			public void verifyRollaccessSetting() {
				objDashboardPage.DashboardMenuisDisplayed();
				objDashboardPage.AppointmentMenuisDisplayed();
				objDashboardPage.TreatmentMenuisDisplayed();
				objDashboardPage.FollowPrescriptionMenuisDisplayed();
				objDashboardPage.PatientBillingMenuisDisplayed();
				objDashboardPage.NoticeBoardMenuisDisplayed();	
				objDashboardPage.AttendanceMenuisDisplayed();
				objDashboardPage.CertificatesMenuisDisplayed();
				objDashboardPage.ShoppingMenuisDisplayed();
				objDashboardPage.MasterMenuisDisplayed();
				objDashboardPage.SearchPatientHistoryMenuisDisplayed();
				objDashboardPage.DocumentsMenuisDisplayed();
				
			}
			
			
			public void treatmentPropAlloSign() throws InterruptedException
			{
				this.clickOnTreatmentProp();
				objBaseClass.selectCheckbox("//input[@id='employeeId']");
				objBaseClass.mouseHover("/html/body/div[4]/div[2]/div[2]/div/div/div[1]/button");
				
			}
			
			
			public void treatmentPDFPropAlloSign() throws InterruptedException
			{
				this.clickOnTreatmentProp();
				objBaseClass.selectCheckbox("//input[@id='clinicPropertiesId_61']");
				Thread.sleep(1000);
				objBaseClass.mouseHover("/html/body/div[4]/div[2]/div[2]/div/div/div[1]/button");
				Thread.sleep(1000);
				objBaseClass.isdisplayed("//input[@id='topMargin']");
				Thread.sleep(3000);
				objBaseClass.unSelectCheckbox("//input[@id='clinicPropertiesId_61']");
				Thread.sleep(3000);
				objBaseClass.mouseHover("/html/body/div[4]/div[2]/div[2]/div/div/div[1]/button");
				
			}
			
			
			
			public void VerifyEmailSetting() throws InterruptedException {
				
				Thread.sleep(2000);
				objBaseClass.scrollToView("//*[@id='sidebar']/ul/li[9]/a[1]");
				objBaseClass.mouseHoverWithoutClick("/html/body/div[4]/div[1]/nav/ul/li[9]/a/i");
				
				Thread.sleep(2000);
				WebElement  element=driver.findElement(By.xpath("/html/body/div[4]/div[1]/nav/ul/li[9]/a/i"));   
				JavascriptExecutor ex=(JavascriptExecutor)driver;
				  ex.executeScript("arguments[0].click()", element);
					Thread.sleep(2000);
				objSetingPage.clickClinicEmailSetting();
				
				objBaseClass.isdisplayed("//h4[contains(text(),'Email Id Detail')]");
				
				objBaseClass.isdisplayed("//label[contains(text(),'Email Id')]");
				
				
				objBaseClass.isdisplayed("//label[contains(text(),'Provider')]");
				
				objBaseClass.isdisplayed("//label[contains(text(),'Password')]");
				
				objBaseClass.isdisplayed("//label[contains(text(),'Port')]");
				
			}
			
			

			public void VerifyDrApptTimeSetting() throws InterruptedException {
				Thread.sleep(2000);
				objBaseClass.scrollToView("/html/body/div[4]/div[1]/nav/ul/li[9]/a/i");
				objBaseClass.mouseHoverWithoutClick("/html/body/div[4]/div[1]/nav/ul/li[9]/a/i");
				
				
				Thread.sleep(3000);
				WebElement  element=driver.findElement(By.xpath("/html/body/div[4]/div[1]/nav/ul/li[9]/a/i"));   
				JavascriptExecutor ex=(JavascriptExecutor)driver;
				  ex.executeScript("arguments[0].click()", element);
				  Thread.sleep(3000);
				objSetingPage.clickDrApptTimeSetting();
				
				objBaseClass.isdisplayed("//*[@id='example_wrapper']/div[2]/div/div[1]/div[1]/div/label");
				  Thread.sleep(3000);
				objBaseClass.ClearText("//input[@id='propertiesValue']");
				  Thread.sleep(3000);
				objBaseClass.setText("//input[@id='propertiesValue']", "10");
				  Thread.sleep(3000);
				objBaseClass.ClearText("//input[@id='bookingDay']");
				  Thread.sleep(3000);
				objBaseClass.setText("//input[@id='bookingDay']", "10");
				objBaseClass.mouseHover("/html/body/div[4]/div[2]/div/div[2]/div/div/div/div/div[2]/div/div[2]/div/div/button");
				
				
			
			}
			
			
			
			public void selectAddpatientSetting() throws InterruptedException
			{
				objBaseClass.scrollToView("/html/body/div[4]/div[1]/nav/ul/li[9]/a/i");
				objBaseClass.mouseHoverWithoutClick("/html/body/div[4]/div[1]/nav/ul/li[9]/a/i");
				
				
				Thread.sleep(3000);
				WebElement  element=driver.findElement(By.xpath("/html/body/div[4]/div[1]/nav/ul/li[9]/a/i"));   
				JavascriptExecutor ex=(JavascriptExecutor)driver;
				  ex.executeScript("arguments[0].click()", element);
				  Thread.sleep(3000);
				  
				  objSetingPage.clickAddPatientSetting();
				  Thread.sleep(3000);
				  objBaseClass.selectDropDown("//select[@id='employeeId']", "viju");
				  Thread.sleep(3000);
				  objBaseClass.unSelectCheckbox("//input[@id='isEnabled_3960']");
				  Thread.sleep(3000);
				objBaseClass.unSelectCheckbox("//input[@id='isEnabled_3957']");
				
				objBaseClass.mouseHover("//*[@id='empPatientSettingDto']/div/div[2]/div/div/div/div[2]/div/div[2]/div/div/div/button");
				
			objBaseClass.refresh();
				
			}
			
			
			
			public void verifiAddpatientSett() throws InterruptedException
			
			
			
			{
				objAddpatientView.clickaddpatientOnAppointmentPage();
				objBaseClass.scrollToView("//label[contains(text(),'City')]");
				Thread.sleep(3000);
				/*objBaseClass.isNotdisplayed("//label[contains(text(),'Note')]");
				Thread.sleep(3000);
				
				objBaseClass.isNotdisplayed("//label[contains(text(),'Weight')]");
				*/
				
			}
			
			public void RevertAddpatientSetting() throws InterruptedException
			{
				objBaseClass.scrollToView("/html/body/div[4]/div[1]/nav/ul/li[9]/a/i");
				objBaseClass.mouseHoverWithoutClick("/html/body/div[4]/div[1]/nav/ul/li[9]/a/i");
				
				
				Thread.sleep(3000);
				WebElement  element=driver.findElement(By.xpath("/html/body/div[4]/div[1]/nav/ul/li[9]/a/i"));   
				JavascriptExecutor ex=(JavascriptExecutor)driver;
				  ex.executeScript("arguments[0].click()", element);
				  Thread.sleep(3000);
				  
				  objSetingPage.clickAddPatientSetting();
				  
				  objBaseClass.unSelectCheckbox("//input[@id='isEnabled_3960']");
				  
				  objBaseClass.unSelectCheckbox("//input[@id='isEnabled_3957']");
				
			}
			
			
			public void clickDrawerSetting() throws InterruptedException {
				Thread.sleep(2000);
				objBaseClass.scrollToView("//li[@id='Drawer Setting']");
				Thread.sleep(2000);
				objBaseClass.mouseHover("//li[@id='Drawer Setting']");
				
			}
			
			
			
			
			
			
			
			
			
}

