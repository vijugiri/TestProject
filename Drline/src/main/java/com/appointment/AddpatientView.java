package com.appointment;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.dashboard.BookApointmentFromDashboard;
import com.dashboard.DashboardView;
import com.login.LoginPage;
import com.login.LoginPageView;
import com.main.BaseClass;
import com.register.RegisterpageView;


public class AddpatientView extends BaseClass{	
	LoginPage objLoginPage=new LoginPage();
	BaseClass objBaseClass= new BaseClass();
	LoginPageView objLoginPageView= new LoginPageView();
	AppointmentView objAppointmentView=new AppointmentView();
	DashboardView objDashboardView= new DashboardView();
	BookApointmentFromDashboard objBookApointmentFromDashboard= new BookApointmentFromDashboard();
	AddpatientPage objAddpatientPage= new AddpatientPage();
	AppointmentPage objAppointmentPage= new AppointmentPage();
	RegisterpageView objRegisterpageView=new RegisterpageView();


	String strval=null;
	String strval2=null;
	String strval3=null;
	String strval4=null;

	
	
	public void clickaddpatientOnAppointmentPage() {
		objAppointmentPage.clickaddpatientOnAppointmentPage();
	}
	
	public void headerAddatient() {
		WebElement hdrAddpatient= driver.findElement(By.xpath("//h4[contains(text(),'Patient Details')]"));
		hdrAddpatient.isDisplayed();
		
	}
	
public void setSearchPatient(String MobNo) throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objAddpatientPage.setSearchPatient(MobNo);
	}
	
	

public void setFullname(String FullName) throws InterruptedException {
	Thread.sleep(1000);
		objAddpatientPage.setFullname(FullName);
	}
	

public void setDiseseOnAddpatient(String Disease) throws InterruptedException
{
	objAddpatientPage.setDiseseOnAddpatient(Disease);
}


		

public void SelectGender(String Gender) throws InterruptedException
{
	objAddpatientPage.SelectGender(Gender);
}	
	

	
	




public void setAgeOnAddpatient(String Age) throws InterruptedException
{
objAddpatientPage.setAgeOnAddpatient(Age);
}		





public void setWaightAddpatient(String Weight) throws InterruptedException
{
objAddpatientPage.setWaightAddpatient(Weight);
}		





public void setHeightAddpatient(String Height) throws InterruptedException
{
objAddpatientPage.setHeightAddpatient(Height);
}	




public void setNoteAddpatient(String Note) throws InterruptedException
{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
objAddpatientPage.setNoteAddpatient(Note);
}	






public void clickSaveAndBookAddpatientbutton() throws InterruptedException
{
objAddpatientPage.clickSaveAndBookAddpatientbutton();
}	

public void clickAllClearOnAddpatientbutton() throws InterruptedException
{
objAddpatientPage.clickAllClearOnAddpatientbutton();
}	





public void setEmailIdAddpatinetPage(String EmailId) throws InterruptedException
{
objAddpatientPage.setEmailIdAddpatinetPage(EmailId);
}	




/////////////////////////////// 
// add patient components

public void verifySearchPatienttext() throws InterruptedException 
{

	

	strval=driver.findElement(By.xpath("//label[contains(text(),'Search Patient')]")).getText();
	System.out.println("Search Patient text is "+strval);
	strval2 ="Search Patient";
	assertTrue(strval.contains(strval2));
	
}




public void SearchPatientPlaceholder() 
{
	String strval=driver.findElement(By.cssSelector("#save-book-search")).getAttribute("placeholder");
	System.out.println("placeorder Search Patient=="+strval);
	strval2 ="Search By Mobile No. / Name";
	assertTrue(strval.contains(strval2));

}	


////////////////////


public void verifyFullNamePatienttext() throws InterruptedException 
{

	

	strval=driver.findElement(By.xpath("//label[contains(text(),'Full Name')]")).getText();
	System.out.println("Full Name text is "+strval);
	strval2 ="Full Name";
	assertTrue(strval.contains(strval2));
	
}




public void SearchFullNamePlaceholder() 
{
	String strval=driver.findElement(By.cssSelector("#fullName")).getAttribute("placeholder");
	System.out.println("placeorder fullName=="+strval);
	strval2 ="Enter your full Name";
	assertTrue(strval.contains(strval2));

}	
////////////////////////////////////////



