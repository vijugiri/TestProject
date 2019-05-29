package Treatment;

import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.appointment.AddpatientPage;
import com.appointment.AddpatientView;
import com.dashboard.DashboardPage;
import com.login.LoginPage;
import com.main.BaseClass;

public class TreatmentView extends BaseClass {
	
	LoginPage objLoginPage=new LoginPage();
	BaseClass objBaseClass= new BaseClass();
	AddpatientPage objAddpatientPage= new AddpatientPage();
	treatmentpage objtreatmentpage = new treatmentpage();
AddpatientView objAddpatientView= new AddpatientView();
DashboardPage objDashboardPage= new DashboardPage();


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

	
	
	public void verifyPatientInfo(String Disease,String FullName,String EmailId, String Age) throws InterruptedException {
		Thread.sleep(1000);
		objtreatmentpage.patientname(FullName);
		this.verifypatientage(Age);
	//	this.verifypatientdisease(Disease);
		this.verifypatientEmail(EmailId);
		
	}
	
	
	
public void verifypatientEmail(String EmailId) throws InterruptedException {
		
		Thread.sleep(2000);
		strval=objBaseClass.getTableDataFromTableId("example","1","5").getText();
		System.out.println("strval is "+strval);
		strval2 =EmailId;
		assertTrue(strval.contains(strval2));
		
	}
	
	
	
	
	
	
public void verifypatientdisease(String Disease) throws InterruptedException {
		
		Thread.sleep(2000);
		
		
		objBaseClass.scrollToView("//input[@id='dignosisName']");
		objBaseClass.mouseHover("//input[@id='dignosisName']");
		
		
		strval=objBaseClass.getText("//input[@id='dignosisName']");
		System.out.println("strval is "+strval);
		strval2 =Disease;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	

	
	
	public void verifypatientage(String Age) throws InterruptedException {
		
		Thread.sleep(2000);
		strval=objBaseClass.getTableDataFromTableId("example","1","4").getText();
		System.out.println("strval is "+strval);
		strval2 =Age;
		assertTrue(strval.contains(strval2));
		
	}
	
	

	public void editPatientData() throws InterruptedException {
		
		Thread.sleep(2000);
		objBaseClass.editTableData("example","1","6");
		objAddpatientView.setDiseseOnAddpatient("Cold");
	objAddpatientPage.clickonUpdateOnAddpatientPage();
	Thread.sleep(2000);
	
		
	}
	
	
	

	public void DeletePatientFromTreatmentpageWithYesButton() throws InterruptedException {
		
		Thread.sleep(2000);
		objBaseClass.DeleteTableData("example","1","6");
	

		
				Thread.sleep(3000);
				WebElement  element=driver.findElement(By.xpath("//button[contains(text(),'Yes')]"));   
				JavascriptExecutor ex=(JavascriptExecutor)driver;
				  ex.executeScript("arguments[0].click()", element);
				

		objBaseClass.refresh();
		

		
	}
	
	

	public void DeletePatientFromTreatmentpageWithNoButton() throws InterruptedException {
		
		Thread.sleep(2000);
		objBaseClass.DeleteTableData("example","1","6");
	
		try {
			if(driver.findElement(By.xpath("//button[contains(text(),'No')]")).isDisplayed()) {
				

				WebElement  element=driver.findElement(By.xpath("//button[contains(text(),'No')]"));   
				JavascriptExecutor ex=(JavascriptExecutor)driver;
				  ex.executeScript("arguments[0].click()", element);
				
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(2000);
		objBaseClass.refresh();
	
		
	}
	
	
	
	public void setComplaints(String pulses,String Systolic,String diastolic,String repositoryRate,String temprature) {
		objtreatmentpage.setComplaints(pulses, Systolic, diastolic, repositoryRate, temprature);
	}
	
	public void AddPricsriptionAfterFood(String medicineNeme,String Dose,String Days,String ConsultingCharge,String Note) throws InterruptedException
	{
		this.setMedicine(medicineNeme);
		Thread.sleep(1000);
		this.SetmorningDose(Dose);
		Thread.sleep(1000);
		this.selectDoseAfterNoon();
		Thread.sleep(1000);
		this.SetAfternoonDose(Dose);
		Thread.sleep(1000);
		this.selectDoseEvening();
		Thread.sleep(1000);
		this.SetEveningDose(Dose);
		Thread.sleep(1000);
		this.selectDoseNight();
		Thread.sleep(1000);
		this.SetNightDose(Dose);
		Thread.sleep(1000);
		this.selectAfterFood();
		Thread.sleep(1000);
		this.SetDays(Days);
		Thread.sleep(1000);
		this.SetConsultingCharges(ConsultingCharge);
		Thread.sleep(1000);
		//this.SetAdvice(Note);
		Thread.sleep(1000);
			
	}
	
	public void setMedicine (String medicineNeme) throws InterruptedException {
		objtreatmentpage.setMedicine(medicineNeme);
	}
	
	public void selectDoseMorning () throws InterruptedException {
		objtreatmentpage.selectDoseMorning();
	}
	
	public void selectDoseNight () throws InterruptedException {
		objtreatmentpage.selectDoseNight();
	}
	
	public void selectDoseAfterNoon () throws InterruptedException {
		objtreatmentpage.selectDoseAfterNoon();
	}
	

	public void selectDoseEvening () throws InterruptedException {
		objtreatmentpage.selectDoseEvening();
	}

	public void selectAfterFood () throws InterruptedException {
		objtreatmentpage.selectAfterFood();
	}
	

	
	
	public void selectBeforeFood () throws InterruptedException {
		objtreatmentpage.selectBeforeFood();
	}

	
	
	
	
	
	
	
	
	public void SetmorningDose (String Dose) {
		objtreatmentpage.SetmorningDose(Dose);
	}
	
	
	public void SetAfternoonDose (String Dose) {
		objtreatmentpage.SetAfternoonDose(Dose);
	}
	
	

	public void SetEveningDose (String Dose) {
		objtreatmentpage.SetEveningDose(Dose);
	}
	
	

	public void SetNightDose (String Dose) {
		objtreatmentpage.SetNightDose(Dose);
	}
	

	public void SetDays (String Days) {
		objtreatmentpage.SetDays(Days);
	}
	
	

	
	public void SetConsultingCharges (String ConsultingCharge) throws InterruptedException {
		objtreatmentpage.SetConsultingCharges(ConsultingCharge);
	}
	


	public void SetAdvice(String Note) {
		objtreatmentpage.SetAdvice(Note);
	}
	
	
	public void clickContinueButtonWithYesoption() throws InterruptedException {
		Thread.sleep(2000);
		objtreatmentpage.clickContinueButtonWithYesoption();
		
		Thread.sleep(1000);
		if(driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[12]/div/div/div[2]/button[2]")).isDisplayed()) {
		
			WebElement  element=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[12]/div/div/div[2]/button[2]"));   
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			  ex.executeScript("arguments[0].click()", element);
		
	}
		
		
		
		
	}
	
	
	
	

	public void clickOnCollect() throws InterruptedException {
		objtreatmentpage.clickOnCollect();
		
	}
	


	public void clickContinueButtonWithNooption() throws InterruptedException {
		objtreatmentpage.clickContinueButtonWithNooption();
		
		Thread.sleep(1000);
		if(driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[12]/div/div/div[2]/button[1]")).isDisplayed()) {
		
			WebElement  element=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[12]/div/div/div[2]/button[1]"));   
			JavascriptExecutor ex=(JavascriptExecutor)driver;
			  ex.executeScript("arguments[0].click()", element);
		
	}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	public void clickOnSaveAndCollectPayment() {
		objtreatmentpage.clickOnSaveAndCollectPayment();
	}
	
	
	
	

	
	public void clickOnSave() {
		objtreatmentpage.clickOnSave();
	}
	
	
	public void  VerifyAmount(String ConsultingCharge)
	{
	strval=driver.findElement(By.xpath("//input[@id='amountPaid']")).getAttribute("value");
	System.out.println("amountPaid is "+strval);
	strval2 =ConsultingCharge;
	assertTrue(strval.contains(strval2));

		
	}
	
	
	public void AddInvestigationreport() throws InterruptedException {
		this.clickInvestigationreport();
		this.setInvestigationreportName();
		//this.clickChooseInvestigationreport();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='upload-file-input']")).sendKeys("C:\\Users\\Admin\\git\\TestProject\\Drline\\TestData\\file.jpeg");
		objBaseClass.clickUsingJavaScripter("//button[@id='reportButton']");
		Thread.sleep(3000);
		
		objBaseClass.mouseHover("/html/body/div[4]/div[2]/div[9]/div/div/div[3]/div/div/button");
		//objBaseClass.clickUsingJavaScripter("//*[@id='JSmsg']/div/div/div[3]/div/div/button");
		
	
	}
	
	
	public void clickChooseInvestigationreport () {
		objtreatmentpage.clickChooseInvestigationreport();
		
	}
	public void clickInvestigationreport () {
		objtreatmentpage.clickInvestigationreport();
		
	}
	
	
	public void setInvestigationreportName () {
		objtreatmentpage.setInvestigationreportName();
		
	}
	
	
	
	public void veroifyreportnameInvestigationreport() throws InterruptedException {
	
		Thread.sleep(2000);
	strval=objBaseClass.getTableDataFromTBody("investigationBodyOwn", "1", "6").getText();
	
	strval2 ="Test";
	assertTrue(strval.contains(strval2));
	objBaseClass.clickUsingJavaScripter("/html/body/div[4]/div[2]/div[18]/div/div/div[3]/div/div/div/button");
	
	
	}
	
	
	
	public void Addcertificate() throws InterruptedException {
		
		
		objtreatmentpage.clickTreatmentHorizontaltabByName("Certificate");
		this.clickCreatnewCertificate();
		this.setCertificateTitle();
		this.setCertificateBody();
	
		objBaseClass.clickUsingJavaScripter("//button[contains(text(),'Save & Assign')]");
		Thread.sleep(2000);
		objBaseClass.mouseHover("/html/body/div[4]/div[2]/div[9]/div/div/div[3]/div/div/button");
		Thread.sleep(2000);
		
	}
	
	
	
	public void clickCreatnewCertificate() {
		
		
		objBaseClass.clickUsingJavaScripter("//div[@class='col-sm-12 py-3']//button");
	}
	
public void setCertificateTitle() throws InterruptedException {
	Thread.sleep(2000);
	objBaseClass.setText("//input[@id='certificateType']", "Handicap");
	Thread.sleep(2000);
}
	

public void setCertificateBody() {
objBaseClass.setText("//textarea[@id='certbody']", "This is certify that mr. Abs is belong to handicap");
}

	




public void verifyCertificateName() throws InterruptedException {

	Thread.sleep(2000);
	objBaseClass.scrollToView("//label[@class='label d-none d-sm-block labeltab']/span[contains(text(),'Certificate')]");
	
	objBaseClass.clickUsingJavaScripter("//label[@class='label d-none d-sm-block labeltab']/span[contains(text(),'Certificate')]");
	Thread.sleep(2000);
strval=objBaseClass.getTableDataFromTBody("certificatesBody", "1", "2").getText();
System.out.println("certificate name is "+strval);
strval2 ="Handicap";
assertTrue(strval.contains(strval2));


}


//tbody[@id='certificatesBody']//tr[1]/td[2]



public void clickPrintpriscription() throws InterruptedException {
	
	Thread.sleep(2000);
	objBaseClass.scrollToView("//button[@id='pprint']");
	//driver.findElement(By.xpath("//button[@id='pprint']")).click();
	Thread.sleep(2000);
	objBaseClass.mouseHover("//button[@id='pprint']");

	Thread.sleep(6000);
	Set <String> st= driver.getWindowHandles();
	Iterator<String> it = st.iterator();
	String parent =  it.next();
	String child =it.next();
	//swtich to parent
	driver.switchTo().window(parent);
	System.out.println("Returned to parent");
	
}

public void clickonshareButton() {
	objBaseClass.clickUsingJavaScripter("//*[@id='share']");
}




public void sharePriscription() throws InterruptedException {
	
	this.clickonshareButton();
	Thread.sleep(1000);
	objBaseClass.selectCheckbox("//input[@id='sendEmail']");
	Thread.sleep(1000);
	objBaseClass.selectCheckbox("//input[@id='sendSms']");
	
	objBaseClass.clickUsingJavaScripter("/html/body/div[4]/div[2]/div[8]/div/div/div[3]/div/a/button");
	Thread.sleep(1000);
	objBaseClass.clickUsingJavaScripter("/html/body/div[4]/div[2]/div[6]/div/div/div[3]/div/div/button");
	
	
	
}

public void verifyIN_OUTStatus() throws InterruptedException {
	
	this.clickINStatus();
	Thread.sleep(1000);
	strval=driver.findElement(By.xpath("//input[@id='outDoctor']")).getAttribute("value");
	System.out.println("outDoctor is "+strval);
	strval2 ="OUT";
	assertTrue(strval.contains(strval2));

	this.clickOUTStatus();
	Thread.sleep(1000);

	strval3=driver.findElement(By.xpath("//input[@value='IN']")).getAttribute("value");
	System.out.println("outDoctor is "+strval3);
	strval4 ="IN";
	assertTrue(strval3.contains(strval4));
	Thread.sleep(1000);
	if(!driver.findElement(By.xpath("//input[@value='IN']")).isDisplayed()) {
	this.clickINStatus();
	}
	
	
}

public void clickINStatus() 
{
	objBaseClass.clickUsingJavaScripter("//input[@id='inDoctor']");
}




public void clickOUTStatus() 
{
	objBaseClass.clickUsingJavaScripter("//input[@id='outDoctor']");
}















public void VerifyConsultingCharges() throws InterruptedException {
	
	//objBaseClass.scrollToView("/html/body/div[4]/div[2]/div[1]/div[3]/div[2]/div/div/div/div[2]/label[2]");
	objBaseClass.mouseHover("//label[@class='label d-none d-sm-block labeltab']/span[contains(text(),'Bill Book')]");
	
	//objBaseClass.getTableDataFromTBody("feestbody", "1", "4").click();
	//driver.findElement(By.xpath("//*[@id='feeQty_1']")).click();
	Thread.sleep(2000);
	objBaseClass.mouseHover("//*[@id='feeQty_1']");
	
	strval4="2";
	this.setQTYConsultingCharge(strval4);
	
	
	
	strval=driver.findElement(By.xpath("//input[@id='feestotal_1']")).getAttribute("value");
	System.out.println("qty is "+strval);
	strval2 ="1000.00";
	System.out.println(strval2);
	assertTrue(strval.contains(strval2));
	
	Thread.sleep(2000);
	objBaseClass.scrollToView("//span[@id='grandTotalAll']");
	strval3=driver.findElement(By.xpath("//span[@id='grandTotalAll']")).getText();
	System.out.println("grand total is is "+strval3);
	strval2 ="1000.00";

	assertTrue(strval3.contains(strval2));
	Thread.sleep(2000);
	
	
	//span[@id='grandTotalAll']
}



public void Resetconsultcharge() throws InterruptedException {
	objBaseClass.scrollToView("//label[@class='label d-none d-sm-block labeltab']/span[contains(text(),'Bill Book')]");
objBaseClass.mouseHover("//label[@class='label d-none d-sm-block labeltab']/span[contains(text(),'Bill Book')]");
	
	objBaseClass.getTableDataFromTBody("feestbody", "1", "4").click();
	
	strval4="1";
	this.setQTYConsultingCharge(strval4);
	
	
	
	strval=driver.findElement(By.xpath("//input[@id='feestotal_1']")).getAttribute("value");
	System.out.println("qty is "+strval);
	strval2 ="500.00";
	System.out.println(strval2);
	assertTrue(strval.contains(strval2));
	
	Thread.sleep(2000);
	objBaseClass.scrollToView("//span[@id='grandTotalAll']");
	strval3=driver.findElement(By.xpath("//span[@id='grandTotalAll']")).getText();
	System.out.println("grand total is is "+strval3);
	strval2 ="500.00";

	assertTrue(strval3.contains(strval2));
	
}







public void setConsultingCharges() {
	//objBaseClass.getTableDataFromTBody(TBodyid, trNo, tdNo)
}

public void setQTYConsultingCharge(String qty) throws InterruptedException {
	Thread.sleep(3000);
	objBaseClass.ClearText("//input[@id='feeQty_1']");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='feeQty_1']")).sendKeys(qty);
}	
	




public void verifyprintBillBook() throws InterruptedException {
	
	
	
	Thread.sleep(2000);
	objBaseClass.scrollToView("//a[@id='pprint']");

	Thread.sleep(2000);
	objBaseClass.mouseHover("//a[@id='pprint']");

	Thread.sleep(4000);
	Set <String> st= driver.getWindowHandles();
	Iterator<String> it = st.iterator();
	String parent =  it.next();
	String child =it.next();
	//swtich to parent
	driver.switchTo().window(parent);
	System.out.println("Returned to parent");
	
	
	
	
}



public void AddAndDeletePreticulers() throws InterruptedException {
	
	Thread.sleep(2000);
	objBaseClass.scrollToView("//div[@class='col-md-8  pt-3']//button[contains(text(),'Add Row')]");
	objBaseClass.clickUsingJavaScripter("//div[@class='col-md-8  pt-3']//button[contains(text(),'Add Row')]");
	Thread.sleep(2000);
	/*objBaseClass.click("//tbody[@id='feestbody']//tr[2]/td[2]");
	Thread.sleep(2000);
	*/
	
	
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id='feename_2']")).sendKeys("Dressing");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id='feeAmount_2']")).sendKeys("500");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id='feeQty_2']")).sendKeys("2");
	

