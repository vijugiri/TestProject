package Register;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.main.BaseClass;
import com.register.RegisterPage;
import com.register.RegisterpageView;

public class Clinic_AdminDetailsTest extends BaseClass {
	BaseClass objBaseClass= new BaseClass();
	RegisterpageView objRegisterpageView= new RegisterpageView();
	RegisterPage objRegisterPage = new RegisterPage();
	
	static String  strv="";
	
	/*
	@BeforeClass
	public void SetupBrowser() throws InterruptedException 
	{
		objBaseClass.LocalBrowserInit("http://qa.drline.in/drline-webapp-qa/");
	}
*/
	

	@Test(priority = -11, dataProvider ="inputData")
	public void Login(String url,String Mob,String Pass ) throws InterruptedException 
		{
		strv=url;
				
			}

	@Test(priority = 10, dataProvider ="Register")
	public void Register(String ClinicName, String DummyFName,String Firstname,String Lastname,String EmailId,String WrongLastname,String WrongEmailId, String WrongMobileNo,String MobileNo ,String State,String Dist,String City,String Address) throws InterruptedException {
	
		objBaseClass.LocalBrowserInit(strv);
		objRegisterpageView.clickRegisterlinkHeaderpage();
		objRegisterpageView.RegisterClinic(ClinicName, Firstname, Lastname, EmailId, MobileNo);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	
		
		objRegisterpageView.hdrClinic_AdminDetailsisDisplayed();
		objRegisterpageView.SelectState(State);		
		objRegisterpageView.SelectDist(Dist);
		objRegisterpageView.SelectCity(City);
		objRegisterpageView.address(Address);
		objRegisterpageView.ClickAdminDetailNextButton();	
		driver.close();
		
	}
	@Test(priority = 1, dataProvider ="Register")
	public void componentClinic_AdminDetailsStep_1_isDisplayed(String ClinicName, String DummyFName,String Firstname,String Lastname,String EmailId,String WrongLastname,String WrongEmailId, String WrongMobileNo,String MobileNo ,String State,String Dist,String City,String Address) throws InterruptedException
	{
		
		objBaseClass.LocalBrowserInit(strv);
		objRegisterpageView.clickRegisterlinkHeaderpage();
		objRegisterpageView.RegisterClinic(ClinicName, Firstname, Lastname, EmailId, MobileNo);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	
		
		objRegisterpageView.hdrClinic_AdminDetailsisDisplayed();
		objRegisterpageView.SelectState(State);		
		objRegisterpageView.SelectDist(Dist);
		objRegisterpageView.SelectCity(City);
		objRegisterpageView.address(Address);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		objRegisterpageView.verifiedClinicName(ClinicName);
		objRegisterpageView.verifiedFirstName(Firstname);
		objRegisterpageView.verifiedLastName(Lastname);
		objRegisterpageView.verifiedContact(MobileNo);
		objRegisterpageView.verifiedemailId(EmailId);
		objRegisterpageView.verifiedAddress(Address);	
		objRegisterpageView.verifiedCity(City);	
		
		objRegisterpageView.verifiedDist(Dist);
		objRegisterpageView.verifiedState(State);	
		objRegisterpageView.verifyclinicNameFieldstext();
		objRegisterpageView.verifyFirstnameNameFieldstext();
		objRegisterpageView.verifylastNameNameFieldstext();
		
		objRegisterpageView.verifyEmailIdFieldstext();
		objRegisterpageView.verifyContactNoFieldstext();
		objRegisterpageView.verifySDistrictFieldstext();
		objRegisterpageView.verifyCityFieldstext();
		objRegisterpageView.verifyAddressFieldstext();
		
		objRegisterpageView.verifyStep_1Fieldstext();
		objRegisterpageView.verifyStep_2Fieldstext();
		objRegisterpageView.verifyStep_3Fieldstext();
		objRegisterpageView.verifyStep_4Fieldstext();
		objRegisterpageView.verifyStep_5Fieldstext();
		objRegisterpageView.AdminDetailNextButtonisDisplayed();
	
	driver.close();
		
		
	}
	
	
	
	
	
	@Test(priority = 2, dataProvider ="Register")
	public void validationClinic_AdminDetailsStep_1_isDisplayed(String ClinicName, String DummyFName,String Firstname,String Lastname,String EmailId,String WrongLastname,String WrongEmailId, String WrongMobileNo,String MobileNo ,String State,String Dist,String City,String Address) throws InterruptedException
	{
		
		objBaseClass.LocalBrowserInit(strv);
		objRegisterpageView.clickRegisterlinkHeaderpage();
		objRegisterpageView.RegisterClinic(ClinicName, Firstname, Lastname, EmailId, MobileNo);
		
		
		objRegisterpageView.hdrClinic_AdminDetailsisDisplayed();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		objRegisterpageView.verifyWithoutStaeOnStep1();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		objRegisterpageView.verifyWithoutDistOnStep1(State);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		objRegisterpageView.verifyWithoutCityOnStep1(State,Dist);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		objRegisterpageView.verifyWithoutAddressOnStep1(State, Dist, City);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		objRegisterpageView.verifyClinicnameOnStep1();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		objRegisterpageView.verifyWithoutFirstnameOnStep1();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		objRegisterpageView.verifyWithoutContactNumberOnStep1();
		driver.close();
		
	}
	
	
	
	
	
	
	@Test(priority = 3, dataProvider ="Register")
	public void componentClinic_AdminDetailsStep_2_isDisplayed(String ClinicName, String DummyFName,String Firstname,String Lastname,String EmailId,String WrongLastname,String WrongEmailId, String WrongMobileNo,String MobileNo ,String State,String Dist,String City,String Address) throws InterruptedException
	{
		
		objBaseClass.LocalBrowserInit(strv);
		objRegisterpageView.clickRegisterlinkHeaderpage();
		objRegisterpageView.RegisterClinic(ClinicName, Firstname, Lastname, EmailId, MobileNo);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		objRegisterpageView.hdrClinic_AdminDetailsisDisplayed();
		objRegisterpageView.SelectState(State);		
		objRegisterpageView.SelectDist(Dist);
		objRegisterpageView.SelectCity(City);
		objRegisterpageView.address(Address);
	
		objRegisterpageView.ClickAdminDetailNextButton();	
		
		objRegisterpageView.hdrPaymentaAceptanceModeisDisplayed();
		
		objRegisterpageView.verifyStep_1Fieldstext();
		objRegisterpageView.verifyStep_2Fieldstext();
		objRegisterpageView.verifyStep_3Fieldstext();
		objRegisterpageView.verifyStep_4Fieldstext();
		objRegisterpageView.verifyStep_5Fieldstext();
	
		driver.close();
		
		
	
	
	}
	
	
	
	
	
	
	
}
