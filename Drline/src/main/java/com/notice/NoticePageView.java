package com.notice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

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


public class NoticePageView extends BaseClass {

	
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

	
	
	NoticePage objNoticePage= new NoticePage();

	String strval=null;
	String strval2=null;
	String strval3=null;
	String strval4=null;
	
	
	
	

	public void clickOnNoticeMenu() throws InterruptedException {
		
		
		
		objNoticePage.clickOnNoticeMenu();
	
	
		
	}
	
	public void NoticeHeaderIsDisplayed() {
		objBaseClass.isdisplayed("//h4[contains(text(),'Notice Board')]");
	}
	
	
	

	public void clickOnAddNoticebutton() {
		objBaseClass.clickUsingJavaScripter("//a[contains(text(),'Add Notice')]");
	}
	
	
	
	
	

	public void addNoticeTitle(String title) throws InterruptedException {
		Thread.sleep(1000);
		objBaseClass.ClearText("//input[@id='title']");
		Thread.sleep(1000);
		objBaseClass.setText("//input[@id='title']",title );
	}
	
	
	
	

	public void addNoticeDescription() throws InterruptedException {
		objBaseClass.setText("//textarea[@id='description']", "Clinical research is a branch of healthcare science that determines the safety and effectiveness (efficacy) of medications, devices, diagnostic products and treatment regimens intended for human use. These may be used for prevention, treatment, diagnosis or for relieving symptoms of a disease. Clinical research is different from clinical practice. In clinical practice established treatments are used, while in clinical research evidence is collected to establish a treatment.");
		Thread.sleep(1000);
	}
	
	
	

	

	public void clickOnCancelNotice() throws InterruptedException {
		Thread.sleep(1000);
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(120,33.91)");
		
		Thread.sleep(3000);
		
		objBaseClass.mouseHover("//a[@id='del']");
	
		objBaseClass.mouseHover("/html/body/div[6]/div[2]/a/button/i");
		
	}
	
	
	

	public void clickOnSubmitButtonNotice() throws InterruptedException {
		objBaseClass.clickUsingJavaScripter("//button[contains(text(),'Submit')]");
	
	
	}
	
	
	public void clickOkOnPopup() {
		objBaseClass.mouseHover("/html/body/div[5]/div/div/div[1]");
		
	
	}
	
	
	
	public void verifyNoticeTitle() {
		
		
		strval=objBaseClass.getText("//tbody[@id='tbl5']//tr[1]/td[3]");
		
		strval2="Notice to All employee";
		
		Assert.assertTrue(strval.contains(strval2));
		
		
	}
	public void verifyUpdatedNoticeTitle() {
		
		
		strval=objBaseClass.getText("//tbody[@id='tbl5']//tr[1]/td[3]");
		
		strval2="important notice";
		
		Assert.assertTrue(strval.contains(strval2));
		
		
	}
	
	public void updateNoticeTitle(String updatetitle) throws InterruptedException {
		
		
		
		objBaseClass.clickUsingJavaScripter("//tbody[@id='tbl5']//tr[1]/td[4]/a[1]");
	this.NoticeHeaderIsDisplayed();
	this.addNoticeTitle(updatetitle);
		
	}
	

	public void verifyupdatedNoticeTitle() {
		
		
		strval=objBaseClass.getText("//tbody[@id='tbl5']//tr[1]/td[3]");
		
		strval2="important notice";
		
		Assert.assertTrue(strval.contains(strval2));
		
		
	}
	
	public void deleteNotice() throws InterruptedException {
		Thread.sleep(2000);
		objBaseClass.mouseHover("//tbody[@id='tbl5']//a[@id='del']");
		
		Thread.sleep(2000);
		objBaseClass.mouseHover("/html/body/div[7]/div[2]/a/button/i");
		Thread.sleep(2000);
		
		objBaseClass.mouseHover("/html/body/div[5]/div/div/div[1]");
	
		
	}
	

	
}
