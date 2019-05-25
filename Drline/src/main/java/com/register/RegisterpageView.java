package com.register;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.login.LoginPage;
import com.main.BaseClass;
import com.main.Log4j;



public class RegisterpageView extends BaseClass {
	LoginPage objLoginPage=new LoginPage();
	BaseClass objBaseClass= new BaseClass();


	String strval=null;
	String strval2=null;
	String strval3=null;
	String strval4=null;

	
	RegisterPage objRegisterPage = new RegisterPage();
	@Test
	public void displayComponent()
	{	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objRegisterPage.clickRegisterlinkHeader();
		objRegisterPage.headerRegister();
		objRegisterPage.hdrDrlineDisplayed();
		objRegisterPage.RegisterlinkIsDisplayed();
		objRegisterPage.CancellinkIsDisplayed();
		//objRegisterPage.clinicNamePlaceholder();
		//objRegisterPage.FirstNamePlaceholder();
		objRegisterPage.LastNamePlaceholder();
	//	objRegisterPage.EmailIdPlaceholder();
	//	objRegisterPage.mobilePlaceholder();
		objRegisterPage.RefrencePlaceholder();
		
		
		
	
	}

	public void clickRegisterlinkHeaderpage()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objRegisterPage.clickRegisterlinkHeader();
		
		
	}
	
	public void setUsernameRegisterPage(String Username)
	{
		objRegisterPage.setUsernameRegisterPage(Username);
	}

	
	public void setFnameameRegisterPage(String Firstname)
	{
		objRegisterPage.setFnameameRegisterPage(Firstname);
	}
	public void setLastNameRegisterPage(String Lastname)
	{
		objRegisterPage.setLastNameRegisterPage(Lastname);
	}
	public void setEmailIdRegisterPage(String EmailId)
	{
		objRegisterPage.setEmailIdRegisterPage(EmailId);
	}
	public void setmobileNoRegisterPage(String MobileNo)
	{
		objRegisterPage.setmobileNoRegisterPage(MobileNo);
	}
	public void setRefferenceRegisterPage(String Referance)
	{
		objRegisterPage.setRefferenceRegisterPage(Referance);
	}
	
	
	
	public void RegisterWithoutAnyField() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		objRegisterPage.ClickRegisterlink();
		strval=	driver.findElement(By.xpath("//span[@id='clinicNameerr']")).getText();		
		System.out.println(strval);
		strval2 ="Please Enter Clinic Name.";
		Assert.assertEquals(strval.contains(strval2), true);
		objBaseClass.refresh();
	}
	
	
	
	
	
	
	public void RegisterWithOnlyUserName(String Username) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		this.setUsernameRegisterPage(Username);
		objRegisterPage.ClickRegisterlink();
		
		
		strval=	driver.findElement(By.xpath("//span[@id='firstNameerr']")).getText();		
		System.out.println(strval);
		strval2 ="Please Enter First Name.";
		Assert.assertTrue(strval.contains(strval2));
		objBaseClass.refresh();
	}
	
	public void RegisterWithWrongFirstname(String Username, String DummyFName ) throws InterruptedException
	{
		objBaseClass.refresh();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		this.setUsernameRegisterPage(Username);
		Thread.sleep(1000);
		this.setFnameameRegisterPage(DummyFName);
		
		
		objRegisterPage.ClickRegisterlink();
		
		
		//strval=	driver.findElement(By.xpath("//span[@id='firstNameerr']")).getText();		
		strval=objBaseClass.getText("//span[@id='firstNameerr']");
		System.out.println(strval);
		strval2 ="Please Enter Valid First Name.";
		Assert.assertTrue(strval.contains(strval2));
		objBaseClass.refresh();
	}
	
	
	
	
	
	public void RegisterWithUserandFirstnameWithLasName(String Username, String Firstname,String Lastname ) throws InterruptedException
	{
		objBaseClass.refresh();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		this.setUsernameRegisterPage(Username);
		Thread.sleep(1000);
		this.setFnameameRegisterPage(Firstname);
		this.setLastNameRegisterPage(Lastname);
		
		objRegisterPage.ClickRegisterlink();
		
		
		strval=	driver.findElement(By.xpath("//span[@id='emailIderr']")).getText();		
		System.out.println(strval);
		strval2 ="Enter Valid Email.";
		assertTrue(strval.contains(strval2));
		objBaseClass.refresh();
	}
	

	public void RegisterWithoutMobile(String Username, String Firstname,String Lastname,String EmailId ) throws InterruptedException
	{
		objBaseClass.refresh();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		this.setUsernameRegisterPage(Username);
		Thread.sleep(1000);
		this.setFnameameRegisterPage(Firstname);
		this.setLastNameRegisterPage(Lastname);
		this.setEmailIdRegisterPage(EmailId);
		
		
		objRegisterPage.ClickRegisterlink();
		
		
		strval=	driver.findElement(By.xpath("//span[@id='contactNoerr']")).getText();		
		System.out.println(strval);
		strval2 ="Please Enter Valid Contact Number.";
		assertTrue(strval.contains(strval2));
		objBaseClass.refresh();
	}
	
	
	
	// wrong last name like last name kjhfdk556565
	public void RegisterWithWrongLastName(String Username, String Firstname,String WrongLastname ) throws InterruptedException
	{
		objBaseClass.refresh();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		this.setUsernameRegisterPage(Username);
		Thread.sleep(1000);
		this.setFnameameRegisterPage(Firstname);
		this.setLastNameRegisterPage(WrongLastname);
		
		objRegisterPage.ClickRegisterlink();
		
		
		strval=	driver.findElement(By.xpath("//span[@id='lastNameerr']")).getText();		
		System.out.println(strval);
		strval2 ="Please Enter Valid Last Name.";
		assertTrue(strval.contains(strval2));
		objBaseClass.refresh();
	}
	
	public void RegisterWithWrongEmail(String Username, String Firstname,String Lastname,String EmailId ) throws InterruptedException
	{
		objBaseClass.refresh();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		this.setUsernameRegisterPage(Username);
		Thread.sleep(1000);
		this.setFnameameRegisterPage(Firstname);
		this.setLastNameRegisterPage(Lastname);
		this.setEmailIdRegisterPage(EmailId);
		
		
		objRegisterPage.ClickRegisterlink();
		
		
		strval=	driver.findElement(By.xpath("//span[@id='emailIderr']")).getText();		
		System.out.println(strval);
		strval2 ="Enter Valid Email.";
		assertTrue(strval.contains(strval2));
		objBaseClass.refresh();
	}
	

	public void RegisterWithWrongMobile(String Username, String Firstname,String Lastname,String EmailId ,String MobileNo) throws InterruptedException
	{
		objBaseClass.refresh();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		this.setUsernameRegisterPage(Username);
		Thread.sleep(1000);
		this.setFnameameRegisterPage(Firstname);
		this.setLastNameRegisterPage(Lastname);
		this.setEmailIdRegisterPage(EmailId);
		this.setmobileNoRegisterPage(MobileNo);
		
		
		objRegisterPage.ClickRegisterlink();
		
		
		strval=	driver.findElement(By.xpath("//span[@id='contactNoerr']")).getText();		
		System.out.println(strval);
		strval2 ="Please Enter Valid Contact Number.";
		assertTrue(strval.contains(strval2));
		objBaseClass.refresh();
	}
	public void RegisterClinic(String Username, String Firstname,String Lastname,String EmailId ,String MobileNo) throws InterruptedException
	{

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		this.setUsernameRegisterPage(Username);
		Thread.sleep(1000);
		this.setFnameameRegisterPage(Firstname);
		Thread.sleep(1000);
		this.setLastNameRegisterPage(Lastname);
		Thread.sleep(1000);
		this.setEmailIdRegisterPage(EmailId);
		Thread.sleep(1000);
		this.setmobileNoRegisterPage(MobileNo);
		Thread.sleep(1000);
		objRegisterPage.ClickRegisterlink();
		
	}
	public void CancelRegisterClinic(String Username, String Firstname,String Lastname,String EmailId ,String MobileNo) throws InterruptedException
	{
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		this.setUsernameRegisterPage(Username);
		Thread.sleep(1000);
		this.setFnameameRegisterPage(Firstname);
		Thread.sleep(1000);
		this.setLastNameRegisterPage(Lastname);
		Thread.sleep(1000);
		this.setEmailIdRegisterPage(EmailId);
		Thread.sleep(1000);
		this.setmobileNoRegisterPage(MobileNo);
		Thread.sleep(1000);
		objRegisterPage.ClickCancellink();
		
	}
	


	public void SelectState(String State) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objRegisterPage.SelectState(State);
	}

	public void SelectDist(String Dist) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	objRegisterPage.SelectDist(Dist);
	
	}

	public void SelectCity(String City) throws InterruptedException
	{	
		
	objRegisterPage.SelectCity(City);

	
	}
	



