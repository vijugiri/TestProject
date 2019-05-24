package Shopping;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.appointment.AddpatientView;
import com.appointment.AppointmentPage;
import com.appointment.AppointmentView;
import com.dashboard.BookApointmentFromDashboard;
import com.dashboard.DashboardPage;
import com.dashboard.DashboardView;
import com.login.LoginPage;
import com.login.LoginPageView;
import com.main.BaseClass;
import com.main.Log4j;
import com.register.RegisterpageView;
import com.setting.SettingView;

import Treatment.TreatmentView;

public class shopping extends BaseClass{

	
	private static Logger logger=LogManager.getLogger(Log4j.class);
	AppointmentPage objAppointmentPage= new AppointmentPage();
	DashboardPage objDashboardPage= new DashboardPage();
	LoginPage objLoginPage=new LoginPage();
	BaseClass objBaseClass= new BaseClass();
	LoginPageView objLoginPageView= new LoginPageView();

	AppointmentView objAppointmentView= new AppointmentView();
	DashboardView objDashboardView= new DashboardView();
	BookApointmentFromDashboard objBookApointmentFromDashboard= new BookApointmentFromDashboard();
	AddpatientView objAddpatientView= new AddpatientView();
	RegisterpageView objRegisterpageView= new RegisterpageView();
	TreatmentView objTreatmentView = new TreatmentView();
	SettingView objSettingView = new SettingView();

	

	private boolean isElementPresent(By by) {
		  try {
		    driver.findElement(by);
		    return true;
		  } catch (NoSuchElementException e) {
		    return false;
		  }
		}

	String strval=null;
	String strval2=null;
	String strval3=null;
	String strval4=null;
	
	
	
	public void clickOnShopping() throws InterruptedException {
		
		  JavascriptExecutor js= (JavascriptExecutor)driver;
		    js.executeScript("javascript:window.scrollBy(94.81,19)");
		Thread.sleep(3000);
		
		objBaseClass.scrollToView("//span[contains(text(),'Shopping')]");
		objBaseClass.mouseHover("//span[contains(text(),'Shopping')]");
		
		
	}
	
	
	

	public void clickOnSale() throws InterruptedException {
		
		  JavascriptExecutor js= (JavascriptExecutor)driver;
		    js.executeScript("javascript:window.scrollBy(56.3,19)");
		Thread.sleep(3000);
		
		objBaseClass.scrollToView("//span[contains(text(),'Sale')]");
		objBaseClass.mouseHover("//span[contains(text(),'Sale')]");
		
		
	}
	public void clickconUploadsaleitem() {
		objBaseClass.mouseHover("//a[contains(text(),'Upload Item')]");
	}
	
	
	public void uploadImage() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='primaryImageUrl']")).sendKeys("C:\\Users\\Admin\\git\\TestProject\\Drline\\TestData\\file.jpeg");
		
	}
	public void setItemname(String name) {
		
		objBaseClass.setText("//input[@id='itemName']", name);
	}
	public void settypeName() {
		
		objBaseClass.setText("//input[@id='typeName']", "OLD");
	}
	
	public void setdiscription() {
		
		objBaseClass.setText("//input[@id='discription']", "UsableaND IT IS OLD ITEM");
	}

	public void setPrice(String ConsultingCharge) {
		
		objBaseClass.setText("//input[@id='price']", ConsultingCharge);
	}
	
	
	
	public void setcontactNo(String contactNo) {
		
		objBaseClass.setText("//input[@id='contactNo']", contactNo);
	}

	public void setpurchaseYear(String Year) {
		
		objBaseClass.setText("//input[@id='purchaseYear']", Year);
	}
	
	
	
	
	
public void setaddress(String address) {
		
		objBaseClass.setText("//input[@id='address']", address);
	}
	

	
public void clickcSubmit() throws InterruptedException {
	objBaseClass.mouseHover("//button[contains(text(),'Submit')]");
	Thread.sleep(3000);
	
	objBaseClass.mouseHover("//a[contains(text(),'OK')]");
	//objBaseClass.clickUsingJavaScripter("//*[@id='ja_btn_155868204954225807']");

}





