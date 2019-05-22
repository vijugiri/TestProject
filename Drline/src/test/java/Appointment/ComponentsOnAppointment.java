package Appointment;

import org.testng.annotations.Test;

import com.appointment.AppointmentView;
import com.dashboard.DashboardView;
import com.login.LoginPage;
import com.login.LoginPageView;
import com.main.BaseClass;

import DashBoard.BookApointmentFromDashboard;

public class ComponentsOnAppointment extends BaseClass{	
LoginPage objLoginPage=new LoginPage();
BaseClass objBaseClass= new BaseClass();
LoginPageView objLoginPageView= new LoginPageView();
AppointmentView objAppointmentView=new AppointmentView();
DashboardView objDashboardView= new DashboardView();
BookApointmentFromDashboard objBookApointmentFromDashboard= new BookApointmentFromDashboard();



String strval=null;
String strval2=null;
String strval3=null;
String strval4=null;




		@Test(priority = 1, dataProvider ="inputData")
			public void setup(String url,String Mob,String Pass) throws InterruptedException
		{
			objBaseClass.LocalBrowserInit(url);
		}


		// make sure mobile number and password should be correct
		@Test(priority = 2, dataProvider ="inputData")
		public void Login(String url,String Mob,String Pass ) throws InterruptedException 
			{
		objLoginPageView.Login(Mob,Pass);
		objLoginPageView.YesPopup();
		
			}

		@Test(priority =3, dataProvider ="Dashboard")
		public void ComponentsOnAppointmentPage(String Date,String Time,String Mob_Name,String fullname) throws InterruptedException {
			
			
			objBookApointmentFromDashboard.SelectDateToBooKAppointment(Date, Time, Mob_Name, fullname);
			
			objDashboardView.clickDashboardMenu();
			objAppointmentView.clickAppointmentMenu();
			objAppointmentView.headerAppointment();
			objAppointmentView.searchAppointmentPlaceholder();
			objAppointmentView.addpatientOnAppointmentPageisDisplayed();
			objAppointmentView.hedrPatientWaitingListAppointment();
			objAppointmentView.verifyBookingTypetext();
			objAppointmentView.DrNameAppointmenttext();
			objAppointmentView.SpecialityAppointmenttext();
			objAppointmentView.NOOFPATIENTAppointmenttext();
			objAppointmentView.verifyEdit_Cancel_ProcessTextOnBookedAppointment();
			objAppointmentView.verifyAppointmentBookedTime(Time);

		
			
			
	
		}
	
		@Test(priority =4, dataProvider ="Dashboard")
		public void processBookedAppointment(String Date,String Time,String Mob_Name,String fullname) throws InterruptedException {
			
			objDashboardView.clickDashboardMenu();
			
			Thread.sleep(2000);
			objBookApointmentFromDashboard.SelectDateToBooKAppointment(Date, Time, Mob_Name, fullname);
			objAppointmentView.clickAppointmentMenu();
			Thread.sleep(2000);
			//objAppointmentView.mouseHoverOnDiffrentTimeSlot(Time);
			
			//objAppointmentView.processPatientFromWaitingList(Time);
			
			
			objAppointmentView.ClickOnProcess();
			
			objAppointmentView.verifyPatienthasProcessed();
			objDashboardView.clickDashboardMenu();
			
		}
		
		@Test(priority =5, dataProvider ="Dashboard")
		public void EditBookedAppointment(String Date,String Time,String Mob_Name,String fullname) throws InterruptedException {
			
			objDashboardView.clickDashboardMenu();
			
			Thread.sleep(2000);
			objBookApointmentFromDashboard.SelectDateToBooKAppointment(Date, Time, Mob_Name, fullname);
			objAppointmentView.clickAppointmentMenu();
			Thread.sleep(2000);	
			objAppointmentView.EditBookedPatientonAppointment();
			objBaseClass.refresh();
			
	
			
		}
		
		@Test(priority =6, dataProvider ="Dashboard")
		public void CancelBookedAppointmentWithYesButton(String Date,String Time,String Mob_Name,String fullname) throws InterruptedException {
			
			objDashboardView.clickDashboardMenu();
			
			Thread.sleep(2000);
			objBookApointmentFromDashboard.SelectDateToBooKAppointment(Date, Time, Mob_Name, fullname);
			objAppointmentView.clickAppointmentMenu();
			Thread.sleep(2000);	
			objAppointmentView.CancelBookedPatientonAppointmentWithYesButton();
		
			objBaseClass.refresh();
	
			
		}
		@Test(priority =7, dataProvider ="Dashboard")
		public void CancelBookedAppointmentWithNoButton(String Date,String Time,String Mob_Name,String fullname) throws InterruptedException {
			
			objDashboardView.clickDashboardMenu();
			
			Thread.sleep(2000);
			objBookApointmentFromDashboard.SelectDateToBooKAppointment(Date, Time, Mob_Name, fullname);
			objAppointmentView.clickAppointmentMenu();
			Thread.sleep(2000);	
			objAppointmentView.CancelBookedPatientonAppointmentWithNoButton();
		
			objBaseClass.refresh();
	
			driver.close();
		}
		
		
		

		//objAppointmentView.moushoverAndClickOnEditinAppointment();
		//Thread.sleep(2000);
		//objAppointmentView.moushoverAndClickOnCancelAndYesPopupInAppointment();
	/*	
		@Test(priority =1, dataProvider ="Dashboard")
		public void SelectDateToBooKAppointment(String Date,String Time,String Mob_Name,String fullname ) throws InterruptedException {
		
			
			objDashboardView.SelectDateToBooKAppointment(Date);
			objDashboardView.SelectTimeToBooKAppointment(Time);
			objDashboardView.PatientNameorMob(Mob_Name,fullname);
			objBaseClass.refresh();
			objDashboardView.clickDashboardMenu();
		
	
		}
	*/
	
	
	
	
	
	
	
	
	
	}
