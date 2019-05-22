package Trenment;

import java.util.concurrent.TimeUnit;

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

public class treatmentSettingTest extends BaseClass{

	
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
		

		
	
		
		

	
		// without inventory 
		
		@Test(priority = 2, dataProvider ="HappyFlow")
		public void HappyFlowFromAddpatientToBilling(String SearchPatient,String FullName,String Disease,String MobNo,String EmailId, String Age,String Gender,String Weight,String Height,
				String State,String District,String City,String Note,String pulses,String Systolic,String diastolic,String repositoryRate,String temprature,String medicineNeme,String Dose,String Days,String ConsultingCharge ) throws InterruptedException
		
		{
			obBookAppointmentFromAddPatientAppointmentPage.AddpatientFromAppointmentPage(SearchPatient, FullName, Disease, MobNo, EmailId, Age, Gender, Weight, Height, State, District, City, Note);
			objBaseClass.refresh();
			objAppointmentView.clickAppointmentMenu();
			objAppointmentView.ClickOnProcess();
			objDashboardView.clickDashboardMenu();
			

		}
		
		
		@Test(priority=3)
		
		public void verifyAllCheckboxSelectedProper () throws InterruptedException {
			objDashboardView.clickDashboardMenu();
			objDashboardView.clickTreatmentMenu();
			objTreatmentView.clickSettingIcon();
			Thread.sleep(2000);
			objTreatmentView.selectAllCheckBox();
			Thread.sleep(2000);
			objTreatmentView.clickonSaveTreatmentSetting();
			Thread.sleep(2000);
			objTreatmentView.verifyAllCheckboxSelected();
		}
		
		
		@Test(priority=4)
		public void verifyPulsesckboxIsNotSelected() throws InterruptedException {
			objDashboardView.clickDashboardMenu();
			objDashboardView.clickTreatmentMenu();

			objTreatmentView.clickSettingIcon();
			Thread.sleep(2000);
			objTreatmentView.unSelectPULSESCheckboxTreatmentSetting();
			Thread.sleep(2000);
			objTreatmentView.clickonSaveTreatmentSetting();
			Thread.sleep(2000);
	
			objTreatmentView.verifyPulsesckboxIsNotSelected();
			
		}
		
		

		@Test(priority=5)
		public void verifyBloodcheckboxIsNotSelected() throws InterruptedException {
			objDashboardView.clickDashboardMenu();
			objDashboardView.clickTreatmentMenu();
			objTreatmentView.clickSettingIcon();
			Thread.sleep(2000);
			objTreatmentView.unSelectBlood_PressureCheckboxTreatmentSetting();
			Thread.sleep(2000);
			objTreatmentView.clickonSaveTreatmentSetting();
			Thread.sleep(2000);

			objTreatmentView.verifyBloodcheckboxIsNotSelected();
			
		}
		

		@Test(priority=6)
		public void verifyTempCheckboxIsNotSelected() throws InterruptedException {

			objDashboardView.clickDashboardMenu();
			objDashboardView.clickTreatmentMenu();
			
			objTreatmentView.clickSettingIcon();
			Thread.sleep(2000);
			objTreatmentView.unSelectTempCheckboxTreatmentSetting();
			Thread.sleep(2000);
			objTreatmentView.clickonSaveTreatmentSetting();
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			objTreatmentView.verifyTempCheckboxIsNotSelected();
		}
		

		@Test(priority=7)
		public void verifyR_RCheckboxIsNotSelected() throws InterruptedException {

			objDashboardView.clickDashboardMenu();
			objDashboardView.clickTreatmentMenu();
			objTreatmentView.clickSettingIcon();
			Thread.sleep(2000);
			objTreatmentView.unSelectR_RCheckboxTreatmentSetting();
			Thread.sleep(2000);
			objTreatmentView.clickonSaveTreatmentSetting();
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			objTreatmentView.verifyR_RCheckboxIsNotSelected();
		}
		

		@Test(priority=8)
		public void verifyK_C_O_CheckboxisNotSelected() throws InterruptedException {
			objDashboardView.clickDashboardMenu();
			objDashboardView.clickTreatmentMenu();
			objTreatmentView.clickSettingIcon();
			Thread.sleep(2000);
			objTreatmentView.unSelectK_C_OCheckboxTreatmentSetting();
			Thread.sleep(2000);
			objTreatmentView.clickonSaveTreatmentSetting();
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			objTreatmentView.verifyK_C_O_CheckboxisNotSelected();
			
			
		}
		
		@Test(priority=9)
		public void verifyCancaelButton() throws InterruptedException {
			objDashboardView.clickDashboardMenu();
			objDashboardView.clickTreatmentMenu();
			objTreatmentView.clickSettingIcon();
			Thread.sleep(2000);
			objTreatmentView.selectAllCheckBox();
			Thread.sleep(1000);
			objTreatmentView.clickonSaveTreatmentSetting();
			Thread.sleep(1000);
			objDashboardView.clickDashboardMenu();
			objDashboardView.clickTreatmentMenu();
			objTreatmentView.clickSettingIcon();
			Thread.sleep(1000);
			objTreatmentView.unSelectPULSESCheckboxTreatmentSetting();
			Thread.sleep(1000);
			objTreatmentView.unSelectTempCheckboxTreatmentSetting();
			Thread.sleep(1000);
			objTreatmentView.unSelectR_RCheckboxTreatmentSetting();
			Thread.sleep(1000);
			objTreatmentView.unSelectK_C_OCheckboxTreatmentSetting();
			Thread.sleep(1000);
			objTreatmentView.clickonCancelTreatmentSetting();
			Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			Thread.sleep(1000);
			objTreatmentView.verifyAllCheckboxSelected();
			driver.close();
			
		}
		
		
		
		
}
