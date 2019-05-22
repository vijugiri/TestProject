package inventoryOFClicnic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import com.appointment.AddpatientView;
import com.appointment.AppointmentPage;
import com.appointment.AppointmentView;
import com.dashboard.DashboardPage;
import com.dashboard.DashboardView;
import com.login.LoginPage;
import com.login.LoginPageView;
import com.main.BaseClass;
import com.master.masterView;
import com.register.RegisterpageView;
import com.setting.SettingView;

import Appointment.BookAppointmentFromAddPatientAppointmentPage;
import DashBoard.BookApointmentFromDashboard;
import Treatment.TreatmentView;
import inventry.inventoryView;

public class Vendor_test  extends BaseClass{

	

	AppointmentPage objAppointmentPage= new AppointmentPage();
	DashboardPage objDashboardPage= new DashboardPage();
	LoginPage objLoginPage=new LoginPage();
	BaseClass objBaseClass= new BaseClass();
	LoginPageView objLoginPageView= new LoginPageView();

	AppointmentView objAppointmentView= new AppointmentView();
	DashboardView objDashboardView= new DashboardView();
	BookApointmentFromDashboard objBookApointmentFromDashboard= new BookApointmentFromDashboard();
	AddpatientView objAddpatientView= new AddpatientView();
	RegisterpageView objRegisterpageView= new RegisterpageView();
	TreatmentView objTreatmentView = new TreatmentView();
	SettingView objSettingView = new SettingView();

	inventoryView objinventoryView= new inventoryView();
	
	BookAppointmentFromAddPatientAppointmentPage obBookAppointmentFromAddPatientAppointmentPage= new BookAppointmentFromAddPatientAppointmentPage();
	
	masterView objmasterView= new masterView();
	


	String strval=null;
	String strval2=null;
	String strval3=null;
	String strval4=null;

	
	


		// make sure mobile number and password should be correct
		@Test(priority = 1, dataProvider ="inputData")
		public void Login(String url,String Mob,String Pass ) throws InterruptedException 
			{
			objBaseClass.LocalBrowserInit(url);
		
				objLoginPageView.Login(Mob,Pass);
			
				objLoginPageView.YesPopup();
		
	
			}

		@Test(priority = 2, dataProvider ="AddEmployee")
		public void addVendor(String Firstname,String Role,String Qualification,String Speciality,String mobile,String email,String State,String District,String City,String PIN ,String Address,String Starttime,String endTime

) throws InterruptedException {
			
			
			objDashboardView.clickDashboardMenu();
			objinventoryView.clickOninventory();
			objinventoryView.clickOnvendor();
			objinventoryView.clickonAddVendor();
			objinventoryView.addvendor(Firstname, mobile, email, Address, PIN);
			objDashboardView.clickDashboardMenu();
			objinventoryView.clickOninventory();
			objinventoryView.clickOnvendor();
			objDashboardView.clickDashboardMenu();
			
			

}
	
		
		
		@Test(priority = 3, dataProvider ="AddEmployee")
		public void verifyVendor(String Firstname,String Role,String Qualification,String Speciality,String mobile,String email,String State,String District,String City,String PIN ,String Address,String Starttime,String endTime

) throws InterruptedException {
		
		
		
			objDashboardView.clickDashboardMenu();
			objinventoryView.clickOninventory();
			objinventoryView.clickOnvendor();
			objinventoryView.verifyvendor(Firstname, mobile, PIN, Address);
			objDashboardView.clickDashboardMenu();
		
		
		}
		
		
		/*
		@Test(priority = 7)
		public void editvendor() throws InterruptedException {
			

			objDashboardView.clickDashboardMenu();
			objinventoryView.clickOninventory();
			objinventoryView.clickOnvendor();
			objinventoryView.deletevendor();
			
		}*/
		
		
		
		
		
		
		
		@Test(priority = 6)
		public void EditvendorandVerifyVendor() throws InterruptedException {
			
			objDashboardView.clickDashboardMenu();
			objinventoryView.clickOninventory();
			objinventoryView.clickOnvendor();
			objinventoryView.Editvendor("411111");
			objDashboardView.clickDashboardMenu();
			objDashboardView.clickDashboardMenu();
			objinventoryView.clickOninventory();
			objinventoryView.clickOnvendor();
			objinventoryView.verifyeditrdvendor("411111");
			objDashboardView.clickDashboardMenu();
			driver.close();
			
		}
		
		
		
}
