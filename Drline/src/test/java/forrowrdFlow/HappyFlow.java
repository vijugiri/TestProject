package forrowrdFlow;

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

public class HappyFlow extends BaseClass{

	
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

	
	@Test(priority = 2)
		public void UnselectOWNInventory() throws InterruptedException
		{
			
			objDashboardView.clickDashboardMenu();
			objSettingView.clickSettingMenu();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			objSettingView.unSelectTreatmentproperties();
			objDashboardView.clickDashboardMenu();
			
			
		}
		
		
		

	
		// without inventory 

		@Test(priority = 3, dataProvider ="HappyFlow")
		public void HappyFlowFromAddpatientToBilling(String SearchPatient,String FullName,String Disease,String MobNo,String EmailId, String Age,String Gender,String Weight,String Height,
				String State,String District,String City,String Note,String pulses,String Systolic,String diastolic,String repositoryRate,String temprature,String medicineNeme,String Dose,String Days,String ConsultingCharge ) throws InterruptedException
		
		{
			
			obBookAppointmentFromAddPatientAppointmentPage.AddpatientFromAppointmentPage(SearchPatient, FullName, Disease, MobNo, EmailId, Age, Gender, Weight, Height, State, District, City, Note);
			objBaseClass.refresh();
			objAppointmentView.clickAppointmentMenu();
			objAppointmentView.updatePatient(Disease+"High Fever");
			logger.info("Patient updated sucessfully");
			objBaseClass.refresh();
			objAppointmentView.ClickOnProcess();
			
			
			
			objDashboardView.clickDashboardMenu();
			objDashboardView.clickTreatmentMenu();
			objTreatmentView.verifyPatientInfo( Disease, FullName, EmailId,  Age);
			objTreatmentView.editPatientData();
			logger.info("Patient updated sucessfully");
			objTreatmentView.DeletePatientFromTreatmentpageWithNoButton();
			objTreatmentView.DeletePatientFromTreatmentpageWithYesButton();
			logger.info("Patient Deleted sucessfully");

			obBookAppointmentFromAddPatientAppointmentPage.AddpatientFromAppointmentPage(SearchPatient, FullName, Disease, MobNo, EmailId, Age, Gender, Weight, Height, State, District, City, Note);
			objBaseClass.refresh();
			objAppointmentView.clickAppointmentMenu();
			objAppointmentView.ClickOnProcess();
			//priscription
			objDashboardView.clickDashboardMenu();
			objDashboardView.clickTreatmentMenu();
			objTreatmentView.verifyPatientInfo( Disease, FullName, EmailId,  Age);
			objTreatmentView.setComplaints(pulses, Systolic, diastolic, repositoryRate, temprature);
			objTreatmentView.AddPricsriptionAfterFood(medicineNeme, Dose, Days, ConsultingCharge, Note);
			logger.info("Priscription added sucessfully");
			objTreatmentView.clickContinueButtonWithYesoption();
			
			objTreatmentView.clickOnSaveAndCollectPayment();
			objTreatmentView.VerifyAmount(ConsultingCharge);
			logger.info("Consulting charges are correct");
			objTreatmentView.clickOnCollect();
			objBaseClass.refresh();
			logger.info("Patient closed Sucessfully");
			objDashboardView.clickDashboardMenu();
	
		}
			

		
	
		@Test(priority = 4, dataProvider ="HappyFlow")
		public void AddReport(String SearchPatient,String FullName,String Disease,String MobNo,String EmailId, String Age,String Gender,String Weight,String Height,
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
			objTreatmentView.AddPricsriptionAfterFood(medicineNeme, Dose, Days, ConsultingCharge, Note);
			objTreatmentView.AddInvestigationreport();
			objTreatmentView.veroifyreportnameInvestigationreport();
			objDashboardView.clickDashboardMenu();
			objDashboardView.clickTreatmentMenu();
			objTreatmentView.Addcertificate();	
			objTreatmentView.verifyCertificateName();
			objDashboardView.clickDashboardMenu();
			objDashboardView.clickTreatmentMenu();
			objTreatmentView.setComplaints(pulses, Systolic, diastolic, repositoryRate, temprature);
			objTreatmentView.clickPrintpriscription();
			objDashboardView.clickDashboardMenu();
			objDashboardView.clickTreatmentMenu();
			objTreatmentView.setComplaints(pulses, Systolic, diastolic, repositoryRate, temprature);
			objTreatmentView.sharePriscription();
			objBaseClass.refresh();
			objDashboardView.clickDashboardMenu();
			objDashboardView.clickTreatmentMenu();
			objTreatmentView.setComplaints(pulses, Systolic, diastolic, repositoryRate, temprature);
			objTreatmentView.verifyIN_OUTStatus();
			objDashboardView.clickDashboardMenu();
			
			
		
		}
		
	
		
		
		@Test(priority = 5, dataProvider ="HappyFlow")
		public void BillBookOperations(String SearchPatient,String FullName,String Disease,String MobNo,String EmailId, String Age,String Gender,String Weight,String Height,
				String State,String District,String City,String Note,String pulses,String Systolic,String diastolic,String repositoryRate,String temprature,String medicineNeme,String Dose,String Days,String ConsultingCharge ) throws InterruptedException
		
