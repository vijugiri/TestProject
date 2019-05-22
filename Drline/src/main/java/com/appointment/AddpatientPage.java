package com.appointment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.dashboard.BookApointmentFromDashboard;
import com.dashboard.DashboardView;
import com.login.LoginPage;
import com.login.LoginPageView;
import com.main.BaseClass;

public class AddpatientPage extends BaseClass{	
	LoginPage objLoginPage=new LoginPage();
	BaseClass objBaseClass= new BaseClass();
	LoginPageView objLoginPageView= new LoginPageView();

	DashboardView objDashboardView= new DashboardView();
	BookApointmentFromDashboard objBookApointmentFromDashboard= new BookApointmentFromDashboard();



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
	
	public void setSearchPatient(String MobNo) throws InterruptedException {
		Thread.sleep(3000);
		objBaseClass.setText("//input[@id='save-book-search']", MobNo);
		
		
		Thread.sleep(4000);
		
		
		boolean autosearch = isElementPresent(By.xpath("//div[@class='autocomplete-suggestions']"));

		//WebElement autosearch=driver.findElement(By.xpath("//div[@class='autocomplete-suggestions']"));
		Thread.sleep(2000);
		if(autosearch==true)
		{
			Thread.sleep(1000);
			objBaseClass.mouseHover("//div[@class='autocomplete-suggestions']");
		
		}
		
		/*else {
			
			this.setFullname(FullName);
			
			Thread.sleep(4000);
			objBaseClass.click("//input[@id='fullName']");
			objBaseClass.ClearText("//input[@id='fullName']");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='fullName']"));
		
		}*/
	
	}
	
	
	
	
	
	
	
	public void setFullname(String FullName) throws InterruptedException {
		
		try {
	WebElement	fname=driver.findElement(By.xpath("//input[@id='fullName']"));
	Thread.sleep(1000);
	//String fName=fname.getAttribute("text");
	String fName=fname.getText();
	System.out.println("full name is"+fName);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		if(!fName.equals(FullName)) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			objBaseClass.ClearText("//input[@id='fullName']");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='fullName']")).sendKeys(FullName);
			
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
		
		
	}
	

	
	
	
	
	
	
	
	public void setDiseseOnAddpatient(String Disease) throws InterruptedException
	{	Thread.sleep(1000);
	
	objBaseClass.ClearText("//input[@id='disease']");
	Thread.sleep(1000);
		objBaseClass.setText("//input[@id='disease']", Disease);
	}
	
	
	
	

public void SelectGender(String Gender) throws InterruptedException
{	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Select selGender = new Select(driver.findElement(By.xpath("//select[@id='gender']")));
	selGender.selectByVisibleText(Gender);
}

	

public void setDOBOnAddpatient(String Year,String month, String day) throws InterruptedException
{
objBaseClass.ClearText("//input[@id='dob']"); 
	

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	objBaseClass.click("//input[@id='dob']");
	
	
	
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//select[@class='ui-datepicker-year']
Select selyear = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
selyear.selectByVisibleText(Year);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
Select selmonth = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
selmonth.selectByVisibleText(month);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	//objBaseClass.click("//a[contains(text(),'"+Date+"')]");
	//objBaseClass.click("//table[@class='ui-datepicker-calendar']//a[contains(text(),'"+day+"')]");
	
	WebElement  element=driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[contains(text(),'"+ day +"')]"));   
	JavascriptExecutor ex=(JavascriptExecutor)driver;
	  ex.executeScript("arguments[0].click()", element);
	
}
	
	

public void setAgeOnAddpatient(String Age) throws InterruptedException
{
	
objBaseClass.ClearText("//input[@id='age']"); 
	
	Thread.sleep(1000);
	objBaseClass.setText("//input[@id='age']", Age);
}

	


public void setWaightAddpatient(String Weight) throws InterruptedException
{
	objBaseClass.ClearText("//input[@id='weightValue']"); 
	
	Thread.sleep(1000);
objBaseClass.setText("//input[@id='weightValue']", Weight);
}
	
	


public void setHeightAddpatient(String Height) throws InterruptedException
{
objBaseClass.ClearText("//input[@id='hightValue']"); 
	
	Thread.sleep(1000);
objBaseClass.setText("//input[@id='hightValue']", Height);
}


public void setNoteAddpatient(String Note) throws InterruptedException
{
objBaseClass.ClearText("//textarea[@id='note']"); 
	
	Thread.sleep(1000);
objBaseClass.setText("//textarea[@id='note']", Note);
}	
	




public void clickSaveAndBookAddpatientbutton() throws InterruptedException
{
	
	
	
	WebElement  element=driver.findElement(By.xpath("//button[contains(text(),'Save & Book Appointment')]"));   
	JavascriptExecutor ex=(JavascriptExecutor)driver;
	  ex.executeScript("arguments[0].click()", element);
	
	
	
	
//bjBaseClass.click("//button[contains(text(),'Save & Book Appointment')]");


try {
	if(driver.findElement(By.xpath("//span[contains(text(),'Appointment has already booked.')]")).isDisplayed()) {
		
		objBaseClass.refresh();
		
		
	}else {
	Thread.sleep(1000);
	objBaseClass.refresh();
	}
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}

public void setEmailIdAddpatinetPage(String EmailId) throws InterruptedException
{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@id='email']")).clear();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(EmailId);
}

public void clickAllClearOnAddpatientbutton()
{
	
	
	WebElement  element=driver.findElement(By.xpath("//button[contains(text(),'All Clear')]"));   
	JavascriptExecutor ex=(JavascriptExecutor)driver;
	  ex.executeScript("arguments[0].click()", element);
	

}

public void selectWeightFormat(String selectByVisibleText) {
	
	objBaseClass.selectDropDown("//select[@id=\"weightType\"]", selectByVisibleText);
	
	
}



public void selectheightFormat(String selectByVisibleText) {
	
	objBaseClass.selectDropDown("//select[@id=\"hightType\"]", selectByVisibleText);
	
	
}
public void setPatientNameInSearcField(String keysToSend) 
{
	
	driver.findElement(By.xpath("//input[@id='searchHighlight']")).sendKeys(keysToSend);
	driver.findElement(By.xpath("//input[@id='searchHighlight']")).sendKeys(Keys.ENTER);
	

}
public void clickonUpdateOnAddpatientPage() throws InterruptedException {

WebElement  element=driver.findElement(By.xpath("//button[contains(text(),'Update')]"));   
JavascriptExecutor ex=(JavascriptExecutor)driver;
  ex.executeScript("arguments[0].click()", element);

 Thread.sleep(2000);
 
 objBaseClass.refresh();
}

}
