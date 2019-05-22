package DashBoard;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.dashboard.DashboardView;
import com.login.LoginPage;
import com.login.LoginPageView;
import com.main.BaseClass;

public class DashboardComponents extends BaseClass{
	LoginPage objLoginPage=new LoginPage();
	BaseClass objBaseClass= new BaseClass();
	LoginPageView objLoginPageView= new LoginPageView();
	DashboardView objDashboardView= new DashboardView();
	


	String strval=null;
	String strval2=null;
	String strval3=null;
	String strval4=null;

	
	

		@Test(priority = 1, dataProvider ="inputData")
		public void setup(String url,String Mob,String Pass) throws InterruptedException
		{
		objBaseClass.LocalBrowserInit(url);
		}
	

		// make sure mobile number and password should be correct
		@Test(priority = 2, dataProvider ="inputData")
		public void Login(String url,String Mob,String Pass ) throws InterruptedException 
			{
				objLoginPageView.Login(Mob,Pass);
				objLoginPageView.YesPopup();
				
			}
	
	@Test(priority=3)
	public void MenuDisplayedOnDashboard() 
	{	
		objDashboardView.MenuDisplayedOnDashboard();
	}
	
	@Test(priority=4)
	public void ComponentDosplayedonDashboard() {
		
		objDashboardView.ComponentDosplayedonDashboard();
		
	}
	@Test(priority=5)
	public void VerifyDashboardText() {
		objDashboardView.VerifyDashboardText();
	}
	
	
	
	
	@Test(priority=7)
	public void VerifyDashboardMenusDisplayedAndHide() throws InterruptedException {
		
		objDashboardView.verifymenus();
		
		
	}
	@Test(priority =6, dataProvider ="Dashboard")
	public void ComponentDosplayedonPatientBookingPage(String Date,String Time,String Mob_Name,String fullname  ) throws InterruptedException {
		objDashboardView.SelectDateToBooKAppointment(Date);
		objDashboardView.ComponentDosplayedonPatientBookingPage();
		objDashboardView.SelectTimeToBooKAppointment(Time);
		objDashboardView.BookingPatientnamePlaceholderisDisplayed();
		objDashboardView.SearchByPatientName_MobileNumberText();
		objDashboardView.clickDashboardMenu();
		

	}
	
	
	@Test(priority=8)
	public void VerifyHelpIconOnDashboard() throws InterruptedException {
		objDashboardView.clickDashboardMenu();
		objDashboardView.verifyHelpMenu();
		objDashboardView.clickDashboardMenu();
		driver.close();
		
	}
	
	

	
	
	
	
	
	
	
}
