package com.dashboard;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.login.LoginPage;
import com.main.BaseClass;



public class DashboardPage extends BaseClass {
	
	LoginPage objLoginPage=new LoginPage();
	BaseClass objBaseClass= new BaseClass();


	String strval=null;
	String strval3=null;
	String strval4=null;
	String strval2=null;
	private Object wait;
	
	
	
public void DashboardMenuisDisplayed(){
	objBaseClass.isdisplayed("//li[@id='Dashboard']");
	
}


public boolean DashboardMenuisNotDisplayed(){
	
	

try
{
   if(driver.findElement(By.xpath("//li[@id='Dashboard']")).isDisplayed()){
       return false;}
       else
     {
         System.out.println("element not displayed");
      return true;
     }
}
catch(Exception e)
{
    return false;
}

}
	 




public void AppointmentMenuisDisplayed(){
objBaseClass.isdisplayed("//li[@id='Appointment']");

}

public void TreatmentMenuisDisplayed(){
objBaseClass.isdisplayed("//li[@id='Treatment']");

}


public void FollowPrescriptionMenuisDisplayed(){
objBaseClass.isdisplayed("//li[@id='Follow Prescription ']");

}


public void TransactionMenuisDisplayed(){
objBaseClass.isdisplayed("//*[@id=\"sidebar\"]/ul/li[6]/a/span[1]");

}



public void PatientBillingMenuisDisplayed(){
objBaseClass.isdisplayed("//li[@id='Patient Billing']");

}


public void NoticeBoardMenuisDisplayed(){
objBaseClass.isdisplayed("//li[@id='Notice Board']");

}

public void SettingMenuisDisplayed(){
objBaseClass.isdisplayed("//*[@id='sidebar']/ul/li[9]");

}


public void AttendanceMenuisDisplayed(){
objBaseClass.isdisplayed("//li[@id='Attendance']");

}


public void CertificatesMenuisDisplayed(){
objBaseClass.isdisplayed("//li[@id='Certificates']");

}


public void InventoryMenuisDisplayed(){
objBaseClass.isdisplayed("//*[@id=\"sidebar\"]/ul/li[12]");

}


public void ShoppingMenuisDisplayed(){
objBaseClass.isdisplayed("//*[@id=\"sidebar\"]/ul/li[13]");

}



public void MasterMenuisDisplayed(){
objBaseClass.isdisplayed("//*[@id=\"sidebar\"]/ul/li[14]");

}





public void AllReportsMenuisDisplayed(){
objBaseClass.isdisplayed("//*[@id=\"sidebar\"]/ul/li[15]");

}





public void SearchPatientHistoryMenuisDisplayed(){
objBaseClass.isdisplayed("//li[@id='SearchPatientHistory']");

}



public void DocumentsMenuisDisplayed(){
objBaseClass.isdisplayed("//li[@id='Documents']");

}


////////////////////

// click menu icon

public void clickDashboardMenu(){
objBaseClass.click("//li[@id='Dashboard']");

}



public void clickAppointmentMenu(){
objBaseClass.click("//li[@id='Appointment']");

}

public void clickTreatmentMenu(){
objBaseClass.click("//li[@id='Treatment']");

}


public void clickFollowPrescriptionMenu(){
objBaseClass.click("//li[@id='Follow Prescription ']");

}


public void clickTransactionMenu(){
objBaseClass.click("//*[@id=\"sidebar\"]/ul/li[6]/a/span[1]");

}



public void clickPatientBillingMenu(){
objBaseClass.click("//li[@id='Patient Billing']");

}


public void clickNoticeBoardMenu(){
objBaseClass.click("//li[@id='Notice Board']");

}

public void clickSettingMenuis(){
	
	//JavascriptExecutor js= (JavascriptExecutor) driver;
	//js.executeScript("javascript:window.scrollBy(79.84,19)");
	objBaseClass.scrollToView("/html/body/div[4]/div[1]/nav/ul/li[9]/a");
objBaseClass.mouseHover("/html/body/div[4]/div[1]/nav/ul/li[9]/a");

}


public void clickAttendanceMenu(){
objBaseClass.click("//li[@id='Attendance']");

}


public void clickCertificatesMenu(){
objBaseClass.click("//li[@id='Certificates']");

}


public void clickInventoryMenu(){
objBaseClass.click("//*[@id='sidebar']/ul/li[12]");

}


public void clickShoppingMenu(){
objBaseClass.click("//*[@id=\"sidebar\"]/ul/li[13]");

}



public void clickMasterMenu(){
objBaseClass.click("//*[@id=\"sidebar\"]/ul/li[14]");

}





public void clickAllReportsMenu(){
objBaseClass.click("//*[@id=\"sidebar\"]/ul/li[15]");

}





public void clickSearchPatientHistoryMenu(){
objBaseClass.click("//li[@id='SearchPatientHistory']");

}



public void clickDocumentsMenu(){
objBaseClass.click("//li[@id='Documents']");

}


public void clickNotificationicon(){
objBaseClass.click("//i[@class='fa fa-bell']");

}



public void clickMyProfile(){

WebElement  element=driver.findElement(By.xpath("/html/body/div[3]/div/nav/div[2]/ul/li[3]/a"));   
JavascriptExecutor ex=(JavascriptExecutor)driver;
  ex.executeScript("arguments[0].click()", element);

}



public void clickPrevbuttonOndashboard(){
objBaseClass.click("//div[contains(text(),'Prev')]");

}



public void clickNextbuttonOndashboard(){
objBaseClass.click("//div[contains(text(),'Next')]");

}




public void clickCancelButton(){
objBaseClass.click("/html/body/div[4]/div[2]/div[1]/div[3]/div/a/button");

}



public void clickBookButton(){
objBaseClass.click("//*[@id=\"patient-book\"]/div/div/button[1]");

}






//////////////////////////////////////////

// cpmponent displayed





public void NextbuttonOndashboardisDisplayed(){
objBaseClass.isdisplayed("//div[contains(text(),'Next')]");

}

public void PrevbuttonOndashboardisDisplayed(){
objBaseClass.isdisplayed("//div[contains(text(),'Prev')]");

}

public void HelpSymbolisDisplayed(){
objBaseClass.isdisplayed("//i[@class='fa fa-question-circle']");

}

public void NotificationiconDisplayed(){
objBaseClass.isdisplayed("//i[@class='fa fa-bell']");

}


public void DoctorprofileDisplayed(){
objBaseClass.isdisplayed("/html/body/div[3]/div/nav/div[2]/ul/li[3]/a");

}






public void CancelButtonDisplayed(){
objBaseClass.isdisplayed("/html/body/div[4]/div[2]/div[1]/div[3]/div/a/button");

}





public void BookButtonDisplayed(){
objBaseClass.isdisplayed("//*[@id=\"patient-book\"]/div/div/button[1]");

}




public void clickCancelButtonDisplayedonpatientbooking() throws InterruptedException{
	Thread.sleep(2000);

WebElement  element=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div/div[2]/div/div/div/form[1]/div/div[2]/div/div/button[2]"));   
JavascriptExecutor ex=(JavascriptExecutor)driver;
  ex.executeScript("arguments[0].click()", element);

}




/////////////////////////////////

// verify text 






public void VerifyAllPatientText() {
	
	strval=driver.findElement(By.xpath("//p[contains(text(),'ALL PATIENT')]")).getText();
	System.out.println("All patient text is "+strval);
	strval2 ="ALL PATIENT";
	assertTrue(strval.contains(strval2));
	
}





public void VerifyTODAYS_WAITINGPATIENTText() {
	
	strval=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[1]/div[2]/div/div/div/div[2]/p")).getText();
	System.out.println("TODAY'S WAITING PATIENT text is "+strval);
	strval2 ="TODAY'S WAITING PATIENT";
	assertTrue(strval.contains(strval2));
	
}






public void VerifyTODAYS_PROCESSEDPATIENTText() {
	
	strval=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[1]/div[3]/div/div/div/div[2]/p")).getText();
	System.out.println("TODAY'S PROCESSED PATIEN text is "+strval);
	strval2 ="TODAY'S PROCESSED PATIENT";
	assertTrue(strval.contains(strval2));
	
}





public void VerifyTODAYS_COLLECTIONText() {
	
	strval=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[1]/div[4]/div/div/div[1]/div[2]/p")).getText();
	System.out.println("TODAY'S COLLECTION text is "+strval);
	strval2 ="TODAY'S COLLECTION";
	assertTrue(strval.contains(strval2));
	
}



public void SearchByPatientName_MobileNumberText() {
	
	WebElement searctext=driver.findElement(By.xpath("//label[contains(text(),'Search By Patient Name / Mobile Number')]"));
	searctext.isDisplayed();

	
}




public void VerifyAVAILABLE_BALANCEText() {
	
	strval=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[1]/div[5]/div/div/div/div[2]/p")).getText();
	System.out.println("AVAILABLE BALANCE text is "+strval);
	strval2 ="AVAILABLE BALANCE";
	assertTrue(strval.contains(strval2));
	
}




public void VerifyREMAINING_SMS_COUNTText() {
	
	strval=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[1]/div[6]/div/div/div/div[2]/p")).getText();
	System.out.println("AVAILABLE BALANCE text is "+strval);
	strval2 ="REMAINING SMS COUNT";
	assertTrue(strval.contains(strval2));
	
}


public void VerifyTrack_MapText() {
	
	strval=driver.findElement(By.xpath("//h4[contains(text(),'Track Map')]")).getText();
	System.out.println("Track Map text is "+strval);
	strval2 ="Track Map";
	assertTrue(strval.contains(strval2));
	
}





public void VerifyBookAppointmentText() {
	
	strval=driver.findElement(By.xpath("//h4[contains(text(),'Book Appointment')]")).getText();
	System.out.println("Book Appointmenttext is "+strval);
	strval2 ="Book Appointment";
	assertTrue(strval.contains(strval2));
	
}

//[text()='" + dynamicString + "']

public void VerifySelect_DoctorText() {
	
	strval=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[3]/div/div/div/div[1]/div[2]")).getText();
	System.out.println(" Select Doctor :  text is "+ strval);
	System.out.println(strval);
	strval2 ="Select Doctor";
	assertTrue(strval.contains(strval2));
	
}

///////////////////////////////////////////////////


// select date drom xpath

public void SelectDate(String Date) {
	
	objBaseClass.click("//a[contains(text(),'"+Date+"')]");
	
	
	
	
/*	
	WebElement  element=driver.findElement(By.xpath("//a[contains(text(),'"+Date+"')]"));   
	JavascriptExecutor ex=(JavascriptExecutor)driver;
	  ex.executeScript("arguments[0].click()", element);*/
	

}



public void SelectTime(String Time) {
	
	objBaseClass.click("//span[contains(text(),'"+Time+"')]");
	
}


public void hdrPatientBooking() {
	
	WebElement dfrpatieentbook=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[1]/div/div/div/div/div/div/div/div"));
	
	dfrpatieentbook.isDisplayed();
}





public void AvailablePatientBookingText() {

	strval=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[2]/div/div/div/div[1]/div[2]")).getText();
	System.out.println("Available text is "+ strval);
	System.out.println(strval);
	strval2 ="Available";
	assertTrue(strval.contains(strval2));
	
}



public void BookedPatientBookingText() {
	     

	strval=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[2]/div/div/div/div[1]/div[2]")).getText();
	System.out.println(" Booked is "+ strval);
	System.out.println(strval);
	strval2 =" Booked";
	assertTrue(strval.contains(strval2));
	
}



public void BookingPatientnamePlaceholder() 
{
	String strval=driver.findElement(By.cssSelector("#w-input-search")).getAttribute("placeholder");
	System.out.println("Placeholder is=="+strval);
	strval2 ="Search By Patient Name / Mobile Number";
	assertTrue(strval.contains(strval2));

}	












public void setPatientNamrorMob(String Mob_Name) throws InterruptedException {
	objBaseClass.setText("//input[@id='w-input-search']", Mob_Name);
	
	
	
}

public void selectOptionWithText(String textToSelect) {
	try {
		WebElement autoOptions = driver.findElement(By.xpath("//input[@id='w-input-search']"));
	Thread.sleep(2000);

		List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
		for(WebElement option : optionsToSelect){
	        if(option.getText().equals(textToSelect)) {
	        	System.out.println("Trying to select: "+textToSelect);
	            option.click();
	            break;
	        }
	    }
		
	} catch (NoSuchElementException e) {
		System.out.println(e.getStackTrace());
	}
	catch (Exception e) {
		System.out.println(e.getStackTrace());
	}
}


public void clickOnNotificationOnDashboard() {
	
	  WebElement  element2=driver.findElement(By.xpath("//i[@class='fa fa-bell']"));   
			JavascriptExecutor ex2=(JavascriptExecutor)driver;
			  ex2.executeScript("arguments[0].click()", element2);
			  
			  
			  
	
	
}


public void tableData(String trNo,String tdNo) {
	
	//objBaseClass.click("//a[contains(text(),'"+Date+"')]");
	
	
			
		WebElement ele=	driver.findElement(By.xpath("//table[@class='table table-bordered']//tr["+trNo+"]/th["+tdNo+"]"));
}




}
