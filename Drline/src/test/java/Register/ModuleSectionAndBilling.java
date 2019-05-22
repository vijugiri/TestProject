package Register;

import org.testng.annotations.Test;

import com.main.BaseClass;
import com.register.RegisterPage;
import com.register.RegisterpageView;

public class ModuleSectionAndBilling  extends BaseClass {
	
	
	
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
	public void ComponentDisplayedOnModuleSectionAndBilling(String ClinicName,String Firstname,String Lastname,String EmailId,String MobileNo ,String State,String Dist,String City,String Address,String ClinicType,String Referance) throws InterruptedException {
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
		
		objRegisterpageView.PaymentModeCheckboxOfonline();
		objRegisterpageView.PaymentModeCheckboxOfchechbook();
		
		objRegisterpageView.SelectLicence();
		objRegisterpageView.SelectClinicType(ClinicType);
		objRegisterpageView.ClickNextButtonOnPaymentModePage();
		objRegisterpageView.hdrModuleSectionAndBillingisDisplayed();
		
		objRegisterpageView.verifyStep_1Fieldstext();
		objRegisterpageView.verifyStep_2Fieldstext();
		objRegisterpageView.verifyStep_3Fieldstext();
		objRegisterpageView.verifyStep_4Fieldstext();
		objRegisterpageView.verifyStep_5Fieldstext();

		objRegisterpageView.hdrInoviceheader();
		
		objRegisterpageView.checkboxWebSiteModuleAndBillingisDisplayed();
		objRegisterpageView.checkboxAdvertiesmentModuleAndBillingisDisplayed();		
		objRegisterpageView.PREVButtononModuleAndBillingIsDisplayed();
		objRegisterpageView.NextButtononModuleAndBillingIsDisplayed();
	
		driver.close();

}
	
	
	@Test(priority = 2, dataProvider ="CompleteRegister")
	public void PREVOnModuleSectionAndBilling(String ClinicName,String Firstname,String Lastname,String EmailId,String MobileNo ,String State,String Dist,String City,String Address,String ClinicType,String Referance) throws InterruptedException {
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
		
		objRegisterpageView.PaymentModeCheckboxOfonline();
		objRegisterpageView.PaymentModeCheckboxOfchechbook();
		
		objRegisterpageView.SelectLicence();
		objRegisterpageView.SelectClinicType(ClinicType);
		objRegisterpageView.ClickNextButtonOnPaymentModePage();
		objRegisterpageView.hdrModuleSectionAndBillingisDisplayed();
		objRegisterpageView.ClickPREVButtononModuleAndBilling();
		objRegisterpageView.hdrPaymentMode();
		objRegisterpageView.ClickNextButtonOnPaymentModePage();
		driver.close();
	
}
	
	@Test(priority = 3, dataProvider ="CompleteRegister")
	public void OperationModuleSectionAndBilling(String ClinicName,String Firstname,String Lastname,String EmailId,String MobileNo ,String State,String Dist,String City,String Address,String ClinicType,String Referance) throws InterruptedException {
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
	
		objRegisterpageView.PaymentModeCheckboxOfonline();
		objRegisterpageView.PaymentModeCheckboxOfchechbook();
		objRegisterpageView.SelectLicence();
		objRegisterpageView.SelectClinicType(ClinicType);
		objRegisterpageView.ClickNextButtonOnPaymentModePage();
		objRegisterpageView.hdrModuleSectionAndBillingisDisplayed();	
		objRegisterpageView.verifyClinicCost();
		objRegisterpageView.verifyWebSiteCost();
		objRegisterpageView.verifyTotalCostWithoutWebsiteAndAdvertisement();		
		objRegisterpageView.verifyTotalCostWithWebsite();	
		objRegisterpageView.verifyTotalCostWithWebsiteAndOnlyOneMonthAdver();	
		objRegisterpageView.verifyTotalCostWithWebsiteAndAdver_2_Month();	
		objRegisterpageView.verifyTotalCostWithWebsiteAndAdver_3_Month();
		objRegisterpageView.ClickNextButtononModuleAndBilling();
	
		driver.close();
	}
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}