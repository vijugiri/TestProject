package DashBoard;

import org.testng.annotations.Test;

import com.dashboard.DashboardPage;
import com.dashboard.DashboardView;

import com.login.LoginPage;
import com.login.LoginPageView;
import com.main.BaseClass;

public class Notification extends BaseClass{
	LoginPage objLoginPage=new LoginPage();
	BaseClass objBaseClass= new BaseClass();
	LoginPageView objLoginPageView= new LoginPageView();
	DashboardView objDashboardView= new DashboardView();
	DashboardPage objDashboardPage= new DashboardPage();
	


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
		
		@Test(priority=2)
		public void verifyComponentsOnNotification() throws InterruptedException {
			
			objDashboardView.clickDashboardMenu();
			objDashboardPage.DashboardMenuisDisplayed();
			Thread.sleep(1000);
			objDashboardView.clickOnNotificationOnDashboard();
			Thread.sleep(1000);
			objDashboardView.hdrNotificationisDisplaye();
			Thread.sleep(1000);
			objDashboardView.cmpNotificationisDisplaye();
			
			
		}
		
		
		@Test(priority=3)
		public void OperationsOnNotification() throws InterruptedException {
			
			
			objDashboardView.clickDashboardMenu();
			objDashboardPage.DashboardMenuisDisplayed();
			Thread.sleep(1000);
			objDashboardView.clickOnNotificationOnDashboard();
			objDashboardView.verifyShowsEntries();

		}
		
		
		@Test(priority=4)
		public void OpenNewNotification() throws InterruptedException {
			
			
			objDashboardView.clickDashboardMenu();
			objDashboardPage.DashboardMenuisDisplayed();
			Thread.sleep(1000);
			objDashboardView.clickOnNotificationOnDashboard();
			objDashboardView.clickOnViewNotification();
			driver.close();
			

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
