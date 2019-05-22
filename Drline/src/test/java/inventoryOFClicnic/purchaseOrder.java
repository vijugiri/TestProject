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

public class purchaseOrder extends BaseClass{

	

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
	


	 static String strval=null;
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

		
		
		@Test(priority = 2, dataProvider ="AddEmployee")
		public void addVendor(String Firstname,String Role,String Qualification,String Speciality,String mobile,String email,String State,String District,String City,String PIN ,String Address,String Starttime,String endTime

) throws InterruptedException {
			
			
			strval=Firstname;
			/*objDashboardView.clickDashboardMenu();
			objinventoryView.clickOninventory();
			objinventoryView.clickOnvendor();
			objinventoryView.clickonAddVendor();
		
			objinventoryView.addvendor(Firstname, mobile, email, Address, PIN);
			objDashboardView.clickDashboardMenu();
			objinventoryView.clickOninventory();
			objinventoryView.clickOnvendor();
			objDashboardView.clickDashboardMenu();*/
			
			

}
	
/*	
		
		@Test(priority = 3, dataProvider ="Inventory")
		public void PurchaseOrder(String Medicine_Name,String Contents,String Company_Name,String Buying_Price,String MRP,String TabletsinStrip,String AvailableStock,String Description,String MedicineType,String AlertBalanceStock) throws InterruptedException {

			objDashboardView.clickDashboardMenu();
			objinventoryView.clickOninventory();
			objinventoryView.clickOnPurchaseorder();
			objinventoryView.setvendorNameOnPurchaseOrder(strval);
			objinventoryView.setPoOrderDate();
			objinventoryView.setReceeiveOrderDate();
			objinventoryView.setPoReceivenumber("12345");
			objinventoryView.setNote(Description);
			objinventoryView.setbuyingStripAndExpiredateinPurchaseorder(AvailableStock);
			objinventoryView.setMedicine_NamePurchaseorder(Medicine_Name);
			objinventoryView.setContentsPurchaseorder(Contents);
			objinventoryView.setCompany_NamePurchaseorder(Company_Name);
			objinventoryView.setBatchNumberPurchaseorder();
			objinventoryView.setMRPPurchaseorder(MRP);
			objinventoryView.setBuyingPPricePurchaseorder(Buying_Price);
			objinventoryView.setQTYPurchaseorder(TabletsinStrip);
			objinventoryView.setDiscount();
			objinventoryView.ClickonSavePurchaseorder();
			objDashboardView.clickDashboardMenu();
			
		}	
			
			
			

		
		@Test(priority = 4, dataProvider ="Inventory")
		public void OrderSaveAsDraft(String Medicine_Name,String Contents,String Company_Name,String Buying_Price,String MRP,String TabletsinStrip,String AvailableStock,String Description,String MedicineType,String AlertBalanceStock) throws InterruptedException {

			objDashboardView.clickDashboardMenu();
			objinventoryView.clickOninventory();
			objinventoryView.clickOnPurchaseorder();
			objinventoryView.setvendorNameOnPurchaseOrder(strval);
			objinventoryView.setPoOrderDate();
			objinventoryView.setReceeiveOrderDate();
			objinventoryView.setPoReceivenumber("12345");
			objinventoryView.setNote(Description);
			objinventoryView.setbuyingStripAndExpiredateinPurchaseorder(AvailableStock);
			objinventoryView.setMedicine_NamePurchaseorder(Medicine_Name);
			objinventoryView.setContentsPurchaseorder(Contents);
			objinventoryView.setCompany_NamePurchaseorder(Company_Name);
			objinventoryView.setBatchNumberPurchaseorder();
			objinventoryView.setMRPPurchaseorder(MRP);
			objinventoryView.setBuyingPPricePurchaseorder(Buying_Price);
			objinventoryView.setQTYPurchaseorder(TabletsinStrip);
			objinventoryView.setDiscount();
			objinventoryView.ClickonSaveAsDrafrtPurchaseorder();
			objDashboardView.clickDashboardMenu();
		
			objinventoryView.clickOninventory();
			objinventoryView.clickOnPurchaseorder();
			objinventoryView.clickOnViewDraft();
			
			
			
			
		}	
			
			

		@Test(priority = 5, dataProvider ="Inventory")
		public void verifyOurchaseorderasDraft(String Medicine_Name,String Contents,String Company_Name,String Buying_Price,String MRP,String TabletsinStrip,String AvailableStock,String Description,String MedicineType,String AlertBalanceStock) throws InterruptedException {

			objDashboardView.clickDashboardMenu();
			
			objinventoryView.clickOninventory();
			objinventoryView.clickOnPurchaseorder();
			objinventoryView.clickOnViewDraft();
			objinventoryView.verifyPurchaseOrder(strval);
			objDashboardView.clickDashboardMenu();
			
		}	

		@Test(priority = 6, dataProvider ="Inventory")
		public void EditPurchaseorderasDraft(String Medicine_Name,String Contents,String Company_Name,String Buying_Price,String MRP,String TabletsinStrip,String AvailableStock,String Description,String MedicineType,String AlertBalanceStock) throws InterruptedException {

			objDashboardView.clickDashboardMenu();
			
			objinventoryView.clickOninventory();
			objinventoryView.clickOnPurchaseorder();
			objinventoryView.clickOnViewDraft();
			objinventoryView.clickonEditOFPurchaseOrderasDraft();
			objinventoryView.ClickonSaveAsDrafrtPurchaseorder();
			objDashboardView.clickDashboardMenu();
	
			
		}	
		@Test(priority = 7, dataProvider ="Inventory")
		public void deletePurchaseorderasDraft(String Medicine_Name,String Contents,String Company_Name,String Buying_Price,String MRP,String TabletsinStrip,String AvailableStock,String Description,String MedicineType,String AlertBalanceStock) throws InterruptedException {

			objDashboardView.clickDashboardMenu();
			
			objinventoryView.clickOninventory();
			objinventoryView.clickOnPurchaseorder();
			objinventoryView.clickOnViewDraft();
			objinventoryView.clickonDeletePurchaseOrderasDraft();
			objDashboardView.clickDashboardMenu();
			
			
			
		}*/
		
