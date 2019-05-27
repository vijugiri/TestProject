package com.followUp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
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

public class FollowupView extends BaseClass{

	
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

	

	private boolean isElementPresent(By by) {
		  try {
		    driver.findElement(by);
		    return true;
		  } catch (NoSuchElementException e) {
		    return false;
		  }
		}

	String strval=null;
	String strval2=null;
	String strval3=null;
	String strval4=null;

	public void clickOnFolloupPriscription() throws InterruptedException {
		
		

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(159.23,19)");
		Thread.sleep(2000);
		objBaseClass.mouseHoverWithoutClick("//span[contains(text(),'Follow Prescription')]");
		Thread.sleep(2000);
		objBaseClass.mouseHover("//span[contains(text(),'Follow Prescription')]");
		
	}

	
	public void headerOfFollowup() {
		objBaseClass.isdisplayed("//h4[contains(text(),'FollowUp Prescription Chart')]");
	}
	
	
	
public void searchpatient(String MobNo) throws InterruptedException {
		Thread.sleep(3000);
		objBaseClass.setText("//input[@id='patient-search']", MobNo);
		
		
		Thread.sleep(4000);
		
		
		boolean autosearch = isElementPresent(By.xpath("//div[@class='autocomplete-suggestions']"));

		//WebElement autosearch=driver.findElement(By.xpath("//div[@class='autocomplete-suggestions']"));
		Thread.sleep(2000);
		if(autosearch==true)
		{
			Thread.sleep(1000);
			objBaseClass.mouseHover("//div[@class='autocomplete-suggestions']");
		
		}
}
	
	
public void verifyPatientName(String FullName) {
	
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("javascript:window.scrollBy(93.59,19)");
	
	strval= objBaseClass.getText("//section[@class='content']//div[4]/font[1]");

	
	Assert.assertTrue(strval.contains(FullName));
	
}




public void verifyMedicinenameName(String medicineNeme) {


	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("javascript:window.scrollBy(181.11,65)");
	
strval= objBaseClass.getText("//span[@class='svg_label']");


Assert.assertTrue(strval.contains(medicineNeme));

}


public void verifyNo_OfDays(String Days) {
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("javascript:window.scrollBy(181.11,65)");
	

strval= objBaseClass.getText("//span[@class='svg_label']");


Assert.assertTrue(strval.contains(Days));

}

public void verifycheckboxisDisabled() {
	//input[@id='isTaken_1165']
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("javascript:window.scrollBy(181.11,65)");
	
	WebElement elemrnt= driver.findElement(By.xpath("//input[@id='isTaken_4732']"));
	Assert.assertTrue(!elemrnt.isEnabled());
}


}

