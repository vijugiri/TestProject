package inventry;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class inventoryView extends inventoryPage {
	


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
	
	public void clickOninventory() {
		objBaseClass.scrollToView("//span[contains(text(),'Inventory')]");
		
		objBaseClass.clickUsingJavaScripter("//span[contains(text(),'Inventory')]");
	}
	
	
	
	//span[contains(text(),'Clinic Medicines')]
	public void clickOnvendor() {
		objBaseClass.scrollToView("//span[contains(text(),'Vendor')]");
		
		objBaseClass.clickUsingJavaScripter("//span[contains(text(),'Vendor')]");
	}
	
	public void clickonAddVendor() {
		objBaseClass.clickUsingJavaScripter("//a[contains(text(),'Add Vendor')]");
	}
	
	
	public void addvendor(String Firstname,String mobile,String email,String Address,String PIN) throws InterruptedException {
		Thread.sleep(1000);
		objBaseClass.ClearText("//input[@id='firstName']");
		Thread.sleep(1000);
		objBaseClass.setText("//input[@id='firstName']", Firstname);
		Thread.sleep(1000);
		
		
		
		
		
		Thread.sleep(1000);
		objBaseClass.ClearText("//input[@id='lastName']");
		Thread.sleep(1000);
		objBaseClass.setText("//input[@id='lastName']", Firstname);
		Thread.sleep(1000);
		
		
		Thread.sleep(1000);
		objBaseClass.ClearText("//input[@id='contactNo']");
		Thread.sleep(1000);
		objBaseClass.setText("//input[@id='contactNo']", mobile);
		
		WebElement Element = driver.findElement(By.xpath("//span[@id='contactNoerr']"));
	
		if(!Element.isDisplayed()) {

			Thread.sleep(1000);
			objBaseClass.ClearText("//input[@id='emailId']");
			Thread.sleep(1000);
			objBaseClass.setText("//input[@id='emailId']", email);
			Thread.sleep(1000);
		
			
			WebElement Element1 = driver.findElement(By.xpath("//span[@id='emailIderr']"));
		
			if(!Element1.isDisplayed()) {

				Thread.sleep(1000);
				objBaseClass.ClearText("//textarea[@id='address']");
				Thread.sleep(1000);
				objBaseClass.setText("//textarea[@id='address']", Address);
				Thread.sleep(1000);
				
				


				Thread.sleep(1000);
				objBaseClass.ClearText("//input[@id='pinCode']");
				Thread.sleep(1000);
				objBaseClass.setText("//input[@id='pinCode']", PIN);
				Thread.sleep(1000);
				this.clickSubmitOfAddVendor();
			}
			
		}
		
		
		
	}
	
	
	
	
	public void clickSubmitOfAddVendor() throws InterruptedException {
		objBaseClass.clickUsingJavaScripter("//button[contains(text(),'Submit')]");
		Thread.sleep(4000);
		objBaseClass.refresh();
	}
	
	
	
	
	public void verifyvendor(String Firstname,String mobile,String PIN ,String Address) {
		
				strval=objBaseClass.getText("//tbody[@class='removeScroll']//tr[1]/td[2]");
				assertTrue(strval.contains(Firstname));
				
				strval2=objBaseClass.getText("//tbody[@class='removeScroll']//tr[1]/td[5]");
				assertTrue(strval2.contains(mobile));
				
				strval3=objBaseClass.getText("//tbody[@class='removeScroll']//tr[1]/td[6]");
				assertTrue(strval3.contains(Address));
				
			
	}
	
	
	
	
	public void deletevendor() throws InterruptedException {
		
		if(driver.findElement(By.xpath("//tbody[@class='removeScroll']//tr[1]/td/a[2]")).isDisplayed())
		{
		objBaseClass.isdisplayed("//tbody[@class='removeScroll']//tr[1]/td/a[2]");
		
		objBaseClass.mouseHover("//tbody[@class='removeScroll']//tr[1]/td/a[2]");
		
		Thread.sleep(1000);
		objBaseClass.mouseHover("/html/body/div[6]/div[2]/a/button/i");	
		}
	
	
		else {
			objDashboardView.clickDashboardMenu();
		}
	
	
	
	
	}
	
	

	public void Editvendor(String Pincode) throws InterruptedException {
		
		if(driver.findElement(By.xpath("//tbody[@class='removeScroll']//tr[1]/td/a[1]")).isDisplayed())
		{
			objBaseClass.mouseHover("//tbody[@class='removeScroll']//tr[1]/td/a[1]");
			

			Thread.sleep(1000);
			objBaseClass.ClearText("//input[@id='pinCode']");
			Thread.sleep(1000);
			objBaseClass.setText("//input[@id='pinCode']",Pincode );
			Thread.sleep(1000);
			objBaseClass.mouseHover("//button[contains(text(),'Update')]");
			
			objBaseClass.refresh();
		}
			
		}
	
	
	
	
	public void verifyeditrdvendor(String Pincode){
		
		strval=objBaseClass.getText("//tbody[@class='removeScroll']//tr[1]/td[7]");
		
		
		Assert.assertTrue(strval.contains(Pincode));

		
		
	}
	
	

	
	public void clickOnClinicMedicines() {
		objBaseClass.scrollToView("//span[contains(text(),'Clinic Medicines')]");
		
		objBaseClass.clickUsingJavaScripter("//span[contains(text(),'Clinic Medicines')]");
	}
	
	
	
	public void clickOnAddMedicines() {
		
		objBaseClass.clickUsingJavaScripter("//a[contains(text(),'Add Medicine')]");
		
	}
	
	public void setMedicinename(String Medicine_Name) {
		objBaseClass.ClearText("//input[@id='name']");
		
		objBaseClass.setText("//input[@id='name']", Medicine_Name);
	}
	
	
	public void setContents(String Contents) {
		objBaseClass.ClearText("//input[@id='contents']");
		
		objBaseClass.setText("//input[@id='contents']", Contents);
	}
	
	
	

	public void setCompany_Name(String Company_Name) {
		objBaseClass.ClearText("//input[@id='brandName']");
		
		objBaseClass.setText("//input[@id='brandName']", Company_Name);
	}
	
	
	

	public void setBuying_Price(String Buying_Price) {
		objBaseClass.ClearText("//input[@id='buyingPrice']");
		
		objBaseClass.setText("//input[@id='buyingPrice']", Buying_Price);
	}
	
	
	

	public void setMRP(String MRP) {
		objBaseClass.ClearText("//input[@id='mrp']");
		
		objBaseClass.setText("//input[@id='mrp']", MRP);
	}
	
	
	

	public void setTabletsinStrip(String TabletsinStrip) {
		objBaseClass.ClearText("//input[@id='unitQty']");
		
		objBaseClass.setText("//input[@id='unitQty']", TabletsinStrip);
	}
	
	

	public void setAvailableStock(String AvailableStock) {
		objBaseClass.ClearText("//input[@id='balance']");
		
		objBaseClass.setText("//input[@id='balance']", AvailableStock);
	}
	
	
	

	public void setDescriptionk(String Description) {
		objBaseClass.ClearText("//textarea[@id='description']");
		
		objBaseClass.setText("//textarea[@id='description']", Description);
	}
	
	
	

	public void setMedicineType(String MedicineType) {
		
	
		
		objBaseClass.selectDropDown("//select[@id='itemType']", MedicineType);
	}
	
	
	

	public void setAlertBalanceStock(String AlertBalanceStock) {
		objBaseClass.ClearText("//textarea[@id='alertStock']");
		
		objBaseClass.setText("//textarea[@id='alertStock']", AlertBalanceStock);
	}
	
	
	
	
	
	
	public void clickOnSubmitOfAddmedicine() throws InterruptedException {
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(120,33.91)");
		Thread.sleep(500);
		objBaseClass.clickUsingJavaScripter("//button[contains(text(),'Submit')]");
		Thread.sleep(500);
		objBaseClass.refresh();
	}
	
	
	
	public void verifyMedicine(String Medicine_Name) {
		
		strval= objBaseClass.getText("//tbody[@class='removeScroll']");
		
		Assert.assertTrue(strval.contains(Medicine_Name));
		
		
	}
	public void editmedicine(String NewMedicinename) throws InterruptedException {
		objBaseClass.mouseHover("//tbody[@class='removeScroll']//tr[1]/td[8]/a[1]");
		
		this.setMedicinename(NewMedicinename);
		
		objBaseClass.mouseHover("//button[contains(text(),'Update')]");
		
		Thread.sleep(500);
		objBaseClass.refresh();
		

	}
	public void deletenewaddedMedicine() throws InterruptedException {
		objBaseClass.mouseHover("//tbody[@class='removeScroll']//tr[1]/td[8]/a[2]");
		Thread.sleep(1000);
		objBaseClass.mouseHover("/html/body/div[6]/div[2]/a/button");
		Thread.sleep(2000);
		objBaseClass.refresh();
		
	}
	
	
	

	public void clickOnPurchaseorder() {
		objBaseClass.scrollToView("//span[contains(text(),'Purchase Order')]");
		
		objBaseClass.clickUsingJavaScripter("//span[contains(text(),'Purchase Order')]");
	}
	
	
	public void setvendorNameOnPurchaseOrder(String vendorNeme) throws InterruptedException {
			Thread.sleep(3000);
			objBaseClass.setText("//input[@id='firstName']", vendorNeme);
			
			
			Thread.sleep(3000);
			
			
			boolean autosearch = isElementPresent(By.xpath("//div[@class='autocomplete-suggestions']"));

			//WebElement autosearch=driver.findElement(By.xpath("//div[@class='autocomplete-suggestions']"));
			Thread.sleep(2000);
			if(autosearch==true)
			{
				Thread.sleep(1000);
				objBaseClass.mouseHover("//div[@class='autocomplete-suggestions']");
			
			}
			
		
		
	}
	
	public void setPoOrderDate() throws InterruptedException {
		Thread.sleep(2000);
		objBaseClass.click("//input[@id='purchaseOrderDate']");
		
		Thread.sleep(500);
		
		objBaseClass.selectDropDown("//select[@class='ui-datepicker-year']", "2019");		
		Thread.sleep(500);
		objBaseClass.selectDropDown("//select[@class='ui-datepicker-month']", "May");
		Thread.sleep(500);
		objBaseClass.mouseHover("//table[@class='ui-datepicker-calendar']//tbody//tr[1]/td[4]");
		

	}
	
	
public void setReceeiveOrderDate() throws InterruptedException {
		
	Thread.sleep(2000);
		objBaseClass.click("//input[@id='orderReceivedDate']");
		Thread.sleep(500);
		
		
		objBaseClass.selectDropDown("//select[@class='ui-datepicker-year']", "2019");		
		Thread.sleep(500);
		objBaseClass.selectDropDown("//select[@class='ui-datepicker-month']", "May");
		Thread.sleep(500);
		objBaseClass.mouseHover("//table[@class='ui-datepicker-calendar']//tbody//tr[3]/td[2]");
		

	}
	
	
	public void setPoReceivenumber(String PONumber) {
		
		objBaseClass.setText("//input[@id='orderReceivedNo']", PONumber);
	}

	public void setNote(String Description) {
		
		objBaseClass.setText("//textarea[@id='note']", Description);
	}

	
	
public void setMedicine_NamePurchaseorder(String Medicine_Name) {
		
		objBaseClass.setText("//input[@id='name_1']", Medicine_Name);
	}

	
	

public void setContentsPurchaseorder(String Contents) {
	
	objBaseClass.setText("//input[@id='contents_1']", Contents);
}
	

	


public void setCompany_NamePurchaseorder(String Company_Name) {

objBaseClass.setText("//input[@id='companyName_1']", Company_Name);
}
	



public void setBatchNumberPurchaseorder() throws InterruptedException {

objBaseClass.setText("//input[@id='batchNumber_1']", "12345");
Thread.sleep(1000);

objBaseClass.click("//input[@id='batchNumber_1']");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='batchNumber_1']")).sendKeys(Keys.TAB);
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='mfgDate_1']")).sendKeys("01Mar");
objBaseClass.click("//input[@id='batchNumber_1']");
driver.findElement(By.xpath("//input[@id='batchNumber_1']")).sendKeys(Keys.TAB);
driver.findElement(By.xpath("//input[@id='mfgDate_1']")).sendKeys(Keys.TAB);
driver.findElement(By.xpath("//input[@id='mfgDate_1']")).sendKeys(Keys.TAB);
driver.findElement(By.xpath("//input[@id='mfgDate_1']")).sendKeys("2011");



}
	



