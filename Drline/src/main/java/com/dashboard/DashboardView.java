package com.dashboard;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.login.LoginPage;
import com.main.BaseClass;

public class DashboardView  extends BaseClass {
	
	LoginPage objLoginPage=new LoginPage();
	BaseClass objBaseClass= new BaseClass();
	DashboardPage objDashboardPage=new DashboardPage();


	String strval=null;
	String strval2=null;
	String strval3=null;
	String strval4=null;
	
	public void MenuDisplayedOnDashboard() {
		objDashboardPage.DashboardMenuisDisplayed();
		objDashboardPage.AppointmentMenuisDisplayed();
		objDashboardPage.TreatmentMenuisDisplayed();
		objDashboardPage.FollowPrescriptionMenuisDisplayed();
		objDashboardPage.TransactionMenuisDisplayed();
		objDashboardPage.PatientBillingMenuisDisplayed();
		objDashboardPage.NoticeBoardMenuisDisplayed();
		objDashboardPage.SettingMenuisDisplayed();
		objDashboardPage.AttendanceMenuisDisplayed();
		objDashboardPage.CertificatesMenuisDisplayed();
		objDashboardPage.InventoryMenuisDisplayed();
		objDashboardPage.ShoppingMenuisDisplayed();
		objDashboardPage.MasterMenuisDisplayed();
		objDashboardPage.AllReportsMenuisDisplayed();
		objDashboardPage.SearchPatientHistoryMenuisDisplayed();
		objDashboardPage.DocumentsMenuisDisplayed();
		objDashboardPage.NextbuttonOndashboardisDisplayed();
		objDashboardPage.PrevbuttonOndashboardisDisplayed();
		
	}
	
	public void ComponentDosplayedonDashboard() {
		
		objDashboardPage.HelpSymbolisDisplayed();
		objDashboardPage.NotificationiconDisplayed();
		objDashboardPage.DoctorprofileDisplayed();
	}
	
	public void VerifyDashboardText() {
		objDashboardPage.VerifyAllPatientText();
		objDashboardPage.VerifyTODAYS_WAITINGPATIENTText();
		objDashboardPage.VerifyTODAYS_PROCESSEDPATIENTText();
		objDashboardPage.VerifyTODAYS_COLLECTIONText();
		objDashboardPage.VerifyAVAILABLE_BALANCEText();
		objDashboardPage.VerifyTrack_MapText();
		objDashboardPage.VerifyBookAppointmentText();
		objDashboardPage.VerifySelect_DoctorText();
	}
	
	public void PrevAndNextFunctionality() throws InterruptedException {
		
		objDashboardPage.clickPrevbuttonOndashboard();
		Thread.sleep(1000);
		objDashboardPage.DashboardMenuisDisplayed();
		Thread.sleep(1000);
		objDashboardPage.clickNextbuttonOndashboard();
		Thread.sleep(1000);
		objDashboardPage.DashboardMenuisDisplayed();
		
		
		
	
	}
	
	
	
	
	
	
	public void ComponentDosplayedonPatientBookingPage()
	{
	
		
		objDashboardPage.hdrPatientBooking();
		objDashboardPage.AvailablePatientBookingText();
		objDashboardPage.BookedPatientBookingText();
		objDashboardPage.CancelButtonDisplayed();
	}
	
	public void SelectDateToBooKAppointment(String Date) throws InterruptedException {
		Thread.sleep(1000);
		objDashboardPage.SelectDate(Date);
		Thread.sleep(1000);
	
	
		
		
	}

	public void SelectTimeToBooKAppointment(String Time) throws InterruptedException {
		
		Thread.sleep(1000);
		//objDashboardPage.hdrPatientBooking();
		Thread.sleep(1000);
		objDashboardPage.SelectTime(Time);
		
		
	}
	
	

	public void BookingPatientnamePlaceholderisDisplayed() {
		

		objDashboardPage.BookingPatientnamePlaceholder();

	}
public void clickPatientBillingMenu() {
		

		objDashboardPage.clickPatientBillingMenu();
		
		
		objBaseClass.isdisplayed("/html/body/div[4]/div[2]/div/div[1]/div/div/div/div/div/div/h4");

	}
	
	
	

