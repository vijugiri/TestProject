package Register;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.main.BaseClass;
import com.main.Listenertest;
import com.register.RegisterPage;
import com.register.RegisterpageView;

//@Listeners({Listenertest.class})

public class RegisterPageTest extends BaseClass {
	
	BaseClass objBaseClass= new BaseClass();
	RegisterpageView objRegisterpageView= new RegisterpageView();
	RegisterPage objRegisterPage = new RegisterPage();
	
	

	static String strv="";
	@Test(priority = -11, dataProvider ="inputData")
	public void Login(String url,String Mob,String Pass ) throws InterruptedException 
		{
	
	
	objBaseClass.LocalBrowserInit(url);
	}
	
	@Test(priority=1)
	public void ComponentDisplayed() 
	{	
		objRegisterpageView.clickRegisterlinkHeaderpage();		
		objRegisterpageView.displayComponent();
		
	}

	@Test(priority=2)
	public void RegistertestwithoutAnyField() throws InterruptedException
	
	{
		Thread.sleep(3000);
		objRegisterpageView.clickRegisterlinkHeaderpage();
		objRegisterpageView.RegisterWithoutAnyField();
	}
	@Test(priority = 3, dataProvider ="Register")
	public void RegisterErrormessages(String ClinicName, String DummyFName,String Firstname,String Lastname,String EmailId,String WrongLastname,String WrongEmailId, String WrongMobileNo,String MobileNo,String State,String Dist,String City,String Address  ) throws InterruptedException 
	{
		objRegisterpageView.clickRegisterlinkHeaderpage();
		Thread.sleep(2000);
		objRegisterpageView.RegisterWithWrongFirstname(ClinicName,DummyFName);
		Thread.sleep(2000);
		objRegisterpageView.RegisterWithUserandFirstnameWithLasName(ClinicName,Firstname,Lastname);	
		Thread.sleep(2000);
		objRegisterpageView.RegisterWithoutMobile(ClinicName, Firstname, Lastname, EmailId);
		Thread.sleep(2000);
		objRegisterpageView.RegisterWithWrongLastName(ClinicName, Firstname, WrongLastname);
		Thread.sleep(2000);
		objRegisterpageView.RegisterWithWrongEmail(ClinicName, Firstname, Lastname, WrongEmailId);
		Thread.sleep(2000);
		objRegisterpageView.RegisterWithWrongMobile(ClinicName, Firstname, Lastname, EmailId, WrongMobileNo);
		
	}
	
	@Test(priority = 4, dataProvider ="Register")
	public void CancelRegister(String ClinicName, String DummyFName,String Firstname,String Lastname,String EmailId,String WrongLastname,String WrongEmailId, String WrongMobileNo,String MobileNo,String State,String Dist,String City,String Address) throws InterruptedException {
		Thread.sleep(2000);
		objRegisterpageView.clickRegisterlinkHeaderpage();
		objRegisterpageView.CancelRegisterClinic(ClinicName, Firstname, Lastname, EmailId, MobileNo);
		Thread.sleep(2000);
		
	}
	@Test(priority = 5, dataProvider ="Register")
	public void Register(String ClinicName, String DummyFName,String Firstname,String Lastname,String EmailId,String WrongLastname,String WrongEmailId, String WrongMobileNo,String MobileNo,String State,String Dist,String City,String Address) throws InterruptedException {
		Thread.sleep(2000);
		objRegisterpageView.clickRegisterlinkHeaderpage();
		objRegisterpageView.RegisterClinic(ClinicName, Firstname, Lastname, EmailId, MobileNo);	
		Thread.sleep(2000);
		driver.close();
	}

}