public void verifyDiseasePatienttext() throws InterruptedException 
{

	

	strval=driver.findElement(By.xpath("//label[contains(text(),'Disease')]")).getText();
	System.out.println("Disease text is "+strval);
	strval2 ="Disease *";
	assertTrue(strval.contains(strval2));
	
}




public void SearchDiseasePlaceholder() 
{
	String strval=driver.findElement(By.cssSelector("#disease")).getAttribute("placeholder");
	System.out.println("placeorder fullName=="+strval);
	strval2 ="Enter your disease";
	assertTrue(strval.contains(strval2));

}


///////////////////////////




public void verifyMobilePatienttext() throws InterruptedException 
{

	

	strval=driver.findElement(By.xpath("//label[contains(text(),'Mobile No ')]")).getText();
	System.out.println("Mobile text is "+strval);
	strval2 ="Mobile No *";
	assertTrue(strval.contains(strval2));
	
}




public void SearchMobNoPlaceholder() 
{
	String strval=driver.findElement(By.cssSelector("#phone")).getAttribute("placeholder");
	System.out.println("placeorder mobile number=="+strval);
	strval2 ="Enter your mobile number";
	assertTrue(strval.contains(strval2));

}




//////////////////////////////////////







public void verifyEmailIdPatienttext() throws InterruptedException 
{

	

	strval=driver.findElement(By.xpath("//label[contains(text(),'Email-Id')]")).getText();
	System.out.println("Email-Idtext is "+strval);
	strval2 ="Email-Id";
	assertTrue(strval.contains(strval2));
	
}




public void SearchEmailIdPlaceholder() 
{
	String strval=driver.findElement(By.cssSelector("#email")).getAttribute("placeholder");
	System.out.println("placeorder fullName=="+strval);
	strval2 ="Enter your email";
	assertTrue(strval.contains(strval2));

}



////////////////////////////////





public void verifyAgePatienttext() throws InterruptedException 
{

	

	strval=driver.findElement(By.xpath("//label[contains(text(),'Age')]")).getText();
	System.out.println("Age text is "+strval);
	strval2 ="Age";
	assertTrue(strval.contains(strval2));
	
}




public void SearchAgePlaceholder() 
{
	String strval=driver.findElement(By.cssSelector("#age")).getAttribute("placeholder");
	System.out.println("Enter your age=="+strval);
	strval2 ="Enter your age";
	assertTrue(strval.contains(strval2));

}

//////////////////////////////////////////////////






public void verifyDateOfBirthPatienttext() throws InterruptedException 
{

	

	strval=driver.findElement(By.xpath("//label[contains(text(),'Date Of Birth')]")).getText();
	System.out.println("Date Of Birth text is "+strval);
	strval2 ="Date Of Birth";
	assertTrue(strval.contains(strval2));
	
}




public void SearchDateOfBirthPlaceholder() 
{
	String strval=driver.findElement(By.cssSelector("#dob")).getAttribute("placeholder");
	System.out.println("Enter your age=="+strval);
	strval2 ="Select your date of birth";
	assertTrue(strval.contains(strval2));

}

///////////////////////////////////////////////////







public void verifyGenderPatienttext() throws InterruptedException 
{

	

	strval=driver.findElement(By.xpath("//label[contains(text(),'Gender')]")).getText();
	System.out.println("Gender text is "+strval);
	strval2 ="Gender";
	assertTrue(strval.contains(strval2));
	
}




public void SearchWeightPlaceholder() 
{
	String strval=driver.findElement(By.cssSelector("#weightValue")).getAttribute("placeholder");
	System.out.println("Enter your age=="+strval);
	strval2 ="Weight";
	assertTrue(strval.contains(strval2));

}






public void verifyWeightPatienttext() throws InterruptedException 
{

	

	strval=driver.findElement(By.xpath("//label[contains(text(),'Weight')]")).getText();
	System.out.println("Weight text is "+strval);
	strval2 ="Weight";
	assertTrue(strval.contains(strval2));
	
}

////////////////////////////////










public void verifyHeightPatienttext() throws InterruptedException 
{

	

	strval=driver.findElement(By.xpath("//label[contains(text(),'Height')]")).getText();
	System.out.println("Height text is "+strval);
	strval2 ="Height";
	assertTrue(strval.contains(strval2));
	
}




public void SearchHeightPlaceholder() 
{
	String strval=driver.findElement(By.cssSelector("#hightValue")).getAttribute("placeholder");
	System.out.println("Enter your age=="+strval);
	strval2 ="Height";
	assertTrue(strval.contains(strval2));

}



