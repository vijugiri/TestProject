package Attendence;

import org.testng.annotations.Test;


import com.attendence.AttendenceView;
import com.dashboard.DashboardView;
import com.login.LoginPage;
import com.login.LoginPageView;
import com.main.BaseClass;

public class attendenceOperations extends BaseClass{
	
	BaseClass objBaseClass= new BaseClass();

	LoginPage objLoginPage=new LoginPage();
	LoginPageView objLoginPageView= new LoginPageView();
	AttendenceView objAttendenceView= new AttendenceView();
	DashboardView objDashboardView= new DashboardView();

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
	@Test(priority = 2)
	public void attendenceMenusandComponents() throws InterruptedException

	{
	
		objAttendenceView.clickAttendacemenu();
		objAttendenceView.empheader();
		objAttendenceView.empName();
		objAttendenceView.dailyattendancedisplayed();
		objAttendenceView.monthlyattendancedisplayed();
		objAttendenceView.Employees();
		objAttendenceView.displayeemployeeList("vijay");
		objAttendenceView.datetextdisplayed();
		objAttendenceView.checkOutDisplayed();
		objDashboardView.clickDashboardMenu();

		
	}
	
	
	@Test(priority = 3)
	public void attendenceclockInDaily() throws InterruptedException{

		objAttendenceView.clickAttendacemenu();
		objAttendenceView.empheader();
		objAttendenceView.empName();
		objAttendenceView.dailyattendancedisplayed();
		objAttendenceView.monthlyattendancedisplayed();
		objAttendenceView.Employees();
		objAttendenceView.selectemp("vijay");
		objAttendenceView.clickOnCheckin();
		objAttendenceView.verifycheckindone();
		objAttendenceView.clickOnCheckOUT();
		objAttendenceView.verifycheckOUTdone();
		objAttendenceView.verifyCheckInAndCheckOutIsDone();
		objAttendenceView.verifyTodaysDateInDailyAttendence();
		objDashboardView.clickDashboardMenu();
	}
	

	
	@Test(priority = 4)
	public void attendenceMonthly() throws InterruptedException{

		objAttendenceView.clickAttendacemenu();
		objAttendenceView.empheader();
		objAttendenceView.empName();
		objAttendenceView.dailyattendancedisplayed();
		objAttendenceView.monthlyattendancedisplayed();
		objAttendenceView.Employees();
		objAttendenceView.selectemp("vijay");
		objAttendenceView.clickOnCheckin();
		objAttendenceView.verifycheckindone();
		objAttendenceView.clickOnCheckOUT();
		objAttendenceView.verifycheckOUTdone();
		objAttendenceView.verifyCheckInAndCheckOutIsDone();
		objAttendenceView.clickOnMonthlyAttendance();
		objAttendenceView.verifyPageValue();
		objAttendenceView.verifyTodaysDateinMonthlyAttendance();
		objDashboardView.clickDashboardMenu();
		
	
	}
	
	@Test(priority = 5)
	public void verifyClockInmapWithEmpNAme() throws InterruptedException{

		objAttendenceView.clickAttendacemenu();
		objAttendenceView.empheader();
		objAttendenceView.empName();
		objAttendenceView.dailyattendancedisplayed();
		objAttendenceView.monthlyattendancedisplayed();
		objAttendenceView.Employees();
		objAttendenceView.selectemp("vijay");
		objAttendenceView.clickOnCheckin();
		objAttendenceView.verifycheckindone();
		objAttendenceView.clickOnCheckOUT();
		objAttendenceView.verifycheckOUTdone();
		objAttendenceView.verifyCheckInAndCheckOutIsDone();
		objAttendenceView.clickOnMonthlyAttendance();
		objAttendenceView.clickOnCheckInMapInMonthlyAttendance();
		objAttendenceView.verifyCheckInMapInMonthlyAttendance();
		objAttendenceView.clickOnCancelButtonOnCheckInMapIn();
		objAttendenceView.dailyattendancedisplayed();
		objAttendenceView.monthlyattendancedisplayed();
		objAttendenceView.Employees();
		objAttendenceView.selectemp("vijay");
		objAttendenceView.clickOnMonthlyAttendance();
		objAttendenceView.clickOnCheckOUTMapInMonthlyAttendance();
		objAttendenceView.clickOnCancelButtonOnCheckInMapIn();
		objAttendenceView.dailyattendancedisplayed();
		objAttendenceView.monthlyattendancedisplayed();
		objDashboardView.clickDashboardMenu();
	}
	
	
	
	
	
	
	
	