public void address(String Address)
{
WebElement addres=driver.findElement(By.xpath("//input[@id='addressLine1']"));
addres.sendKeys(Address);
}


public void verifiedClinicName(String ClinicName) throws InterruptedException 
{
	Thread.sleep(2000);
	strval=driver.findElement(By.xpath("//input[@id='name']")).getAttribute("value");

	
	System.out.println("Clinic name is "+strval);
	strval2 =ClinicName;
	Assert.assertTrue(strval.contains(strval2));
}


public void verifiedFirstName(String Firstname) throws InterruptedException 
{
	Thread.sleep(2000);
	strval=driver.findElement(By.xpath("//input[@id='fname']")).getAttribute("value");

	
	System.out.println("First name is "+strval);
	strval2 =Firstname;
	Assert.assertTrue(strval.contains(strval2));
}



public void verifiedLastName(String Lastname) throws InterruptedException 
{
	Thread.sleep(2000);
	strval=driver.findElement(By.xpath("//input[@id='lname']")).getAttribute("value");

	
	System.out.println("Last name is "+strval);
	strval2 =Lastname;
	Assert.assertTrue(strval.contains(strval2));
}
public void verifiedContact(String MobileNo) throws InterruptedException 
{
	Thread.sleep(2000);
	strval=driver.findElement(By.xpath("//input[@id='contactNo1']")).getAttribute("value");

	
	System.out.println("MobileNo is "+strval);
	strval2 =MobileNo;
	Assert.assertTrue(strval.contains(strval2));
}

