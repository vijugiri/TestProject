package com.master;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.appointment.AddpatientPage;
import com.appointment.AddpatientView;
import com.dashboard.DashboardPage;
import com.login.LoginPage;
import com.main.BaseClass;

import Treatment.treatmentpage;

public class masterView extends BaseClass {
	
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
	
	
	public void clickOnMaster() throws InterruptedException {
		
		  JavascriptExecutor js= (JavascriptExecutor)driver;
		    js.executeScript("javascript:window.scrollBy(102.13,19)");
		Thread.sleep(3000);
		
		objBaseClass.scrollToView("//span[contains(text(),'Master')]");
		objBaseClass.mouseHover("//span[contains(text(),'Master')]");
		
		
	}
	
	

	public void clickOnAddNewEmployee() throws InterruptedException {

		
		objBaseClass.scrollToView("//span[contains(text(),'Add New Employee')]");
		Thread.sleep(2000);
		objBaseClass.mouseHover("//span[contains(text(),'Add New Employee')]");
		
		
	}
	public void clickOnAddemp() {
		objBaseClass.mouseHover("//a[contains(text(),'Add Employee')]");
	}
	
	

	public void clickOnWorkDetailTab() {
		objBaseClass.mouseHover("//a[contains(text(),' Work Details')]");
	}

	public void clickOnWorkDetailsSundayTime() {
		objBaseClass.mouseHover("//*[@id='newrow1']/div[2]/div/div/label[2]");
	}
	
	
	
	
	public void setFirstName(String Firstname) {
		
		objBaseClass.setText("//input[@id='firstName']", Firstname);
		
	}
	
	
	public void clickOnNextButton() throws InterruptedException {
		
		 JavascriptExecutor js= (JavascriptExecutor)driver;
		    js.executeScript("javascript:window.scrollBy(120,33.91)");
		Thread.sleep(1000);
		objBaseClass.clickUsingJavaScripter("//button[contains(text(),'Next')]");

	}
	
	public void selectRole(String Role) {
		objBaseClass.selectDropDown("//select[@id='roleId']", Role);
	}
	

	public void setQualificcation(String Qualification) {
		objBaseClass.setText("//input[@id='qualification']", Qualification);
	}
	
	

	public void setSpeciality(String Speciality) {
		objBaseClass.setText("//input[@id='speciality']", Speciality);
	}
	
	
	public void clickonPatientDetailsNextButton() {
		objBaseClass.clickUsingJavaScripter("//div[@class='pull-right pt-3']//button[3]");
	}
	
	
	