	Thread.sleep(2000);
	strval=driver.findElement(By.xpath("//*[@id='feestotal_2']")).getAttribute("value");
	System.out.println("qty is "+strval);
	strval2 ="1000.00";
	System.out.println(strval2);
	assertTrue(strval.contains(strval2));
	Thread.sleep(2000);
	objBaseClass.clickUsingJavaScripter("//span[@name='record1']");
	
	
	
}



public void verifyReferTo(String ClinicName,String Firstname,String MobileNo,String Address ) throws InterruptedException {
	

	Thread.sleep(3000);
	objBaseClass.scrollToView("//label[@class='label d-none d-sm-block labeltab']/span[contains(text(),'Refer')]");
	Thread.sleep(3000);
	this.clickReferToTab();
	
	objBaseClass.scrollToView("//*[@id='refToClinicName']");
	Thread.sleep(3000);
	objBaseClass.setText("//*[@id='refToClinicName']", ClinicName);
	Thread.sleep(3000);
	objBaseClass.setText("//*[@id='refToDoctorName']", Firstname);
	Thread.sleep(3000);
	objBaseClass.setText("//*[@id='drContatNo']", MobileNo);
	Thread.sleep(3000);
	objBaseClass.setText("//*[@id='address']", Address);
	Thread.sleep(3000);
	objBaseClass.setText("//*[@id='referAdvice']", "Emergency burn case");
	
	Thread.sleep(3000);
	objtreatmentpage.clickSubmitButtonReferto();
	
	
	
	
	
	
	
}




