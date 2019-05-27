package Setting;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
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
import com.setting.SetingPage;
import com.setting.SettingView;

import Appointment.BookAppointmentFromAddPatientAppointmentPage;
import DashBoard.BookApointmentFromDashboard;
import Treatment.TreatmentView;

public class AddPatientSetting   extends BaseClass {

	
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
	SetingPage objSetingPage = new SetingPage();
	
	
	BookAppointmentFromAddPatientAppointmentPage obBookAppointmentFromAddPatientAppointmentPage= new BookAppointmentFromAddPatientAppointmentPage();
	


		// make sure mobile number and password should be correct
		@Test(priority = 1, dataProvider ="inputData")
		public void Login(String url,String Mob,String Pass ) throws InterruptedException 
			{
			objBaseClass.LocalBrowserInit(url);
		
				objLoginPageView.Login(Mob,Pass);
			
				objLoginPageView.YesPopup();
		
	
			}
		@Test(priority = 2)
		public void AddPatientSetting()throws InterruptedException		{
			objDashboardPage.clickDashboardMenu();
			objAppointmentView.clickAppointmentMenu();
			objDashboardPage.clickDashboardMenu();
			objSettingView.clickSettingMenu();
			objSetingPage.clickAddPatientSetting();
			objSettingView.selectEmp();
			objSettingView.selecNotechkbox();
			objSettingView.clivkOnSave();
			objDashboardPage.clickDashboardMenu();
			objAppointmentView.clickAppointmentMenu();
			objAddpatientView.clickaddpatientOnAppointmentPage();
			objSettingView.NoteIsDisplayed();
			objDashboardPage.clickDashboardMenu();
			
			objSettingView.clickSettingMenu();
			objSetingPage.clickAddPatientSetting();
			objSettingView.selectEmp();
			objSettingView.unselecNotechkbox();
			objSettingView.clivkOnSave();
			objDashboardPage.clickDashboardMenu();
			objAppointmentView.clickAppointmentMenu();
			objAddpatientView.clickaddpatientOnAppointmentPage();
			objDashboardPage.clickDashboardMenu();

}
		
		@Test(priority = 11)
		public void close() {
			driver.close();
		}
		
		
	
		@Test(priority = 3)
		public void emailSetting()throws InterruptedException		{
			objDashboardPage.clickDashboardMenu();
			objAppointmentView.clickAppointmentMenu();
			objDashboardPage.clickDashboardMenu();
			objSettingView.clickSettingMenu();
			objSetingPage.clickAddEmailSetting();
			objSetingPage.verifyEmailheader();	
			objSettingView.setClinicEmailId("drline.care@gmail.com");		
			objSettingView.setClinicEmailIdPassword("DrLine@12345");	
			objSettingView.setClinicEmailIdPort("587");	
			objSettingView.setClinicEmailIdprovider("Gmail");	
			objSettingView.clickUpdateButtonEmailSett();
			objSettingView.verifyEmailSettingUpdate();
			objDashboardPage.clickDashboardMenu();
			
		}
		

		
		@Test(priority = 4)
			public void TreatmentPropertiesSettingPDFSIGN() throws InterruptedException
			{
				
				objDashboardView.clickDashboardMenu();
				objSettingView.clickSettingMenu();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				objSettingView.clickOnTreatmentProp();
				objSettingView.deselectPdfSign();
				objSettingView.selectPdfSign();
				objSettingView.verifyPdfSignlSetting();
				objDashboardView.clickDashboardMenu();
				
			
				
				
			}
	
		@Test(priority = 5)
			public void TreatmentPropertiesSettingFollowup() throws InterruptedException
			{
				
				objDashboardView.clickDashboardMenu();
				objSettingView.clickSettingMenu();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				objSettingView.clickOnTreatmentProp();
				objSettingView.deselectFolloup();
				objSettingView.selectFolloup();
				objSettingView.verifyPdfSignlSetting();
				objDashboardView.clickDashboardMenu();
				
			
				
				
			}
		
		
		@Test(priority = 6)
		public void BdaySMSsetting() throws InterruptedException
		{
			
			objDashboardView.clickDashboardMenu();
			objSettingView.clickSettingMenu();
			objSettingView.clickOnBdaySMS();
			objSettingView.deselectSMSBirthday();
			objSettingView.selectSMSBirthday();
			objSettingView.verifySMSBirthday();
			objDashboardView.clickDashboardMenu();
		}
		
		
		
		
		

@Test(priority = 7)
public void RevertAddPatientSetting()throws InterruptedException		{
	objDashboardPage.clickDashboardMenu();
	objAppointmentView.clickAppointmentMenu();
	objDashboardPage.clickDashboardMenu();
	objSettingView.clickSettingMenu();
	objSetingPage.clickAddPatientSetting();
	objSettingView.selectEmp();
	objSettingView.selecNotechkbox();
	objSettingView.clivkOnSave();
	objDashboardPage.clickDashboardMenu();
}
		
		
}
