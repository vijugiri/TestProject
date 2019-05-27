package Appointment;

import org.testng.annotations.Test;

import com.appointment.AddpatientView;
import com.appointment.AppointmentView;
import com.dashboard.DashboardView;
import com.login.LoginPage;
import com.login.LoginPageView;
import com.main.BaseClass;
import com.register.RegisterpageView;

import DashBoard.BookApointmentFromDashboard;

public class BookAppointmentFromAddPatientAppointmentPage extends BaseClass{	
	LoginPage objLoginPage=new LoginPage();
	BaseClass objBaseClass= new BaseClass();
	LoginPageView objLoginPageView= new LoginPageView();
	AppointmentView objAppointmentView=new AppointmentView();
	DashboardView objDashboardView= new DashboardView();
	BookApointmentFromDashboard objBookApointmentFromDashboard= new BookApointmentFromDashboard();
	AddpatientView objAddpatientView= new AddpatientView();
	RegisterpageView objRegisterpageView= new RegisterpageView();

	String strval=null;
	String strval2=null;
	String strval3=null;
	String strval4=null;





			
			@Test(priority = 1, dataProvider ="inputData")
			public void Login(String url,String Mob,String Pass ) throws InterruptedException 
				{
			objBaseClass.LocalBrowserInit(url);	
			objLoginPageView.Login(Mob,Pass);
			objLoginPageView.YesPopup();
			
				}
			
			

			
			@Test(priority = 2, dataProvider ="Appointment")
			public void AddpatientFromAppointmentPage(String SearchPatient,String FullName,String Disease,String MobNo,String EmailId, String Age,String Gender,String Weight,String Height,String State,String District,String City,String Note ) throws InterruptedException {
				
				objDashboardView.clickDashboardMenu();
				objAppointmentView.clickAppointmentMenu();
				objAppointmentView.CalcelAllAppointment();
				objDashboardView.clickDashboardMenu();
				objAppointmentView.clickAppointmentMenu();
				objAddpatientView.clickaddpatientOnAppointmentPage();
			
				objAddpatientView.setSearchPatient(MobNo);
				
				objAddpatientView.setFullname(FullName);
				objAddpatientView.setDiseseOnAddpatient(Disease);
				objAddpatientView.setEmailIdAddpatinetPage(EmailId);
			
			
			
				objAddpatientView.setAgeOnAddpatient(Age);
				objAddpatientView.SelectGender(Gender);
				objAddpatientView.setWaightAddpatient(Weight);
				objAddpatientView.setHeightAddpatient(Height);
				/*objRegisterpageView.SelectState(State);		
				objRegisterpageView.SelectDist(District);
				objRegisterpageView.SelectCity(City);*/
				objAddpatientView.setNoteAddpatient(Note);
				//objAddpatientView.setDOBOnAddpatient("2018", "Aug", "1");
				objAddpatientView.clickSaveAndBookAddpatientbutton();

				objBaseClass.refresh();
				
				
			
				
				
				
				
				
				
				
			}
			
			
			
			
			
}
