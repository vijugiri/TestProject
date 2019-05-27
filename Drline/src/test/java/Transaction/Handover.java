package Transaction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
import com.master.masterView;
import com.register.RegisterpageView;
import com.report.reportpage;
import com.setting.SettingView;

import Appointment.BookAppointmentFromAddPatientAppointmentPage;
import DashBoard.BookApointmentFromDashboard;
import Master.AddNewEmployeeTest;
import Treatment.TreatmentView;

public class Handover extends BaseClass{

	
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
	masterView objmasterView= new masterView();
	
	
	BookAppointmentFromAddPatientAppointmentPage obBookAppointmentFromAddPatientAppointmentPage= new BookAppointmentFromAddPatientAppointmentPage();
	AddNewEmployeeTest objAddNewEmployeeTest= new AddNewEmployeeTest();

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
		
		
		

		
		
		
		

		@Test(priority = 2, dataProvider ="AddEmployee")
		public void addEmployee(String Firstname,String Role,String Qualification,String Speciality,String mobile,String email,String State,String District,String City,String PIN ,String Address,String Starttime,String endTime

) throws InterruptedException {
		
		
			
		objmasterView.clickOnMaster();
		objmasterView.clickOnAddNewEmployee();
		
		WebElement mobnum= driver.findElement(By.xpath("//tbody[@class='removeScroll']"));
		strval=mobnum.getText();
		
		if(!strval.contains(mobile)) {
		objmasterView.clickOnAddemp();
		objmasterView.setFirstName(Firstname);
		objmasterView.clickOnNextButton();
		objmasterView.selectRole(Role);
		objmasterView.setQualificcation(Qualification);
		objmasterView.setSpeciality(Speciality);
		objmasterView.clickonPatientDetailsNextButton();

		
		
// sinday time slot		
		objmasterView.clickOnWorkDetailsSundayTime();
		objmasterView.clickonSundayTimeSlotAddHours();
		objmasterView.setStartTimeOfSunday(Starttime);
		objmasterView.setEndTimeOfSunday(endTime);
		
		
		
// monday tome slot 		
		
		objmasterView.clickOnWorkDetailsMondayTime();
		objmasterView.clickonMondayTimeSlotAddHours();
		objmasterView.setSteartTimeMonda(Starttime);
		objmasterView.setendTimeMonda(endTime);
	
		
		
//tuesday
		objmasterView.clickOnWorkDetailsTuesdayTime();
		objmasterView.clickonTuesdayTimeSlotAddHours();	
		objmasterView.setSteartTimeTuesda(Starttime);	
		objmasterView.setendTimeTuesda(endTime);
		
// wednesday
		objmasterView.clickOnWorkDetailsWednesdayTime();	
		objmasterView.clickonWednesdayTimeSlotAddHours();
		objmasterView.setSteartTimeWednesda(Starttime);
		objmasterView.setendTimeWednesday(endTime);
		
// Thrusday
		objmasterView.clickOnWorkDetailsThrusdayTime();
		objmasterView.clickonThrusdayTimeSlotAddHours();	
		objmasterView.setSteartTimeThrusda(Starttime);
		objmasterView.setendTimeThrusday(endTime);
		
/// Friday
		objmasterView.clickOnWorkDetailsFridayTime();
		objmasterView.clickonFridayTimeSlotAddHours();
		objmasterView.setSteartTimeFrida(Starttime);
		objmasterView.setendTimeFriday(endTime);
		

// saturday
		
		objmasterView.clickOnWorkDetailsSaturdayTime();
		objmasterView.clickonSaturdayTimeSlotAddHours();
		objmasterView.setSteartTimeSaturda(Starttime);
		objmasterView.setendTimeSaturday(endTime);	
		objmasterView.clickOnNextButtonOnWorkDetailsPage();		
		objmasterView.setMobileNumber(mobile);
		objmasterView.setemail(email);	
		objmasterView.selectState(State);		
		objmasterView.selectDistrict(District);		
		objmasterView.selectCity(City);
		objmasterView.setPinCode(PIN);
		objmasterView.setAddress(Address);
		objmasterView.clickSubmitOnEmpAdd();	
		Thread.sleep(2000);
		objBaseClass.refresh();
		
		
		
		}
		objDashboardView.clickDashboardMenu();
		
		}
		
		
		
		@Test(priority = 3, dataProvider ="AddEmployee")
		public void HandoverOperations(String Firstname,String Role,String Qualification,String Speciality,String mobile,String email,String State,String District,String City,String PIN ,String Address,String Starttime,String endTime

) throws InterruptedException {

			
			objDashboardView.clickDashboardMenu();
			objSettingView.clickSettingMenu();
			objSettingView.clickDrawerSetting();
			WebElement mobnum= driver.findElement(By.xpath("//table[@class='table table-bordered']"));
			strval=mobnum.getText();
			
			if(!strval.contains(mobile)) {
				objBaseClass.selectDropDown("//select[@id='employeeId']", Firstname);
				objBaseClass.mouseHover("//button[contains(text(),'Assign Drawer')]");
				objBaseClass.refresh();
				objDashboardView.clickDashboardMenu();
				
			}
			
			
			objDashboardView.clickDashboardMenu();
			objTransactionView.clickOnTransaction();
			objTransactionView.clickOnExpenditure();
			
			objTransactionView.headerofExpenditureidDisplayed();
			objTransactionView.HandoverLinkisdisplayed();
			objTransactionView.clickOnHandOver();
			WebElement drpvalue= driver.findElement(By.xpath("//select[@id='handoverTo']"));
	
		if(!drpvalue.isSelected()) 
		{
			
			objBaseClass.selectDropDown("//select[@id='handoverTo']", Firstname);	
		}
			
			objTransactionView.copyAndPastHandoverAmount();
			objTransactionView.setNote();
			objTransactionView.clickOnSubmit();

			Thread.sleep(1000);
		//driver.close();
			
			
		}
		
		@Test(priority = 6, dataProvider ="inputData")
		public void loginAgain(String url,String Mob,String Pass ) throws InterruptedException 
			{
				objBaseClass.LocalBrowserInit(url);
				objLoginPageView.Login(Mob,Pass);
				objLoginPageView.YesPopup();
			}
		
		
		
		@Test(priority = 8, dataProvider ="AddEmployee")
		public void verifyhandover(String Firstname,String Role,String Qualification,String Speciality,String mobile,String email,String State,String District,String City,String PIN ,String Address,String Starttime,String endTime

) throws InterruptedException {
				objDashboardView.clickDashboardMenu();
				objTransactionView.clickOnTransaction();
				objTransactionView.clickOnHandoverhistory();
				objTransactionView.verifyHandoverHistory(Firstname);
				strval2= objBaseClass.getText("//tbody[@id='tbl5']//tr[1]/td[7]");
				System.out.println("staval ======"+strval);
				strval3= objBaseClass.getText("//tbody[@id='tbl5']//tr[1]/td[5]");
				System.out.println("strval3 ======"+strval3);
				objTransactionView.verifyHistoryOfHandoverHistory(strval3, strval2);
			
				objDashboardView.clickDashboardMenu();
			//driver.close();
				
				
	
			}
		
		
		
		
		
		
		

}