public void setMRPPurchaseorder(String MRP) throws InterruptedException {
	

objBaseClass.setText("//input[@id='mrp_1']", MRP);


}



public void setBuyingPPricePurchaseorder(String Buying_Price) throws InterruptedException {
	

objBaseClass.setText("//input[@id='buyingPrice_1']", Buying_Price);


}

public void setQTYPurchaseorder(String TabletsinStrip) throws InterruptedException {
	

objBaseClass.setText("//input[@id='unitQty_1']", TabletsinStrip);


}



public void setbuyingStripAndExpiredateinPurchaseorder(String AvailableStock) throws InterruptedException {
	

objBaseClass.setText("//input[@id='orderedQty_1']", AvailableStock);







objBaseClass.click("//input[@id='orderedQty_1']");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='orderedQty_1']")).sendKeys(Keys.TAB);
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='expiryDate_1']")).sendKeys("25JUN");
Thread.sleep(2000);
//objBaseClass.click("//input[@id='orderedQty_1']");
//Thread.sleep(2000);
//driver.findElement(By.xpath("//input[@id='orderedQty_1']")).sendKeys(Keys.TAB);
//Thread.sleep(500);
//driver.findElement(By.xpath("//input[@id='expiryDate_1']")).sendKeys(Keys.TAB);
//Thread.sleep(500);
driver.findElement(By.xpath("//input[@id='expiryDate_1']")).sendKeys(Keys.TAB);
//Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='expiryDate_1']")).sendKeys("2020");












}