public void clickReferToTab() {



	WebElement  element=driver.findElement(By.xpath("//label[@class='label d-none d-sm-block labeltab']/span[contains(text(),'Refer')]"));   
	JavascriptExecutor ex=(JavascriptExecutor)driver;
	  ex.executeScript("arguments[0].click()", element);


}

public void clickAllHistoryTab() {



	WebElement  element=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[3]/div[2]/div/div/div/div[2]/label[5]"));   
	JavascriptExecutor ex=(JavascriptExecutor)driver;
	  ex.executeScript("arguments[0].click()", element);


}



public void verifypriscriptionHistory(String FullName) {
	
	//objBaseClass.scrollToView("//div[@class='col-lg-2 col-md-3']");
	this.clickHistryOnPriscription();
objBaseClass.isdisplayed("//h3[contains(text(),'Prescription')]");

//WebElement table=driver.findElement(By.xpath("//tbody[@id='prescriptionHistoryOwnBranch']"));


List<WebElement> rows = driver.findElements(By.xpath("//tbody[@id='prescriptionHistoryOwnBranch']"));
System.out.println(rows.size());
 int count=rows.size();
 

	assertTrue(count>=1);
	
	strval=driver.findElement(By.xpath("//tbody[@id='prescriptionHistoryOwnBranch']//tr[1]/td[5]")).getText();
	
	strval2 =FullName;

	assertTrue(strval.contains(FullName));
	
	
	this.clickCancelPriscriptionHistory();
	
	
 
	
}