public void clickOnbuy() throws InterruptedException {
	
	  JavascriptExecutor js= (JavascriptExecutor)driver;
	    js.executeScript("javascript:window.scrollBy(194,51)");
	Thread.sleep(3000);
	
	

	objBaseClass.scrollToView("//span[contains(text(),'Buy')]");
	objBaseClass.mouseHover("//span[contains(text(),'Buy')]");
	
	
}





public void  VerifyItem(String name)
{
strval=driver.findElement(By.xpath("//table[@class='table table-bordered']//tr[1]/td[2]")).getText();
strval2 =name;
assertTrue(strval.contains(strval2));

	
}

public void clickonEditFirstItem() {
	
	objBaseClass.mouseHover("//table[@class='table table-bordered']//tr[1]/td[4]/a[1]");
	
	
	
}



public void deletSaleitem() throws InterruptedException {
	
	Thread.sleep(2000);
boolean autosearch = isElementPresent(By.xpath("//table[@class='table table-bordered']//tr[1]/td[4]/a[2]"));

//WebElement autosearch=driver.findElement(By.xpath("//div[@class='autocomplete-suggestions']"));

if(autosearch==true)
{
	Thread.sleep(1000);
	 objBaseClass.mouseHover("//table[@class='table table-bordered']//tr[1]/td[4]/a[2]");
		Thread.sleep(1000);
	 objBaseClass.mouseHover("/html/body/div[6]/div[2]/a/button/i");
		Thread.sleep(1000);
		objBaseClass.mouseHover("//a[contains(text(),'OK')]");

} 



}



public void UploadMultipleImageInSale() throws InterruptedException {
	
	 objBaseClass.mouseHover("//table[@class='table table-bordered']//tr[1]/td[4]/a[3]");
	

			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='imageUrl']")).sendKeys("C:\\Users\\Admin\\git\\TestProject\\Drline\\TestData\\file.jpeg");
			objBaseClass.mouseHover("//button[contains(text(),'Submit')]");
			
			
			
			
		}



public void veriFyMultiplePhotos() throws InterruptedException {
	Thread.sleep(2000);
	List <WebElement> elem=driver.findElements(By.xpath("//table[@class='table table-bordered']"));
	int count = elem.size();


	System.out.println(count>0);
}

public void postRequirmrnt(String fullname) {
	objBaseClass.setText("//input[@id='itemName1']", fullname);
}

public void selecLocationCheckBox() {
	objBaseClass.selectCheckbox("//div[@class='widget-content']//li[1]/a/input");
}


public void unSelectCheckboxcLocation() {
	objBaseClass.unSelectCheckbox("//div[@class='widget-content']//li[1]/a/input");
}


public void selecPriceCheckBox() {
	objBaseClass.selectCheckbox("//div[@class='widget-content']//li[2]/a/input");
}


public void unSelectCheckboxPrice() {
	objBaseClass.unSelectCheckbox("//div[@class='widget-content']//li[2]/a/input");
}


public void selecyearCheckBox() {
	objBaseClass.selectCheckbox("//div[@class='widget-content']//li[3]/a/input");
}


public void UNselecyearCheckBox() {
	objBaseClass.unSelectCheckbox("//div[@class='widget-content']//li[3]/a/input");
}


public void setLocation(String city) {
	objBaseClass.setText("//input[@id='location']", city);
}




public void ClickEnterLocation() {

	driver.findElement(By.xpath("//input[@id='location']")).sendKeys(Keys.ENTER);
	
}




public void  VerifyBuyList(String name)
{
strval=driver.findElement(By.xpath("//div[@class='rowc content-wrapper1']")).getText();
strval2 =name;
assertTrue(strval.contains(strval2));

	
}

public void setstrtAndEndPrise(String endPrice) {
	objBaseClass.setText("//input[@id='startPrice']", "0");
	
	
	objBaseClass.setText("//input[@id='endPrice']", endPrice);
	
	
}

public void clickSearch() {
	objBaseClass.mouseHover("//button[contains(text(),'search')]");
}




public void setstrtAndEndYearse() {
	objBaseClass.setText("//input[@id='startYear']", "2000");
	
	
	objBaseClass.setText("//input[@id='endYear']", "2025");
	
	
}







}
