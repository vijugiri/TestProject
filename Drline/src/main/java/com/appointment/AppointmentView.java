package com.appointment;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.dashboard.DashboardPage;
import com.dashboard.DashboardView;
import com.login.LoginPage;
import com.main.BaseClass;

import Treatment.TreatmentView;

public class AppointmentView extends BaseClass {
	
	LoginPage objLoginPage=new LoginPage();
	BaseClass objBaseClass= new BaseClass();
	AppointmentPage objAppointmentPage= new AppointmentPage();
	DashboardPage objDashboardPage=new DashboardPage();
AddpatientPage objAddpatientPage= new AddpatientPage();




	String strval=null;
	String strval2=null;
	String strval3=null;
	String strval4=null;
	
	private boolean isElementPresent(By by) {
		  try {
		    driver.findElement(by);
		    return true;
		  } catch (NoSuchElementException e) {
		    return false;
		  }
		}

	
	
	public void clickAppointmentMenu() {
		objDashboardPage.clickAppointmentMenu();
	}
	
	
	
	public void headerAppointment() {
		objAppointmentPage.headerAppointment();
	}

	public void hedrPatientWaitingListAppointment() {
		objAppointmentPage.hedrPatientWaitingListAppointment();
	}
	
	public void searchAppointmentPlaceholder() {
		objAppointmentPage.searchAppointmentPlaceholder();
	}
	public void addpatientOnAppointmentPageisDisplayed() {
		objAppointmentPage.addpatientOnAppointmentPageisDisplayed();
	}
	public void DrNameAppointmenttext() {
		objAppointmentPage.DrNameAppointmenttext();
	}
	public void SpecialityAppointmenttext() {
		objAppointmentPage.SpecialityAppointmenttext();
	}
	public void NOOFPATIENTAppointmenttext() {
		objAppointmentPage.NOOFPATIENTAppointmenttext();
	}
	
	public void moushoverAndClickOnEditinAppointment() {
		objAppointmentPage.moushoverAndClickOnEditinAppointment();
	}
	
	public void moushoverAndClickOnCancelAndYesPopupInAppointment() throws InterruptedException {
		Thread.sleep(2000);
		objAppointmentPage.moushoverAndClickOnCancelAndYesPopupInAppointment();
	}
	
	
	
	public void verifyBookingTypetext() {
		objAppointmentPage.ProcessedappointmentBookedType();
		objAppointmentPage.OnlineBookingappointmentBookedType();
		objAppointmentPage.DirectBookingappointmentBookedType();
		objAppointmentPage.OnCallBookingappointmentBookedType();
		
	}
	
	public void verifyEdit_Cancel_ProcessTextOnBookedAppointment() throws InterruptedException {
		Thread.sleep(2000);
		objBaseClass.mouseHoverWithoutClick("//ul[@class='list-inline social-lists animate']");
		objAppointmentPage.verifyEdit_Text();
		//objAppointmentPage.verifyProcess_Text();
		objAppointmentPage.verifyCancel_Text();
	
	}
	
