package NoticeTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.appointment.AddpatientView;
import com.appointment.AppointmentPage;
import com.appointment.AppointmentView;
import com.dashboard.DashboardPage;
import com.dashboard.DashboardView;
import com.login.LoginPage;
import com.login.LoginPageView;
import com.main.BaseClass;
import com.main.Log4j;
import com.notice.NoticePageView;
import com.register.RegisterpageView;
import com.setting.SettingView;

import Appointment.BookAppointmentFromAddPatientAppointmentPage;
import DashBoard.BookApointmentFromDashboard;
import Treatment.TreatmentView;

public class NoticetTest extends BaseClass {

	
	private static Logger logger=LogManager.getLogger(Log4j.class);
	AppointmentPage objAppointmentPage= new AppointmentPage();
	DashboardPage objDashboardPage= new DashboardPage();
	LoginPage objLoginPage=new LoginPage();
	BaseClass objBaseClass= new BaseClass();
	LoginPageView objLoginPageView= new LoginPageView();

	AppointmentView objAppointmentView= new AppointmentView();
	DashboardView objDashboardView= new DashboardView();
	BookApointmentFromDashboard objBookApointmentFromDashboard= new BookApointmentFromDashboard();
	AddpatientView objAddpatientView= new AddpatientView();
	RegisterpageView objRegisterpageView= new RegisterpageView();
	TreatmentView objTreatmentView = new TreatmentView();
	SettingView objSettingView = new SettingView();

	
	
	BookAppointmentFromAddPatientAppointmentPage obBookAppointmentFromAddPatientAppointmentPage= new BookAppointmentFromAddPatientAppointmentPage();
	NoticePageView objNoticePageView= new NoticePageView();

  
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
	public void addAndverifyNoticeAndCancel() throws InterruptedException 
	{
		objNoticePageView.clickOnNoticeMenu();
		objNoticePageView.NoticeHeaderIsDisplayed();
		objNoticePageView.clickOnAddNoticebutton();
		objNoticePageView.NoticeHeaderIsDisplayed();
		objNoticePageView.addNoticeTitle("Notice to All employee");
		objNoticePageView.addNoticeDescription();	
		objNoticePageView.clickOnCancelNotice();
		objDashboardView.clickDashboardMenu();
		
	}
	
	
	
	
	@Test(priority=3)
	public void addAndverifyNotice() throws InterruptedException 
	{
		objNoticePageView.clickOnNoticeMenu();
		objNoticePageView.NoticeHeaderIsDisplayed();
		objNoticePageView.clickOnAddNoticebutton();
		objNoticePageView.NoticeHeaderIsDisplayed();
		objNoticePageView.addNoticeTitle("Notice to All employee");
		objNoticePageView.addNoticeDescription();	
		objNoticePageView.clickOnSubmitButtonNotice();
		objNoticePageView.clickOkOnPopup();
		objNoticePageView.verifyNoticeTitle();
		objDashboardView.clickDashboardMenu();
		
	}
	
	@Test(priority=4)
	public void updateNotice() throws InterruptedException 
	{
		objNoticePageView.clickOnNoticeMenu();
		objNoticePageView.NoticeHeaderIsDisplayed();
		objNoticePageView.updateNoticeTitle("important notice");
	
		objNoticePageView.clickOnSubmitButtonNotice();
		objNoticePageView.clickOkOnPopup();
		objNoticePageView.verifyUpdatedNoticeTitle();
		objDashboardView.clickDashboardMenu();
	
	}
	
	
	@Test(priority=5)
	public void DeleteNotice() throws InterruptedException 
	{
		objNoticePageView.clickOnNoticeMenu();
		objNoticePageView.NoticeHeaderIsDisplayed();
		objNoticePageView.deleteNotice();
		objDashboardView.clickDashboardMenu();
		driver.close();
	
	}

}