		@Test(priority = 8, dataProvider ="Inventory")
		public void Shortage(String Medicine_Name,String Contents,String Company_Name,String Buying_Price,String MRP,String TabletsinStrip,String AvailableStock,String Description,String MedicineType,String AlertBalanceStock) throws InterruptedException {

			objDashboardView.clickDashboardMenu();
			
			objinventoryView.clickOninventory();
			objinventoryView.clickOnPurchaseorder();
			objinventoryView.clickonShortage();
			objinventoryView.shotrageheaderDisplayed();
			objinventoryView.clickonShortageAdd();
			objinventoryView.addShortage(Medicine_Name, Company_Name, Contents);
			objinventoryView.clickonShortageSubmit();
			objinventoryView.verifyShortageAddedmedicine(Medicine_Name);
			objinventoryView.selectAddedmedicine();
			objinventoryView.clickOnAddtoorder();
			objinventoryView.setvendorNameSendOrder(strval);
			
			objinventoryView.AddqtyAddorder(TabletsinStrip);
			objinventoryView.clickOnSendOrder();

			objDashboardView.clickDashboardMenu();
			
			
		
		
		}
		
		

		@Test(priority = 8, dataProvider ="Inventory")
		public void ViewOrderlist(String Medicine_Name,String Contents,String Company_Name,String Buying_Price,String MRP,String TabletsinStrip,String AvailableStock,String Description,String MedicineType,String AlertBalanceStock) throws InterruptedException {

			objDashboardView.clickDashboardMenu();
			
			objinventoryView.clickOninventory();
			objinventoryView.clickOnPurchaseorder();
			objinventoryView.clickonViewOrderliste();
			objinventoryView.clickonViewOrderlisteFromTable();
			objinventoryView.verifyShortageAddedmedicineFromView(Medicine_Name);
			objDashboardView.clickDashboardMenu();
			driver.close();
		}
		
		
		
		
			
}