public void verifiedemailId(String EmailId) throws InterruptedException 
{
	Thread.sleep(2000);
	strval=driver.findElement(By.xpath("//input[@id='emailId']")).getAttribute("value");

	
	System.out.println("emailId is "+strval);
	strval2 =EmailId;
	Assert.assertTrue(strval.contains(strval2));
}


public void verifiedAddress(String Address) throws InterruptedException 
{
	Thread.sleep(2000);
	strval=driver.findElement(By.xpath("//input[@id='addressLine1']")).getAttribute("value");

	
	System.out.println("address is "+strval);
	strval2 =Address;
	Assert.assertTrue(strval.contains(strval2));
}
	


public void verifiedCity(String City) throws InterruptedException 
{
	Thread.sleep(2000);
	
	
	WebElement drp = driver.findElement(By.xpath("//select[@id='cityId']"));
	 Select sel = new Select(drp); 
	 
     strval=sel.getFirstSelectedOption().getText();
	System.out.println("City is "+strval);
	strval2 =City;
	Assert.assertTrue(strval.contains(strval2));
}


public void verifiedDist(String Dist) throws InterruptedException 
{
	Thread.sleep(2000);
	
	
	WebElement drp = driver.findElement(By.xpath("//select[@id='districtId']"));
	 Select sel = new Select(drp); 
	 
     strval=sel.getFirstSelectedOption().getText();
	System.out.println("Dist is "+strval);
	strval2 =Dist;
	Assert.assertTrue(strval.contains(strval2));
}



public void verifiedState(String State) throws InterruptedException 
{
	Thread.sleep(2000);
	//strval=driver.findElement(By.xpath("//input[@id='cityId']")).getAttribute("value");
	
	WebElement drp = driver.findElement(By.xpath("//select[@id='stateId']"));
	 Select sel = new Select(drp); 
	 
     strval=sel.getFirstSelectedOption().getText();
	System.out.println("State is "+strval);
	strval2 =State;
	Assert.assertTrue(strval.contains(strval2));
}


public void verifyclinicNameFieldstext() {
	
	  strval=driver.findElement(By.xpath("//label[contains(text(),'Clinic Name')]")).getText();
	  System.out.println("Clinic name is"+ strval);
	  strval2 ="Clinic Name*";
	  Assert.assertTrue(strval.contains(strval2));
}


public void verifyFirstnameNameFieldstext() {
	
	  strval=driver.findElement(By.xpath("//label[contains(text(),'First Name')]")).getText();
	  System.out.println("First name is"+ strval);
	  strval2 ="First Name*";
	  Assert.assertTrue(strval.contains(strval2));
}


public void verifylastNameNameFieldstext() {
	
	  strval=driver.findElement(By.xpath("//label[contains(text(),'Last Name')]")).getText();
	  System.out.println("Last name is"+ strval);
	  strval2 ="Last Name";
	  Assert.assertTrue(strval.contains(strval2));
}





public void verifyEmailIdFieldstext() {
	
	  strval=driver.findElement(By.xpath("//label[contains(text(),'Email Id')]")).getText();
	  System.out.println("Email is"+ strval);
	  strval2 ="Email Id";
	  Assert.assertTrue(strval.contains(strval2));
}


public void verifyContactNoFieldstext() {
	
	  strval=driver.findElement(By.xpath("//label[contains(text(),'Contact No')]")).getText();
	  System.out.println("Contact No  is"+ strval);
	  strval2 ="Contact No*";
	  Assert.assertTrue(strval.contains(strval2));
}