	public void SearchByPatientName_MobileNumberText() throws InterruptedException {
		
		
		objDashboardPage.SearchByPatientName_MobileNumberText();
		objDashboardPage.BookButtonDisplayed();
		objDashboardPage.clickCancelButtonDisplayedonpatientbooking();
		

	
	}
	public void clickDashboardMenu() throws InterruptedException {
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(2000);
		objDashboardPage.clickDashboardMenu();
		objDashboardPage.DashboardMenuisDisplayed();
		Thread.sleep(1000);
		

	}
	
	public void PatientNameorMob(String Mob_Name,String fullname ) throws InterruptedException {
		
		Thread.sleep(2000);
		WebElement cancelpopup =driver.findElement(By.xpath("//button[@id='cancelapp']"));
		
		if(cancelpopup.isDisplayed()) 
		
		{
			Thread.sleep(1000);
			objBaseClass.refresh();
			this.clickDashboardMenu();	
		}
		
		
		
		
		else{
		
		
		
		
		objDashboardPage.setPatientNamrorMob(Mob_Name);
		Thread.sleep(2000);
		WebElement message=driver.findElement(By.xpath("//span[@id=\"successmsg\"]"));
		if(message.isDisplayed()) {
			Thread.sleep(2000);
			
			Thread.sleep(2000);
			objBaseClass.setText("//input[@id='fullName']", fullname);
			Thread.sleep(5000);
			
			
			
			WebElement  element=driver.findElement(By.xpath("//button[contains(text(),'save & Book')]"));   
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			  ex.executeScript("arguments[0].click()", element);
			
		}
		else
		{
			Thread.sleep(2000);
		/*	objBaseClass.ClearText("//input[@id='w-input-search']");
			WebElement settxt=driver.findElement(By.xpath("//input[@id='w-input-search']"));
			settxt.sendKeys(Mob_Name);
			settxt.selectOptionWithText("Java");*/
			
			
			
			objBaseClass.mouseHover("//div[@class='autocomplete-suggestion']");
			
			
			WebElement  element=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div/div[2]/div/div/div/form[1]/div/div[2]/div/div/button[1]"));   
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			  ex.executeScript("arguments[0].click()", element);
		}
		
		}
	}
		
	
	
	
	
	
	public void VerifyPatientName(String fullname ) {
		
		
		
		strval=driver.findElement(By.xpath("//span[@id='name']")).getText();
		System.out.println(" name is "+ strval);
		System.out.println(strval);
		strval2 =fullname;
		assertTrue(strval.contains(strval2));
		

		
	}
	public void VerifyPatientMob(String Mob_Name) throws InterruptedException {
		
		
		Thread.sleep(1000);
		strval=driver.findElement(By.xpath("//span[@id='contact']")).getText();
		System.out.println(" Mob_Name is "+ strval);
		System.out.println(strval);
		strval2 =Mob_Name;
		assertTrue(strval.contains(strval2));
		

		
	}
	
public void CancelAppointment() throws InterruptedException {
		
		
				Thread.sleep(1000);
				objBaseClass.click("//button[@id='cancelapp']");
	
	
}
	
	
	
	public void verifyComponentOnBookedAppointmentPopup() 
	{
		objBaseClass.isdisplayed("//button[@id='cancelapp']");
		objBaseClass.isdisplayed("//span[@id='contact']");
		objBaseClass.isdisplayed("//*[@id=\"printMSG\"]/div/div/div[2]/div[2]/div");
		objBaseClass.isdisplayed("//*[@id=\"printMSG\"]/div/div/div[2]/div[1]/div");
		objBaseClass.isdisplayed("//h4[contains(text(),'Do you want cancel this Appointment?')]");
		objBaseClass.isdisplayed("//button[@class='close pull-right']");
		
	}
	
	
	
public boolean verifymenus() throws InterruptedException {
	
	
	
	
	objDashboardPage.DashboardMenuisDisplayed();
	
	WebElement  element=driver.findElement(By.xpath("//button[@class='navbar-toggler navbar-toggler-right align-self-center d-lg-none']"));   
	JavascriptExecutor ex=(JavascriptExecutor)driver;
	  ex.executeScript("arguments[0].click()", element);
	

Thread.sleep(1000);
objDashboardPage.DashboardMenuisNotDisplayed();
Thread.sleep(1000);
objBaseClass.click("//button[@class='navbar-toggler navbar-toggler-right align-self-center d-lg-none']");

objDashboardPage.DashboardMenuisDisplayed();
return false;
}
	
	
	public void verifyHelpMenu() {
		
		objDashboardPage.DashboardMenuisDisplayed();
		
		WebElement  element=driver.findElement(By.xpath("//i[@class='fa fa-question-circle']"));   
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		  ex.executeScript("arguments[0].click()", element);
		  
		  
		  objBaseClass.isdisplayed("//h4[contains(text(),'Frequently Asked Questions (FAQ)')]");
		  
		  
		  
		  WebElement  element2=driver.findElement(By.xpath("//i[@class='fa fa-question-circle']"));   
			JavascriptExecutor ex2=(JavascriptExecutor)driver;
			  ex2.executeScript("arguments[0].click()", element2);
			  
				objDashboardPage.DashboardMenuisDisplayed();
		
		
	}
	
	
	
	
	
	
	public void clickOnNotificationOnDashboard() {
		
		
		objDashboardPage.clickOnNotificationOnDashboard();
		objBaseClass.click("//a[contains(text(),'View all')]");

	}
	
