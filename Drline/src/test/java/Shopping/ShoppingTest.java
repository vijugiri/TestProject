package Shopping;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
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
import com.setting.SettingView;

import Appointment.BookAppointmentFromAddPatientAppointmentPage;
import DashBoard.BookApointmentFromDashboard;
import Treatment.TreatmentView;






public class ShoppingTest extends BaseClass{

	
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
	
	shopping objshopping= new shopping();

	String strval=null;
	String strval2=null;
	String strval3=null;
	String Year="2019";

	

	// make sure mobile number and password should be correct
	@Test(priority = 1, dataProvider ="inputData")
	public void Login(String url,String Mob,String Pass ) throws InterruptedException 
		{
		objBaseClass.LocalBrowserInit(url);
	
			objLoginPageView.Login(Mob,Pass);
		
			objLoginPageView.YesPopup();
	

		}
	


	@Test(priority = 2, dataProvider ="HappyFlow")
	public void UploadSaleItems(String SearchPatient,String FullName,String Disease,String MobNo,String EmailId, String Age,String Gender,String Weight,String Height,
			String State,String District,String City,String Note,String pulses,String Systolic,String diastolic,String repositoryRate,String temprature,String medicineNeme,String Dose,String Days,String ConsultingCharge ) throws InterruptedException
	
	{
		
		
	objshopping.clickOnShopping();
	objshopping.clickOnSale();
	objDashboardView.clickDashboardMenu();
	objshopping.deletSaleitem();	
	objshopping.clickOnShopping();
	objshopping.clickOnSale();
	objshopping.clickconUploadsaleitem();
	objshopping.uploadImage();
	objshopping.setItemname(FullName);
	objshopping.settypeName();
	objshopping.setdiscription();
	objshopping.setPrice(ConsultingCharge);
	objshopping.setcontactNo(MobNo);
	objshopping.setpurchaseYear(Year);
	objshopping.setaddress(City);
	objshopping.clickcSubmit();
	objshopping.VerifyItem(FullName);
	objDashboardView.clickDashboardMenu();
	
	}


	@Test(priority = 3, dataProvider ="HappyFlow")
	public void EditAndVerufyItems(String SearchPatient,String FullName,String Disease,String MobNo,String EmailId, String Age,String Gender,String Weight,String Height,
			String State,String District,String City,String Note,String pulses,String Systolic,String diastolic,String repositoryRate,String temprature,String medicineNeme,String Dose,String Days,String ConsultingCharge ) throws InterruptedException
	
	{
		
		objDashboardView.clickDashboardMenu();
		objshopping.clickOnShopping();
		objshopping.clickOnSale();
		objshopping.clickonEditFirstItem();
		
		objshopping.setItemname(FullName+"Giri");
		objshopping.clickcSubmit();
		objshopping.VerifyItem("Giri");
		objDashboardView.clickDashboardMenu();
	
	}
	

	@Test(priority = 4, dataProvider ="HappyFlow")
	public void UploadMultipleImageInSale(String SearchPatient,String FullName,String Disease,String MobNo,String EmailId, String Age,String Gender,String Weight,String Height,
			String State,String District,String City,String Note,String pulses,String Systolic,String diastolic,String repositoryRate,String temprature,String medicineNeme,String Dose,String Days,String ConsultingCharge ) throws InterruptedException
	
	{
		
		objDashboardView.clickDashboardMenu();
		objshopping.clickOnShopping();
		objshopping.clickOnSale();
		objshopping.UploadMultipleImageInSale();
		objshopping.veriFyMultiplePhotos();
		objDashboardView.clickDashboardMenu();

	}
	

	@Test(priority = 5, dataProvider ="HappyFlow")
	public void BuyShoppingpostRequirment(String SearchPatient,String FullName,String Disease,String MobNo,String EmailId, String Age,String Gender,String Weight,String Height,
			String State,String District,String City,String Note,String pulses,String Systolic,String diastolic,String repositoryRate,String temprature,String medicineNeme,String Dose,String Days,String ConsultingCharge ) throws InterruptedException
	
	{
		
		objDashboardView.clickDashboardMenu();
		objshopping.clickOnShopping();
		objshopping.clickOnbuy();
		objshopping.postRequirmrnt(FullName);
		objshopping.selecLocationCheckBox();
		objshopping.setLocation(City);
		objshopping.ClickEnterLocation();
		objshopping.VerifyBuyList(FullName);
		objshopping.unSelectCheckboxcLocation();
		objDashboardView.clickDashboardMenu();
	
	
	}
	
	

	@Test(priority = 6, dataProvider ="HappyFlow")
	public void BuyShoppingBypriceWiset(String SearchPatient,String FullName,String Disease,String MobNo,String EmailId, String Age,String Gender,String Weight,String Height,
			String State,String District,String City,String Note,String pulses,String Systolic,String diastolic,String repositoryRate,String temprature,String medicineNeme,String Dose,String Days,String ConsultingCharge ) throws InterruptedException
	
	{
		
		objDashboardView.clickDashboardMenu();
		objshopping.clickOnShopping();
		objshopping.clickOnbuy();
		objshopping.selecPriceCheckBox();
		objshopping.setstrtAndEndPrise(ConsultingCharge);
		objshopping.clickSearch();
		objshopping.VerifyBuyList(FullName);
		objshopping.unSelectCheckboxPrice();
		objDashboardView.clickDashboardMenu();
	
	}
	
	


	@Test(priority = 7, dataProvider ="HappyFlow")
	public void BuyShoppingByYear(String SearchPatient,String FullName,String Disease,String MobNo,String EmailId, String Age,String Gender,String Weight,String Height,
			String State,String District,String City,String Note,String pulses,String Systolic,String diastolic,String repositoryRate,String temprature,String medicineNeme,String Dose,String Days,String ConsultingCharge ) throws InterruptedException
	
	{
		
		objDashboardView.clickDashboardMenu();
		objshopping.clickOnShopping();
		objshopping.clickOnbuy();
		objshopping.selecyearCheckBox();
		objshopping.setstrtAndEndYearse();
		objshopping.clickSearch();
		objshopping.VerifyBuyList(FullName);
		objshopping.UNselecyearCheckBox();
		objDashboardView.clickDashboardMenu();
	
	}
	
	@AfterClass
	public void close() {
		driver.close();
	}
	
	
	
}