public void verifyStateFieldstext() {
	
	  strval=driver.findElement(By.xpath("//label[contains(text(),'State')]")).getText();
	  System.out.println("State  is"+ strval);
	  strval2 ="State*";
		Assert.assertEquals("Verified State text is displayedt", strval2, strval);
}


public void verifySDistrictFieldstext() {
	
	  strval=driver.findElement(By.xpath("//label[contains(text(),'District')]")).getText();
	  System.out.println("District  is"+ strval);
	  strval2 ="District*";
	  Assert.assertTrue(strval.contains(strval2));
}


public void verifyCityFieldstext() {
	
	  strval=driver.findElement(By.xpath("//label[contains(text(),'City')]")).getText();
	  System.out.println("City  is=="+ strval);
	  strval2 ="City*";
	  Assert.assertTrue(strval.contains(strval2));
}


public void verifyAddressFieldstext() {
	
	  strval=driver.findElement(By.xpath("//label[contains(text(),'Address')]")).getText();
	  System.out.println("Address  is"+ strval);
	  strval2 ="Address*";
	  Assert.assertTrue(strval.contains(strval2));
}

public void ClickAdminDetailNextButton() {
	objRegisterPage.ClickAdminDetailNextButton();
}



public void AdminDetailNextButtonisDisplayed() {
	WebElement  element=driver.findElement(By.xpath("//button[@id='nextBtn']"));
	element.isDisplayed();
	element.isEnabled();
	
}



public void verifyStep_1Fieldstext() {
	
	  strval=driver.findElement(By.xpath("//div[contains(text(),'Step 1')]")).getText();
	  System.out.println("Step 1  is"+ strval);
	  strval2 ="Step 1";
		Assert.assertTrue(strval.contains(strval2));
}


public void verifyStep_2Fieldstext() {
	
	  strval=driver.findElement(By.xpath("//div[contains(text(),'Step 2')]")).getText();
	  System.out.println("Step 2  is"+ strval);
	  strval2 ="Step 2";
	  Assert.assertTrue(strval.contains(strval2));
}

public void verifyStep_3Fieldstext() {
	
	  strval=driver.findElement(By.xpath("//div[contains(text(),'Step 3')]")).getText();
	  System.out.println("Step 3  is"+ strval);
	  strval2 ="Step 3";
	  Assert.assertTrue(strval.contains(strval2));
}

public void verifyStep_4Fieldstext() {
	
	  strval=driver.findElement(By.xpath("//div[contains(text(),'Step 4')]")).getText();
	  System.out.println("Step 4  is"+ strval);
	  strval2 ="Step 4";
	  Assert.assertTrue(strval.contains(strval2));
}

public void verifyStep_5Fieldstext() {
	
	  strval=driver.findElement(By.xpath("//div[contains(text(),'Step 5')]")).getText();
	  System.out.println("Step 5  is"+ strval);
	  strval2 ="Step 5";
	  Assert.assertTrue(strval.contains(strval2));
}



public void hdrClinic_AdminDetailsisDisplayed() {
	WebElement  element=driver.findElement(By.xpath("//h4[contains(text(),'Clinic / Admin Details')]"));
	element.isDisplayed();
	
	
}


public void verifyClinic_AdminDetailsFieldstext() {
	
	  strval=driver.findElement(By.xpath("//h4[contains(text(),'Clinic / Admin Details')]")).getText();
	  System.out.println("Step 5  is"+ strval);
	  strval2 ="Clinic / Admin Details";
		Assert.assertEquals("Verified Clinic / Admin Details text is displayedt", strval2, strval);
}



public void hdrPaymentaAceptanceModeisDisplayed() {
	WebElement  element=driver.findElement(By.xpath("//h4[contains(text(),'Payment acceptance Mode In Clinic')]"));
	element.isDisplayed();
	
	
}


public void verifyWithoutStaeOnStep1() throws InterruptedException
{
	objRegisterPage.ClickAdminDetailNextButton();
	Thread.sleep(1000);	
	objRegisterPage.verifyWithoutStateOnStep1();
	objBaseClass.refresh();
	
	
}



public void verifyWithoutDistOnStep1(String State) throws InterruptedException
{
	
	objRegisterPage.SelectState(State);
	objRegisterPage.ClickAdminDetailNextButton();
	Thread.sleep(1000);	
	objRegisterPage.verifyWithoutDistOnStep1();
	objBaseClass.refresh();
	
}