	public void clickonSundayTimeSlotAddHours() throws InterruptedException {
		Thread.sleep(1000);
		objBaseClass.mouseHover("//div[@id='addNewTime1']//div/a");
	}
	

	
	
	
	
	
	
public void setSteartTime(String time) {
	objBaseClass.setText("//input[@id='starttime-1-0']", time);
	
}

public void setEndTime(String time) {
objBaseClass.setText("//input[@id='endtime-1-0']", time);

}



public void setStartTimeOfSunday(String time) {
	this.setSteartTime(time);
}

public void setEndTimeOfSunday(String time) {
	this.setEndTime(time);
}

////////////////////


public void clickOnWorkDetailsMondayTime() {
	objBaseClass.mouseHover("//div[@id='newrow2']//div[2]");
}


public void clickonMondayTimeSlotAddHours() throws InterruptedException {
	Thread.sleep(1000);
	objBaseClass.mouseHover("//div[@id='addNewTime2']//div/a");
}

public void setSteartTimeMonday(String time) {
objBaseClass.setText("//input[@id='starttime-2-0']", time);

}

public void setEndTimeMonday(String time) {
objBaseClass.setText("//input[@id='endtime-2-0']", time);

}



public void setSteartTimeMonda(String time) {
	this.setSteartTimeMonday(time);
}

public void setendTimeMonda(String time) {
	this.setEndTimeMonday(time);
}




///////////////////////tuesday



public void clickOnWorkDetailsTuesdayTime() {
	objBaseClass.mouseHover("//div[@id='newrow3']//div[2]");
}


public void clickonTuesdayTimeSlotAddHours() throws InterruptedException {
	Thread.sleep(1000);
	objBaseClass.mouseHover("//div[@id='addNewTime3']//div/a");
}

public void setSteartTimeTuesday(String time) {
objBaseClass.setText("//input[@id='starttime-3-0']", time);

}

public void setEndTimeTuesday(String time) {
objBaseClass.setText("//input[@id='endtime-3-0']", time);

}



public void setSteartTimeTuesda(String time) {
	this.setSteartTimeTuesday(time);
}

public void setendTimeTuesda(String time) {
	this.setEndTimeTuesday(time);
}




///////////////////////Wednesday



public void clickOnWorkDetailsWednesdayTime() {
	objBaseClass.mouseHover("//div[@id='newrow4']//div[2]");
}


public void clickonWednesdayTimeSlotAddHours() throws InterruptedException {
	Thread.sleep(1000);
	objBaseClass.mouseHover("//div[@id='addNewTime4']//div/a");
}

public void setSteartTimeWednesday(String time) {
objBaseClass.setText("//input[@id='starttime-4-0']", time);

}

public void setEndTimeWednesday(String time) {
objBaseClass.setText("//input[@id='endtime-4-0']", time);

}



public void setSteartTimeWednesda(String time) {
	this.setSteartTimeWednesday(time);
}

public void setendTimeWednesday(String time) {
	this.setEndTimeWednesday(time);
}



///////////////Thrusday


public void clickOnWorkDetailsThrusdayTime() {
	objBaseClass.mouseHover("//div[@id='newrow5']//div[2]");
}


public void clickonThrusdayTimeSlotAddHours() throws InterruptedException {
	Thread.sleep(1000);
	objBaseClass.mouseHover("//div[@id='addNewTime5']//div/a");
}

public void setSteartTimeThrusday(String time) {
objBaseClass.setText("//input[@id='starttime-5-0']", time);

}

public void setEndTimeThrusday(String time) {
objBaseClass.setText("//input[@id='endtime-5-0']", time);

}



public void setSteartTimeThrusda(String time) {
	this.setSteartTimeThrusday(time);
}

public void setendTimeThrusday(String time) {
	this.setEndTimeThrusday(time);
}

	

/// Friday



public void clickOnWorkDetailsFridayTime() {
	objBaseClass.mouseHover("//div[@id='newrow6']//div[2]");
}


public void clickonFridayTimeSlotAddHours() throws InterruptedException {
	Thread.sleep(1000);
	objBaseClass.mouseHover("//div[@id='addNewTime6']//div/a");
}

public void setSteartTimeFriday(String time) {
objBaseClass.setText("//input[@id='starttime-6-0']", time);

}

public void setEndTimeFriday(String time) {
objBaseClass.setText("//input[@id='endtime-6-0']", time);

}



public void setSteartTimeFrida(String time) {
	this.setSteartTimeFriday(time);
}

public void setendTimeFriday(String time) {
	this.setEndTimeFriday(time);
}




/// Saturday



public void clickOnWorkDetailsSaturdayTime() {
	objBaseClass.mouseHover("//div[@id='newrow7']//div[2]");
}


public void clickonSaturdayTimeSlotAddHours() throws InterruptedException {
	Thread.sleep(1000);
	objBaseClass.mouseHover("//div[@id='addNewTime7']//div/a");
}

public void setSteartTimeSaturday(String time) {
objBaseClass.setText("//input[@id='starttime-7-0']", time);

}

public void setEndTimeSaturday(String time) {
objBaseClass.setText("//input[@id='endtime-7-0']", time);

}



public void setSteartTimeSaturda(String time) {
	this.setSteartTimeSaturday(time);
}

public void setendTimeSaturday(String time) {
	this.setEndTimeSaturday(time);
}
	





public void clickOnNextButtonOnWorkDetailsPage() throws InterruptedException {
	
	 JavascriptExecutor js= (JavascriptExecutor)driver;
	    js.executeScript("javascript:window.scrollBy(120,33.91)");
	Thread.sleep(1000);
	objBaseClass.clickUsingJavaScripter("//div[@id='Section3']/div/div/div/div/div[2]/div/a/button");

}



public void setMobileNumber(String mobile) {
	objBaseClass.setText("//input[@id='contactNo1']", mobile);
}



public void setemail(String email) {
	objBaseClass.setText("//input[@id='emailId']", email);
}



public void selectState(String State) throws InterruptedException {
	Thread.sleep(1000);
	objBaseClass.selectDropDown("//select[@id='stateId']", State);
}



public void selectDistrict(String District) throws InterruptedException {
	Thread.sleep(1000);
	objBaseClass.selectDropDown("//select[@id='districtId']", District);
}


public void selectCity(String City) throws InterruptedException {
	Thread.sleep(1000);
	objBaseClass.selectDropDown("//select[@id='cityId']", City);
}

public void setPinCode(String PIN ) {
	objBaseClass.setText("//input[@id='pinCode']", PIN);
}

public void setAddress(String Address) {
	objBaseClass.setText("//textarea[@id='addressLine1']", Address);
}

public void clickSubmitOnEmpAdd() {

	 JavascriptExecutor js= (JavascriptExecutor)driver;
	    js.executeScript("javascript:window.scrollBy(120,33.91)");
	
	    objBaseClass.clickUsingJavaScripter("//*[@id='Section4']/div[5]/div/div/button[2]");

}


public void clickOnAddNewRole() throws InterruptedException {

	
	objBaseClass.scrollToView("//span[contains(text(),'Add New Role')]");
	Thread.sleep(2000);
	objBaseClass.mouseHover("//span[contains(text(),'Add New Role')]");
	
	
}
public void setRollName() {
	objBaseClass.setText("//input[@id='name']", "Clinic Operator");
}


public void setRollDescription() {
	objBaseClass.setText("//textarea[@id='description']", "Work on computer only ");
}

public void clickOnSubmitAddRoll() throws InterruptedException {
	objBaseClass.mouseHover("//button[contains(text(),'Submit')]");
	Thread.sleep(2000);
	objBaseClass.refresh();
}


public void clickUpdateEdirttAddRoll() throws InterruptedException {
	objBaseClass.mouseHover("//button[contains(text(),'Update')]");
	Thread.sleep(2000);
	objBaseClass.refresh();
}

public void clickAddRoll() throws InterruptedException {
	objBaseClass.mouseHover("//a[contains(text(),'Add Role')]");

}

public void verifyNewAddedRolel() {
	
	objBaseClass.isdisplayed("//tbody[@class='removeScroll']//tr/td[contains(text(),'Clinic Operator')]");
}

public void clickOnEditNewAddedRoll() throws InterruptedException {
	objBaseClass.mouseHover("//tbody[@class='removeScroll']//tr/td[contains(text(),'Clinic Operator')]//following-sibling:: td[2]/a[1]");
	
	
}

public void clickOnDeleteNewAddedRoll() throws InterruptedException {
	objBaseClass.mouseHover("//tbody[@class='removeScroll']//tr/td[contains(text(),'Clinic Operator')]//following-sibling:: td[2]/a[2]");
	Thread.sleep(2000);
	objBaseClass.mouseHover("/html/body/div[6]/div[2]/a/button/i");
	Thread.sleep(2000);
	objBaseClass.refresh();
}


public void EditRollDescription() {
	
	
	objBaseClass.ClearText("//textarea[@id='description']");
	objBaseClass.setText("//textarea[@id='description']", "computer only ");
}





public void setfeesPerticular() {
	
	
	objBaseClass.ClearText("//input[@id='name']");
	objBaseClass.setText("//input[@id='name']", "Injection by doctor");
}

public void verifyNewFeesstru() {
	
	objBaseClass.isdisplayed("//tbody[@class='removeScroll']//tr/td[contains(text(),'Injection by doctor')]");
}



public void clickOnEditNewFeesstru() throws InterruptedException {
	objBaseClass.mouseHover("//tbody[@class='removeScroll']//tr/td[contains(text(),'Injection by doctor')]//following-sibling:: td[4]/a[1]");
	
	
}


public void setfeesDescription() {
	
	
	objBaseClass.ClearText("//input[@id='description']");
	objBaseClass.setText("//input[@id='description']", "patient need to injection");
}


public void setfeesAmount() {
	
	
	objBaseClass.ClearText("//input[@id='amount']");
	objBaseClass.setText("//input[@id='amount']", "100");
}



public void clickOnFeesStructure() throws InterruptedException {

	Thread.sleep(2000);
	objBaseClass.scrollToView("//span[contains(text(),'Fees Structure')]");
	Thread.sleep(2000);
	objBaseClass.mouseHover("//span[contains(text(),'Fees Structure')]");
	
	
}




public void clickOnAddBranch() throws InterruptedException {

	Thread.sleep(2000);
	objBaseClass.scrollToView("//span[contains(text(),'Add Branch')]");
	Thread.sleep(2000);
	objBaseClass.mouseHover("//span[contains(text(),'Add Branch')]");
	
	
}

public void clickOnAddFeesStructure() throws InterruptedException {

	
	objBaseClass.mouseHover("//a[contains(text(),'Add Fee')]");
	
	
}

public void BranchDetailsheader() {
	objBaseClass.isdisplayed("//h4[contains(text(),'Branch Details')]");
}

public void EditfeesPerticular() {
	
	
	objBaseClass.ClearText("//input[@id='name']");
	objBaseClass.setText("//input[@id='name']", "Injection");
}



public void deleteNewFeesstru() throws InterruptedException {
	objBaseClass.mouseHover("//tbody[@class='removeScroll']//tr/td[contains(text(),'Injection')]//following-sibling:: td[4]/a[2]");
	Thread.sleep(2000);
	objBaseClass.mouseHover("/html/body/div[6]/div[2]/a/button/i");
	Thread.sleep(2000);
	objBaseClass.refresh();
	
}

public void clickRegisternewbranch() {
	objBaseClass.mouseHover("//a[contains(text(),'Register New Branch')]");
}

 public void verifyAddedBranch(String BranchNAme) {
	 objBaseClass.isdisplayed("//tbody[@class='removeScroll']//tr/td[contains(text(),'"+BranchNAme+"')]");
 }

 
 

public void setUsernameRegisterPage(String Username)
{
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys(Username);
}



public void setFnameameRegisterPage(String Firstname)
{
	driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(Firstname);
}


public void setLastNameRegisterPage(String Lastname)
{
	driver.findElement(By.xpath("//input[@id='lname']")).sendKeys(Lastname);
}




public void address(String Address)
{
WebElement addres=driver.findElement(By.xpath("//textarea[@id='addressLine1']"));
addres.sendKeys(Address);
}

 public void selectonlinecheckbox() {
	 objBaseClass.selectCheckbox("/html/body/div[4]/div[2]/div/div[2]/div/div/div/div/div[2]/div/form/div[1]/div[2]/div/label/input");
 }
 
 
 public void clickonNext() throws InterruptedException {
	 objBaseClass.scrollToView("//button[contains(text(),'Next')]");
	 Thread.sleep(2000);
	 objBaseClass.mouseHover("//button[contains(text(),'Next')]");
 }
 
 

 
 
 
 
 
 
 
 
 
 
 
 
 

	
}