public void clickHistryOnPriscription() {

	WebElement  element=driver.findElement(By.xpath("//section[@id='content1']//div/div/h5/a"));   
	JavascriptExecutor ex=(JavascriptExecutor)driver;
	  ex.executeScript("arguments[0].click()", element);
	
	
}

public void clickHistryOnBillbook() {

	WebElement  element=driver.findElement(By.xpath("//section[@id='content2']//div/div/h5/a"));   
	JavascriptExecutor ex=(JavascriptExecutor)driver;
	  ex.executeScript("arguments[0].click()", element);
	
	
}

public void clickHistryOnCertificate() {

	
	objBaseClass.scrollToView("//section[@id='content3']//div/div/h5/a");
	
	
	WebElement  element=driver.findElement(By.xpath("//section[@id='content3']//div/div/h5/a"));   
	JavascriptExecutor ex=(JavascriptExecutor)driver;
	  ex.executeScript("arguments[0].click()", element);
	
	
}


public void clickCancelPriscriptionHistory() {

objBaseClass.scrollToView("//*[@id='example_wrapper']/button");

	WebElement  element=driver.findElement(By.xpath("//*[@id='example_wrapper']/button"));   
	JavascriptExecutor ex=(JavascriptExecutor)driver;
	  ex.executeScript("arguments[0].click()", element);
	

}