public void verifyWithoutCityOnStep1(String State,String Dist ) throws InterruptedException
{
	objRegisterPage.SelectState(State);
	objRegisterPage.SelectDist(Dist);
	objRegisterPage.ClickAdminDetailNextButton();
	Thread.sleep(1000);	
	objRegisterPage.verifyWithoutCityOnStep1();
	objBaseClass.refresh();
	
}


public void verifyWithoutAddressOnStep1(String State,String Dist,String City ) throws InterruptedException
{

	

	
	objRegisterPage.SelectState(State);
	objRegisterPage.SelectDist(Dist);
	objRegisterPage.SelectCity(City);
	
	//objBaseClass.ClearText("//input[@id='name']");
	
	objRegisterPage.ClickAdminDetailNextButton();
	Thread.sleep(1000);	
	objRegisterPage.verifyWithoutAddressOnStep1();
	
	
	
		
	
}

public void verifyClinicnameOnStep1() throws InterruptedException
{

	objBaseClass.ClearText("//input[@id='name']");
	
	objRegisterPage.ClickAdminDetailNextButton();
	Thread.sleep(1000);	
	
	 strval=driver.findElement(By.xpath("//span[@id='clinicNameerr']")).getText();
	 System.out.println("Clinic eror is"+strval);
	 strval2 ="Enter Clinic Name.";
	 org.testng.Assert.assertTrue(strval.contains(strval2));
		objBaseClass.refresh();
	
	
}


public void verifyWithoutFirstnameOnStep1() throws InterruptedException
{

	objBaseClass.ClearText("//input[@id='fname']");
	
	objRegisterPage.ClickAdminDetailNextButton();
	Thread.sleep(1000);	
	
	 strval=driver.findElement(By.xpath("//span[@id='firstNameerr']")).getText();
	 System.out.println("First name eror is"+strval);
	 strval2 ="Please Enter First Name";
	 Assert.assertTrue(strval.contains(strval2));
		
	 
	/* Thread.sleep(1000);	
	 String xpath="//input[@id='fname']";
	 objBaseClass.setText(xpath, "Giri vijay");
	 objRegisterPage.ClickAdminDetailNextButton();
	 Thread.sleep(1000);
	 strval=driver.findElement(By.xpath("//span[@id='firstNameerr']")).getText();
	 System.out.println("First name eror is"+strval);
	 strval2 ="Please Enter Valid First Name.";
	 
	 Assert.assertEquals("Verified Please Enter First Name. text", strval2, strval);
*/
	 objBaseClass.refresh();
	
	
}


public void verifyWithoutContactNumberOnStep1() throws InterruptedException
{

	objBaseClass.ClearText("//input[@id='contactNo1']");
	
	objRegisterPage.ClickAdminDetailNextButton();
	Thread.sleep(1000);	
	
	 strval=driver.findElement(By.xpath("//span[@id='contactNoerr']")).getText();
	 System.out.println("First name eror is"+strval);
	 strval2 ="Please Enter Valid Contact Number.";
	 Assert.assertTrue(strval.contains(strval2));
		
	 Thread.sleep(1000);	
	 String xpath="//input[@id='contactNo1']";
	 objBaseClass.setText(xpath, "88888");
	 objRegisterPage.ClickAdminDetailNextButton();
		
	 Thread.sleep(1000);	
	 strval3=driver.findElement(By.xpath("//span[@id='contactNoerr']")).getText();
	 System.out.println("First name eror is"+strval);
	 strval4 ="Please Enter Valid Contact Number.";
	 Assert.assertTrue(strval3.contains(strval4));

	 objBaseClass.refresh();
	
}





public void hdrPaymentMode()
{
	objRegisterPage.hdrPaymentMode();
}


public void PaymentModeCheckboxOfCash() throws InterruptedException
{
	objRegisterPage.PaymentModeCheckboxOfCash();
	System.out.println("Cash button is altready selected");
}


public void PaymentModeCheckboxOfonline()
{
	objRegisterPage.PaymentModeCheckboxOfOnline();
	System.out.println("Online checkbos is selecteed");
	
}


public void PaymentModeCheckboxOfchechbook()
{
	objRegisterPage.PaymentModeCheckboxOfchechbook();
	System.out.println("Online checkbos is selecteed");
	
}


public void SelectLicence()
{
	objRegisterPage.SelectLicenceMode();
	
}
public void verifyLicenceModeText() {
	
	
	 strval=driver.findElement(By.xpath("//label[contains(text(),'License Mode')]")).getText();
	 System.out.println("License Mode  is"+strval);
	 strval2 ="License Mode*";
	 Assert.assertTrue(strval.contains(strval2));
	
}