		{
			
			objDashboardView.clickDashboardMenu();
			objDashboardView.clickTreatmentMenu();
			objTreatmentView.setComplaints(pulses, Systolic, diastolic, repositoryRate, temprature);
			objTreatmentView.VerifyConsultingCharges();
			objTreatmentView.verifyprintBillBook();
			objTreatmentView.Resetconsultcharge();
			objTreatmentView.AddAndDeletePreticulers();
			objDashboardView.clickDashboardMenu();
		
		
		}
		
	

		@Test(priority = 6, dataProvider ="CompleteRegister")
		public void ReferTo(String ClinicName,String Firstname,String Lastname,String EmailId,String MobileNo ,String State,String Dist,String City,String Address,String ClinicType,String Referance) throws InterruptedException {
			Thread.sleep(2000);
		
			
			objDashboardView.clickDashboardMenu();
			objDashboardView.clickTreatmentMenu();
			objTreatmentView.setComplaints("75", "120", "90", "70", "36");
			
			objTreatmentView.verifyReferTo(ClinicName, Firstname, MobileNo, Address);

			objTreatmentView.setComplaints("75", "120", "90", "70", "36");
			objDashboardView.clickDashboardMenu();

		
		}

		
		@Test(priority = 7, dataProvider ="HappyFlow")
		public void AllHistoriesOperations(String SearchPatient,String FullName,String Disease,String MobNo,String EmailId, String Age,String Gender,String Weight,String Height,
				String State,String District,String City,String Note,String pulses,String Systolic,String diastolic,String repositoryRate,String temprature,String medicineNeme,String Dose,String Days,String ConsultingCharge ) throws InterruptedException
		
		{
			
			objDashboardView.clickDashboardMenu();
			objDashboardView.clickTreatmentMenu();
			objTreatmentView.setComplaints(pulses, Systolic, diastolic, repositoryRate, temprature);
			objTreatmentView.verifypriscriptionHistory(FullName);
		
			objDashboardView.clickDashboardMenu();
			objDashboardView.clickTreatmentMenu();
			objTreatmentView.setComplaints(pulses, Systolic, diastolic, repositoryRate, temprature);
			objBaseClass.refresh();
			objDashboardView.clickDashboardMenu();
			objDashboardView.clickTreatmentMenu();
			objTreatmentView.setComplaints(pulses, Systolic, diastolic, repositoryRate, temprature);
			
			objTreatmentView.verifyCertificateHistory(FullName);
			
			objBaseClass.refresh();
			
			objDashboardView.clickDashboardMenu();
	
			objDashboardView.clickDashboardMenu();
			objDashboardView.clickTreatmentMenu();
			objTreatmentView.setComplaints(pulses, Systolic, diastolic, repositoryRate, temprature);
			
			
			objTreatmentView.verifyRefertohistory(FullName);			
			
			objBaseClass.refresh();
			objDashboardView.clickDashboardMenu();
		
			objDashboardView.clickTreatmentMenu();
			objTreatmentView.setComplaints(pulses, Systolic, diastolic, repositoryRate, temprature);
			objTreatmentView.AddInvestigationreport();
			objTreatmentView.closeinvestigationReport();
			objTreatmentView.verifyALLHistory(FullName);	
			objDashboardView.clickDashboardMenu();
			objDashboardView.clickTreatmentMenu();

			objTreatmentView.setComplaints(pulses, Systolic, diastolic, repositoryRate, temprature);
			objTreatmentView.DeletePatientFromTreatmentpageWithYesButton();
			driver.close();
			
			
			
		
		}
		

		

		
		
	
	
		

		
	
		
		
		
		
}
