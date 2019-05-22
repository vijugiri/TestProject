package Transaction;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.spi.ObjectThreadContextMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Transaction.TransactionView;
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
import com.report.reportpage;
import com.setting.SettingView;

import Appointment.BookAppointmentFromAddPatientAppointmentPage;
import DashBoard.BookApointmentFromDashboard;
import Treatment.TreatmentView;

public class CollectionAndExpendituree extends BaseClass{

	
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
	TransactionView objTransactionView= new TransactionView();
	reportpage objreportpage= new reportpage();

	
	
	BookAppointmentFromAddPatientAppointmentPage obBookAppointmentFromAddPatientAppointmentPage= new BookAppointmentFromAddPatientAppointmentPage();
	

static  String strval=null;
static 	String strval2=null;
	String strval3=null;
	String strval4=null;
	static String  stingtest=null;

	
	


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
			objDashboardView.clickDashboardMenu();
			objAppointmentView.clickAppointmentMenu();
			objAppointmentView.ClickOnProcess();
			objDashboardView.clickDashboardMenu();
			objDashboardView.clickTreatmentMenu();	
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
		
		//@Test(priority = 4, dataProvider ="Transaction")
		@Test(priority =4)
		public void VerifyCollection() throws InterruptedException
		{
			objDashboardView.clickDashboardMenu();
			objTransactionView.clickOnTransaction();
			objTransactionView.clickOnCollection();
			
			stingtest =objBaseClass.getText("//table[@class='table d-none d-sm-block']");
			objDashboardView.clickDashboardMenu();
			objreportpage.clickonAllReport();
		    objreportpage.clickOnCollectionReport();
		   strval2=objBaseClass.getText("//div[@id='example_wrapper']");
		   System.out.println(strval2.contains(stingtest));
		   objDashboardView.clickDashboardMenu();
					
			
		}

		
		

		@Test(priority = 5, dataProvider ="Transaction")

		public void componentsOnExpenditure(String Narration, String Amount,String Description) throws InterruptedException
		{
			objDashboardView.clickDashboardMenu();
			objTransactionView.clickOnTransaction();
			objTransactionView.clickOnExpenditure();
			
			objTransactionView.headerofExpenditureidDisplayed();
			objTransactionView.HandoverLinkisdisplayed();
			objTransactionView.AddExpenditureDetailsLinkisdisplayed();
			objTransactionView.clickOnAddExpenditureDetailsLink();
			
			
			objTransactionView.setnarretion(Narration);
			objTransactionView.setAmount(Amount);
			objTransactionView.setDiscription(Description);
			objTransactionView.clickSubmitOnExpenditure();
			objBaseClass.refresh();
			objTransactionView.verifyExpenditureNaretion(Narration);	
			objTransactionView.verifyExpenditureAmount(Amount);		
			objDashboardView.clickDashboardMenu();
			
			
			
		}
		
		
		
		
		@Test(priority =6)
		public void verifyPagination() throws InterruptedException {
			
			objDashboardView.clickDashboardMenu();
			objTransactionView.clickOnTransaction();
			objTransactionView.clickOnExpenditure();
			
			objTransactionView.headerofExpenditureidDisplayed();
			objTransactionView.HandoverLinkisdisplayed();
			objTransactionView.AddExpenditureDetailsLinkisdisplayed();
			
			Thread.sleep(1000);
			objTransactionView.selectPagination("10");
			Thread.sleep(1000);
			objTransactionView.verifypaginitionvalue("10");
			
			Thread.sleep(1000);
			objTransactionView.selectPagination("25");
			Thread.sleep(1000);
			objTransactionView.verifypaginitionvalue("25");

			Thread.sleep(1000);
			objTransactionView.selectPagination("50");
			Thread.sleep(1000);
			objTransactionView.verifypaginitionvalue("50");

			Thread.sleep(1000);
			objTransactionView.selectPagination("100");
			Thread.sleep(1000);
			objTransactionView.verifypaginitionvalue("100");

			Thread.sleep(1000);
			objTransactionView.selectPagination("All");
			Thread.sleep(1000);
			objTransactionView.verifypaginitionvalue("All");
			
			objDashboardView.clickDashboardMenu();
		}
		
		
	
		@Test(priority =7)
		public void verifyDatevalidation() throws InterruptedException {
			
			objDashboardView.clickDashboardMenu();
			objTransactionView.clickOnTransaction();
			objTransactionView.clickOnExpenditure();
			
			objTransactionView.headerofExpenditureidDisplayed();
			objTransactionView.HandoverLinkisdisplayed();
			objTransactionView.AddExpenditureDetailsLinkisdisplayed();
			objTransactionView.clickOnSearchFunction();
			objTransactionView.verifyErrormessage();
			objBaseClass.refresh();
		    objTransactionView.clickInStartDate();
		    objTransactionView.selectStartDate("1994", "Aug", "1");
			objTransactionView.clickOnSearchFunction();
			objTransactionView.verifyErrormessage();
			objBaseClass.refresh();
			
			objTransactionView.clickInStartDate();
		    objTransactionView.selectStartDate("1994", "Aug", "1");
			objTransactionView.clickInendDate();
			objTransactionView.selectStartDate("1994", "Aug", "3");
			objTransactionView.clickOnSearchFunction();
			objTransactionView.oopsErrormessageDisplayed();
			objBaseClass.refresh();

		}
		
		@Test(priority = 8, dataProvider ="Transaction")

		public void editExpenditure(String Narration, String Amount,String Description) throws InterruptedException
		{
			objDashboardView.clickDashboardMenu();
			objTransactionView.clickOnTransaction();
			objTransactionView.clickOnExpenditure();
			
			objTransactionView.headerofExpenditureidDisplayed();
			objTransactionView.HandoverLinkisdisplayed();
			objTransactionView.AddExpenditureDetailsLinkisdisplayed();
			objTransactionView.clickOnAddExpenditureDetailsLink();
			
			
			objTransactionView.setnarretion(Narration);
			objTransactionView.setAmount(Amount);
			objTransactionView.setDiscription(Description);
			Thread.sleep(1000);
			objTransactionView.clickSubmitOnExpenditure();
			objBaseClass.refresh();
			Thread.sleep(2000);
		
			objTransactionView.clickOnEditExpenditure();
			Thread.sleep(1000);
			objTransactionView.setnarretion(Narration+"  New");
			Thread.sleep(1000);
			objTransactionView.setAmount(Amount);
			Thread.sleep(1000);
			objTransactionView.setDiscription(Description+"New ");
			Thread.sleep(1000);
			objTransactionView.clickSubmitOnExpenditure();
			objBaseClass.refresh();
			Thread.sleep(1000);
			objTransactionView.verifyExpenditureNaretion(Narration);
			Thread.sleep(1000);
			objTransactionView.verifyExpenditureAmount(Amount);	
			Thread.sleep(1000);
			objDashboardView.clickDashboardMenu();
			
			
			driver.close();
			
			
		}
		

}
