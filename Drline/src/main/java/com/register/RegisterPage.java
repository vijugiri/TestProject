package com.register;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.login.LoginPage;
import com.main.BaseClass;



public class RegisterPage extends BaseClass
{

	BaseClass objBaseClass= new BaseClass();
	LoginPage objLoginPage=new LoginPage();
	

	String strval=null;
	String strval2=null;

public void headerRegister() 
{
	objLoginPage.HeaderRegisterIsDisplayed();
}


public void clickRegisterlinkHeader() 
{
	objLoginPage.ClickHeaderRegisterLink();
}

public void hdrDrlineDisplayed()
{
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div[2]/div/h2")).isDisplayed();
}

public void RegisterlinkIsDisplayed()
{
	driver.findElement(By.xpath("//button[@id='register']")).isDisplayed();
}


public void ClickRegisterlink() throws InterruptedException
{
	
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("javascript:window.scrollBy(120,38.38)");
	Thread.sleep(2000);	
	objBaseClass.mouseHover("//button[@id='register']");
	
	/*WebElement  element=driver.findElement(By.xpath("//button[@id='register']"));   
	JavascriptExecutor ex=(JavascriptExecutor)driver;
	  ex.executeScript("arguments[0].click()", element);*/
}


public void CancellinkIsDisplayed()
{
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div[2]/div/form/div[7]/a")).isDisplayed();
}

public void ClickCancellink()
{
	WebElement  element=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div[2]/div/form/div[7]/a"));   
	JavascriptExecutor ex=(JavascriptExecutor)driver;
	  ex.executeScript("arguments[0].click()", element);
}

public void clinicNamePlaceholder() 
{
	String strval=driver.findElement(By.cssSelector("#menu1 > div > form > div:nth-child(1) > label")).getAttribute("placeholder");
	System.out.println("cplace prder clinic name=="+strval);
	strval2 ="Clinic Name";
	Assert.assertEquals("Verified Clinic name place value", strval2, strval);

}	

public void FirstNamePlaceholder() 
{
	String strval=driver.findElement(By.cssSelector("#firstName")).getAttribute("placeholder");
	System.out.println("place order First name=="+strval);
	strval2 ="First Name";
	Assert.assertEquals("Verified First Name place value", strval2, strval);

}	



public void LastNamePlaceholder() 
{
	String strval=driver.findElement(By.cssSelector("#lastName")).getAttribute("placeholder");
	System.out.println("placeorder Last name=="+strval);
	strval2 ="Last Name";
	assertTrue(strval.contains(strval2));

}	



public void EmailIdPlaceholder() 
{
	String strval=driver.findElement(By.cssSelector("#emailId")).getAttribute("placeholder");
	System.out.println("placeorder Email id =="+strval);
	strval2 ="Email Id";
	Assert.assertEquals("Verified EmailId place value", strval2, strval);

}	


public void mobilePlaceholder() 
{
	String strval=driver.findElement(By.cssSelector("#contactNo1")).getAttribute("placeholder");
	System.out.println("placeorder mobile =="+strval);
	strval2 ="Mobile Number";
	Assert.assertEquals("Verified Mobile Number place value", strval2, strval);

}	

public void RefrencePlaceholder() 
{
	String strval=driver.findElement(By.cssSelector("#referanceBy")).getAttribute("placeholder");
	System.out.println("placeorder reference =="+strval);
	strval2 ="Reference Number";
	assertTrue(strval.contains(strval2));
	

}	


public void setUsernameRegisterPage(String Username)
{
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys(Username);
}



public void setFnameameRegisterPage(String Firstname)
{
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(Firstname);
}


public void setLastNameRegisterPage(String Lastname)
{
	driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(Lastname);
}


public void setEmailIdRegisterPage(String EmailId)
{
	driver.findElement(By.xpath("//input[@id='emailId']")).sendKeys(EmailId);
}

public void setmobileNoRegisterPage(String MobileNo)
{
	driver.findElement(By.xpath("//input[@id='contactNo1']")).sendKeys(MobileNo);
}



public void setRefferenceRegisterPage(String Referance)
{
	driver.findElement(By.xpath("//input[@id='referanceBy']")).sendKeys(Referance);
}




public void SelectState(String State) throws InterruptedException
{	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Select state = new Select(driver.findElement(By.xpath("//select[@id='stateId']")));
	state.selectByVisibleText(State);
}

public void SelectDist(String Dist) throws InterruptedException
{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Select dist = new Select(driver.findElement(By.xpath("//select[@id='districtId']")));
	dist.selectByVisibleText(Dist);
}

public void SelectCity(String City) throws InterruptedException
{	
	Select city = new Select(driver.findElement(By.xpath("//select[@id='cityId']")));
	city.selectByVisibleText(City);
}


public void ClickAdminDetailNextButton()
{
	
	
	WebElement  element=driver.findElement(By.xpath("//button[@id='nextBtn']"));   
	JavascriptExecutor ex=(JavascriptExecutor)driver;
	  ex.executeScript("arguments[0].click()", element);
}





public void verifyWithoutStateOnStep1() {
	
	  strval=driver.findElement(By.xpath("//span[@id='stateIderr']")).getText();
	  System.out.println("State is"+strval);
	  strval2 ="Please Select State.";
	
	  Assert.assertTrue(strval.contains(strval2));
}






public void verifyWithoutDistOnStep1() {

	  strval=driver.findElement(By.xpath("//span[@id='districtIderr']")).getText();
	  System.out.println("dist is"+strval);
	  strval2 ="Please Select District.";
	  Assert.assertTrue(strval.contains(strval2));
}




public void verifyWithoutCityOnStep1() {
	
	  strval=driver.findElement(By.xpath("//span[@id='cityIderr']")).getText();
	  System.out.println("city is"+strval);
	  strval2 ="Please Select City.";
	  Assert.assertTrue(strval.contains(strval2));
}





public void verifyWithoutAddressOnStep1() {
	
	  strval=driver.findElement(By.xpath("//span[@id='addressLine1err']")).getText();
	  System.out.println("Address eror is"+strval);
	  strval2 ="Enter Valid Address.";
	  Assert.assertTrue(strval.contains(strval2));
			
}



public void hdrPaymentMode()
{
	driver.findElement(By.xpath("//h4[contains(text(),'Payment acceptance Mode In Clinic')]")).isDisplayed();
}



public void PaymentModeCheckboxOfCash() throws InterruptedException
{
	//WebElement chk=driver.findElement(By.xpath("//*[@id=\"clinicLicenceDto\"]/div[1]/div[1]/div/label/input[1]"));
	

	
	WebElement checkBox1;
	//WebElement checkBox3;

	checkBox1 = driver.findElement(By.cssSelector("#clinicLicenceDto > div:nth-child(3) > div:nth-child(1)"));
	//checkBox3 = driver.findElement(By.cssSelector("input[value='cb3']"));
	checkBox1.isDisplayed();
	Thread.sleep(1000);
	if(!checkBox1.isSelected()){
	    checkBox1.click();
	}
	
	
}	
	

public void PaymentModeCheckboxOfOnline()
{
	//WebElement chk=driver.findElement(By.xpath("//*[@id=\"clinicLicenceDto\"]/div[1]/div[1]/div/label/input[1]"));
	

	
	WebElement checkBox1;
	//WebElement checkBox3;

	checkBox1 = driver.findElement(By.cssSelector("#clinicLicenceDto > div:nth-child(3) > div:nth-child(2) > div"));
	//checkBox3 = driver.findElement(By.cssSelector("input[value='cb3']"));
	checkBox1.isDisplayed();
	if(!checkBox1.isSelected()){
	    checkBox1.click();
	}
}
	

public void PaymentModeCheckboxOfchechbook()
{
	//WebElement chk=driver.findElement(By.xpath("//*[@id=\"clinicLicenceDto\"]/div[1]/div[1]/div/label/input[1]"));
	

	
	WebElement checkBox1;
	//WebElement checkBox3;

	checkBox1 = driver.findElement(By.cssSelector("#clinicLicenceDto > div:nth-child(3) > div:nth-child(3)"));
	//checkBox3 = driver.findElement(By.cssSelector("input[value='cb3']"));
	checkBox1.isDisplayed();
	if(!checkBox1.isSelected()){
	    checkBox1.click();
	}
	
}




public void SelectLicenceMode() {
	
	Select state = new Select(driver.findElement(By.xpath("//select[@id='licenceMode']")));
	state.selectByVisibleText("License");

	
}



public void SelectSClinictype(String ClinicType) throws InterruptedException
{Thread.sleep(2000);
	Select state = new Select(driver.findElement(By.xpath("//select[@id='clinicTypeId']")));
	state.selectByVisibleText(ClinicType);
}

public void ClickPREVButtonOnPaymentModePage() {
	WebElement PREvbutton=driver.findElement(By.xpath("//button[contains(text(),'PREV')]"));
	
	PREvbutton.click();
}


public void PREVButtonOnPaymentModePageisDisplayed() {
	WebElement PREvbutton=driver.findElement(By.xpath("//button[contains(text(),'PREV')]"));
	
	PREvbutton.isDisplayed();
}



public void NextButtonOnPaymentModePageisDisplayed() {
	WebElement PREvbutton=driver.findElement(By.xpath("//button[contains(text(),'Next')]"));
	
	PREvbutton.isDisplayed();
}



public void ClickNextButtonOnPaymentModePage() {
	WebElement PREvbutton=driver.findElement(By.xpath("//button[contains(text(),'Next')]"));
	
	PREvbutton.click();
}



public void checkboxClinicModuleAndBilling() throws InterruptedException
	{
		
	WebElement checkBox1;

	checkBox1 = driver.findElement(By.xpath("//input[@id='moduleId_3']"));
	//checkBox3 = driver.findElement(By.cssSelector("input[value='cb3']"));
	Thread.sleep(2000);
	checkBox1.isDisplayed();
	if(!checkBox1.isSelected()){
	    checkBox1.click();
	}
	
	
}	



public void checkboxWebSiteModuleAndBillingisDisplayed()
	{
		
	WebElement checkBox1;

	checkBox1 = driver.findElement(By.cssSelector("body > div > div:nth-child(3) > div > div > div > form > div.row.py-4.pl-3 > div.col-xl-8.col-lg-8.col-md-7.col-sm-7 > div > div:nth-child(2)"));
	//checkBox3 = driver.findElement(By.cssSelector("input[value='cb3']"));
	checkBox1.isDisplayed();
	/*if(!checkBox1.isSelected()){
	    checkBox1.click();
	}*/
	
	
}	

public void SelectcheckboxWebSiteModuleAndBilling() throws InterruptedException
	{
		
	WebElement checkBox1;

	checkBox1 = driver.findElement(By.xpath("//input[@id='moduleId_4']"));
	checkBox1.isDisplayed();
	Thread.sleep(2000);
	if(!checkBox1.isSelected()){
	    checkBox1.click();
	}
	
	
}	




public void checkboxAdvertiesmentModuleAndBillingisDisplayed()
	{
		
	WebElement checkBox1;

	checkBox1 = driver.findElement(By.xpath("//input[@id='moduleId_4']"));

	checkBox1.isDisplayed();
	
	
}	


public void SelectcheckboxAdvertiesmentModuleAndBilling()
	{
		
	WebElement checkBox1;

	checkBox1 = driver.findElement(By.cssSelector("#moduleId_4"));

	checkBox1.isDisplayed();
	
	if(!checkBox1.isSelected()){
	    checkBox1.click();
	}
	
	
}	

public void PREVButtononModuleAndBillingIsDisplayed() {
	
	
	WebElement PREVbtn=driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/form/div[2]/div/div/a/button"));
	PREVbtn.isDisplayed();
	
}



public void ClickPREVButtononModuleAndBilling() {
	
	
	WebElement PREVbtn=driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/form/div[2]/div/div/a/button"));
	PREVbtn.click();
	
}


public void NextButtononModuleAndBillingIsDisplayed() {
	
	
	WebElement PREVbtn=driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/form/div[2]/div/div/button"));
	PREVbtn.isDisplayed();
	
}



public void ClickNextButtononModuleAndBilling() {
	
	
	WebElement PREVbtn=driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/form/div[2]/div/div/button"));
	PREVbtn.click();
	
}

public void SelectMonthAdvertisement(String MonthofAdvertise) throws InterruptedException
{Thread.sleep(2000);
	Select city = new Select(driver.findElement(By.xpath("//select[@id='selectbox']")));
	city.selectByVisibleText(MonthofAdvertise);
}



public void SelectcheckboxSMSService()
	{
		
	WebElement checkBox1;

	checkBox1 = driver.findElement(By.cssSelector("#wantsmsservice"));
	checkBox1.isDisplayed();
	if(!checkBox1.isSelected()){
	    checkBox1.click();
	}
	
	}
public void SelectcheckboxSMSServiceisDisplayed(){
		
	WebElement checkBox1;

	checkBox1 = driver.findElement(By.cssSelector("#wantsmsservice"));
	checkBox1.isDisplayed();
	
	}
	
public void SenderIdTextFieldEnaBled() {
	
	WebElement sendID=driver.findElement(By.xpath("//input[@id='senderId']"));
	sendID.isDisplayed();
	sendID.isEnabled();
}
public void SetSenderIdText(String SenderId) {
	
	WebElement sendID=driver.findElement(By.xpath("//input[@id='senderId']"));
	sendID.isDisplayed();
	sendID.sendKeys(SenderId);
}

public void SetSMSQTY(String QTY) throws InterruptedException {
	Thread.sleep(1000);
	WebElement sendID=driver.findElement(By.xpath("//input[@id='quantity']"));
	sendID.sendKeys(QTY);
}





public void AnySiXCharPlaceholder() 
{
	String strval=driver.findElement(By.cssSelector("#senderId")).getAttribute("placeholder");
	System.out.println("placeorder Last name=="+strval);
	strval2 ="Any six characters";
	assertTrue(strval.contains(strval2));

}	




public void SMSQTYPlaceholder() 
{
	String strval=driver.findElement(By.cssSelector("#quantity")).getAttribute("placeholder");
	System.out.println(" placeholder SMS Quantity=="+strval);
	strval2 ="1000";
	assertTrue(strval.contains(strval2));

}	



public void SMSRateinPaisa() 
{
	String strval=driver.findElement(By.xpath("//input[@id='rate']")).getAttribute("Value");
	System.out.println("placeorder SMS RAte =="+strval);
	strval2 ="15";
	assertTrue(strval.contains(strval2));

}	


public void TotalInRsWithoutAnySMS() 
{
	String strval=driver.findElement(By.xpath("//input[@id='nettotal']")).getAttribute("placeholder");
	System.out.println("placeorder TotalRS=="+strval);
	strval2 ="100";
	assertTrue(strval.contains(strval2));

}	



public void SMSQTYTextDisplayed() 
{
	String strval=driver.findElement(By.xpath("//*[@id=\"smsservice\"]/div[2]/div[1]/label")).getText();
	System.out.println("SMS qty=="+strval);
	strval2 ="SMS Qty *";
	assertTrue(strval.contains(strval2));

}	


public void RateInPaisaDisplayed() 
{
	String strval=driver.findElement(By.xpath("//*[@id=\"smsservice\"]/div[2]/div[3]/label")).getText();
	System.out.println("SMS qty=="+strval);
	strval2 ="Rate(In Paisa)";
	assertTrue(strval.contains(strval2));

}	

public void TotalInRSDisplayed() 
{
	String strval=driver.findElement(By.xpath("//*[@id=\"smsservice\"]/div[2]/div[5]/span")).getText();
	System.out.println("SMS qty=="+strval);
	strval2 ="Total(In RS)";
	assertTrue(strval.contains(strval2));

}	



public void SenderIDDisplayed() 
{
	String strval=driver.findElement(By.xpath("//*[@id=\"smsservice\"]/div[1]/div/label")).getText();
	System.out.println("SMS qty=="+strval);
	strval2 ="Sender ID*";
	assertTrue(strval.contains(strval2));

}	

public void Noteisplayed() 
{
	String strval=driver.findElement(By.xpath("//*[@id=\"smsservice\"]/div[1]/div/small")).getText();
	System.out.println("SMS qty=="+strval);
	strval2 ="This is the name/number which flashes on recipient's mobile phone when they receive on sms.";
	assertTrue(strval.contains(strval2));

}	

public void ClearSMSQTY() {
	
	WebElement sendID=driver.findElement(By.xpath("//input[@id='quantity']"));
	sendID.clear();
}



public void PREVButtonOnSMSSettingisplayed() {
	WebElement PREvbutton=driver.findElement(By.xpath("//button[contains(text(),'PREV')]"));
	
	PREvbutton.click();
}


public void ClickPREVButtonOnSMSSettingage() {
	WebElement PREvbutton=driver.findElement(By.xpath("//button[contains(text(),'PREV')]"));
	
	PREvbutton.click();
}


public void ClickNextButtononSMSSettingpage() {
	
	
	WebElement PREVbtn=driver.findElement(By.xpath("//button[contains(text(),'Next')]"));
	PREVbtn.click();
	
}


public void ClinicNameClinicDetailsConfirmDetailPage(String ClinicName) 
{
	
	strval=driver.findElement(By.xpath("//div[@class='white-box']")).getText();
	System.out.println("ClinicName  is "+strval);
	strval2 =ClinicName;
	assertTrue(strval.contains(strval2));
	
}


public void FirstnameClinicDetailsConfirmDetailPage(String Firstname) 
{
	
	strval=driver.findElement(By.xpath("//div[@class='white-box']")).getText();
	System.out.println("Firstname  is "+strval);
	strval2 =Firstname;
	assertTrue(strval.contains(strval2));
	
}

public void EmailIdClinicDetailsConfirmDetailPage(String EmailId) 
{
	
	strval=driver.findElement(By.xpath("//div[@class='white-box']")).getText();
	System.out.println("EmailId  is "+strval);
	strval2 =EmailId;
	assertTrue(strval.contains(strval2));
	
}


public void MobileNoClinicDetailsConfirmDetailPage(String MobileNo) 
{
	
	strval=driver.findElement(By.xpath("//div[@class='white-box']")).getText();
	System.out.println("MobileNo  is "+strval);
	strval2 =MobileNo;
	assertTrue(strval.contains(strval2));
	
}


public void CliniCBillingInoviceClinicDetailsConfirmDetailPage(String CliniC) 
{
	
	strval=driver.findElement(By.xpath("//div[@class='card-body billing-invoice']")).getText();
	System.out.println("MobileNo  is ============"+strval);
	strval2 ="Clinic";
	assertTrue(strval.contains(strval2));
	
}


public void WebSiteBillingInoviceClinicDetailsConfirmDetailPage(String WebSite) 
{
	
	strval=driver.findElement(By.xpath("//div[@class='card-body billing-invoice']")).getText();
	System.out.println("MobileNo  is ====="+strval);
	strval2 ="1,999.00";
	assertTrue(strval.contains(strval2));
	
}


public void hdrBillingInoviceClinicDetailsConfirmDetailPage() 
{
WebElement hdr=driver.findElement(By.xpath("//h4[contains(text(),'Confirm Your Details')]"));

hdr.isDisplayed();

}

public void SubmitButtonBillingInoviceClinicDetailsConfirmDetailPageisDisplayed() 
{
WebElement btn=driver.findElement(By.xpath("//button[contains(text(),'SUBMIT')]"));

btn.isDisplayed();

}

public void ClickSubmitButtonBillingInoviceClinicDetailsConfirmDetailPage() 


{
	objBaseClass.scrollToView("//button[contains(text(),'SUBMIT')]");
	
WebElement btn=driver.findElement(By.xpath("//button[contains(text(),'SUBMIT')]"));

btn.click();

}
//*[@id="page-wrapper"]/div/div[2]/div/div[2]/div/div/div/form/div/div/a[1]




public void PayLaterButtonisDisplayed() 
{
WebElement btn=driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div[2]/div/div/div/form/div/div/a[1]"));

btn.isDisplayed();

}

public void ClickPayLaterButton() 
{
	WebElement btn=driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div[2]/div/div/div/form/div/div/a[1]"));

btn.click();

}



public void PayButtonisDisplayed() 
{
WebElement btn=driver.findElement(By.xpath("//button[contains(text(),'PAY')]"));

btn.isDisplayed();

}

public void ClickPayButton() 
{
	WebElement btn=driver.findElement(By.xpath("//button[@type='submit']"));
btn.click();

}


















}