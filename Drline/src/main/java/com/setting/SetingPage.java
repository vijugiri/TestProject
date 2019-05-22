package com.setting;

import com.login.LoginPage;
import com.main.BaseClass;

public class SetingPage extends BaseClass {
	
	LoginPage objLoginPage=new LoginPage();
	BaseClass objBaseClass= new BaseClass();


	String strval=null;
	String strval3=null;
	String strval4=null;
	String strval2=null;

	
	public void UnselectOwnProperties() throws InterruptedException {
		Thread.sleep(2000);
		objBaseClass.unSelectCheckbox("//*[@id='clinicPropertiesId_60']]");
	}
	
public void selectOwnProperties() {
		
		objBaseClass.selectCheckbox("//*[@id='clinicPropertiesId_60']");
	}
	
	


	public void clickDashboardSett() 
	{
		objBaseClass.scrollToView("//span[contains(text(),'DashBoard Setting')]");
	objBaseClass.mouseHover("//span[contains(text(),'DashBoard Setting')]");
	}
	
	
	
	


	public void clickRoleAccessSetting() 
	{
	objBaseClass.mouseHover("//span[contains(text(),'Role Access Setting')]");
	}
	
	
	
	

	public void clickUserAccessSetting() 
	{
	objBaseClass.mouseHover("//span[contains(text(),'User Access Setting')]");
	}
	
	
	

	public void clickClinicEmailSetting() 
	{
	
	objBaseClass.mouseHover("//span[contains(text(),'Clinic Email Setting')]");
	}
	
	
	
	

	public void clickTreatmentPropertiesSetting() 
	{
	objBaseClass.mouseHover("//span[contains(text(),'Treatment Properties')]");
	}
	
	
	
	public void clickDrApptTimeSetting() 
	{
		
	objBaseClass.mouseHover("//span[contains(text(),'Dr Appt Time Setting')]");
	}
	
	
	
	

	public void clickAddPatientSetting() 
	{
	objBaseClass.mouseHover("//span[contains(text(),'Add Patient Setting')]");
	}
	
	
	   
	

		public void clickMyPatientSetting() 
		{
		objBaseClass.mouseHover("//span[contains(text(),'My Patient Setting')]");
		}
		

		public void clickPtHistorSetting() 
		{
		objBaseClass.mouseHover("//span[contains(text(),'Pt History Sett')]");
		}
	
		
	

		public void clickDrawerSetting() 
		{
		objBaseClass.mouseHover("//span[contains(text(),'Drawer Setting')]");
		}
	
		
	

		public void clickBirthdaySMSSetting() 
		{
		objBaseClass.mouseHover("//span[contains(text(),'Birthday SMS Setting')]");
		}
	
		
		
		


		
		
		
		
		
		
		
		
}
