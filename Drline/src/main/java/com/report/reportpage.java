package com.report;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;

import com.dashboard.DashboardView;
import com.login.LoginPageView;
import com.main.BaseClass;

public class reportpage extends BaseClass {
	
	
	BaseClass objBaseClass= new BaseClass();
	LoginPageView objLoginPageView= new LoginPageView();

	DashboardView objDashboardView= new DashboardView();
	
	String strval=null;
	String strval2=null;
	String strval3=null;
	String strval4=null;
	
	
	public void clickonAllReport() {
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
	  //  js.executeScript("javascript:window.scrollBy(200,120.13)");
	
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		objBaseClass.scrollToView("//span[contains(text(),'All Reports')]");
	    JavascriptExecutor js= (JavascriptExecutor)driver;
	    js.executeScript("javascript:window.scrollBy(102.13,19)");
	  /*  
	    WebElement webelement=driver.findElement(By.xpath("//span[contains(text(),'All Reports')]"));
	    
	    Actions act= new Actions(driver);
	   act.moveToElement(webelement).click().build().perform();*/
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    objBaseClass.clickUsingJavaScripter("//span[contains(text(),'All Reports')]");
	   
	
	   
	
	    

		
	}
	
	
	
	public void clickonPatientReport() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		objBaseClass.scrollToView("//span[contains(text(),'Patient Report')]");
		
		/*  Actions act= new Actions(driver);
		
		   
		   WebElement webelement2=driver.findElement(By.xpath("//span[contains(text(),'Patient Report')]"));
		   
		 act.moveToElement(webelement2).click().build().perform();
		    */
	
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	objBaseClass.clickUsingJavaScripter("//span[contains(text(),'Patient Report')]");
	
	}
	
	
	
	
	public void clickOnCollectionReport() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(1000);
		objBaseClass.mouseHoverWithoutClick("//span[contains(text(),'Collection Report')]");
		Thread.sleep(1000);
		objBaseClass.mouseHover("//span[contains(text(),'Collection Report')]");
	}
	
	
	public void clickOnCollectionsReport() throws InterruptedException {
		
	
		JavascriptExecutor js= (JavascriptExecutor)driver;
	    js.executeScript("javascript:window.scrollBy(102.13,19)");
		Thread.sleep(1000);
		   objBaseClass.clickUsingJavaScripter("//span[contains(text(),'All Reports')]");
			Thread.sleep(2000);
			
			objBaseClass.scrollToView("//li[@id='Collection Report']");
		 
			Thread.sleep(1000);
		    objBaseClass.mouseHover("//li[@id='Collection Report']");
	}
	
	
	public void clickOnExpenseReport() throws InterruptedException {
		
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
	    js.executeScript("javascript:window.scrollBy(102.13,19)");
		Thread.sleep(1000);
		   objBaseClass.clickUsingJavaScripter("//span[contains(text(),'All Reports')]");
			Thread.sleep(2000);
			
			objBaseClass.scrollToView("//li[@id='Expense Report']");
		 
			Thread.sleep(1000);
		    objBaseClass.mouseHover("//li[@id='Expense Report']");
	}
	
	
	
	public void verifysearchfunction(String Narration) throws InterruptedException {
		
		objBaseClass.ClearText("//input[@id='searchBox']");
		Thread.sleep(1000);
		objBaseClass.setText("//input[@id='searchBox']", Narration);
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
