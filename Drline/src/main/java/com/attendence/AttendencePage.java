package com.attendence;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.login.LoginPage;
import com.main.BaseClass;

public class AttendencePage extends BaseClass	{
	
	LoginPage objLoginPage=new LoginPage();
BaseClass objBaseClass= new BaseClass();


String strval=null;
String strval3=null;
String strval4=null;
String strval2=null;
private boolean isElementPresent(By by) {
	  try {
	    driver.findElement(by);
	    return true;
	  } catch (NoSuchElementException e) {
	    return false;
	  }
	}



public void clickAttendacemenu() throws InterruptedException {
	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	Thread.sleep(1000);
JavascriptExecutor js= (JavascriptExecutor) driver;

js.executeScript("javascript:window.scrollBy(115.09,19)");

//objBaseClass.mouseHover("//span[contains(text(),'Attendance')]/i[1]");
Thread.sleep(1000);
objBaseClass.clickUsingJavaScripter("//span[contains(text(),'Attendance')]/i[1]");
}

public void empheader() {
	objBaseClass.isdisplayed("//h4[contains(text(),'Employee Attendance')]");
}




public void empName() {
	objBaseClass.isdisplayed("//h4[contains(text(),'Employee Name')]");
}
 public void dailyattendancedisplayed() {
	 objBaseClass.isdisplayed("//span[contains(text(),'Daily')]");
 }

 

 public void monthlyattendancedisplayed() {
	 objBaseClass.isdisplayed("//span[contains(text(),'Monthly')]");
 }

 


 public void Employees() {
	 objBaseClass.isdisplayed("//label[contains(text(),'Employees')]");
 }



 public void datetextdisplayed() {
	 objBaseClass.isdisplayed("//label[contains(text(),'Date')]");
 }


 public void checkOutDisplayed() {
	 objBaseClass.isdisplayed("//button[contains(text(),'Check Out')]");
 }


 public void selectEmp(String empname) {
	 objBaseClass.selectDropDown("//select[@id='employeeId']", empname);
 }

public void clickOnCheckin() {
	objBaseClass.clickUsingJavaScripter("//*[@id=\"content1\"]/form/div/div[4]/div/button[1]");
}



public void clickOnCheckOUT() {
	objBaseClass.clickUsingJavaScripter("//button[contains(text(),'Check Out')]");
}





public void clickOnMonthlyAttendance() {
	
	objBaseClass.clickUsingJavaScripter("//span[contains(text(),'Monthly')]");
	
}




public void clickOnCheckInMapInMonthlyAttendance() throws InterruptedException {
	
	
	objBaseClass.mouseHoverWithoutClick("//table[@id='example1']/tbody/tr[1]/td[6]/a[@title='Check In'][1]");
	Thread.sleep(1000);
	objBaseClass.clickUsingJavaScripter("//table[@id='example1']/tbody/tr[1]/td[6]/a[@title='Check In'][1]");
	
}




public void clickOnCheckOutMapInMonthlyAttendance() throws InterruptedException {
	
	
	objBaseClass.mouseHoverWithoutClick("//table[@id='example1']/tbody/tr[1]/td[6]/a[2][@title='Check Out'][1]");
	Thread.sleep(1000);
	objBaseClass.clickUsingJavaScripter("//table[@id='example1']/tbody/tr[1]/td[6]/a[2][@title='Check Out'][1]");
	
}


public void clickOnCheckOUTMapInMonthlyAttendance() throws InterruptedException {
	
	
	objBaseClass.mouseHoverWithoutClick("//table[@id='example1']/tbody/tr[1]/td[6]/a[2]");
	Thread.sleep(1000);
	objBaseClass.clickUsingJavaScripter("//table[@id='example1']/tbody/tr[1]/td[6]/a[2]");
	
}



public void clickOnDeleteTrashWithYESOptionMonthlyAttendance() throws InterruptedException {
	
	
	Thread.sleep(2000);
	objBaseClass.mouseHover("//table[@id='example1']//tr[1]/td[7]/a[2]");
	
	
	objBaseClass.mouseHover("/html/body/div[7]/div[2]/a/button/i");
	
	
}


public void clickOnDeleteTrashWithNOOptionMonthlyAttendance() throws InterruptedException {
	
	
	Thread.sleep(2000);
	objBaseClass.mouseHover("//table[@id='example1']//tr[1]/td[7]/a[2]");
	
	
	objBaseClass.mouseHover("/html/body/div[7]/div[2]/i/a/button");
	objBaseClass.refresh();
	
}


public void clickEditmonthlyattendence() {
	objBaseClass.clickUsingJavaScripter("//*[@id=\"example1\"]/tbody/tr[1]/td[7]/a[1]/i");
}





}