public void SelectClinicType(String ClinicType1) throws InterruptedException
{
	objRegisterPage.SelectSClinictype(ClinicType1);
	
}

public void verifyClinicType(String ClinicType1) {
	
	

	
	WebElement drp = driver.findElement(By.xpath("//select[@id='clinicTypeId']"));
	 Select sel = new Select(drp); 
	 
     strval=sel.getFirstSelectedOption().getText();
	System.out.println("Clinic  is "+strval);
	strval2 =ClinicType1;
	Assert.assertTrue(strval.contains(strval2));
}


public void ClickPREVButtonOnPaymentModePage() {
	objRegisterPage.ClickPREVButtonOnPaymentModePage();
}


public void PREVButtonOnPaymentModePageisDisplayed() {
	objRegisterPage.PREVButtonOnPaymentModePageisDisplayed();
}


public void NextButtonOnPaymentModePageisDisplayed() {
	objRegisterPage.NextButtonOnPaymentModePageisDisplayed();
}



public void ClickNextButtonOnPaymentModePage() {
	objRegisterPage.ClickNextButtonOnPaymentModePage();
}





public void hdrModuleSectionAndBillingisDisplayed() {
	WebElement  element=driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/div/div/h4[1]"));
	element.isDisplayed();
	
	
}


public void verifymoduleSectionTextOnmoduleSectionAndBillingPage() {
	
	
	 strval=driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/form/div[1]/div[1]/h3")).getText();
	 System.out.println("module Section is"+strval);
	 strval2 ="Module Selection";
		assertTrue(strval.contains(strval2));
	
}



public void hdrInoviceheader() {
	 strval=driver.findElement(By.xpath("//div[@class='invoice']")).getText();
	 System.out.println("module  invoice is"+strval);
	 System.out.println(strval);
	 strval2 ="Invoice";
	 assertTrue(strval.contains(strval2));
	
	 
}


public void checkboxClinicModuleAndBilling() throws InterruptedException
{
	objRegisterPage.checkboxClinicModuleAndBilling();
	System.out.println("Clinic checkbox is altready selected");
}




public void checkboxWebSiteModuleAndBillingisDisplayed() throws InterruptedException
{
	objRegisterPage.checkboxClinicModuleAndBilling();
	
}



public void SelectcheckboxWebSiteModuleAndBilling() throws InterruptedException
{
	objRegisterPage.SelectcheckboxWebSiteModuleAndBilling();
	
}




public void checkboxAdvertiesmentModuleAndBillingisDisplayed()
{
	objRegisterPage.checkboxAdvertiesmentModuleAndBillingisDisplayed();
	
}



public void SelectcheckboxAdvertiesmentModuleAndBilling()
{
	objRegisterPage.SelectcheckboxAdvertiesmentModuleAndBilling();
	
}


public void PREVButtononModuleAndBillingIsDisplayed()
{
	objRegisterPage.PREVButtononModuleAndBillingIsDisplayed();
	
}



public void ClickPREVButtononModuleAndBilling()
{
	objRegisterPage.ClickPREVButtononModuleAndBilling();
	
}


public void NextButtononModuleAndBillingIsDisplayed()
{
	objRegisterPage.NextButtononModuleAndBillingIsDisplayed();
	
}



public void ClickNextButtononModuleAndBilling()
{
	objRegisterPage.ClickNextButtononModuleAndBilling();
	
}

public void verifyClinicCost() throws InterruptedException 
{
	Thread.sleep(2000);
	//strval=driver.findElement(By.xpath("//div[@class='form-check col-sm-12  col-lg-6'][1]")).getAttribute("value");
	strval=driver.findElement(By.xpath("//div[@class='form-check col-sm-12  col-lg-6'][1]")).getText();
	
	System.out.println("Clinic Value is "+strval);
	strval2 ="7,500.00";
	//Assert.assertEquals("Verified Clinic name is correct", strval2, strval);
	assertTrue(strval.contains(strval2));
	
}


public void verifyWebSiteCost() throws InterruptedException 
{
	Thread.sleep(2000);
	
	strval=driver.findElement(By.xpath("//div[@class='form-check col-sm-12  col-lg-6'][2]")).getText();
	
	System.out.println("Websitec Value is "+strval);
	strval2 ="2,500.00";

	assertTrue(strval.contains(strval2));
	
}

public void verifyTotalCostWithoutWebsiteAndAdvertisement() throws InterruptedException 
{
	Thread.sleep(2000);
	strval=driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/form/div[1]/div[2]/div[3]/div[4]")).getText();
	System.out.println("Total Cost  is "+strval);
	strval2 ="8,850.00";
	assertTrue(strval.contains(strval2));
	
}



