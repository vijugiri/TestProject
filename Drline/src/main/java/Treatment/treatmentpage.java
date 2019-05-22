package Treatment;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.login.LoginPage;
import com.main.BaseClass;

public class treatmentpage extends BaseClass {
	
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

	public void patientname(String FullName) throws InterruptedException {
		
		//driver.findElement(By.xpath("//table[@class='"+classvalue+"']//tr["+trNo+"]/th["+thNo+"]"));
		

		Thread.sleep(2000);
		strval=objBaseClass.getTableDataFromTableId("example","1","2").getText();
		System.out.println("strval is "+strval);
		strval2 =FullName;
		assertTrue(strval.contains(strval2));
		
		
	}


	
	public void setComplaints(String pulses,String Systolic,String diastolic,String repositoryRate,String temprature)
	
			{
		objBaseClass.ClearText("//input[@id='pulses']");
		objBaseClass.setText("//input[@id='pulses']", pulses);
		
		objBaseClass.ClearText("//input[@id='systolic']");
		objBaseClass.setText("//input[@id='systolic']", Systolic);
		
		objBaseClass.ClearText("//input[@id='diastolic']");
		objBaseClass.setText("//input[@id='diastolic']", diastolic);
		
		objBaseClass.ClearText("//input[@id='repositoryRate']");
		objBaseClass.setText("//input[@id='repositoryRate']", repositoryRate);
		
		objBaseClass.ClearText("//input[@id='temprature']");
		objBaseClass.setText("//input[@id='temprature']", temprature);
	
	
			}
	
	public void setMedicine(String medicineNeme) throws InterruptedException {
	
		Thread.sleep(2000);
		objBaseClass.ClearText("//input[@id='name_1']");
		
		objBaseClass.setText("//input[@id='name_1']", medicineNeme);
		
		Thread.sleep(1000);

		boolean autosearch = isElementPresent(By.xpath("//div[@class='autocomplete-suggestion']"));

		//WebElement autosearch=driver.findElement(By.xpath("//div[@class='autocomplete-suggestions']"));
		Thread.sleep(2000);
		if(autosearch==true)
		{
			Thread.sleep(1000);
			objBaseClass.mouseHover("//div[@class='autocomplete-suggestion']");
		
		}
	}
	
	
	
	
	public void selectDoseMorning() throws InterruptedException {

		Thread.sleep(3000);
		
		objBaseClass.scrollToView("//*[@id='itemId_1']/following-sibling::input[@id='timing_1']");
		
		driver.findElement(By.xpath("//*[@id='itemId_1']/following-sibling::input[@id='timing_1']")).click();
		if(!driver.findElement(By.xpath("//*[@id='itemId_1']/following-sibling::input[@id='timing_1']")).isSelected())    
		// to check the checkbox is already selected or not
		{

		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='itemId_1']/following-sibling::input[@id='timing_1']")).click(); // Select the checkbox

		}
		
		
		
		
		
		
		
