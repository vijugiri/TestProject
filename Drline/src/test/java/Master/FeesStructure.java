package Master;

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

public class FeesStructure  extends BaseClass{

	

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
		@Test(priority = 2)
		public void AddFeesStructurel() throws InterruptedException {
			
			objmasterView.clickOnMaster();
			objmasterView.clickOnFeesStructure();
			objmasterView.clickOnAddFeesStructure();
			objmasterView.setfeesPerticular();
			objmasterView.setfeesDescription();
			objmasterView.setfeesAmount();
			objmasterView.clickOnSubmitAddRoll();
			objDashboardView.clickDashboardMenu();	
		}

			@Test(priority = 3)
				public void verifynewFeesstructure() throws InterruptedException {
	
					objmasterView.clickOnMaster();
					objmasterView.clickOnFeesStructure();
					objmasterView.verifyNewFeesstru();
					objDashboardView.clickDashboardMenu();
	
}
			@Test(priority = 4)
			public void EditnewFeesstructure() throws InterruptedException {

				objmasterView.clickOnMaster();
				objmasterView.clickOnFeesStructure();
				objmasterView.clickOnEditNewFeesstru();
				objmasterView.EditfeesPerticular();
				objmasterView.clickUpdateEdirttAddRoll();
				objDashboardView.clickDashboardMenu();

			}
			@Test(priority = 5)
			public void deletenewFeesstructure() throws InterruptedException {

				objmasterView.clickOnMaster();
				objmasterView.clickOnFeesStructure();
				objmasterView.deleteNewFeesstru();
				objDashboardView.clickDashboardMenu();
				driver.close();
			
			}
















}