public void clickCancelBillBookHistory() {

objBaseClass.scrollToView("//*[@id='billbookhistory']/div/div/div[3]/button");

	WebElement  element=driver.findElement(By.xpath("//*[@id='billbookhistory']/div/div/div[3]/button"));   
	JavascriptExecutor ex=(JavascriptExecutor)driver;
	  ex.executeScript("arguments[0].click()", element);
	

}



public void verifyBillBookHistory(String FullName) {
	

	objBaseClass.mouseHover("//label[@class='label d-none d-sm-block labeltab']/span[contains(text(),'Bill Book')]");

objBaseClass.scrollToView("/html/body/div[4]/div[2]/div[1]/div[3]/div[2]/div/div/div/div[2]/section[2]/div[1]/div[2]/h5/a");

this.clickHistryOnBillbook();

objBaseClass.isdisplayed("//h4[contains(text(),'Bill Book')]");


List<WebElement> rows = driver.findElements(By.xpath("//tbody[@id='billinghistory']"));
System.out.println(rows.size());
 int count=rows.size();
 

	assertTrue(count>=1);
	
	strval=driver.findElement(By.xpath("//tbody[@id='billinghistory']//tr[1]/td[3]")).getText();
	
	strval2 =FullName;

	assertTrue(strval.contains(FullName));

	this.clickCancelBillBookHistory();
	
	
	

}

public void verifyCertificateHistory(String FullName) throws InterruptedException {
	Thread.sleep(2000);
	objBaseClass.scrollToView("//label[@class='label d-none d-sm-block labeltab']/span[contains(text(),'Certificate')]");
	
	objBaseClass.clickUsingJavaScripter("//label[@class='label d-none d-sm-block labeltab']/span[contains(text(),'Certificate')]");

	this.clickHistryOnCertificate();

Thread.sleep(2000);
	objBaseClass.isdisplayed("/html/body/div[4]/div[2]/div[21]/div/div/div[1]/h4");


	List<WebElement> rows = driver.findElements(By.xpath("//tbody[@id='certificatetbody']"));
	System.out.println(rows.size());
	 int count=rows.size();
	 

		assertTrue(count>=1);
		
		strval=driver.findElement(By.xpath("//tbody[@id='certificatetbody']//tr[1]/td[4]")).getText();
		
		strval2 =FullName;

		//assertTrue(strval.contains(strval2));

		this.clickCancelCertificateHistory();
		

}



