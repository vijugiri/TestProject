package com.dashboard;



import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dashboard.DashboardView;
import com.login.LoginPage;
import com.login.LoginPageView;
import com.main.BaseClass;

public class BookApointmentFromDashboard extends BaseClass{
	LoginPage objLoginPage=new LoginPage();
	BaseClass objBaseClass= new BaseClass();
	LoginPageView objLoginPageView= new LoginPageView();
	DashboardView objDashboardView= new DashboardView();
	


	String strval=null;
	String strval2=null;
	String strval3=null;
	String strval4=null;

	
	
	private String url="http://qa.drline.in/drline-webapp-qa/";
	private String Mob="9511711822";
	private String Pass="12345";
		
	
		
		//@Test(priority = 1, dataProvider ="inputData")
	
	@Test(priority =-11, dataProvider ="inputData")
	public void Login(String url,String Mob,String Pass ) throws InterruptedException 
		{
		objBaseClass.LocalBrowserInit(url);
	
			objLoginPageView.Login(Mob,Pass);
		
			objLoginPageView.YesPopup();
	

		}
	
		
		
		@Test(priority =1, dataProvider ="Dashboard")
		public void SelectDateToBooKAppointment(String Date,String Time,String Mob_Name,String fullname ) throws InterruptedException {
		
			
			objDashboardView.SelectDateToBooKAppointment(Date);
			objDashboardView.SelectTimeToBooKAppointment(Time);
			objDashboardView.PatientNameorMob(Mob_Name,fullname);
			objBaseClass.refresh();
			objDashboardView.clickDashboardMenu();
		
	
		}
		

		@Test(priority =4, dataProvider ="Dashboard")
		public void VerifyDetailsFromBooKedAppointment(String Date,String Time,String Mob_Name,String fullname ) throws InterruptedException {
		
			Thread.sleep(3000);
			objDashboardView.SelectDateToBooKAppointment(Date);
			objDashboardView.SelectTimeToBooKAppointment(Time);
			Thread.sleep(2000);
			//objDashboardView.VerifyPatientName(fullname);
			Thread.sleep(1000);
			objDashboardView.VerifyPatientMob(Mob_Name);
			objBaseClass.refresh();
			objDashboardView.clickDashboardMenu();
	
	
		}

		@Test(priority =5, dataProvider ="Dashboard")
		public void canceledBooKedAppointment(String Date,String Time,String Mob_Name,String fullname ) throws InterruptedException {
		
			Thread.sleep(3000);
			objDashboardView.SelectDateToBooKAppointment(Date);
			objDashboardView.SelectTimeToBooKAppointment(Time);
			Thread.sleep(2000);
			//objDashboardView.VerifyPatientName(fullname);
			Thread.sleep(1000);
			objDashboardView.VerifyPatientMob(Mob_Name);
			objDashboardView.CancelAppointment();
			objBaseClass.refresh();
			objDashboardView.clickDashboardMenu();
	
	
		}
		@Test(priority =6, dataProvider ="Dashboard")
		public void ComponentDosplayedonBookedPopUP(String Date,String Time,String Mob_Name,String fullname  ) throws InterruptedException {
			
			
			objDashboardView.SelectDateToBooKAppointment(Date);
			objDashboardView.SelectTimeToBooKAppointment(Time);
			objDashboardView.PatientNameorMob(Mob_Name,fullname);
			objBaseClass.refresh();
			objDashboardView.clickDashboardMenu();
			
			
			
			
			Thread.sleep(3000);
			objDashboardView.SelectDateToBooKAppointment(Date);
			objDashboardView.SelectTimeToBooKAppointment(Time);
			Thread.sleep(2000);
			//objDashboardView.VerifyPatientName(fullname);
			Thread.sleep(1000);
			objDashboardView.VerifyPatientMob(Mob_Name);
			objDashboardView.verifyComponentOnBookedAppointmentPopup();
			driver.close();
			
			
		}
		
		


		/*@AfterClass
		public void Logout() {
			objLoginPageView.Logout();
			objBaseClass.TearDown();
			
		}
		
		*/
		
		
		
		
		
		
		

}
