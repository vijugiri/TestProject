package Register;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.main.BaseClass;
import com.register.RegisterPage;
import com.register.RegisterpageView;

public class CompleteRegisterClinic extends BaseClass {
	
	
	
	BaseClass objBaseClass= new BaseClass();
	RegisterpageView objRegisterpageView= new RegisterpageView();
	RegisterPage objRegisterPage = new RegisterPage();

static String strv="";
	@Test(priority = -11, dataProvider ="inputData")
	public void Login(String url,String Mob,String Pass ) throws InterruptedException 
		{
		strv=url;
				
			}

	@Test(priority = 1, dataProvider ="CompleteRegister")
	public void RegisterWithoutRef(String ClinicName,String Firstname,String Lastname,String EmailId,String MobileNo ,String State,String Dist,String City,String Address,String ClinicType,String Referance) throws InterruptedException {
		Thread.sleep(2000);
		objBaseClass.LocalBrowserInit(strv);
		objRegisterpageView.clickRegisterlinkHeaderpage();
		objRegisterpageView.RegisterClinic(ClinicName, Firstname, Lastname, EmailId, MobileNo);

		
		objRegisterpageView.hdrClinic_AdminDetailsisDisplayed();
		objRegisterpageView.SelectState(State);		
		objRegisterpageView.SelectDist(Dist);
		objRegisterpageView.SelectCity(City);
		objRegisterpageView.address(Address);
		
		objRegisterpageView.ClickAdminDetailNextButton();	
		
		objRegisterpageView.PaymentModeCheckboxOfonline();
		objRegisterpageView.PaymentModeCheckboxOfchechbook();
		
		objRegisterpageView.SelectLicence();
		objRegisterpageView.SelectClinicType(ClinicType);
		objRegisterpageView.ClickNextButtonOnPaymentModePage();
		objRegisterpageView.SelectcheckboxWebSiteModuleAndBilling();
		objRegisterpageView.SelectcheckboxAdvertiesmentModuleAndBilling();
		objRegisterpageView.Select_3_Advertisemonth();
		objRegisterpageView.ClickNextButtononModuleAndBilling();
		objRegisterpageView.SelectcheckboxSMSService();
		objRegisterpageView.SetSenderIdText("VBGIRI");
		objRegisterpageView.SetSMSQTY("1000");
		objRegisterpageView.ClickNextButtononSMSSettingpage();
		objRegisterpageView.ClickSubmitButtonBillingInoviceClinicDetailsConfirmDetailPage();
		//objRegisterpageView.ClickPayLaterButton();
		objRegisterpageView.ClickPayButton();
		objBaseClass.MakePayment();
		objRegisterpageView.ClickHereToLogin();
		driver.close();
	
	
	}
	
	/*@Test(priority = 2, dataProvider ="CompleteRegister")
	public void RegisterWithRefrence(String ClinicName,String Firstname,String Lastname,String EmailId,String MobileNo ,String State,String Dist,String City,String Address,String ClinicType,String Referance) throws InterruptedException {
		Thread.sleep(2000);
		objBaseClass.LocalBrowserInit("http://qa.drline.in/drline-webapp-qa/");
		objRegisterpageView.clickRegisterlinkHeaderpage();
		objRegisterpageView.setRefferenceRegisterPage(Referance);
		objRegisterpageView.RegisterClinic(ClinicName, Firstname, Lastname, EmailId, MobileNo);

		Thread.sleep(2000);		
		
		objRegisterpageView.hdrClinic_AdminDetailsisDisplayed();
		objRegisterpageView.SelectState(State);		
		objRegisterpageView.SelectDist(Dist);
		objRegisterpageView.SelectCity(City);
		objRegisterpageView.address(Address);
		
		objRegisterpageView.ClickAdminDetailNextButton();	
		
		objRegisterpageView.PaymentModeCheckboxOfCash();
		objRegisterpageView.PaymentModeCheckboxOfonline();
		objRegisterpageView.PaymentModeCheckboxOfchechbook();
		
		objRegisterpageView.SelectLicence();
		objRegisterpageView.SelectClinicType(ClinicType);
		objRegisterpageView.ClickNextButtonOnPaymentModePage();
		objRegisterpageView.SelectcheckboxWebSiteModuleAndBilling();
		objRegisterpageView.SelectcheckboxAdvertiesmentModuleAndBilling();
		objRegisterpageView.Select_3_Advertisemonth();
		objRegisterpageView.ClickNextButtononModuleAndBilling();
		objRegisterpageView.ClickNextButtononModuleAndBilling();
		objRegisterpageView.SelectcheckboxSMSService();
		objRegisterpageView.SetSenderIdText("VBGIRI");
		objRegisterpageView.SetSMSQTY("1000");
		objRegisterpageView.ClickNextButtononSMSSettingpage();
		objRegisterpageView.ClickSubmitButtonBillingInoviceClinicDetailsConfirmDetailPage();
		//objRegisterpageView.ClickPayLaterButton();
		 	objRegisterpageView.ClickPayButton();
		 	objBaseClass.MakePayment();
		objRegisterpageView.ClickHereToLogin();
		
}*/
}