public void setDiscount() {
	objBaseClass.setText("//input[@id='totalDiscount']","10");
}

//button[contains(text(),'Save')]


public void ClickonSavePurchaseorder() throws InterruptedException {
	objBaseClass.mouseHover("//button[contains(text(),'Save')]");
	
	Thread.sleep(2000);
	
	objBaseClass.refresh();
}



public void ClickonSaveAsDrafrtPurchaseorder() throws InterruptedException {
	
	
	objBaseClass.scrollToView("//input[@value='Save As Draft']");
	Thread.sleep(2000);
	objBaseClass.mouseHover("//input[@value='Save As Draft']");
	
	Thread.sleep(2000);
	
	objBaseClass.refresh();
}


public void clickOnViewDraft() {
	objBaseClass.mouseHover("//a[contains(text(),'View Drafts')]");
}



public void verifyPurchaseOrder(String vendorname) {
	
	strval2=objBaseClass.getText("//tbody[@class='removeScroll']//tr[1]/td[3]");
	
	Assert.assertTrue(strval2.contains(vendorname));
}




public void clickonEditOFPurchaseOrderasDraft() {
	
	objBaseClass.mouseHover("//tbody[@class='removeScroll']//tr[1]/td[7]/a[1]");
}




public void clickonShortage() {
	
	objBaseClass.mouseHover("//a[contains(text(),'Shortage')]");
}

