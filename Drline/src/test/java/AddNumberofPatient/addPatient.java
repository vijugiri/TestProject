package AddNumberofPatient;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.appointment.AddpatientView;
import com.appointment.AppointmentPage;
import com.appointment.AppointmentView;
import com.dashboard.DashboardPage;
import com.dashboard.DashboardView;
import com.followUp.FollowupView;
import com.login.LoginPage;
import com.login.LoginPageView;
import com.main.BaseClass;
import com.main.Log4j;
import com.register.RegisterpageView;
import com.setting.SettingView;

import Appointment.BookAppointmentFromAddPatientAppointmentPage;
import DashBoard.BookApointmentFromDashboard;
import Treatment.TreatmentView;

public class addPatient extends BaseClass{

	
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
	FollowupView objFollowupView= new FollowupView();


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
		
	
	
		
		@Test(priority = 3, dataProvider ="AddPatient")
		public void Addpatientonly(String SearchPatient,String FullName,String Disease,String MobNo,String EmailId, String Age,String Gender,String Weight,String Height,
				String State,String District,String City,String Note) throws InterruptedException
		{
		
			
		
			objDashboardView.clickDashboardMenu();
			objAppointmentView.clickAppointmentMenu();
			objAddpatientView.clickaddpatientOnAppointmentPage();
			objBaseClass.setText("//input[@id='phone']", MobNo);
	
			objAddpatientView.setFullname(FullName);
			objAddpatientView.setDiseseOnAddpatient(Disease);
			objAddpatientView.setEmailIdAddpatinetPage(EmailId);
			objAddpatientView.setAgeOnAddpatient(Age);
			objAddpatientView.SelectGender(Gender);
			objAddpatientView.setWaightAddpatient(Weight);
			objAddpatientView.setHeightAddpatient(Height);
			objAddpatientView.clickSaveAndBookAddpatientbutton();
			objBaseClass.refresh();
			
			
			
			
			
			
			
			
			
			
			
			
			
		}	

}