	@Test(priority = 6)
	public void verifyDeleteInMonthlyattendenc() throws InterruptedException{

		objAttendenceView.clickAttendacemenu();
		objAttendenceView.empheader();
		objAttendenceView.empName();
		objAttendenceView.dailyattendancedisplayed();
		objAttendenceView.monthlyattendancedisplayed();
		objAttendenceView.Employees();
		objAttendenceView.selectemp("vijay");
		objAttendenceView.clickOnCheckin();
		objAttendenceView.verifycheckindone();
		objAttendenceView.clickOnCheckOUT();
		objAttendenceView.verifycheckOUTdone();
		objAttendenceView.verifyCheckInAndCheckOutIsDone();
		objAttendenceView.clickOnMonthlyAttendance();
		objAttendenceView.clickOnDeleteTrashWithNOOptionMonthlyAttendance();
		objDashboardView.clickDashboardMenu();
		
		
		objAttendenceView.clickAttendacemenu();
		objAttendenceView.empheader();
		objAttendenceView.empName();
		objAttendenceView.dailyattendancedisplayed();
		objAttendenceView.monthlyattendancedisplayed();
		objAttendenceView.Employees();
		objAttendenceView.selectemp("vijay");
		objAttendenceView.clickOnCheckin();
		objAttendenceView.verifycheckindone();
		objAttendenceView.clickOnCheckOUT();
		objAttendenceView.verifycheckOUTdone();
		objAttendenceView.verifyCheckInAndCheckOutIsDone();
		objAttendenceView.clickOnMonthlyAttendance();
		objAttendenceView.deletefunctionality();
		objAttendenceView.verifyAttendanceDeleted();
	
		objDashboardView.clickDashboardMenu();
	
	  
	}
	

	
	

	@Test(priority = 7)
	public void verifyCheckOutmapWithEmpNAme() throws InterruptedException{

		objAttendenceView.clickAttendacemenu();
		objAttendenceView.empheader();
		objAttendenceView.empName();
		objAttendenceView.dailyattendancedisplayed();
		objAttendenceView.monthlyattendancedisplayed();
		objAttendenceView.Employees();
		objAttendenceView.selectemp("vijay");
		objAttendenceView.clickOnCheckin();
		objAttendenceView.verifycheckindone();
		objAttendenceView.clickOnCheckOUT();
		objAttendenceView.verifycheckOUTdone();
		objAttendenceView.verifyCheckInAndCheckOutIsDone();
		objAttendenceView.clickOnMonthlyAttendance();
		objAttendenceView.clickOnCheckOutMapInMonthlyAttendance();
		objAttendenceView.verifyCheckInMapInMonthlyAttendance();
		objAttendenceView.clickOnCancelButtonOnCheckInMapIn();
		objAttendenceView.dailyattendancedisplayed();
		objAttendenceView.monthlyattendancedisplayed();
		objDashboardView.clickDashboardMenu();
	
	
	}
	
	@Test(priority = 8)
	public void verifyEditFunctionalistofMonthly() throws InterruptedException{

		objAttendenceView.clickAttendacemenu();
		objAttendenceView.empheader();
		objAttendenceView.empName();
		objAttendenceView.dailyattendancedisplayed();
		objAttendenceView.monthlyattendancedisplayed();
		objAttendenceView.Employees();
		objAttendenceView.selectemp("vijay");
		objAttendenceView.clickOnCheckin();
		objAttendenceView.verifycheckindone();
		objAttendenceView.clickOnCheckOUT();
		objAttendenceView.verifycheckOUTdone();
		objAttendenceView.verifyCheckInAndCheckOutIsDone();
		objAttendenceView.clickOnMonthlyAttendance();
		strval=objBaseClass.getText("//*[@id='example1']/tbody/tr[1]/td[2]");
		objAttendenceView.clickEditmonthlyattendence();
		objAttendenceView.hdrEditAttendenceDisplayed();
		objAttendenceView.verifyEditDate(strval);
		objAttendenceView.clickOnCancelBNoBttonOnEditAttendance();
		objAttendenceView.clickOnCancelBYesuttonOnEditAttendance();
				objDashboardView.clickDashboardMenu();
	
	
	}
	
	
	@Test(priority = 9)
	public void verifyEditAndUpdateFunctionalistofMonthly() throws InterruptedException{

		objAttendenceView.clickAttendacemenu();
		objAttendenceView.empheader();
		objAttendenceView.empName();
		objAttendenceView.dailyattendancedisplayed();
		objAttendenceView.monthlyattendancedisplayed();
		objAttendenceView.Employees();
		objAttendenceView.selectemp("vijay");
		objAttendenceView.clickOnCheckin();
		objAttendenceView.verifycheckindone();
		objAttendenceView.clickOnCheckOUT();
		objAttendenceView.verifycheckOUTdone();
		objAttendenceView.verifyCheckInAndCheckOutIsDone();
		objAttendenceView.clickOnMonthlyAttendance();
		objDashboardView.clickDashboardMenu();
		objAttendenceView.clickAttendacemenu();
		objAttendenceView.selectemp("vijay");
		objAttendenceView.clickEditmonthlyattendence();
		objAttendenceView.hdrEditAttendenceDisplayed();
		objAttendenceView.verifyupdateFunctionality();
		objDashboardView.clickDashboardMenu();
		
	
	
		
		
		
		
		
		
		
		
	}
	@Test(priority = 11)
	public void closebow() {
		driver.close();
	}
	
	
	
	
	

}
