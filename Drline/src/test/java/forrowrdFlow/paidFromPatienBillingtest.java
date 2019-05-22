package forrowrdFlow;

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

public class paidFromPatienBillingtest extends BaseClass{

	
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
		

		
	/*@Test(priority = 2)
		public void UnselectOWNInventory() throws InterruptedException
		{
			
			objDashboardView.clickDashboardMenu();
			objSettingView.clickSettingMenu();
			Thread.sleep(3000);
			objSettingView.unSelectTreatmentproperties();
			objDashboardView.clickDashboardMenu();
			
			
		}
	*/
	
	
	

	@Test(priority = 3, dataProvider ="HappyFlow")
	public void PaidFromPatientBilling(String SearchPatient,String FullName,String Disease,String MobNo,String EmailId, String Age,String Gender,String Weight,String Height,
			String State,String District,String City,String Note,String pulses,String Systolic,String diastolic,String repositoryRate,String temprature,String medicineNeme,String Dose,String Days,String ConsultingCharge ) throws InterruptedException
	
	{
		
		obBookAppointmentFromAddPatientAppointmentPage.AddpatientFromAppointmentPage(SearchPatient, FullName, Disease, MobNo, EmailId, Age, Gender, Weight, Height, State, District, City, Note);
		objBaseClass.refresh();
		objAppointmentView.clickAppointmentMenu();
		objAppointmentView.ClickOnProcess();
		objDashboardView.clickDashboardMenu();

		objDashboardView.clickTreatmentMenu();
		objTreatmentView.verifyPatientInfo( Disease, FullName, EmailId,  Age);
		objTreatmentView.setComplaints(pulses, Systolic, diastolic, repositoryRate, temprature);
	
		objTreatmentView.AddPricsriptionBeforeFood(medicineNeme, Dose, Days, ConsultingCharge, Note);
	
		
		objTreatmentView.clickContinueButtonWithNooption();
		
		objTreatmentView.clickOnSave();
		objDashboardView.clickDashboardMenu();
		objDashboardView.clickPatientBillingMenu();
		objTreatmentView.clickOnMakePaymenyt(FullName);
		

		objTreatmentView.VerifyAmount(ConsultingCharge);
		logger.info("Consulting charges are correct");
		objTreatmentView.clickOnCollect();
		objBaseClass.refresh();
		logger.info("Patient closed Sucessfully");
		objDashboardView.clickDashboardMenu();
		
		driver.close();
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