/////////////////////////////





public void verifyStatePatienttext() throws InterruptedException 
{

	

	strval=driver.findElement(By.xpath("//label[contains(text(),'State')]")).getText();
	System.out.println("State text is "+strval);
	strval2 ="State";
	assertTrue(strval.contains(strval2));
	
}



public void verifyDistrictPatienttext() throws InterruptedException 
{

	

	strval=driver.findElement(By.xpath("//label[contains(text(),'District')]")).getText();
	System.out.println("District text is "+strval);
	strval2 ="District";
	assertTrue(strval.contains(strval2));
	
}







public void verifyCityPatienttext() throws InterruptedException 
{

	

	strval=driver.findElement(By.xpath("//label[contains(text(),'City')]")).getText();
	System.out.println("City text is "+strval);
	strval2 ="City";
	assertTrue(strval.contains(strval2));
	
}


///////////////////////




public void verifySelectDoctorPatienttext() throws InterruptedException 
{

	

	strval=driver.findElement(By.xpath("//label[contains(text(),'Select Doctor')]")).getText();
	System.out.println("Select Doctor text is "+strval);
	strval2 ="Select Doctor";
	assertTrue(strval.contains(strval2));
	
}



public void verifyNotePatienttext() throws InterruptedException 
{

	

	strval=driver.findElement(By.xpath("//label[contains(text(),'Note')]")).getText();
	System.out.println("Note text is "+strval);
	strval2 ="Note";
	assertTrue(strval.contains(strval2));
	
}


public void SearchNotetPlaceholder() 
{
	String strval=driver.findElement(By.cssSelector("#note")).getAttribute("placeholder");
	System.out.println("Enter your note=="+strval);
	strval2 ="Enter your note";
	assertTrue(strval.contains(strval2));

}
///////////////////


public void verifySaveAndBookAppointmentButtonPatienttext() throws InterruptedException 
{

	

	strval=driver.findElement(By.xpath("//button[contains(text(),'Save & Book Appointment')]")).getText();
	System.out.println("Save & Book Appointmente text is "+strval);
	strval2 ="Save & Book Appointment";
	assertTrue(strval.contains(strval2));
	
}


public void verifyAllClearPatienttext() throws InterruptedException 
{

	

	strval=driver.findElement(By.xpath("//button[contains(text(),'All Clear')]")).getText();
	System.out.println("Save & Book Appointmente text is "+strval);
	strval2 ="All Clear";
	assertTrue(strval.contains(strval2));
	
}

///////////////////////////////////////////////////////////////////


// Validation 




