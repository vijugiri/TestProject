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

public class expenseReport extends BaseClass{
	
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

		

		@Test(priority = 2, dataProvider ="Transaction")

		public void AddexpenditureandVerifyinExpenceReport(String Narration, String Amount,String Description) throws InterruptedException
		{
			objDashboardView.clickDashboardMenu();
			objTransactionView.clickOnTransaction();
			objTransactionView.clickOnExpenditure();
			
			objTransactionView.headerofExpenditureidDisplayed();
			objTransactionView.HandoverLinkisdisplayed();
			objTransactionView.AddExpenditureDetailsLinkisdisplayed();
			objTransactionView.clickOnAddExpenditureDetailsLink();
			
			
			objTransactionView.setnarretion(Narration);
			objTransactionView.setAmount(Amount);
			objTransactionView.setDiscription(Description);
			objTransactionView.clickSubmitOnExpenditure();
			objBaseClass.refresh();
			objTransactionView.verifyExpenditureNaretion(Narration);	
			objTransactionView.verifyExpenditureAmount(Amount);		
			objDashboardView.clickDashboardMenu();
			objreportview.clickOnExpenseReport();
			objreportview.verifyExpenditureNaretion(Narration);
			objreportview.verifyExpenditureAmount(Amount);
			objDashboardView.clickDashboardMenu();
			
	
			
		}
		
		
		
		
		@Test(priority=3)
		public void Paginition() throws InterruptedException {
			
			
			objDashboardView.clickDashboardMenu();
			objreportview.clickOnExpenseReport();
			
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
			
			objDashboardView.clickDashboardMenu();
		}
			

		
		
		@Test(priority = 4, dataProvider ="Transaction")

		public void AddexpenditureandVerifysEARCHFunctionality(String Narration, String Amount,String Description) throws InterruptedException
		{
			objDashboardView.clickDashboardMenu();
			objTransactionView.clickOnTransaction();
			objTransactionView.clickOnExpenditure();
			
			objTransactionView.headerofExpenditureidDisplayed();
			objTransactionView.HandoverLinkisdisplayed();
			objTransactionView.AddExpenditureDetailsLinkisdisplayed();
			objTransactionView.clickOnAddExpenditureDetailsLink();
			
			
			objTransactionView.setnarretion(Narration);
			objTransactionView.setAmount(Amount);
			objTransactionView.setDiscription(Description);
			objTransactionView.clickSubmitOnExpenditure();
			objBaseClass.refresh();
			objTransactionView.verifyExpenditureNaretion(Narration);	
			objTransactionView.verifyExpenditureAmount(Amount);		
			objDashboardView.clickDashboardMenu();
			objreportview.clickOnExpenseReport();
			objreportview.EnterNarrationInsearchfunction(Narration);
			objreportview.Verifysearchfunction(Narration);
			
			objDashboardView.clickDashboardMenu();
		
		
		}
		

		@Test(priority=6)
		public void verifyAllBookingType() throws InterruptedException {
			

			objDashboardView.clickDashboardMenu();
			objreportview.clickOnBookingTypeReport();
			Thread.sleep(1000);
			objreportview.verifyDirectBookingType();
			Thread.sleep(1000);
			objreportview.verifyONCALLBookingType();
			Thread.sleep(1000);
			objreportview.verifyALLBookingType();
			Thread.sleep(1000);
			objDashboardView.clickDashboardMenu();
			driver.close();
		}
		
		
		
		
		
		
		
		
		
}
