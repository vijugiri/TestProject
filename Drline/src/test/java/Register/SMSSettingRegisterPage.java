package Register;

import org.testng.annotations.Test;

import com.main.BaseClass;
import com.register.RegisterPage;
import com.register.RegisterpageView;

public class SMSSettingRegisterPage extends BaseClass{

	BaseClass objBaseClass= new BaseClass();
	RegisterpageView objRegisterpageView= new RegisterpageView();
	RegisterPage objRegisterPage = new RegisterPage();
	
	

	@Test(priority = 1, dataProvider ="CompleteRegister")
	public void SMSSettingRegisterComponentDisplayed(String ClinicName,String Firstname,String Lastname,String EmailId,String MobileNo ,String State,String Dist,String City,String Address,String ClinicType,String Referance) throws InterruptedException {
		Thread.sleep(2000);
		objBaseClass.LocalBrowserInit("http://qa.drline.in/drline-webapp-qa/");
		objRegisterpageView.clickRegisterlinkHeaderpage();
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
		
		objRegisterpageView.verifyStep_1Fieldstext();
		objRegisterpageView.verifyStep_2Fieldstext();
		objRegisterpageView.verifyStep_3Fieldstext();
		objRegisterpageView.verifyStep_4Fieldstext();
		objRegisterpageView.verifyStep_5Fieldstext();
		
		objRegisterpageView.hdrInoviceheader();
		objRegisterpageView.hdrSMSSettingRegisterisDisplayed();
		
		objRegisterpageView.verifyTDoYouWantSMSServicesText();
		
		objRegisterpageView.SelectcheckboxSMSServiceisDisplayed();
		
		objRegisterpageView.verifyTotalCostWithoutSMSServices();
		objRegisterpageView.SelectcheckboxSMSService();
		objRegisterpageView.SenderIdTextFieldEnaBled();
		objRegisterpageView.AnySiXCharPlaceholder();
		objRegisterpageView.SMSQTYPlaceholder();
		objRegisterpageView.SMSRateinPaisa();
		objRegisterpageView.TotalInRsWithoutAnySMS();
		objRegisterpageView.SMSQTYTextDisplayed();
		objRegisterpageView.RateInPaisaDisplayed();
		objRegisterpageView.TotalInRSDisplayed();
		objRegisterpageView.SenderIDDisplayed();
		objRegisterpageView.Noteisplayed();
		driver.close();
		
	}

		
	
	@Test(priority = 2, dataProvider ="CompleteRegister")
	public void OperationInSMSSettingRegister(String ClinicName,String Firstname,String Lastname,String EmailId,String MobileNo ,String State,String Dist,String City,String Address,String ClinicType,String Referance) throws InterruptedException {
		Thread.sleep(2000);
		objBaseClass.LocalBrowserInit("http://qa.drline.in/drline-webapp-qa/");
		objRegisterpageView.clickRegisterlinkHeaderpage();
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
		objRegisterpageView.hdrSMSSettingRegisterisDisplayed();
		objRegisterpageView.verifyTotalCostWithoutSMSServices();
		objRegisterpageView.SelectcheckboxSMSService();
		objRegisterpageView.SetSenderIdText("VBGIRI");		
		objRegisterpageView.SetSMSQTY("100");
		objRegisterpageView.VerifiedSMSRateFor100();
		Thread.sleep(1000);
		objRegisterpageView.ClearSMSQTY();
		Thread.sleep(1000);
		objRegisterpageView.SetSMSQTY("1000");
		objRegisterpageView.VerifiedSMSRateFor1000();
		Thread.sleep(1000);
		objRegisterpageView.ClearSMSQTY();
		objRegisterpageView.ClickPREVButtonOnSMSSettingpage();
		objRegisterpageView.hdrModuleSectionAndBillingisDisplayed();
		objRegisterpageView.ClickNextButtononModuleAndBilling();	
		objRegisterpageView.ClickNextButtononSMSSettingpage();
		driver.close();
		
		
}
	@Test(priority = 3, dataProvider ="CompleteRegister")
	public void ConfirmDetailPage(String ClinicName,String Firstname,String Lastname,String EmailId,String MobileNo ,String State,String Dist,String City,String Address,String ClinicType,String Referance) throws InterruptedException {
		Thread.sleep(2000);
		objBaseClass.LocalBrowserInit("http://qa.drline.in/drline-webapp-qa/");
		objRegisterpageView.clickRegisterlinkHeaderpage();
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
		objRegisterpageView.SelectcheckboxSMSService();
		objRegisterpageView.SetSenderIdText("VBGIRI");
		objRegisterpageView.SetSMSQTY("1000");
		objRegisterpageView.ClickNextButtononSMSSettingpage();
		objRegisterpageView.ClinicDetailsConfirmDetailPage(ClinicName, Firstname, Lastname, EmailId, MobileNo);	
		objRegisterpageView.BillingInoviceClinicDetailsConfirmDetailPag();	
		objRegisterpageView.LicenceModeClinicDetailsConfirmDetailPag();		
		objRegisterpageView.ClickPREVButtonOnSMSSettingpage();
		objRegisterpageView.hdrSMSSettingRegisterisDisplayed();
		objRegisterpageView.ClickNextButtononSMSSettingpage();
		objRegisterpageView.hdrBillingInoviceClinicDetailsConfirmDetailPage();
		objRegisterpageView.SubmitButtonBillingInoviceClinicDetailsConfirmDetailPageisDisplayed();
		objRegisterpageView.ClickSubmitButtonBillingInoviceClinicDetailsConfirmDetailPage();
		driver.close();
		

}
}
