package Register;

import org.testng.annotations.Test;

import com.main.BaseClass;
import com.register.RegisterPage;
import com.register.RegisterpageView;

public class RegisterPaymentmode extends BaseClass {
	
	
	
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
	public void componentsDisplayedonRegisterPaymentmodepage(String ClinicName, String Firstname,String Lastname,String EmailId,String MobileNo ,String State,String Dist,String City,String Address,String ClinicType,String Referance) throws InterruptedException {
	Thread.sleep(2000);
		objBaseClass.LocalBrowserInit(strv);
		objRegisterpageView.clickRegisterlinkHeaderpage();
		objRegisterpageView.RegisterClinic(ClinicName, Firstname, Lastname, EmailId, MobileNo);
		Thread.sleep(2000);		
		
		objRegisterpageView.hdrClinic_AdminDetailsisDisplayed();
		objRegisterpageView.SelectState(State);		
		objRegisterpageView.SelectDist(Dist);
		objRegisterpageView.SelectCity(City);
		objRegisterpageView.address(Address);
		objRegisterpageView.ClickAdminDetailNextButton();	
		
		objRegisterpageView.hdrPaymentMode();
		
		objRegisterpageView.verifyStep_1Fieldstext();
		objRegisterpageView.verifyStep_2Fieldstext();
		objRegisterpageView.verifyStep_3Fieldstext();
		objRegisterpageView.verifyStep_4Fieldstext();
		objRegisterpageView.verifyStep_5Fieldstext();
		
	
		objRegisterpageView.PaymentModeCheckboxOfonline();
		objRegisterpageView.PaymentModeCheckboxOfchechbook();
		objRegisterpageView.verifyLicenceModeText();
		
		objRegisterpageView.SelectLicence();
		objRegisterpageView.verifyLicenceModeText();
		
		
		objRegisterpageView.SelectClinicType(ClinicType);
		Thread.sleep(3000);	
		objRegisterpageView.verifyClinicType(ClinicType);

		Thread.sleep(3000);
		
		objRegisterpageView.PREVButtonOnPaymentModePageisDisplayed();
		
		objRegisterpageView.NextButtonOnPaymentModePageisDisplayed();
		
		driver.close();
	
	
	}
	
	
	

	@Test(priority = 2, dataProvider ="CompleteRegister")
	public void PREVButtonFunctionality(String ClinicName, String Firstname,String Lastname,String EmailId,String MobileNo ,String State,String Dist,String City,String Address,String ClinicType,String Referance) throws InterruptedException {
	Thread.sleep(2000);
		objBaseClass.LocalBrowserInit(strv);
		objRegisterpageView.clickRegisterlinkHeaderpage();
		objRegisterpageView.RegisterClinic(ClinicName, Firstname, Lastname, EmailId, MobileNo);
		Thread.sleep(2000);		
		
		objRegisterpageView.hdrClinic_AdminDetailsisDisplayed();
		objRegisterpageView.SelectState(State);		
		objRegisterpageView.SelectDist(Dist);
		objRegisterpageView.SelectCity(City);
		objRegisterpageView.address(Address);
		objRegisterpageView.ClickAdminDetailNextButton();	
		
		objRegisterpageView.hdrPaymentMode();
		
		objRegisterpageView.verifyStep_1Fieldstext();
		objRegisterpageView.verifyStep_2Fieldstext();
		objRegisterpageView.verifyStep_3Fieldstext();
		objRegisterpageView.verifyStep_4Fieldstext();
		objRegisterpageView.verifyStep_5Fieldstext();
		
	
		objRegisterpageView.PaymentModeCheckboxOfonline();
		objRegisterpageView.PaymentModeCheckboxOfchechbook();
		objRegisterpageView.verifyLicenceModeText();
		
		objRegisterpageView.SelectLicence();
		objRegisterpageView.verifyLicenceModeText();
		
		
		objRegisterpageView.SelectClinicType(ClinicType);
		Thread.sleep(3000);	
		objRegisterpageView.verifyClinicType(ClinicType);
		Thread.sleep(3000);	
	
		Thread.sleep(3000);
		objRegisterpageView.ClickPREVButtonOnPaymentModePage();
		objRegisterpageView.hdrClinic_AdminDetailsisDisplayed();
		objRegisterpageView.ClickAdminDetailNextButton();
		
		objRegisterpageView.hdrPaymentMode();
		
		objRegisterpageView.ClickNextButtonOnPaymentModePage();
		driver.close();
	
	}
			
	
	
}