	public void verifyAppointmentBookedTime(String Time)
	{
		try {
			objAppointmentPage.verifyAppointmentBookedTime(Time);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public void mouseHoverOnDiffrentTimeSlot(String Time ) throws InterruptedException {
		Thread.sleep(2000);
		objBaseClass.mouseHoverWithoutClick("//div[@class='row']//following-sibling::h6//span[contains(text(),'"+ Time +"')]");
		
	}
	
	
	public void processPatientFromWaitingList(String Time) throws InterruptedException {
		Thread.sleep(2000);
		objAppointmentPage.processPatientFromWaitingList(Time);
	}
	
public void verifyPatienthasProcessed()

{
	WebElement greencolor= driver.findElement(By.xpath("//div[@style='background-color: #3CB371;']"));
if(greencolor.isDisplayed()) {	
	
System.out.println("patient has processed sucessfully ");	
}

}
	




public void ClickOnProcess() throws InterruptedException {
	
	Thread.sleep(2000);
//WebElement process=driver.findElement(By.xpath("//a[contains(text(),'Process')]"));
objBaseClass.mouseHoverWithoutClick("//a[contains(text(),'Process')]");


try {Thread.sleep(1000);
	WebElement  element=driver.findElement(By.xpath("//a[contains(text(),'Process')]"));  
	
	if(element.isDisplayed())
	{
		Thread.sleep(1000);
		objBaseClass.mouseHover("//a[contains(text(),'Process')]");
	
	}
} catch (Exception e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}


//process.click();


WebElement popupPatentalready;
try {
	popupPatentalready = driver.findElement(By.xpath("//span[contains(text(),'Another patient is already in process.')]"));




if(popupPatentalready.isDisplayed())
{
	
	objBaseClass.click("//a[@id='ja_btn_154831765624659619']");
}
objBaseClass.refresh();


} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}

public void EditBookedPatientonAppointment() throws InterruptedException {
	
Thread.sleep(1000);
objBaseClass.mouseHoverWithoutClick("//a[contains(text(),'Edit')]");
	
try {
	Thread.sleep(1000);
	WebElement Edit=driver.findElement(By.xpath("//a[contains(text(),'Edit')]"));
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	if(Edit.isDisplayed()) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	objBaseClass.mouseHover("//a[contains(text(),'Edit')]");
		
	//Edit.click();
	
	}
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}



public void CancelBookedPatientonAppointmentWithYesButton() throws InterruptedException {
	

objBaseClass.mouseHoverWithoutClick("//a[contains(text(),'Cancel')]");
	
WebElement Edit=driver.findElement(By.xpath("//a[contains(text(),'Cancel')]"));

Edit.click();
Thread.sleep(1000);	
objBaseClass.mouseHoverWithoutClick("//button[contains(text(),'Yes')]");
Thread.sleep(1000);	



WebElement  element=driver.findElement(By.xpath("/html/body/div[8]/div[2]/a[1]/button"));   
JavascriptExecutor ex=(JavascriptExecutor)driver;
  ex.executeScript("arguments[0].click()", element);




}



public void CancelBookedPatientonAppointmentWithNoButton() throws InterruptedException {
	

objBaseClass.mouseHoverWithoutClick("//a[contains(text(),'Cancel')]");
	
WebElement Edit=driver.findElement(By.xpath("//a[contains(text(),'Cancel')]"));

Edit.click();
Thread.sleep(1000);	
objBaseClass.mouseHoverWithoutClick("//button[contains(text(),'No')]");
Thread.sleep(1000);	



WebElement  element=driver.findElement(By.xpath("/html/body/div[8]/div[2]/a[2]/button"));   
JavascriptExecutor ex=(JavascriptExecutor)driver;
  ex.executeScript("arguments[0].click()", element);


}


public void updatePatient(String Disease ) throws InterruptedException {
	this.EditBookedPatientonAppointment();
	Thread.sleep(1000);
	objAddpatientPage.setDiseseOnAddpatient(Disease);
	

WebElement  element=driver.findElement(By.xpath("//button[contains(text(),'Update')]"));   
JavascriptExecutor ex=(JavascriptExecutor)driver;
  ex.executeScript("arguments[0].click()", element);

	try {
		if(driver.findElement(By.xpath("//span[@id='successmsg']")).isDisplayed()){
			Thread.sleep(1000);
			objBaseClass.refresh();
		}else {
			Thread.sleep(1000);
			objBaseClass.refresh();
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Thread.sleep(1000);
	objBaseClass.refresh();
}


public void CalcelAllAppointment() throws InterruptedException {
	
	objDashboardPage.clickDashboardMenu();
	objDashboardPage.clickAppointmentMenu();
	
	
	boolean autosearch = isElementPresent(By.xpath("//div[@class='wait-patient-booking']/div/div/div/div"));


	Thread.sleep(2000);
	if(autosearch==true)
	{
		/*Thread.sleep(1000);
	objBaseClass.mouseHoverWithoutClick("//a[contains(text(),'Cancel')]");

	Thread.sleep(1000);	
	
	
	objBaseClass.mouseHover("//a[contains(text(),'Cancel')]");
	Thread.sleep(2000);	

	objBaseClass.mouseHover("/html/body/div[8]/div[2]/a[1]/button");
	
	//objBaseClass.mouseHover("/html/body/div[5]/div/div/div[1]");
	objBaseClass.refresh();*/
		

		
		Thread.sleep(2000);
		objDashboardPage.clickDashboardMenu();
		objDashboardPage.DashboardMenuisDisplayed();
		Thread.sleep(1000);
		
		objDashboardPage.clickTreatmentMenu();
		
		
	
		Thread.sleep(2000);
		objBaseClass.DeleteTableData("example","1","6");
	

		
				Thread.sleep(3000);
				WebElement  element=driver.findElement(By.xpath("//button[contains(text(),'Yes')]"));   
				JavascriptExecutor ex=(JavascriptExecutor)driver;
				  ex.executeScript("arguments[0].click()", element);
				

		objBaseClass.refresh();
		
	
	}
	
	Thread.sleep(2000);
	
	
	
}





public void CancelAppointment()
{
objDashboardPage.clickDashboardMenu();
objDashboardPage.clickAppointmentMenu();
	
	
}








}
