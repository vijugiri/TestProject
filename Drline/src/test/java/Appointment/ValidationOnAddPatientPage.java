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

public class ValidationOnAddPatientPage extends BaseClass{	
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
			public void componentsDisplayed(String SearchPatient,String FullName,String Disease,String MobNo,String EmailId, String Age,String Gender,String Weight,String Height,String State,String District,String City,String Note ) throws InterruptedException {
				
				objDashboardView.clickDashboardMenu();
				objAppointmentView.clickAppointmentMenu();	
				objAddpatientView.clickaddpatientOnAppointmentPage();	
				objAddpatientView.headerAddatient();
				objAddpatientView.verifySearchPatienttext();
				objAddpatientView.SearchPatientPlaceholder();
				objAddpatientView.verifyFullNamePatienttext();
				objAddpatientView.SearchFullNamePlaceholder();
				objAddpatientView.verifyDiseasePatienttext();
				objAddpatientView.SearchDiseasePlaceholder();
				objAddpatientView.verifyMobilePatienttext();
				objAddpatientView.SearchMobNoPlaceholder();
				objAddpatientView.verifyEmailIdPatienttext();
				objAddpatientView.SearchEmailIdPlaceholder();
				objAddpatientView.verifyAgePatienttext();
				objAddpatientView.SearchAgePlaceholder();
				objAddpatientView.verifyDateOfBirthPatienttext();
				objAddpatientView.SearchDateOfBirthPlaceholder();	
				objAddpatientView.verifyGenderPatienttext();
				objAddpatientView.SearchWeightPlaceholder();
				objAddpatientView.verifyWeightPatienttext();
				objAddpatientView.verifyHeightPatienttext();
				objAddpatientView.SearchHeightPlaceholder();
				objAddpatientView.verifyStatePatienttext();
				objAddpatientView.verifyDistrictPatienttext();
				objAddpatientView.verifyCityPatienttext();		
				objAddpatientView.verifySelectDoctorPatienttext();
				objAddpatientView.verifyNotePatienttext();
				objAddpatientView.SearchNotetPlaceholder();
				objAddpatientView.verifySaveAndBookAppointmentButtonPatienttext();
				objAddpatientView.verifyAllClearPatienttext();
				objBaseClass.refresh();
				objDashboardView.clickDashboardMenu();
			}
			

@Test(priority = 3, dataProvider ="Appointment")
public void ValidationOnAddpatient(String SearchPatient,String FullName,String Disease,String MobNo,String EmailId, String Age,String Gender,String Weight,String Height,String State,String District,String City,String Note ) throws InterruptedException {
	
	objDashboardView.clickDashboardMenu();
	objAppointmentView.clickAppointmentMenu();	
	objAddpatientView.clickaddpatientOnAppointmentPage();	
	objAddpatientView.headerAddatient();
	
	objAddpatientView.VerifyWithoutEnterAnyDataAddPatient();
	objBaseClass.refresh();
	
	objAddpatientView.VerifyWithoutEnterdiseaseAddPatient(MobNo);
	objBaseClass.refresh();
	objAddpatientView.VerifyWithoutFullNameAddPatient(MobNo);
	objBaseClass.refresh();
	
	objAddpatientView.clearAllbutton( SearchPatient, FullName, Disease, MobNo, EmailId,  Age, Gender, Weight, Height, State, District, City, Note);	
	objBaseClass.refresh();
	
	objAddpatientView.verifyUpdatingexistingpatienttext(MobNo);
	objAddpatientView.verifyedWeightFormat(Weight);
	objBaseClass.refresh();
	objAddpatientView.verifyedHeightFormat(Height);
	objBaseClass.refresh();
	objAddpatientView.verifyWrongEmail(MobNo,FullName,Disease);	

	objBaseClass.refresh();
	


}

@Test(priority = 4, dataProvider ="Appointment")
public void SearchFunctionalityOnAppointmentPage(String SearchPatient,String FullName,String Disease,String MobNo,String EmailId, String Age,String Gender,String Weight,String Height,String State,String District,String City,String Note ) throws InterruptedException {
	
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
	objRegisterpageView.SelectState(State);		
	objRegisterpageView.SelectDist(District);
	objRegisterpageView.SelectCity(City);
	objAddpatientView.setNoteAddpatient(Note);
	objAddpatientView.clickSaveAndBookAddpatientbutton();
	objBaseClass.refresh();
	objDashboardView.clickDashboardMenu();
	objAppointmentView.clickAppointmentMenu();
	objBaseClass.refresh();
	objDashboardView.clickDashboardMenu();

	driver.close();
}


}
