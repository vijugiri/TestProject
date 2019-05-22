package loginTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.login.LoginPage;
import com.login.LoginPageView;
import com.main.BaseClass;
import com.util.Screenshot;

public class LoginTest extends BaseClass {
	
	LoginPage objLoginPage=new LoginPage();
	BaseClass objBaseClass= new BaseClass();
	LoginPageView objLoginPageView= new LoginPageView();
	Screenshot objScreenshot = new Screenshot();
	
	@Test(priority = 1, dataProvider ="inputData")
	public void setup(String url,String Mob,String Pass) throws InterruptedException
	{
		objBaseClass.LocalBrowserInit(url);
	}
	

	// Verify component displayed on login page
	
	@Test(priority=2)
	public void componentDisplayedonLoginpage() 
	{
		objLoginPageView.ComponentsOnLoginPage();
		objLoginPageView.mobileplaceholderPss();
		objLoginPageView.passplaceholderPss();
		
	
			
		
	}
	
	
	
	// login Without User Name And Password
	@Test(priority=3)
	public void loginWithoutUserNameAndPassword() throws InterruptedException 
	{
		objLoginPageView.loginWithoutUsenameAndPassword();
	}
	
	
	
	// login With Usenamer And Without Password
	@Test(priority=4)
	public void loginWithUsernameAndWithoutPassword() throws InterruptedException 
	{
		objLoginPageView.loginWithUsenameAndWithoutPassword("9765296444");
	}
	
	
	
	// login Without Usenamer And With Password
	@Test(priority=5)
	public void loginWithoutUsenameAndWithPassword() throws InterruptedException 
	{
		objLoginPageView.loginWithoutUsenameAndWithPassword("12345");
	}
	
	
	
	// wrong mobile number or password
	@Test(priority=6)
	public void invalidMobOrPass() throws InterruptedException 
	{
		objLoginPageView.invalidMobOrPass("8208800252","123456969");
	}
	
	
	
	// make sure mobile no is not registered
	@Test(priority=7)
	public void unrRgisteredUser() throws InterruptedException 
	{
		objLoginPageView.unrRgisteredUser("8380802005");
	}
	
	
		// make sure mobile number and password should be correct
		@Test(priority=8)
		public void LoginWithoutSelectingClinic() throws InterruptedException 
		{
			objLoginPageView.LoginWithoutSelectingClinic("8888085560","12345");
		
			
		}
		
	
	
		// make sure mobile number and password should be correct
		@Test(priority = 9, dataProvider ="inputData")
		public void Login(String url,String Mob,String Pass ) throws InterruptedException 
				{
					objLoginPageView.Login(Mob,Pass);
					objLoginPageView.YesPopup();
					
				}
		@Test(priority=10)
		public void Logout() throws InterruptedException 
				{
					objLoginPageView.Logout();
					driver.close();
				}

}