public void verifyTotalCostWithWebsite() throws InterruptedException 
{
	this.SelectcheckboxWebSiteModuleAndBilling();
	Thread.sleep(2000);
	strval=driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/form/div[1]/div[2]/div[3]/div[4]")).getText();
	System.out.println("Total Cost  is "+strval);
	strval2 ="8968.00";
	assertTrue(strval.contains(strval2));
	
}




public void verifyTotalCostWithWebsiteAndOnlyOneMonthAdver() throws InterruptedException 
{

	this.SelectcheckboxAdvertiesmentModuleAndBilling();
	Thread.sleep(2000);
	strval=driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/form/div[1]/div[2]/div[3]/div[4]")).getText();
	System.out.println("Total Cost  is "+strval);
	strval2 ="8968.00";
	assertTrue(strval.contains(strval2));
	
}

public void Select_2_Advertisemonth() throws InterruptedException {
	String MonthofAdvertise="2 Month";
	
	objRegisterPage.SelectMonthAdvertisement(MonthofAdvertise);
}




public void Select_3_Advertisemonth() throws InterruptedException {
	String MonthofAdvertise="3 Month";
	
	objRegisterPage.SelectMonthAdvertisement(MonthofAdvertise);
}


public void verifyTotalCostWithWebsiteAndAdver_2_Month() throws InterruptedException 
{
	objRegisterPage.SelectcheckboxAdvertiesmentModuleAndBilling();
	this.Select_2_Advertisemonth();
	
	Thread.sleep(2000);
	strval=driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/form/div[1]/div[2]/div[3]/div[4]")).getText();
	System.out.println("Total Cost  is "+strval);
	strval2 ="9086.00";
	assertTrue(strval.contains(strval2));
	
}


public void verifyTotalCostWithWebsiteAndAdver_3_Month() throws InterruptedException 
{
	objRegisterPage.SelectcheckboxAdvertiesmentModuleAndBilling();
	this.Select_3_Advertisemonth();
	
	Thread.sleep(2000);
	strval=driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/form/div[1]/div[2]/div[3]/div[4]")).getText();
	System.out.println("Total Cost  is "+strval);
	strval2 ="9145.00";
	assertTrue(strval.contains(strval2));
	
}


public void hdrSMSSettingRegisterisDisplayed() {
	  WebElement hdrSmaSetting= driver.findElement(By.xpath("//h4[contains(text(),'SMS Setting')]"));
	
	  hdrSmaSetting.isDisplayed();
	 
}

public void verifyTDoYouWantSMSServicesText() throws InterruptedException 
{

	Thread.sleep(2000);
	strval=driver.findElement(By.xpath("/html/body/div/div[3]/div/div/form/div/div[1]/div[1]/div[1]")).getText();
	System.out.println("SMS Text "+strval);
	strval2 ="Do you want sms services ?";
	assertTrue(strval.contains(strval2));
	
}



public void SelectcheckboxSMSServiceisDisplayed()
{
	objRegisterPage.SelectcheckboxSMSServiceisDisplayed();
	
}



public void SelectcheckboxSMSService()
{
	objRegisterPage.SelectcheckboxSMSService();
	
}


public void verifyTotalCostWithoutSMSServices() throws InterruptedException 
{

	Thread.sleep(1000);
	strval=driver.findElement(By.xpath("/html/body/div/div[3]/div/div/form/div/div[1]/div[2]/div[3]/div[3]")).getText();
	System.out.println("Total Cost  is "+strval);
	strval2 ="9,145.00";
	assertTrue(strval.contains(strval2));
	
}

public void SenderIdTextFieldEnaBled() {
	objRegisterPage.SenderIdTextFieldEnaBled();
}
public void SetSenderIdText(String SenderId) {
	objRegisterPage.SetSenderIdText(SenderId);

}



public void SetSMSQTY(String QTY) throws InterruptedException {
	
	objRegisterPage.SetSMSQTY(QTY);
}


public void ClearSMSQTY() {
	
	objRegisterPage.ClearSMSQTY();
}


public void AnySiXCharPlaceholder() {
	objRegisterPage.AnySiXCharPlaceholder();
}


public void SMSQTYPlaceholder() {
	objRegisterPage.SMSQTYPlaceholder();
}

public void SMSRateinPaisa() {
	objRegisterPage.SMSRateinPaisa();
}



public void TotalInRsWithoutAnySMS() {
	objRegisterPage.TotalInRsWithoutAnySMS();
}


public void SMSQTYTextDisplayed() {
	objRegisterPage.SMSQTYTextDisplayed();
}