	public void hdrNotificationisDisplaye() {
		
		
		objBaseClass.isdisplayed("//h4[contains(text(),'Employee Notifications List :')]");

		
		
	}
	
	
public void cmpNotificationisDisplaye() {
		
		

		objBaseClass.isdisplayed("//label[contains(text(),'Show')]");
		objBaseClass.isdisplayed("//*[@id='example_length']/label");
		
		//objBaseClass.getTableDataFromtrAndTh("", "1", "1");
		strval=driver.findElement(By.xpath("//table[@class='table table-bordered']//tr[1]/th[1]")).getText();
		System.out.println("strval====="+strval);
		strval2="Sr. No";
		assertTrue(strval.contains(strval2));
		
		objBaseClass.refresh();
		strval3=driver.findElement(By.xpath("//table[@class='table table-bordered']//tr[1]/th[2]")).getText();
		System.out.println("strval3====="+strval3);
		strval4="Notification Type";
		assertTrue(strval3.contains(strval4));
		
		objBaseClass.refresh();
		
		String s1=driver.findElement(By.xpath("//table[@class='table table-bordered']//tr[1]/th[3]")).getText();
		System.out.println("s1====="+s1);
		String s2="Description";
		assertTrue(s1.contains(s2));
		
		objBaseClass.refresh();
		
		String s3=driver.findElement(By.xpath("//table[@class='table table-bordered']//tr[1]/th[4]")).getText();
		System.out.println("s3====="+s3);
		String s4="Action";
		assertTrue(s3.contains(s4));
		
		
		
		
		
	}
	
	public void verifyShowsEntries() throws InterruptedException {
	
	
	objBaseClass.selectDropDown("//select[@id='pageValue']", "10");
	

	strval3=driver.findElement(By.xpath("//select[@id='pageValue']")).getText();
	System.out.println("pageValue====="+strval3);
	strval4="10";
	assertTrue(strval3.contains(strval4));
	objBaseClass.refresh();
	Thread.sleep(1000);
	objBaseClass.selectDropDown("//select[@id='pageValue']", "25");

	strval3=driver.findElement(By.xpath("//select[@id='pageValue']")).getText();
	System.out.println("pageValue====="+strval3);
	strval4="25";
	assertTrue(strval3.contains(strval4));
	objBaseClass.refresh();
	Thread.sleep(1000);
	objBaseClass.selectDropDown("//select[@id='pageValue']", "50");


	strval3=driver.findElement(By.xpath("//select[@id='pageValue']")).getText();
	System.out.println("pageValue====="+strval3);
	strval4="50";
	assertTrue(strval3.contains(strval4));
	
	objBaseClass.refresh();
	Thread.sleep(1000);
	objBaseClass.selectDropDown("//select[@id='pageValue']", "100");
	

	strval3=driver.findElement(By.xpath("//select[@id='pageValue']")).getText();
	System.out.println("pageValue====="+strval3);
	strval4="100";
	assertTrue(strval3.contains(strval4));

	
	}
	
	
	public void clickOnViewNotification() throws InterruptedException {
		String classxpath="table table-bordered";
		String trNo="1";
		String tdNo="4";
		
	objBaseClass.ClickOntableData(classxpath,trNo,tdNo);
		
		
		
	}
	
	

public void clickTreatmentMenu(){
objDashboardPage.clickTreatmentMenu();
}










}
	

