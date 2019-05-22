package com.Transaction;

import java.util.List;
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
import com.dashboard.DashboardView;
import com.login.LoginPage;
import com.main.BaseClass;

import Treatment.treatmentpage;

public class TransactionView extends BaseClass {
	
	LoginPage objLoginPage=new LoginPage();
	BaseClass objBaseClass= new BaseClass();
	AddpatientPage objAddpatientPage= new AddpatientPage();
	treatmentpage objtreatmentpage = new treatmentpage();
AddpatientView objAddpatientView= new AddpatientView();
DashboardPage objDashboardPage= new DashboardPage();
TransactionPage objTransactionPage = new TransactionPage();
DashboardView objDashboardView= new DashboardView();

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

	
	public void clickOnTransaction() throws InterruptedException {
		objTransactionPage.clickOnTransaction();
	}
	
	
	public void clickOnCollection() throws InterruptedException {
		objTransactionPage.clickonCollecton();
	}

	public void verifyCollectionAmount(String strval) throws InterruptedException {
		
strval2=objBaseClass.getText("//div[@id='example_wrapper']");

		System.out.println("strval2====="+strval2);
		Assert.assertTrue(strval2.contains(strval));
		
		
	}
	
	
	
	public void clickOnExpenditure() throws InterruptedException {
		objTransactionPage.clickOnExpenditure();
	}
	
	
	
	
	public void headerofExpenditureidDisplayed() {
		objBaseClass.isdisplayed("//h4[contains(text(),'Expenditure')]");
	}
	
	
	public void HandoverLinkisdisplayed() {
		objBaseClass.isdisplayed("//a[contains(text(),'Handover')]");
	}
	
	

	public void AddExpenditureDetailsLinkisdisplayed() {
		objBaseClass.isdisplayed("//a[contains(text(),'Add Expenditure Details')]");
	}
	
	public void clickOnAddExpenditureDetailsLink() {
		objBaseClass.clickUsingJavaScripter("//a[contains(text(),'Add Expenditure Details')]");
	}
	
	
	public void setnarretion(String Narration) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		objBaseClass.setText("//input[@id='name']", Narration);
	}
	
	

	public void setAmount(String Amount) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
		objBaseClass.ClearText("//input[@id='expenseAmount']");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		objBaseClass.setText("//input[@id='expenseAmount']", Amount);
	}
	

	public void setDiscription(String Description) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
		objBaseClass.ClearText("//textarea[@id='description']");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		objBaseClass.setText("//textarea[@id='description']", Description);
	}
	
	
	public void clickSubmitOnExpenditure() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(120,33.91)");
		
		objBaseClass.mouseHover("//button[contains(text(),'Submit')]");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	
		
		
	}
	
	
	public void verifyExpenditureNaretion(String Narration) 
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement element=objBaseClass.getTableDataFromTBody("tbl5", "1", "3");

		strval=element.getText();
		
		Assert.assertTrue(strval.contains(Narration));
		
		
	}
	
	public void verifyExpenditureAmount(String Amount) 
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement element=objBaseClass.getTableDataFromTBody("tbl5", "1", "4");
		strval=element.getText();
		
		Assert.assertTrue(strval.contains(Amount));
		
		
	}

	public void selectPagination(String Pagevalue) throws InterruptedException {
		Thread.sleep(2000);
		objBaseClass.selectDropDown("//select[@id='pageValue']", Pagevalue);
		
		
	}
	
	public void verifypaginitionvalue(String Pagevalue) {
		 List<WebElement> drpList=driver.findElements(By.xpath("//select[@id='pageValue']"));
		
		for (WebElement webElement : drpList) {
			
			strval=webElement.getText();
			System.out.println(strval);
			
			
		}
		
		Assert.assertTrue(strval.contains(Pagevalue));
		
		
	}
	
	
	public void clickOnSearchFunction() {
		
		objBaseClass.mouseHover("//button[contains(text(),'Search')]");
		
	}
	
	
	public void verifyErrormessage() throws InterruptedException {
		Thread.sleep(1000);
		strval= objBaseClass.getText("//span[@id='DateError']");
		strval2="Please Select Valid Date.";
		Assert.assertTrue(strval.contains(strval2));
		Thread.sleep(1000);
		
	}
	public void clickInStartDate() {
		objBaseClass.mouseHover("//input[@id='startDate']");
	}
	public void clickInendDate() {
		objBaseClass.mouseHover("//input[@id='endDate']");
	}
	
	
	public void selectStartDateMonth(String Month) throws InterruptedException {
		
		
		objBaseClass.selectDropDown("//select[@class='ui-datepicker-month']", Month);
		Thread.sleep(1000);
		
		
		
	}
	