public void clickCancelCertificateHistory() {

objBaseClass.scrollToView("/html/body/div[4]/div[2]/div[21]/div/div/div[3]/button");

	WebElement  element=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[21]/div/div/div[3]/button"));   
	JavascriptExecutor ex=(JavascriptExecutor)driver;
	  ex.executeScript("arguments[0].click()", element);
	

}

public void clickCancelReferToHistory() {

objBaseClass.scrollToView("/html/body/div[4]/div[2]/div[22]/div/div/div[3]/button");

	WebElement  element=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[22]/div/div/div[3]/button"));   
	JavascriptExecutor ex=(JavascriptExecutor)driver;
	  ex.executeScript("arguments[0].click()", element);
	

}

public void verifyRefertohistory(String FullName ) throws InterruptedException {
	
	
	Thread.sleep(3000);
	objBaseClass.scrollToView("//label[@class='label d-none d-sm-block labeltab']/span[contains(text(),'Refer')]");
	Thread.sleep(3000);
	this.clickReferToTab();
	
	this.clickHistryOnReferTo();
	

	Thread.sleep(3000);
	objBaseClass.isdisplayed("//html/body/div[4]/div[2]/div[22]/div/div/div[1]/h4");


	List<WebElement> rows = driver.findElements(By.xpath("//tbody[@id='refertobody']"));
	System.out.println(rows.size());
	 int count=rows.size();
	 

		assertTrue(count>=1);
		
		strval=driver.findElement(By.xpath("//tbody[@id='refertobody']//tr[1]/td[3]")).getText();
		
		strval2 =FullName;

		assertTrue(strval.contains(FullName));

		this.clickCancelReferToHistory();
		
		Thread.sleep(3000);
	
	
	
}

public void clickHistryOnReferTo() {

	
	objBaseClass.scrollToView("//*[@id='content4']/div[1]/div/h5/a");
	
	
	WebElement  element=driver.findElement(By.xpath("//*[@id='content4']/div[1]/div/h5/a"));   
	JavascriptExecutor ex=(JavascriptExecutor)driver;
	  ex.executeScript("arguments[0].click()", element);
	
	
}

public void clickHistryOnAllHistoory() {

	
	objBaseClass.scrollToView("//*[@id='hide-label']");
	
	
	WebElement  element=driver.findElement(By.xpath("//*[@id='hide-label']"));   
	JavascriptExecutor ex=(JavascriptExecutor)driver;
	  ex.executeScript("arguments[0].click()", element);
	
	
}


public void verifyALLHistory(String FullName ) throws InterruptedException {
	
	
	Thread.sleep(3000);
	objBaseClass.scrollToView("//*[@id='dtBasicExample']/tbody/tr[1]/td[3]/table/tbody/tr/td[3]/table/tbody/tr[1]/td[1]");
	Thread.sleep(3000);
	this.clickAllHistoryTab();

	



	List<WebElement> rows = driver.findElements(By.xpath("//tbody//tr[@class='odd'][1]"));
	System.out.println(rows.size());
	 int count=rows.size();
	 

		assertTrue(count>=1);
		
		strval=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[3]/div[2]/div/div/div/div[2]/section[5]/div[3]/div[2]/div/table/tbody/tr[1]/td[3]/table/tbody/tr/td[3]/table/tbody/tr/td[1]")).getText();
		
		strval2 =FullName;

		assertTrue(strval.contains(FullName));


		
	

}

public void closeinvestigationReport() throws InterruptedException {
	
	Thread.sleep(2000);
	objBaseClass.clickUsingJavaScripter("/html/body/div[4]/div[2]/div[18]/div/div/div[1]/button");
}




public void AddPricsriptionBeforeFood(String medicineNeme,String Dose,String Days,String ConsultingCharge,String Note) throws InterruptedException
{


	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("javascript:window.scrollBy(200,120.13)");
	
	
	this.setMedicine(medicineNeme);
	Thread.sleep(1000);
	this.SetmorningDose(Dose);
	Thread.sleep(1000);
	this.selectDoseAfterNoon();
	Thread.sleep(1000);
	this.SetAfternoonDose(Dose);
	Thread.sleep(1000);
	this.selectDoseEvening();
	Thread.sleep(1000);
	this.SetEveningDose(Dose);
	Thread.sleep(1000);
	this.selectDoseNight();
	Thread.sleep(1000);
	this.SetNightDose(Dose);
	Thread.sleep(3000);
	this.selectBeforeFood();
	Thread.sleep(1000);
	this.SetDays(Days);
	Thread.sleep(1000);
	this.SetConsultingCharges(ConsultingCharge);
	Thread.sleep(1000);
	this.SetAdvice(Note);
	Thread.sleep(1000);
		
}

