package loginTest;

import org.testng.annotations.Test;

import com.login.LoginPage;
import com.login.LoginPageView;
import com.main.BaseClass;
import com.util.Screenshot;

public class CompleteLogin extends BaseClass{

	LoginPage objLoginPage=new LoginPage();
	BaseClass objBaseClass= new BaseClass();
	LoginPageView objLoginPageView= new LoginPageView();
	Screenshot objScreenshot = new Screenshot();
	

	

	// make sure mobile number and password should be correct
	@Test(priority = 1, dataProvider ="inputData")
	public void LoginComplete(String url,String Mob,String Pass) throws InterruptedException 
			{
			objBaseClass.LocalBrowserInit(url);
				objLoginPageView.Login(Mob,Pass);
				objLoginPageView.YesPopup();
				
			}
	
	@Test(priority=9)
	public void Logout() throws InterruptedException 
			{
				objLoginPageView.Logout();
				driver.close();
			}
}
