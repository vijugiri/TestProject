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

public class AddBranch extends BaseClass{

	

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
	

	String strval="Dummy";
	 static String strval2=null;
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

		@Test(priority = 2, dataProvider ="CompleteRegister")
		public void AddnewBranch(String ClinicName,String Firstname,String Lastname,String EmailId,String MobileNo ,String State,String Dist,String City,String Address,String ClinicType,String Referance) throws InterruptedException {
			Thread.sleep(2000);
			
			
		objmasterView.clickOnMaster();
			objmasterView.clickOnAddBranch();
			objmasterView.BranchDetailsheader();
			objmasterView.clickRegisternewbranch();
			objmasterView.setUsernameRegisterPage(strval);
			objmasterView.setFnameameRegisterPage(Firstname);
			objmasterView.setLastNameRegisterPage(Lastname);
			
			objRegisterpageView.setEmailIdRegisterPage(EmailId);
			
			objRegisterpageView.setmobileNoRegisterPage(MobileNo);
			
			objRegisterpageView.SelectState(State);		
			objRegisterpageView.SelectDist(Dist);
			objRegisterpageView.SelectCity(City);
			objmasterView.address(Address);
			
			objRegisterpageView.ClickAdminDetailNextButton();	
			objmasterView.selectonlinecheckbox();
			
			objRegisterpageView.SelectLicence();
			objRegisterpageView.SelectClinicType(ClinicType);
			objRegisterpageView.ClickNextButtonOnPaymentModePage();
			objRegisterpageView.SelectcheckboxWebSiteModuleAndBilling();
			objRegisterpageView.SelectcheckboxAdvertiesmentModuleAndBilling();
			objRegisterpageView.Select_3_Advertisemonth();
		
			objmasterView.clickonNext();
			objRegisterpageView.SelectcheckboxSMSService();
			objRegisterpageView.SetSenderIdText("VBGIRI");
			objRegisterpageView.SetSMSQTY("1000");

			objmasterView.clickonNext();
			objRegisterpageView.ClickSubmitButtonBillingInoviceClinicDetailsConfirmDetailPage();
			objRegisterpageView.ClickPayButton();
			objBaseClass.MakePayment();
			objRegisterpageView.ClickHereToLogin();
			
			
			
		}

		@Test(priority = 3)
		public void VerifyAddedBranch() throws InterruptedException {
			Thread.sleep(2000);
			
			objmasterView.clickOnMaster();
			objmasterView.clickOnAddBranch();
			objmasterView.verifyAddedBranch(strval);
			
			
		}
}
