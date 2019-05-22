package AllReports;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.Transaction.TransactionView;
import com.appointment.AddpatientView;
import com.appointment.AppointmentPage;
import com.appointment.AppointmentView;
import com.dashboard.DashboardPage;
import com.dashboard.DashboardView;
import com.login.LoginPage;
import com.login.LoginPageView;
import com.main.BaseClass;
import com.main.Log4j;
import com.register.RegisterpageView;
import com.report.reportview;
import com.setting.SettingView;

import Appointment.BookAppointmentFromAddPatientAppointmentPage;
import DashBoard.BookApointmentFromDashboard;
import Treatment.TreatmentView;

public class BookingTypeReport  extends BaseClass{
	
	private static Logger logger=LogManager.getLogger(Log4j.class);
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

	reportview objreportview= new reportview();
	
	BookAppointmentFromAddPatientAppointmentPage obBookAppointmentFromAddPatientAppointmentPage= new BookAppointmentFromAddPatientAppointmentPage();
	TransactionView objTransactionView= new TransactionView();


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
		
		
		@Test(priority=2)
		public void Paginition() throws InterruptedException {
			
			
			objDashboardView.clickDashboardMenu();
			objreportview.clickOnBookingTypeRerport();
			
			Thread.sleep(1000);
			objreportview.selectPagination("10");
			Thread.sleep(1000);
			objreportview.verifypaginitionvalue("10");
			
			Thread.sleep(1000);
			objreportview.selectPagination("25");
			Thread.sleep(1000);
			objreportview.verifypaginitionvalue("25");

			Thread.sleep(1000);
			objreportview.selectPagination("50");
			Thread.sleep(1000);
			objreportview.verifypaginitionvalue("50");

			Thread.sleep(1000);
			objreportview.selectPagination("100");
			Thread.sleep(1000);
			objreportview.verifypaginitionvalue("100");

			Thread.sleep(1000);
			objreportview.selectPagination("All");
			Thread.sleep(1000);
			objreportview.verifypaginitionvalue("All");
			
			objDashboardView.clickDashboardMenu();
		}
		
		
		
		@Test(priority=3)
		public void SelectDirectBookingTypeAndVerify() throws InterruptedException {
			
			
			objDashboardView.clickDashboardMenu();
			objreportview.clickOnBookingTypeRerport();
			objreportview.selectDirectBookTypeAdnVerify();
			objDashboardView.clickDashboardMenu();
	
		}

		
		@Test(priority=4)
		public void SelectONCALLBookingTypeAndVerify() throws InterruptedException {
			
			
			objDashboardView.clickDashboardMenu();
			objreportview.clickOnBookingTypeRerport();
			objreportview.selectONCALLDirectBookTypeAdnVerify();
			objDashboardView.clickDashboardMenu();
	
		}
		
		
		@Test(priority=5)
		public void SelectONLINEBookingTypeAndVerify() throws InterruptedException {
			
			
			objDashboardView.clickDashboardMenu();
			objreportview.clickOnBookingTypeRerport();
			objreportview.selectONLINEDirectBookTypeAdnVerify();
			objDashboardView.clickDashboardMenu();
	
		}
		
		
		
		@Test(priority=6)
		public void selectALLBookTypeAdnVerify() throws InterruptedException {
			
			
			objDashboardView.clickDashboardMenu();
			objreportview.clickOnBookingTypeRerport();
			objreportview.selectALLDirectBookTypeAdnVerify();
			objDashboardView.clickDashboardMenu();
			driver.close();
	
		}
		
		

}