public void selectStartDateyear(String year) throws InterruptedException {
		
		
		objBaseClass.selectDropDown("//select[@class='ui-datepicker-year']", year);
		Thread.sleep(1000);
		
		
		
	}

	
public void selectStartDateday(String date) {
	 objBaseClass.mouseHover("//table[@class='ui-datepicker-calendar']//a[contains(text(),'"+ date +"')]");

}
	

	public void selectStartDate(String year,String Month,String date) throws InterruptedException {
		Thread.sleep(2000);
		this.selectStartDateyear(year);
		Thread.sleep(2000);
		this.selectStartDateMonth(Month);
		Thread.sleep(2000);
		this.selectStartDateday(date);
		
		
		
		
	}
	
	
	public void oopsErrormessageDisplayed() {
		
		WebElement element = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
		
		
		if(element.isDisplayed()) {
		objBaseClass.mouseHover("//div//button[contains(text(),'Back')]");
	}
	}
	
	
	
	public void clickOnEditExpenditure() throws InterruptedException {
		Thread.sleep(1000);
		objBaseClass.mouseHover("//tbody[@id='tbl5']//tr[1]/td[6]/a");
	}
	
	
	public void clickOnHandOver() {
		objBaseClass.mouseHover("//a[contains(text(),'Handover')]"); 
	

	}
	

	
	public void copyAndPastHandoverAmount() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//input[@id='balance']"));
		Thread.sleep(3000);	
		action.doubleClick(element).perform();
		
		Thread.sleep(3000);	
driver.findElement(By.xpath("//input[@id='balance']")).sendKeys(Keys.chord(Keys.CONTROL,"c"));


Thread.sleep(3000);		
driver.findElement (By.xpath("//input[@id='closingBalance']")).sendKeys(Keys.chord(Keys.CONTROL, "v"));
		
}
	
	public void setNote() {
		objBaseClass.setText("//textarea[@id='note']", "It was Expenditure");
	}
	
	
	
	
	public void clickOnSubmit() throws InterruptedException {
		objBaseClass.mouseHover("//button[contains(text(),'Submit')]");
		

		
		
		
	}

	public void clickOnHandoverhistory() throws InterruptedException {
		Thread.sleep(1000);
		objBaseClass.mouseHover("//li[@id='Handover History']");

	}
	
	
	public void verifyHandoverHistory(String Firstname) {
		
		strval= objBaseClass.getText("//tbody[@id='tbl5']//tr[1]/td[6]");
		strval4=Firstname;
		
		Assert.assertTrue(strval.contains(strval4));
		strval2= objBaseClass.getText("//tbody[@id='tbl5']//tr[1]/td[7]");
        strval3="DRAWER INITIATE";
		
		Assert.assertTrue(strval2.contains(strval3));
		
	}
	
	
	public void verifyHistoryOfHandoverHistory(String amount,String Dtawerstatus) {
		
		objBaseClass.mouseHover("//tbody[@id='tbl5']//tr[1]/td[8]");
		
		strval= objBaseClass.getText("//*[@id='example_wrapper']/div[1]/div/div[2]/div[2]");
		
		System.out.println(strval.contains(amount));
		
		
		strval4=objBaseClass.getText("//*[@id='example_wrapper']/div[1]/div/div[2]/div[3]");
		System.out.println(strval4.contains(Dtawerstatus));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