public void clickOnMakePaymenyt(String FullName) {
	
	objBaseClass.scrollToView("/html/body/div[4]/div[2]/div/div[2]/div[2]/div/div/div[2]/div[2]/div/table/tbody/tr/td[2]");
	strval=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div[2]/div/div/div[2]/div[2]/div/table/tbody/tr/td[2]")).getText();
	
	strval2 =FullName;

	assertTrue(strval.contains(FullName));



	objBaseClass.scrollToView("//tbody[@class='removeScroll']//tr[1]/td[12]");
	
	WebElement  element=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div[2]/div/div/div[2]/div[2]/div/table/tbody/tr/td[12]/a"));   
	JavascriptExecutor ex=(JavascriptExecutor)driver;
	  ex.executeScript("arguments[0].click()", element);


	
	
	
}


public void clickandPaidPendingBill() throws InterruptedException {
	
	
	
	
objBaseClass.scrollToView("//*[@id='addBorrow']");
Thread.sleep(2000);	  Thread.sleep(2000);
	WebElement  element=driver.findElement(By.xpath("//*[@id='addBorrow']"));   
	JavascriptExecutor ex=(JavascriptExecutor)driver;
	  ex.executeScript("arguments[0].click()", element);
	  
	  Thread.sleep(2000);

	objBaseClass.setText("//input[@id='amountPaid']", "100");
	
	  Thread.sleep(2000);
		objtreatmentpage.clickOnCollect();
	
}




public void paidTotalpayment() throws InterruptedException {
	
	  Thread.sleep(2000);
	strval=driver.findElement(By.xpath("//input[@class='inputbox']")).getAttribute("value");
	System.out.println("amountPaid is "+strval);
	  Thread.sleep(2000);
	  
	  
	  
		boolean autosearch = isElementPresent(By.xpath("//input[@id='payInAdvance']"));

		//WebElement autosearch=driver.findElement(By.xpath("//div[@class='autocomplete-suggestions']"));
		Thread.sleep(2000);
		if(autosearch==true)
		{
			Thread.sleep(1000);
			 objBaseClass.selectCheckbox("//input[@id='payInAdvance']");
		
		} 
	  
	  objBaseClass.ClearText("//input[@id='amountPaid']");
	  Thread.sleep(2000);
	objBaseClass.setText("//input[@id='amountPaid']", strval);
	
	  Thread.sleep(2000);
		objtreatmentpage.clickOnCollect();
		Thread.sleep(1000);
		
		//objBaseClass.clickUsingJavaScripter("//a[@id='ja_btn_155619546091414581']");
		objBaseClass.refresh();
		
}	
		

public void verifyAddNewMedicinPopUp(String medicineNeme,String Days) throws InterruptedException
{
	
	this.setMedicine(medicineNeme);
	this.SetDays(Days);
	if(driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[6]/div/div/div[3]/div/div/button")).isDisplayed())
	{
		
	Thread.sleep(3000);
		WebElement  element=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[6]/div/div/div[3]/div/div/button"));   
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		  ex.executeScript("arguments[0].click()", element);
			Thread.sleep(3000);
	}

	else if(driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[6]/div/div/div[3]/div/div/button")).isDisplayed())
	{
		Thread.sleep(3000);
		WebElement  element2=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[6]/div/div/div[3]/div/div/button"));   
		JavascriptExecutor ex2=(JavascriptExecutor)driver;
		  ex2.executeScript("arguments[0].click()", element2);
			Thread.sleep(3000);
			
			
			
			
			
			
			
			
	}


	
}






public void AddInventory(String MedicineName , String Stock) throws InterruptedException {
	objDashboardPage.clickInventoryMenu();
	objBaseClass.clickUsingJavaScripter("/html/body/div[4]/div[1]/nav/ul/li[12]/div/ul/li[2]/a/span");
	objBaseClass.clickUsingJavaScripter("//a[contains(text(),'Add Medicine')]");
	
	objBaseClass.setText("//input[@id='name']", MedicineName);
	objBaseClass.setText("//input[@id='buyingPrice']", "10");
	objBaseClass.setText("//input[@id='mrp']", "20");
	objBaseClass.setText("//input[@id='unitQty']", "10");
	objBaseClass.setText("//textarea[@id='alertStock']", "10");
	objBaseClass.setText("//input[@id='balance']", Stock);
	objBaseClass.selectDropDown("//select[@id='itemType']", "Saleable");
	objBaseClass.clickUsingJavaScripter("//button[contains(text(),'Submit')]");
	
	
			Thread.sleep(2000);
	WebElement  element2=driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]"));   
	JavascriptExecutor ex2=(JavascriptExecutor)driver;
	  ex2.executeScript("arguments[0].click()", element2);
}


public void verifyAllertStock() throws InterruptedException {
	Thread.sleep(2000);
	WebElement  element2=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[6]/div/div/div[1]/button"));   
	JavascriptExecutor ex2=(JavascriptExecutor)driver;
	  ex2.executeScript("arguments[0].click()", element2);
	
	
}



public void deleteNewInventory() throws InterruptedException
{
	objDashboardPage.clickInventoryMenu();
	objBaseClass.clickUsingJavaScripter("/html/body/div[4]/div[1]/nav/ul/li[12]/div/ul/li[2]/a/span");
	
	
	objBaseClass.mouseHover("//tbody[@class='removeScroll']//tr[1]/td/a[2]");
	
	
	  
	objBaseClass.mouseHover("/html/body/div[6]/div[2]/a/button");
	  
	Thread.sleep(2000);
	WebElement  element2=driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]"));   
	JavascriptExecutor ex2=(JavascriptExecutor)driver;
	  ex2.executeScript("arguments[0].click()", element2);
	  
	  
	
}


