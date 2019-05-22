package com.report;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
public class reportview extends reportpage{
	reportpage objreportpage= new reportpage();
	
	

	String strval=null;
	String strval2=null;
	String strval3=null;
	String strval4=null;
	int intval;
	
	
	public void verifyPatientReport(String FullName) {
		
		objreportpage.clickonAllReport();
		objreportpage.clickonPatientReport();
		
		WebElement element=driver.findElement(By.xpath("//table[@class='table table-bordered']//tr[4]/td[3]"));
		strval=element.getText();
		strval2=FullName;
		
		Assert.assertTrue(strval.contains(strval2));
		
		
		
	}
	
	
	
	public void verifyCollectionReport(String FullName,String ConsultingCharge) throws InterruptedException {
		
	
		
		objreportpage.clickOnCollectionsReport();
		
		WebElement element=driver.findElement(By.xpath("//tbody[@class='removeScroll']//tr[1]/td[3]"));
		strval=element.getText();
		Assert.assertTrue(strval.contains(FullName));
		
		WebElement element1=driver.findElement(By.xpath("//tbody[@class='removeScroll']//tr[1]/td[5]"));
		strval2=element1.getText();
		Assert.assertTrue(strval2.contains(ConsultingCharge));
		
		
	}
	
	public void clickOnCollectionReport() throws InterruptedException {
		
		objreportpage.clickOnCollectionsReport();
	}
	
	
	
	
	public void verifyGeneratePdf() throws InterruptedException {
		JavascriptExecutor js= (JavascriptExecutor)driver;
	    js.executeScript("javascript:window.scrollBy(156.19,33.91)");
		Thread.sleep(1000);
	
		objBaseClass.scrollToView("//button[@id='exportButton']");
		
		objBaseClass.mouseHover("//button[@id='exportButton']");
		
		Thread.sleep(6000);
		Set <String> st= driver.getWindowHandles();
		Iterator<String> it = st.iterator();
		String parent =  it.next();
		String child =it.next();
		//swtich to parent
		driver.switchTo().window(parent);
		System.out.println("Returned to parent");
		
		
		
		
		
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
	
	
	public void enterNameInSearchField(String FullName) throws InterruptedException {
		objBaseClass.setText("//input[@id='searchBox']", FullName);
		driver.findElement(By.xpath("//input[@id='searchBox']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
	}
	
	
	public void verifySearchFunctionality(String FullName) {
		WebElement element=driver.findElement(By.xpath("//tbody[@class='removeScroll']//tr[1]/td[3]"));
		strval=element.getText();
		Assert.assertTrue(strval.contains(FullName));
	}
	
	
	public void verifyExpenditureNaretion(String Narration) throws InterruptedException {
		Thread.sleep(1000);
		strval=	objBaseClass.getText("//tbody[@class='removeScroll']//tr[1]/td[3]");
		Assert.assertTrue(strval.contains(Narration));
			
		}

	public void verifyExpenditureAmount(String Amount) throws InterruptedException {
		Thread.sleep(1000);
		strval=	objBaseClass.getText("//tbody[@class='removeScroll']//tr[1]/td[5]");
		Assert.assertTrue(strval.contains(Amount));
			
		}
		
		
		

	public void EnterNarrationInsearchfunction(String Narration) throws InterruptedException {
		
		objBaseClass.ClearText("//input[@id='searchBox']");
		Thread.sleep(1000);
		objBaseClass.setText("//input[@id='searchBox']", Narration);
		driver.findElement(By.xpath("//input[@id='searchBox']")).sendKeys(Keys.ENTER);
		
	}
	
	

public void Verifysearchfunction(String Narration) throws InterruptedException {
	
strval=objBaseClass.getText("//tbody[@class='removeScroll']//tr[1]/td[3]");
Assert.assertTrue(strval.contains(Narration));
	
}
	




public void clickOnBookingTypeReport() throws InterruptedException {
	
	objBaseClass.scrollToView("//span[contains(text(),'All Reports')]");
	   objBaseClass.clickUsingJavaScripter("//span[contains(text(),'All Reports')]");
		Thread.sleep(2000);
		objBaseClass.scrollToView("//li[@id='Booking Type Report']");

	objBaseClass.mouseHover("//li[@id='Booking Type Report']");
	
	
	
}

public void verifyDirectBookingType() {
	
	objBaseClass.selectDropDown("//select[@id='bookingType']", "DIRECT");
	WebElement element =driver.findElement(By.xpath("//table[@class='table table-bordered']"));
element.getSize();
	Assert.assertTrue(!element.equals(0));
	
}



public void verifyONCALLBookingType() {
	
	objBaseClass.selectDropDown("//select[@id='bookingType']", "ONCALL");
	WebElement element =driver.findElement(By.xpath("//table[@class='table table-bordered']"));
element.getSize();
	Assert.assertTrue(!element.equals(0));
	
}


public void verifyALLBookingType() {
	
	objBaseClass.selectDropDown("//select[@id='bookingType']", "ALL");
	WebElement element =driver.findElement(By.xpath("//table[@class='table table-bordered']"));
element.getSize();
	Assert.assertTrue(!element.equals(0));
	
}



public void clickOnBookingTypeRerport() throws InterruptedException {
	
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
    js.executeScript("javascript:window.scrollBy(102.13,19)");
	Thread.sleep(1000);
	   objBaseClass.clickUsingJavaScripter("//span[contains(text(),'All Reports')]");
		Thread.sleep(2000);
		
		objBaseClass.scrollToView("//li[@id='Booking Type Report']");
	 
		Thread.sleep(1000);
	    objBaseClass.mouseHover("//li[@id='Booking Type Report']");
}


public void selectDirectBookTypeAdnVerify() throws InterruptedException {
	Thread.sleep(1000);
	objBaseClass.selectDropDown("//select[@id='bookingType']", "DIRECT");
	Thread.sleep(1000);
	strval2=objBaseClass.getText("//tbody[@class='removeScroll']//tr[1]/td[6]");
	Assert.assertTrue(strval2.contains("DIRECT"));
}



public void selectONCALLDirectBookTypeAdnVerify() throws InterruptedException {
	Thread.sleep(1000);
	objBaseClass.selectDropDown("//select[@id='bookingType']", "ONCALL");
	Thread.sleep(1000);
	strval2=objBaseClass.getText("//tbody[@class='removeScroll']//tr[1]/td[6]");
	Assert.assertTrue(strval2.contains("ONCALL"));
}


public void selectONLINEDirectBookTypeAdnVerify() throws InterruptedException {
	Thread.sleep(1000);
	objBaseClass.selectDropDown("//select[@id='bookingType']", "ONLINE");
	Thread.sleep(1000);
	strval2=objBaseClass.getText("//tbody[@class='removeScroll']//tr[1]/td[6]");
	Assert.assertTrue(strval2.contains("ONLINE"));
}




public void selectALLDirectBookTypeAdnVerify() throws InterruptedException {
	Thread.sleep(1000);
	objBaseClass.selectDropDown("//select[@id='bookingType']", "ALL");
	
	Thread.sleep(1000);
List	<WebElement>  element=driver.findElements(By.xpath("//tbody[@class='removeScroll']"));
	
	System.out.println(element.size()>0);

}




}
