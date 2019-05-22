package com.Transaction;

import org.openqa.selenium.JavascriptExecutor;

import com.appointment.AddpatientView;
import com.appointment.AppointmentView;
import com.dashboard.BookApointmentFromDashboard;
import com.dashboard.DashboardView;
import com.login.LoginPage;
import com.login.LoginPageView;
import com.main.BaseClass;
import com.register.RegisterpageView;

public class TransactionPage extends BaseClass{
	
	LoginPage objLoginPage=new LoginPage();
	BaseClass objBaseClass= new BaseClass();
	LoginPageView objLoginPageView= new LoginPageView();
	AppointmentView objAppointmentView=new AppointmentView();
	DashboardView objDashboardView= new DashboardView();
	BookApointmentFromDashboard objBookApointmentFromDashboard= new BookApointmentFromDashboard();
	AddpatientView objAddpatientView= new AddpatientView();
	RegisterpageView objRegisterpageView= new RegisterpageView();

	String strval=null;
	String strval2=null;
	String strval3=null;
	String strval4=null;


	public void clickOnTransaction() throws InterruptedException {
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(114,19)");
	
		objBaseClass.mouseHoverWithoutClick("//span[contains(text(),'Transaction')]");
		Thread.sleep(1000);
		objBaseClass.mouseHover("//span[contains(text(),'Transaction')]");
		
	}

	
	
	
	
	
	
	
	
	public void clickonCollecton() throws InterruptedException {
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(194,51)");
		objBaseClass.mouseHoverWithoutClick("//li[@id='Collection']");
		Thread.sleep(1000);
		objBaseClass.mouseHover("//li[@id='Collection']");
		
	}
	
	
	public void clickOnExpenditure() throws InterruptedException {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(194,51)");
		Thread.sleep(1000);
		objBaseClass.mouseHoverWithoutClick("//li[@id='Expenditure']");
		Thread.sleep(1000);
		objBaseClass.mouseHover("//li[@id='Expenditure']");
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
