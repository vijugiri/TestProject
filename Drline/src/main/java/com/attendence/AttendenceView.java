package com.attendence;

import static org.testng.Assert.assertEquals;

import java.awt.RenderingHints.Key;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AttendenceView extends AttendencePage {
	
	AttendencePage objAttendencePage = new AttendencePage();
	
	
	public void clickAttendacemenu() throws InterruptedException {
		objAttendencePage.clickAttendacemenu();
	
		
	}
	
	public void empheader() {
		
		objAttendencePage.empheader();
		
	}
	
public void empName() {
		
		objAttendencePage.empName();
		
	}




public void dailyattendancedisplayed() {
	
	objAttendencePage.dailyattendancedisplayed();
	
}

public void monthlyattendancedisplayed() {
	
	objAttendencePage.monthlyattendancedisplayed();
	
}



public void Employees() {
	
	objAttendencePage.Employees();
	
}

public void datetextdisplayed() {
	
	objAttendencePage.datetextdisplayed();
	
}

public void checkOutDisplayed() {
	
	objAttendencePage.checkOutDisplayed();
	
}






public void displayeemployeeList(String Firstname) {
	
	List <WebElement> emplist= driver.findElements(By.xpath("//select[@id='employeeId']"));
	
	for (WebElement webElement : emplist) {
		
		strval=webElement.getText();
		System.out.println(strval);
		strval2=Firstname;
		Assert.assertTrue(strval.contains(strval2));
		
	}
}

public void selectemp(String empname) {
	objAttendencePage.selectEmp(empname);
}


public void clickOnCheckin() {
	objAttendencePage.clickOnCheckin();
}



public void clickOnCheckOUT() {
	objAttendencePage.clickOnCheckOUT();
}


public void verifycheckindone()
{
	WebElement element= driver.findElement(By.xpath("//*[@id='content1']/form/div/div[4]/div/button[1]"));

if(!element.isEnabled()) {
	System.out.println("Check in Button is Disabled ");
	
}
else {
	System.out.println("Check in button is Enabled");
}
}	
	


public void verifycheckOUTdone()
{
	WebElement element= driver.findElement(By.xpath("//button[contains(text(),'Check Out')]"));

if(!element.isEnabled()) {
	System.out.println("Check OUT Button is Disabled ");
	
}
else {
	System.out.println("Check OUT button is Enabled");
}
	

}

public void verifyCheckInAndCheckOutIsDone() {
	
	List<WebElement> list=driver.findElements(By.xpath("//table[@id='example1']"));
	for (WebElement webElement : list) {
		
		
	strval=	webElement.getText();
	System.out.println(strval);
	
	}
	int num=list.size();
	assert num>0;
	
	
	
}

public void verifyTodaysDateInDailyAttendence() {
	
	DateFormat formatdate= new SimpleDateFormat("MM/dd//yyyy HH:mm:ss");
	Date systemDate= new Date();
	
	strval2=systemDate.toString();
	
	
	


System.out.println("current date is "+strval);
List<WebElement> list=driver.findElements(By.xpath("//table[@id='example1']"));
for (WebElement webElement : list) {
	
	
strval2=	webElement.getText();
System.out.println("table Data is "+ strval2);

Assert.assertTrue(strval2.contains(strval2));

}
}



public void verifyTodaysDateinMonthlyAttendance() {
	



DateFormat formatdate= new SimpleDateFormat("MM/dd//yyyy HH:mm:ss");
Date systemDate= new Date();
strval2=systemDate.toString();
//String currentDate =formatdate.format(systemDate);

System.out.println("table Data is "+ strval2);


List<WebElement> list=driver.findElements(By.xpath("//table[@id='example1']"));
for (WebElement webElement : list) {
	
	
strval2=	webElement.getText();

System.out.println("table Data is "+ strval2);

Assert.assertTrue(strval2.contains(strval2));

}
}

public void clickOnMonthlyAttendance() {
	objAttendencePage.clickOnMonthlyAttendance();
}

public void scrolltopagevalue()
{
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("javascript:window.scrollBy(69.78,50)");
	
}


public void verifyPageValue() {
	
	this.scrolltopagevalue();
	objBaseClass.selectDropDown("//select[@id='pageValue']", "25");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	this.scrolltopagevalue();
	objBaseClass.selectDropDown("//select[@id='pageValue']", "10");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	this.scrolltopagevalue();
	objBaseClass.selectDropDown("//select[@id='pageValue']", "50");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	this.scrolltopagevalue();
	objBaseClass.selectDropDown("//select[@id='pageValue']", "100");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	this.scrolltopagevalue();
	objBaseClass.selectDropDown("//select[@id='pageValue']", "10");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
}


//*[@id="example1"]/tbody/tr[1]/td[6]/a[@title='Check In'][1]



public void clickOnCheckInMapInMonthlyAttendance() throws InterruptedException {
	objAttendencePage.clickOnCheckInMapInMonthlyAttendance();
}

public void clickOnCheckOutMapInMonthlyAttendance() throws InterruptedException {
	objAttendencePage.clickOnCheckOutMapInMonthlyAttendance();
}




public void clickOnCheckOUTMapInMonthlyAttendance() throws InterruptedException {
	objAttendencePage.clickOnCheckOUTMapInMonthlyAttendance();
}



public void verifyCheckInMapInMonthlyAttendance() throws InterruptedException {
	
	objBaseClass.isdisplayed("//h4[contains(text(),'Attendance System Process Map')]");

	
}



public void clickOnCancelButtonOnCheckInMapIn()throws InterruptedException {
	
	

	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("javascript:window.scrollBy(95.88,33.91)");
	
	objBaseClass.clickUsingJavaScripter("//button[contains(text(),'Cancel')]");
	objBaseClass.mouseHoverWithoutClick("//button[contains(text(),' Yes')]");
	objBaseClass.clickUsingJavaScripter("//button[contains(text(),'Yes')]");
	
	
	
}


public void deletefunctionality() throws InterruptedException {
	objAttendencePage.clickOnDeleteTrashWithYESOptionMonthlyAttendance();
	
}
public void verifyAttendanceDeleted() {
	strval=objBaseClass.getText("/html/body/div[5]/div/div/div[2]/span");
	
	strval2="Record deleted successfully.";



	Assert.assertTrue(strval.contains(strval2));
	objBaseClass.refresh();
}


public void clickOnDeleteTrashWithNOOptionMonthlyAttendance() throws InterruptedException {
	objAttendencePage.clickOnDeleteTrashWithNOOptionMonthlyAttendance();
	
}


public void clickEditmonthlyattendence() {
	objAttendencePage.clickEditmonthlyattendence();
	
}

public void hdrEditAttendenceDisplayed() {
	objBaseClass.isdisplayed("//h4[contains(text(),'Employee Attendance Details')]");
}

public void verifyEditDate(String strval2) {

	

	
	
	strval=driver.findElement(By.xpath("//input[@id='stringDate']")).getText();
	System.out.println("geted  date is "+strval);
	Assert.assertTrue(strval.contains(strval2));
	
	
}




public void clickOnCancelBYesuttonOnEditAttendance() {
	objBaseClass.mouseHover("//a[contains(text(),' Cancel ')]");
	objBaseClass.clickUsingJavaScripter("/html/body/div[6]/div[2]/a[1]/button");
	
}

public void clickOnCancelBNoBttonOnEditAttendance() {
	objBaseClass.mouseHover("//a[contains(text(),' Cancel ')]");
	objBaseClass.clickUsingJavaScripter("/html/body/div[6]/div[2]/a[2]/button");
	
}




public void verifyupdateFunctionality() throws InterruptedException {
	
	strval=driver.findElement(By.xpath("//input[@id='stringClockInTime']")).getText();
	strval=strval.toString();
	System.out.println("in tome is "+strval);
	
	
	objBaseClass.mouseHoverWithoutClick("//*[@id='stringClockInTime']");
	objBaseClass.mouseHover("//*[@id='stringClockInTime']");
	driver.findElement(By.xpath("//*[@id='stringClockInTime']")).sendKeys(Keys.TAB.DOWN);
	

	objBaseClass.clickUsingJavaScripter("//button[contains(text(),'Update')]");
	Thread.sleep(2000);
	objBaseClass.clickUsingJavaScripter("//div[@class='closejAlert ja_close']");
	Thread.sleep(2000);
	this.clickAttendacemenu();
	this.selectemp("vijay");
	this.clickOnMonthlyAttendance();
	this.clickEditmonthlyattendence();
	this.hdrEditAttendenceDisplayed();


objBaseClass.clickUsingJavaScripter("//button[contains(text(),'Update')]");
Thread.sleep(2000);
objBaseClass.clickUsingJavaScripter("//div[@class='closejAlert ja_close']");



	
	
}





















}
