package com.appointment;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.dashboard.DashboardView;
import com.login.LoginPage;
import com.login.LoginPageView;
import com.main.BaseClass;


public class AppointmentPage extends BaseClass {
	
	LoginPage objLoginPage=new LoginPage();
	BaseClass objBaseClass= new BaseClass();


	String strval=null;
	String strval3=null;
	String strval4=null;
	String strval2=null;
	private Object wait;
	
	public void headerAppointment() {
		objBaseClass.isdisplayed("//h4[contains(text(),'Appointment')]");
		
	}
	
	
	
	public void searchAppointmentPlaceholder() 
	{
		String strval=driver.findElement(By.cssSelector("#searchHighlight")).getAttribute("placeholder");
		System.out.println("Search clinic name=="+strval);
		strval2 ="Search - Booked Appointment";
		assertTrue(strval.contains(strval2));

	}	
	
	
	// processed apointment booked type
	
	public void ProcessedappointmentBookedType() 
	{
		String strval=driver.findElement(By.xpath("//div[@class='col-md-8']")).getText();
		System.out.println("Appointment Booked type =="+strval);
		strval2 ="Processed Patient";
		assertTrue(strval.contains(strval2));

	}	
	

	//    Online Booking     apointment booked type
	
	public void    OnlineBookingappointmentBookedType() 
	{
		String strval=driver.findElement(By.xpath("//div[@class='col-md-8']")).getText();
		System.out.println("Appointment Booked type =="+strval);
		strval2 ="Online Booking";
		assertTrue(strval.contains(strval2));

	}	

	//    Direct Booking     apointment booked type
	
	public void    DirectBookingappointmentBookedType() 
	{
		String strval=driver.findElement(By.xpath("//div[@class='col-md-8']")).getText();
		System.out.println("Appointment Booked type =="+strval);
		strval2 ="Direct Booking";
		assertTrue(strval.contains(strval2));

	}	
//  Direct Booking     apointment booked type
	
	public void    OnCallBookingappointmentBookedType() 
	{
		String strval=driver.findElement(By.xpath("//div[@class='col-md-8']")).getText();
		System.out.println("Appointment Booked type =="+strval);
		strval2 ="On Call Booking";
		assertTrue(strval.contains(strval2));

	}	
	
	
	
	
	public void addpatientOnAppointmentPageisDisplayed() {
		objBaseClass.isdisplayed("//a[@id='myBtn']");
	}
	
	

	public void hedrPatientWaitingListAppointment() {
		objBaseClass.isdisplayed("//h4[contains(text(),'Patient Waiting List')]");
		
	}

	public void DrNameAppointmenttext() {
		objBaseClass.isdisplayed("//h6[contains(text(),'Name')]");
		
	}
	public void SpecialityAppointmenttext() {
		objBaseClass.isdisplayed("//h6[contains(text(),'Speciality')]");
		
	}
	
	public void NOOFPATIENTAppointmenttext() {
		objBaseClass.isdisplayed("/html/body/div[4]/div[2]/div/div[2]/div/div[1]/div/div/div[2]/div[1]/div/div/div/div[4]/h6");
		
	}
	
	
	
	///////////////////////////////////////////////////////////////////
	
	
	
	public void clickaddpatientOnAppointmentPage() {
		objBaseClass.click("//a[@id='myBtn']");
	}
	
	// first Patient Edit
	public void moushoverAndClickOnEditinAppointment() {
		//objBaseClass.mouseHoverWithoutClick("//div[@id='p_112']");
		objBaseClass.mouseHoverWithoutClick("//ul[@class='list-inline social-lists animate']");
		objBaseClass.click("//a[contains(text(),'Edit')]");
	}
	// first Patient cancel
		public void moushoverAndClickOnCancelInAppointment() {
			objBaseClass.mouseHoverWithoutClick("//div[@id='p_112']");
			objBaseClass.click("//a[contains(text(),'Cancel')]");
		}
	
		
		// first Patient cancel and yesPopup
				public void moushoverAndClickOnCancelAndYesPopupInAppointment() {
					objBaseClass.mouseHoverWithoutClick("//span[contains(text(),'shagee')]");
					objBaseClass.click("//a[contains(text(),'Cancel')]");
					objBaseClass.mouseHover("//button[contains(text(),'Yes')]");
					
					
				}
			
	
	public void verifyEdit_Text() {
		
		strval=objBaseClass.getText("//ul[@class='list-inline social-lists animate']");
		System.out.println("Edit text is=="+strval);
		strval2 ="Edit";
		assertTrue(strval.contains(strval2));
		
	}

	public void verifyProcess_Text() {
		
		strval=objBaseClass.getText("//ul[@class='list-inline social-lists animate']");
		System.out.println("Process text is=="+strval);
		strval2 ="Process";
		assertTrue(strval.contains(strval2));
		
	}
	

	public void verifyCancel_Text() {
		
		strval=objBaseClass.getText("//ul[@class='list-inline social-lists animate']");
		System.out.println("Cancel text is=="+strval);
		strval2 ="Cancel";
		assertTrue(strval.contains(strval2));
		
	}
	
	public void verifyAppointmentBookedTime(String Time) 
	{

		strval=objBaseClass.getText("/html/body/div[4]/div[2]/div/div[2]/div/div[1]/div/div/div[2]/div[2]/div/div/div");
		System.out.println("Booked time is=="+strval);
		strval2 =Time;
		assertTrue(strval.contains(strval2));
		
		
	
	}
	
	
	
	
	public void processBookedAppointment() throws InterruptedException 
	{
		Thread.sleep(2000);
		objBaseClass.mouseHoverWithoutClick("//ul[@class='list-inline social-lists animate']");
		objBaseClass.mouseHover("//a[contains(text(),'Process')]");
	}
	

public void processPatientFromWaitingList(String Time ) throws InterruptedException

{Thread.sleep(1000);

//WebElement process=driver.findElement(By.xpath("//div[@class='row']//following-sibling::h6//span[contains(text(),'"+ Time  +"')]"));
	//objBaseClass.mouseHoverWithoutClick("//div[@class='row']//following-sibling::h6//span[contains(text(),'"+ Time  +"')]");




	/*Thread.sleep(1000);
	objBaseClass.mouseHoverWithoutClick("//*[@id=\\\"p_107\\\"]/div/ul/li[1]/a");
	
	*/
	
	
	
	
	
	
	
	
	/*//objBaseClass.click("//*[@id="p_107"]/div/ul/li[1]/a");
	
	WebElement proc=driver.findElement(By.xpath("//*[@id=\"p_107\"]/div/ul/li[1]/a"));
	
	if(proc.isDisplayed());
	objBaseClass.mouseHoverWithoutClick("//*[@id=\\\"p_107\\\"]/div/ul/li[1]/a");
	
	//proc.click();
	*/
	
	
}

	










	
	
	

}