public void clickonViewOrderliste() {
	
	objBaseClass.mouseHover("//a[contains(text(),'View Ordered List')]");
}

public void clickonViewOrderlisteFromTable() {
	
	objBaseClass.mouseHover("//tbody[@id='tbl5']//tr[1]/td[4]/a");
}


public void shotrageheaderDisplayed() {
	objBaseClass.isdisplayed("//h4[contains(text(),'Shortage Medicin')]");
}


public void AddqtyAddorder(String qty) {
	objBaseClass.setText("//tbody[@id='tbl5']//tr[1]/td[5]/input[@id='qty']", qty);
}


public void clickonShortageSubmit() throws InterruptedException {
	
	objBaseClass.mouseHover("//button[contains(text(),'Submit')]");
	
	Thread.sleep(2000);
	
	objBaseClass.refresh();
}

public void clickonShortageAdd() {
	
	objBaseClass.mouseHover("//button[contains(text(),'Add')][1]");
}
public void addShortage(String medicineName,String componyName,String content) {
	
	objBaseClass.setText("//input[@id='itemName']", medicineName);
	
	objBaseClass.setText("//input[@name='companyName']", componyName);
	
	objBaseClass.setText("//textarea[@name='contents']", content);
	
	
}


public void verifyShortageAddedmedicine(String medicineName) {
	
	strval2=objBaseClass.getText("//tbody[@id='tbl5']//tr[1]/td[2]");
	
	Assert.assertTrue(strval2.contains(medicineName));
}







public void verifyShortageAddedmedicineFromView(String medicineName) {
	
	strval2=objBaseClass.getText("//tbody[@id='tbl5']//tr[1]/td[2]");
	
	Assert.assertTrue(strval2.contains(medicineName));
}
















public void selectAddedmedicine() {
	
	objBaseClass.selectCheckbox("//tbody[@id='tbl5']//tr[1]/td[1]//input[@class='checkbox1']");	
	
}
public void clickOnAddtoorder() {
	objBaseClass.mouseHover("//button[contains(text(),'Add To Order')]");
}
public void clickOnSendOrder() throws InterruptedException {
	objBaseClass.mouseHover("//button[contains(text(),'Send Order')]");
	
	Thread.sleep(2000);
	
	
	objBaseClass.refresh();
	
	
	
	
	
	
}


public void clickonDeletePurchaseOrderasDraft() throws InterruptedException {
	
	objBaseClass.mouseHover("//tbody[@class='removeScroll']//tr[1]/td[7]/a[2]");
	
	Thread.sleep(2000);
	
	objBaseClass.mouseHover("/html/body/div[6]/div[2]/a[1]/button");
	Thread.sleep(2000);
	objBaseClass.refresh();
	
}


public void setvendorNameSendOrder(String vendorNeme) throws InterruptedException {
	Thread.sleep(3000);
	objBaseClass.setText("//input[@id='firstName']", vendorNeme);
	
	
	Thread.sleep(3000);
	
	
	boolean autosearch = isElementPresent(By.xpath("//div[@class='autocomplete-suggestions']"));

	//WebElement autosearch=driver.findElement(By.xpath("//div[@class='autocomplete-suggestions']"));
	Thread.sleep(2000);
	if(autosearch==true)
	{
		Thread.sleep(1000);
		objBaseClass.mouseHover("//div[@class='autocomplete-suggestions']");
	
	}
	Thread.sleep(2000);
}




	
	
		}
		
		



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



