package inventoryOFClicnic;

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
import inventry.inventoryView;

public class ClinicMedicines  extends BaseClass{

	

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

	inventoryView objinventoryView= new inventoryView();
	
	BookAppointmentFromAddPatientAppointmentPage obBookAppointmentFromAddPatientAppointmentPage= new BookAppointmentFromAddPatientAppointmentPage();
	
	masterView objmasterView= new masterView();
	


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

		@Test(priority = 2, dataProvider ="Inventory")
		public void addmedicine(String Medicine_Name,String Contents,String Company_Name,String Buying_Price,String MRP,String TabletsinStrip,String AvailableStock,String Description,String MedicineType,String AlertBalanceStock) throws InterruptedException {

			objDashboardView.clickDashboardMenu();
			objinventoryView.clickOninventory();
			objinventoryView.clickOnClinicMedicines();
			objinventoryView.clickOnAddMedicines();
			objinventoryView.setMedicinename(Medicine_Name);
			objinventoryView.setContents(Contents);
			objinventoryView.setCompany_Name(Company_Name);
			objinventoryView.setBuying_Price(Buying_Price);
			objinventoryView.setMRP(MRP);
			objinventoryView.setTabletsinStrip(TabletsinStrip);
			objinventoryView.setAvailableStock(AvailableStock);
			objinventoryView.setDescriptionk(Description);
			objinventoryView.setMedicineType(MedicineType);
			objinventoryView.setAlertBalanceStock(AlertBalanceStock);
			objinventoryView.clickOnSubmitOfAddmedicine();
			objDashboardView.clickDashboardMenu();
		}
		
		@Test(priority = 3, dataProvider ="Inventory")
		public void verifyMedicinenewlyadded(String Medicine_Name,String Contents,String Company_Name,String Buying_Price,String MRP,String TabletsinStrip,String AvailableStock,String Description,String MedicineType,String AlertBalanceStock) throws InterruptedException {

			objDashboardView.clickDashboardMenu();
			objinventoryView.clickOninventory();
			objinventoryView.clickOnClinicMedicines();
			objinventoryView.verifyMedicine(Medicine_Name);
			objDashboardView.clickDashboardMenu();
		}
		

		@Test(priority = 4, dataProvider ="Inventory")
		public void EditMedicinenewlyadded(String Medicine_Name,String Contents,String Company_Name,String Buying_Price,String MRP,String TabletsinStrip,String AvailableStock,String Description,String MedicineType,String AlertBalanceStock) throws InterruptedException {

			objDashboardView.clickDashboardMenu();
			objinventoryView.clickOninventory();
			objinventoryView.clickOnClinicMedicines();
			objinventoryView.editmedicine("New Lipochol");
			objDashboardView.clickDashboardMenu();
			objinventoryView.clickOninventory();
			objinventoryView.clickOnClinicMedicines();
			objinventoryView.verifyMedicine("New Lipochol");
			objDashboardView.clickDashboardMenu();

		}
		

		@Test(priority = 5, dataProvider ="Inventory")
		public void deleteMedicinenewlyadded(String Medicine_Name,String Contents,String Company_Name,String Buying_Price,String MRP,String TabletsinStrip,String AvailableStock,String Description,String MedicineType,String AlertBalanceStock) throws InterruptedException {

			objDashboardView.clickDashboardMenu();
			objinventoryView.clickOninventory();
			objinventoryView.clickOnClinicMedicines();
			objinventoryView.deletenewaddedMedicine();
			objDashboardView.clickDashboardMenu();
			
		}

		@Test(priority = 6, dataProvider ="Inventory")
		public void addmedicine1(String Medicine_Name,String Contents,String Company_Name,String Buying_Price,String MRP,String TabletsinStrip,String AvailableStock,String Description,String MedicineType,String AlertBalanceStock) throws InterruptedException {

			objDashboardView.clickDashboardMenu();
			objinventoryView.clickOninventory();
			objinventoryView.clickOnClinicMedicines();
			objinventoryView.clickOnAddMedicines();
			objinventoryView.setMedicinename(Medicine_Name);
			objinventoryView.setContents(Contents);
			objinventoryView.setCompany_Name(Company_Name);
			objinventoryView.setBuying_Price(Buying_Price);
			objinventoryView.setMRP(MRP);
			objinventoryView.setTabletsinStrip(TabletsinStrip);
			objinventoryView.setAvailableStock(AvailableStock);
			objinventoryView.setDescriptionk(Description);
			objinventoryView.setMedicineType(MedicineType);
			objinventoryView.setAlertBalanceStock(AlertBalanceStock);
			objinventoryView.clickOnSubmitOfAddmedicine();
			objDashboardView.clickDashboardMenu();
			driver.close();
		}
}
