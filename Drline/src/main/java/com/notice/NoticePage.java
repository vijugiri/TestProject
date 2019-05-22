package com.notice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.appointment.AddpatientView;
import com.appointment.AppointmentPage;
import com.appointment.AppointmentView;
import com.dashboard.BookApointmentFromDashboard;
import com.dashboard.DashboardPage;
import com.dashboard.DashboardView;
import com.login.LoginPage;
import com.login.LoginPageView;
import com.main.BaseClass;
import com.main.Log4j;
import com.register.RegisterpageView;
import com.setting.SettingView;

import Treatment.TreatmentView;

public class NoticePage extends BaseClass {

	
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

	
	
	String strval=null;
	String strval2=null;
	String strval3=null;
	String strval4=null;

	
	
	public void clickOnNoticeMenu() throws InterruptedException {
		
		
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(119.44,19)");
		

		objBaseClass.mouseHoverWithoutClick("//li[@id='Notice Board']");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='Notice Board']")).click();
		
	}
	
	
	
	
	
	
	
	
	

}