public void RateInPaisaDisplayed() {
	objRegisterPage.RateInPaisaDisplayed();
}



public void TotalInRSDisplayed() {
	objRegisterPage.TotalInRSDisplayed();
}



public void SenderIDDisplayed() {
	objRegisterPage.SenderIDDisplayed();
}



public void Noteisplayed() {
	objRegisterPage.Noteisplayed();
}


public void VerifiedSMSRateFor(String QTY) throws InterruptedException 
{
	objRegisterPage.SetSMSQTY(QTY);
	
	
}


public void VerifiedSMSRateFor100() throws InterruptedException {

	
	
	Thread.sleep(2000);
	strval3=driver.findElement(By.xpath("/html/body/div/div[3]/div/div/form/div/div[1]/div[2]/div[3]/div[3]")).getText();
	System.out.println("Total Cost  is "+strval3);
	strval4 ="9162.70";
	assertTrue(strval3.contains(strval4));
	
	objRegisterPage.ClearSMSQTY();


	
}

public void VerifiedSMSRateFor1000() throws InterruptedException {

	
	Thread.sleep(2000);
	strval3=driver.findElement(By.xpath("/html/body/div/div[3]/div/div/form/div/div[1]/div[2]/div[3]/div[3]")).getText();
	System.out.println("Total Cost  is "+strval3);
	strval4 ="9322.00";
	assertTrue(strval3.contains(strval4));

}



public void PREVButtonOnSMSSettingisplayed()
{
	objRegisterPage.PREVButtonOnSMSSettingisplayed();
	
	
}


public void ClickPREVButtonOnSMSSettingpage()
{
	objRegisterPage.ClickPREVButtonOnSMSSettingage();
}





public void hdrBillingInoviceClinicDetailsConfirmDetailPage()
{
	objRegisterPage.hdrBillingInoviceClinicDetailsConfirmDetailPage();
	
}

public void ClickNextButtononSMSSettingpage()
{
	objRegisterPage.ClickNextButtononSMSSettingpage();
	
}


public void ClinicDetailsConfirmDetailPage(String ClinicName,String Firstname,String Lastname,String EmailId,String MobileNo ) 
{
	
	objRegisterPage.ClinicNameClinicDetailsConfirmDetailPage(ClinicName);
	objRegisterPage.FirstnameClinicDetailsConfirmDetailPage(Firstname);
	objRegisterPage.EmailIdClinicDetailsConfirmDetailPage(EmailId);
	objRegisterPage.MobileNoClinicDetailsConfirmDetailPage(MobileNo);
	
}

public void BillingInoviceClinicDetailsConfirmDetailPag() {
	objRegisterPage.CliniCBillingInoviceClinicDetailsConfirmDetailPage(" 1,999.00");
	objRegisterPage.WebSiteBillingInoviceClinicDetailsConfirmDetailPage(" 1,999.00");
	
}




public void LicenceModeClinicDetailsConfirmDetailPag() throws InterruptedException {

	
	Thread.sleep(2000);
	strval3=driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div[1]/div/div[3]/div/div/div/div/div[1]")).getText();
	System.out.println("Total Cost  is "+strval3);
	strval4 ="License";
	assertTrue(strval3.contains(strval4));

}


public void SubmitButtonBillingInoviceClinicDetailsConfirmDetailPageisDisplayed()
{
	objRegisterPage.SubmitButtonBillingInoviceClinicDetailsConfirmDetailPageisDisplayed();
	
}

public void ClickSubmitButtonBillingInoviceClinicDetailsConfirmDetailPage()
{
	objRegisterPage.ClickSubmitButtonBillingInoviceClinicDetailsConfirmDetailPage();
	
}


public void PaymentRegisterPage(String ClinicName,String EmailId,String MobileNo ) 
{
	
	objRegisterPage.ClinicNameClinicDetailsConfirmDetailPage(ClinicName);
	objRegisterPage.EmailIdClinicDetailsConfirmDetailPage(EmailId);
	objRegisterPage.MobileNoClinicDetailsConfirmDetailPage(MobileNo);
	
}



public void PayLaterButtonisDisplayed()
{
	objRegisterPage.PayLaterButtonisDisplayed();
	
}

public void ClickPayLaterButton()
{
	objRegisterPage.ClickPayLaterButton();
	
}





public void PayButtonisDisplayed()
{
	objRegisterPage.PayButtonisDisplayed();
	
}

public void ClickPayButton()
{
	objRegisterPage.ClickPayButton();
	
}

public void ClickHereToLogin() {
	objBaseClass.click("//*[@id=\"example_wrapper\"]/div[2]/div/a");
}
























}