public void clickSettingIcon() {
	
	

	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("javascript:window.scrollBy(17.14,20)");
	
	objBaseClass.clickUsingJavaScripter("//a[@class='tableSetting']");
	
}





public void selectPULSESCheckboxTreatmentSetting() {
	
	objBaseClass.selectCheckbox("//input[@id='propertiesValue_558']");
	
	
}


public void unSelectPULSESCheckboxTreatmentSetting() {
	objBaseClass.unSelectCheckbox("//input[@id='propertiesValue_558']");
	
}



public void selectBlood_PressureCheckboxTreatmentSetting() {
	
	objBaseClass.selectCheckbox("//input[@id='propertiesValue_559']");
	
	
}


public void unSelectBlood_PressureCheckboxTreatmentSetting() {
	

	
	objBaseClass.unSelectCheckbox("//input[@id='propertiesValue_559']");
	
}



public void selectR_RCheckboxTreatmentSetting() {
	
	objBaseClass.selectCheckbox("//input[@id='propertiesValue_560']");
	
	
}



public void unSelectR_RCheckboxTreatmentSetting() {

	
	
	objBaseClass.unSelectCheckbox("//input[@id='propertiesValue_560']");

	
}







public void selectTempCheckboxTreatmentSetting() {
	
	objBaseClass.selectCheckbox("//input[@id='propertiesValue_561']");
	
	
}





public void unSelectTempCheckboxTreatmentSetting() {
	
	
	objBaseClass.unSelectCheckbox("//input[@id='propertiesValue_561']");

	
}







public void unSelectK_C_OCheckboxTreatmentSetting() {
	
	
	objBaseClass.unSelectCheckbox("//input[@id='propertiesValue_562']");
	
	
}







public void selectK_C_OCheckboxTreatmentSetting() {
	
	objBaseClass.selectCheckbox("//input[@id='propertiesValue_562']");
	
	
}
public void selectAllCheckBox() {
	
	this.selectPULSESCheckboxTreatmentSetting();
	this.selectBlood_PressureCheckboxTreatmentSetting();
	this.selectR_RCheckboxTreatmentSetting();
	this.selectTempCheckboxTreatmentSetting();
	this.selectK_C_OCheckboxTreatmentSetting();
}


public void clickonSaveTreatmentSetting() {
	
	objBaseClass.mouseHover("//button[contains(text(),'Save')]");
}




public void clickonCancelTreatmentSetting() {
	
	objBaseClass.mouseHover("//button[contains(text(),'Cancel')]");
}


public void verifyAllCheckboxSelected() {
	strval=objBaseClass.getText("//table[@id='complaintable']");
	
	strval2="Complaints";
	
	strval3="Pulses Per Min";
	
	strval4= "Blood Pressure";
	
	String strval5="R/R Per Min";
	
	String strval6="Temp";
	
	String strval7="K/C/O";
	
	
	Assert.assertTrue(strval.contains(strval2));
	Assert.assertTrue(strval.contains(strval3));
	Assert.assertTrue(strval.contains(strval4));
	Assert.assertTrue(strval.contains(strval5));
	Assert.assertTrue(strval.contains(strval6));
	Assert.assertTrue(strval.contains(strval7));
	

	
}



public void verifyPulsesckboxIsNotSelected() {
	strval=objBaseClass.getText("//table[@id='complaintable']");
	
	
	strval3="Pulses Per Min";
	
	
	Assert.assertTrue(!strval.contains(strval3));

	

	
}


public void verifyBloodcheckboxIsNotSelected() {
	strval=objBaseClass.getText("//table[@id='complaintable']");
	

	strval4= "Blood Pressure";
	

	Assert.assertTrue(!strval.contains(strval4));

	

	
}




public void verifyR_RCheckboxIsNotSelected() {
	strval=objBaseClass.getText("//table[@id='complaintable']");
	

	
	String strval5="R/R Per Min";
	
	
	Assert.assertTrue(!strval.contains(strval5));

	

	
}



public void verifyTempCheckboxIsNotSelected() {
	strval=objBaseClass.getText("//table[@id='complaintable']");

	
	String strval6="Temp";
	

	
	
	Assert.assertTrue(!strval.contains(strval6));

	

	
}


public void verifyK_C_O_CheckboxisNotSelected() {
	strval=objBaseClass.getText("//table[@id='complaintable']");
	

	String strval7="K/C/O";
	

	Assert.assertTrue(!strval.contains(strval7));
	

	
}


	
	
	



}