public void VerifyWithoutEnterAnyDataAddPatient() throws InterruptedException {
	try {
		this.clickSaveAndBookAddpatientbutton();
		
		WebElement validname=driver.findElement(By.xpath("//span[contains(text(),'Enter valid full name.')]"));
		validname.isDisplayed();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
	
	


public void VerifyWithoutEnterdiseaseAddPatient(String MobNo ) throws InterruptedException {
	try {
		
		this.setSearchPatient(MobNo);
		this.clickSaveAndBookAddpatientbutton();
		
		WebElement validname=driver.findElement(By.xpath("//span[contains(text(),'Enter valid disease name.')]"));
		validname.isDisplayed();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}



public void VerifyWithoutFullNameAddPatient(String MobNo ) throws InterruptedException {

		
		this.setSearchPatient(MobNo);
		Thread.sleep(1000);
		objBaseClass.ClearText("//input[@id='fullName']");
		this.clickSaveAndBookAddpatientbutton();
		Thread.sleep(1000);
		WebElement validname=driver.findElement(By.xpath("//span[contains(text(),'Enter valid full name.')]"));
		validname.isDisplayed();

	
	
}
public void clearAllbutton(String SearchPatient,String FullName,String Disease,String MobNo,String EmailId, String Age,String Gender,String Weight,String Height,String State,String District,String City,String Note) throws InterruptedException {
	this.setSearchPatient(MobNo);
	this.setDiseseOnAddpatient(Disease);
	this.setEmailIdAddpatinetPage(EmailId);
	this.setAgeOnAddpatient(Age);

	this.SelectGender(Gender);
	this.setHeightAddpatient(Height);
	this.setWaightAddpatient(Weight);
	objRegisterpageView.SelectState(State);		
	objRegisterpageView.SelectDist(District);
	objRegisterpageView.SelectCity(City);
	
	this.verifySelectDoctorPatienttext();
	this.setNoteAddpatient(Note);
	this.clickAllClearOnAddpatientbutton();
	
	Thread.sleep(2000);
	//objBaseClass.click("//input[@id='save-book-search']");
	strval=driver.findElement(By.xpath("//input[@id='fullName']")).getText();
	Thread.sleep(2000);
	System.out.println("Mobile number after click on clear button is "+strval);
	strval2 =MobNo;
	assertTrue(!strval.contains(strval2));
	

	
}


public void verifyUpdatingexistingpatienttext(String MobNo) throws InterruptedException 

{
	this.setSearchPatient(MobNo);
	WebElement updtmsg=driver.findElement(By.xpath("//span[@id='updateMsg']"));
	updtmsg.isDisplayed();
	
	objBaseClass.refresh();
	
	this.setSearchPatient("1234561230");
	WebElement updtmsg1=driver.findElement(By.xpath("//span[@id='updateMsg']"));
	
	if(!updtmsg1.isDisplayed()) {
		objBaseClass.refresh();
	
}
}




public void verifyedWeightFormat(String Weight) throws InterruptedException {
	
	this.setWaightAddpatient(Weight);
	objAddpatientPage.selectWeightFormat("kgs");
	
	strval=driver.findElement(By.xpath("//select[@id=\"weightType\"]")).getText();
	Thread.sleep(1000);
	System.out.println("weightType is "+strval);
	strval2 ="kgs";
	assertTrue(strval.contains(strval2));
	
	
	objAddpatientPage.selectWeightFormat("gram");
	
	strval=driver.findElement(By.xpath("//select[@id=\"weightType\"]")).getText();
	Thread.sleep(1000);
	System.out.println("weightType is "+strval);
	strval2 ="gram";
	assertTrue(strval.contains(strval2));
	
	
	objAddpatientPage.selectWeightFormat("pound");
	
	strval=driver.findElement(By.xpath("//select[@id=\"weightType\"]")).getText();
	Thread.sleep(1000);
	System.out.println("weightType is "+strval);
	strval2 ="pound";
	assertTrue(strval.contains(strval2));
	

	
	
	
	
}




public void verifyedHeightFormat(String Height) throws InterruptedException {
	
	

	this.setHeightAddpatient(Height);
	
	objAddpatientPage.selectheightFormat("cms");
	
	strval=driver.findElement(By.xpath("//select[@id=\"hightType\"]")).getText();
	Thread.sleep(1000);
	System.out.println("weightType is "+strval);
	strval2 ="cms";
	assertTrue(strval.contains(strval2));
	
	
   objAddpatientPage.selectheightFormat("inch");
	
	strval=driver.findElement(By.xpath("//select[@id=\"hightType\"]")).getText();
	Thread.sleep(1000);
	System.out.println("weightType is "+strval);
	strval2 ="inch";
	assertTrue(strval.contains(strval2));
	

	 	objAddpatientPage.selectheightFormat("mtr");
		
		strval=driver.findElement(By.xpath("//select[@id=\"hightType\"]")).getText();
		Thread.sleep(1000);
		System.out.println("weightType is "+strval);
		strval2 ="mtr";
		assertTrue(strval.contains(strval2));
		
		
		
		
		
		objAddpatientPage.selectheightFormat("ft");
		
		strval=driver.findElement(By.xpath("//select[@id=\"hightType\"]")).getText();
		Thread.sleep(1000);
		System.out.println("weightType is "+strval);
		strval2 ="ft";
		assertTrue(strval.contains(strval2));
		

}



public void verifyWrongEmail(String MobNo,String FullName,String Disease) throws InterruptedException {
	
	
	
	this.setSearchPatient(MobNo);
	this.setFullname(FullName);
	this.setDiseseOnAddpatient(Disease);
	Thread.sleep(2000);
	
	this.setEmailIdAddpatinetPage("vhs.jdh");
	Thread.sleep(2000);
	objAddpatientPage.clickSaveAndBookAddpatientbutton();
	
	objBaseClass.isdisplayed("//span[contains(text(),'Enter valid email id.')]");
	
	
	
	
	
	
	
	
}





public void verifySearchFunctionality(String keysToSend) {
	objAddpatientPage.setPatientNameInSearcField(keysToSend);
	objBaseClass.isdisplayed("//div[@class='col-lg-2 col-md-3 col-sm-3 col-6 text-center doc-item highlightBox']");
	
}













}
