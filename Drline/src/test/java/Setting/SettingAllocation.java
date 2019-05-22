package Setting;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

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
import com.setting.SettingView;

import Appointment.BookAppointmentFromAddPatientAppointmentPage;
import DashBoard.BookApointmentFromDashboard;
import Treatment.TreatmentView;

public class SettingAllocation extends BaseClass {

	
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

	
	
	BookAppointmentFromAddPatientAppointmentPage obBookAppointmentFromAddPatientAppointmentPage= new BookAppointmentFromAddPatientAppointmentPage();
	


		// make sure mobile number and password should be correct
		@Test(priority = 1, dataProvider ="inputData")
		public void Login(String url,String Mob,String Pass ) throws InterruptedException 
			{
			objBaseClass.LocalBrowserInit(url);
		
				objLoginPageView.Login(Mob,Pass);
			
				objLoginPageView.YesPopup();
		
	
			}
		
		@Test(priority = 2, dataProvider ="inputData")
		public void dashboardsettingAllocatesettingToReceptionist(String url,String Mob,String Pass) throws InterruptedException
		
		{
			objDashboardPage.clickDashboardMenu();
		
			objSettingView.clickSettingMenu();
			objSettingView.dashboardSetting();
			objLoginPageView.Logout();
		
			objLoginPageView.loginByRecep();
			
			objDashboardPage.clickDashboardMenu();
			objSettingView.verifyDashboardSetting();
			objLoginPageView.Logout();
			objLoginPageView.Login(Mob,Pass);
			objLoginPageView.YesPopup();
			objDashboardPage.clickDashboardMenu();
			objSettingView.clickSettingMenu();
			objDashboardPage.clickDashboardMenu();
		}
		
		
		@Test(priority = 3, dataProvider ="inputData")
		public void RollAccesssettingAllocatesettingToReceptionist(String url,String Mob,String Pass) throws InterruptedException
		
		{
			objDashboardPage.clickDashboardMenu();
		
			objSettingView.clickSettingMenu();
			objSettingView.RollAccessSetting();
			objLoginPageView.Logout();
			
			objLoginPageView.loginByRecep();
			
			objDashboardPage.clickDashboardMenu();
		
			objSettingView.verifyRollaccessSetting();
			
			objLoginPageView.Logout();
			objLoginPageView.Login(Mob,Pass);
			objLoginPageView.YesPopup();
			objDashboardPage.clickDashboardMenu();
			objSettingView.clickSettingMenu();
	
		}
		
		@Test(priority = 4, dataProvider ="HappyFlow")
		public void treatmentSetting(String SearchPatient,String FullName,String Disease,String MobNo,String EmailId, String Age,String Gender,String Weight,String Height,
				String State,String District,String City,String Note,String pulses,String Systolic,String diastolic,String repositoryRate,String temprature,String medicineNeme,String Dose,String Days,String ConsultingCharge ) throws InterruptedException
		
		{
			objDashboardPage.clickDashboardMenu();
			
			objSettingView.clickSettingMenu();
			objSettingView.treatmentPropAlloSign();
			objDashboardPage.clickDashboardMenu();
			
			obBookAppointmentFromAddPatientAppointmentPage.AddpatientFromAppointmentPage(SearchPatient, FullName, Disease, MobNo, EmailId, Age, Gender, Weight, Height, State, District, City, Note);
			objBaseClass.refresh();
			objAppointmentView.clickAppointmentMenu();
			objAppointmentView.ClickOnProcess();
			objDashboardView.clickDashboardMenu();
	
			objDashboardView.clickTreatmentMenu();
			objTreatmentView.verifyPatientInfo( Disease, FullName, EmailId,  Age);
			objTreatmentView.setComplaints(pulses, Systolic, diastolic, repositoryRate, temprature);
			
			objTreatmentView.clickPrintpriscription();
			objDashboardView.clickDashboardMenu();
			objDashboardPage.clickDashboardMenu();
		
			objDashboardPage.clickDashboardMenu();
			objSettingView.clickSettingMenu();
			objSettingView.treatmentPDFPropAlloSign();
			objDashboardPage.clickDashboardMenu();
			objBaseClass.refresh();
			objBaseClass.refresh();
			objDashboardPage.clickDashboardMenu();
		
		
		}
	
		@Test(priority = 5)
		public void clinicEmainSetting() throws InterruptedException 
		{
			Thread.sleep(2000);
			objSettingView.VerifyEmailSetting();
			objDashboardPage.clickDashboardMenu();
			driver.close();
		
		}
		
		
		
		
		@Test(priority = 6, dataProvider ="inputData")
		public void DrApptTimeSettin(String url,String Mob,String Pass ) throws InterruptedException 
			{
				objBaseClass.LocalBrowserInit(url);
				objLoginPageView.Login(Mob,Pass);
				objLoginPageView.YesPopup();
				objSettingView.VerifyDrApptTimeSetting();
				objDashboardPage.clickDashboardMenu();
				driver.quit();
		
		}
		
		
		@Test(priority = 7, dataProvider ="inputData")
		public void VerifyAddpatientSetting(String url,String Mob,String Pass ) throws InterruptedException 
			{
				objBaseClass.LocalBrowserInit(url);
				objLoginPageView.Login(Mob,Pass);
				objLoginPageView.YesPopup();
		
				objDashboardPage.clickDashboardMenu();
		
		objSettingView.selectAddpatientSetting();
		objLoginPageView.Logout();
		
		objLoginPageView.loginByRecep();
		
		objDashboardPage.clickAppointmentMenu();
		
		objSettingView.verifiAddpatientSett();
		objLoginPageView.Logout();
		objLoginPageView.Login(Mob,Pass);
		objLoginPageView.YesPopup();

		objDashboardPage.clickDashboardMenu();
		objSettingView.RevertAddpatientSetting();
		objDashboardPage.clickDashboardMenu();
		
			}
		
		
		
		
		
		
}