		//objBaseClass.selectCheckbox("//table[@id='tab_logic']//td[3]/div/div[1]/div[1]/div[1]");
		
	}

	public void selectDoseAfterNoon() throws InterruptedException {
		Thread.sleep(2000);
	
		objBaseClass.selectCheckbox("//*[@id='futureDiseaseItemsDosesId_1_dose_2']/following-sibling::input");
		
	}
	

	public void selectDoseEvening() throws InterruptedException {
		Thread.sleep(2000);
		objBaseClass.selectCheckbox("//div/label[@class='form-check-label']//input[@value='3']");
		
	}
	

	public void selectDoseNight() throws InterruptedException {
		Thread.sleep(2000);
		objBaseClass.selectCheckbox("//div/label[@class='form-check-label']//input[@value='4']");
		
	}
	
	
	public void selectAfterFood() throws InterruptedException {
		Thread.sleep(2000);
		objBaseClass.selectCheckbox("//div/label[@class='form-check-label']//input[@id='after_food_1']");
	}
	
	

	public void selectBeforeFood() throws InterruptedException {
		Thread.sleep(2000);
		objBaseClass.selectCheckbox("//div/label[@class='form-check-label']//input[@id='before_food_1']");
	}
	
	/////////////////////////////////
	
	
	
	public void SetmorningDose(String Dose) {
		
		objBaseClass.ClearText("//input[@id='timing_1_dose_1']");
		objBaseClass.setText("//input[@id='timing_1_dose_1']", Dose);
	}
	

	public void SetAfternoonDose(String Dose) {
		
		objBaseClass.ClearText("//input[@id='timing_1_dose_2']");
		objBaseClass.setText("//input[@id='timing_1_dose_2']", Dose);
	}
	
	

	public void SetEveningDose(String Dose) {
		
		objBaseClass.ClearText("//input[@id='timing_1_dose_3']");
		objBaseClass.setText("//input[@id='timing_1_dose_3']", Dose);
	}
	

	public void SetNightDose(String Dose) {
		
		objBaseClass.ClearText("//input[@id='timing_1_dose_4']");
		objBaseClass.setText("//input[@id='timing_1_dose_4']", Dose);
	}
	public void SetDays(String Days) {
		
		objBaseClass.ClearText("//input[@id='days_1']");
		objBaseClass.setText("//input[@id='days_1']", Days);
	}
	
	
	public void SetConsultingCharges(String ConsultingCharge) throws InterruptedException {
	
	objBaseClass.ClearText("//input[@id='feesamount']");
	objBaseClass.setText("//input[@id='feesamount']", ConsultingCharge);
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@id='feesamount']")).sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	}

	
	

	public void SetAdvice(String Advice) {
	
		objBaseClass.ClearText("//textarea[@id='advice']");
	objBaseClass.setText("//textarea[@id='advice']", Advice);
	}
	
	
	public void clickContinueButtonWithYesoption() throws InterruptedException {
		
		objBaseClass.clickUsingJavaScripter("//button[contains(text(),'Continue')] ");
		
	
	}
	
	
	
	
	

	public void clickContinueButtonWithNooption() {
		
		objBaseClass.clickUsingJavaScripter("//button[contains(text(),'Continue')] ");
		
		if(driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[12]/div/div/div[2]/button[1]")).isDisplayed()) {
		
		objBaseClass.clickUsingJavaScripter("/html/body/div[4]/div[2]/div[12]/div/div/div[2]/button[1]");
		
	}
	
	}
	
	
	
	public void clickOnSaveAndCollectPayment() 
	{
		objBaseClass.clickUsingJavaScripter("//button[@id='savebillPayment']");
	}
	
	

	public void clickOnSave() 
	{
		objBaseClass.clickUsingJavaScripter("//*[@id='savebill']");
	}
	
	

	public void clickOnCollect() throws InterruptedException 
	{
		objBaseClass.clickUsingJavaScripter("//button[@id='cash']");
		
		Thread.sleep(1000);
		
		objBaseClass.refresh();

	
		
		
		
	}
	

	
	public void clickInvestigationreport() {
		objBaseClass.clickUsingJavaScripter("//a[contains(text(),'Add Investigation Report')]");
	}
	
	

	public void setInvestigationreportName() {
		objBaseClass.setText("//input[@id='reportName']", "Test");
	}
	
	//input[@id='upload-file-input']
	public void clickChooseInvestigationreport() {
		objBaseClass.clickUsingJavaScripter("//input[@id='upload-file-input']");
	}
	
	
	
	public WebElement clickTreatmentHorizontaltabByName(String Tabname){
		
		WebElement element=driver.findElement(By.xpath("//label[@class='label d-none d-sm-block labeltab']/span[contains(text(),'"+ Tabname +"')]"));
		
		
		return element;
		
		
	}
	public void clickAllHistorytab() {
		objBaseClass.clickUsingJavaScripter("//label[@class='labeltab label d-none d-sm-block']");
	}
	
	
	

	public void clickSubmitButtonReferto() {
		
		objBaseClass.clickUsingJavaScripter("//*[@id='content4']/div[2]/div/div/div/div[3]/div[1]/div/div/button[2]");
		
	
		objBaseClass.refresh();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
