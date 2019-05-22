package com.main;


import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;



public class BaseClass {

	public static WebDriver driver;
	

	String strval=null;
	String strval2=null;
	String strval3=null;
	String strval4=null;

	
	@DataProvider(name = "inputData")
	public Object[][] loginData() {
		Object[][] arrayObject = getExcelData("D:\\DrlineAutomation\\Drline\\src\\main\\java\\com\\data\\inputData.xlsx", "login");
		return arrayObject;
	}
	
	@DataProvider(name = "Register")
	public Object[][] loginDatadf() {
		Object[][] arrayObject = getExcelData(
				"D:\\DrlineAutomation\\Drline\\src\\main\\java\\com\\data\\inputData.xlsx", "Register");
		return arrayObject;
	}
	
	@DataProvider(name = "CompleteRegister")
	public Object[][] CompleteRegister() {
		Object[][] arrayObject = getExcelData(
				"D:\\DrlineAutomation\\Drline\\src\\main\\java\\com\\data\\inputData.xlsx", "CompleteRegister");
		return arrayObject;
	}

	
	@DataProvider(name = "Dashboard")
	public Object[][] Dashboard() {
		Object[][] arrayObject = getExcelData(
				"D:\\DrlineAutomation\\Drline\\src\\main\\java\\com\\data\\inputData.xlsx", "Dashboard");
		return arrayObject;
	}

	@DataProvider(name = "Appointment")
	public Object[][] Appointment() {
		Object[][] arrayObject = getExcelData(
				"D:\\DrlineAutomation\\Drline\\src\\main\\java\\com\\data\\inputData.xlsx", "Appointment");
		return arrayObject;
	}
	@DataProvider(name = "HappyFlow")
	public Object[][] HappyFlow() {
		Object[][] arrayObject = getExcelData(
				"D:\\DrlineAutomation\\Drline\\src\\main\\java\\com\\data\\inputData.xlsx", "HappyFlow");
		return arrayObject;
	}
	@DataProvider(name = "DataAdd")
	public Object[][] DataAdd() {
		Object[][] arrayObject = getExcelData(
				"D:\\DrlineAutomation\\Drline\\src\\main\\java\\com\\data\\inputData.xlsx", "DataAdd");
		return arrayObject;
	}
	
	public Object[][] getExcelData(String fileName, String sheetName) {
		Object[][] data = null;
		try {
			FileInputStream fis = new FileInputStream(fileName);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet(sheetName);
			int rows = sheet.getLastRowNum() - sheet.getFirstRowNum();
			int cplimn = sheet.getRow(0).getLastCellNum();
			rows = rows + 1;
			System.out.println("======================" + rows);
			/* rows=rows+1; */
			data = new Object[rows - 1][cplimn];
			Integer k = 0;
			for (int i = 1; i < rows; i++) {

				for (int j = 0; j < cplimn; j++) {
					// System.out.println("Dara======================"+sheet.getRow(i).getCell(j).getStringCellValue());
					data[k][j] = sheet.getRow(i).getCell(j).getStringCellValue();

				}
				k++;
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return data;

	}
	

	public void LocalBrowserInit(String Url) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser initialized");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Url);


	}

	public void click(String xpath)

	{
		try {
			driver.findElement(By.xpath(xpath)).click();
		} catch (Exception e) {

		}
	}

	public static void takeScreenshot(String screenshotName) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(source, new File("./ErrorScreenshot/" + screenshotName + ".png"));

			System.out.println("screenshot takes sucessfully");
			
		} catch (Exception e) {
			System.out.println("Exception while taking screenshot " + e.getMessage());

		}

	}

	public String getText(String xpath) {

		try {
			String str1 = driver.findElement(By.xpath(xpath)).getText();
			return str1;
		} catch (Exception e) {

		}
		return xpath;

	}

	public void setText(String xpath, String keysToSend) {
		try {

			WebElement element = driver.findElement(By.xpath(xpath));

			element.sendKeys(keysToSend);
		} catch (Exception e) {

		}
	}

	public void selectCheckbox(String xpath) {
		if (!driver.findElement(By.xpath(xpath)).isSelected()) {
			driver.findElement(By.xpath(xpath)).click();
		
		}
	}

	public void unSelectCheckbox(String xpath) {
		try {

			if (driver.findElement(By.xpath(xpath)).isSelected()) {
				driver.findElement(By.xpath(xpath)).click();
				
			}
		} catch (Exception e) {

		}
	}

	public void refresh() {
		driver.navigate().refresh();
	}

	public void selectDropDown(String xpath, String selectByVisibleText) {

		try {
			Select drpCountry = new Select(driver.findElement(By.xpath(xpath)));
			drpCountry.selectByVisibleText(selectByVisibleText);
		} catch (Exception e) {

		}
	}

	public void mouseHover(String xpath) {
		WebElement mousehoverElement = driver.findElement(By.xpath(xpath));

		Actions action = new Actions(driver);
		action.moveToElement(mousehoverElement).click().build().perform();
	}

	
	public void mouseHoverWithoutClick(String xpath) {
		WebElement mousehoverElement = driver.findElement(By.xpath(xpath));

		Actions action = new Actions(driver);
		action.moveToElement(mousehoverElement).build().perform();
	}

	
	
	public void TearDown() {
		driver.close();
	}
	
	public void ClearText(String xpathExpression)
	{
		driver.findElement(By.xpath(xpathExpression)).clear();
	}
	
	
	
	public void  MakePayment()
	{
		this.setText("//input[@id='cardNumber']", "5123456789012346");
		this.setText("//input[@id='cardExp']", "0520");
		this.setText("//input[@id='cardCvv']", "123");
		this.setText("//input[@id='cardHolder']", "Test");
		this.click("//button[@id='citrusCardPayButton']");
		
		
	}
	
	
	
	
	public void isdisplayed(String xpath) 
	{
	WebElement hdr=driver.findElement(By.xpath(xpath));

	hdr.isDisplayed();

	}
	

	public void isNotdisplayed(String xpath) 
	{
	WebElement hdr=driver.findElement(By.xpath(xpath));

	if(!hdr.isDisplayed()) 
	{
		System.out.println("Element is not displayed");
	}

	}
	
	
	public void AllertAccept() {
		 Alert alert = driver.switchTo().alert();	
		 alert.accept();
	}
	
// specifuc contain text
	
	//objBaseClass.click("//a[contains(text(),'"+Date+"')]");
	

	public void SelectTableFrmClassLocator(String trNo,String tdNo) {
		
		driver.findElement(By.xpath("table[@class='table table-bordered']//tr["+trNo+"]/th["+tdNo+"]"));
		
		
	}
	
	

	public void getTableDataFromtrAndTh(String classvalue,String trNo,String thNo) {
		
		
		
		
		//driver.findElement(By.xpath("table[@class='table table-bordered']//tr["+trNo+"]/th["+tdNo+"]"));
		
		
		driver.findElement(By.xpath("//table[@class='"+classvalue+"']//tr["+trNo+"]/th["+thNo+"]"));
	

		
		
	}
	
	
	
	

public void ClickOntableData(String classxpath,String trNo,String tdNo) throws InterruptedException {
	
	//objBaseClass.click("//a[contains(text(),'"+Date+"')]");
	Thread.sleep(4000);
	/*  WebElement  element2=driver.findElement(By.xpath("//table[@class='"+classxpath+"']//tr["+trNo+"]/th["+tdNo+"]"));   
		JavascriptExecutor ex2=(JavascriptExecutor)driver;
		  ex2.executeScript("arguments[0].click()", element2);*/
			
		this.mouseHover("//table[@class='"+ classxpath +"']//tr["+ trNo +"]/th["+ tdNo +"]");
}


	
	public WebElement getTableDataFromTableId(String Tableid,String trNo,String tdNo) {
		
		
		//table[@id='example']//tr[1]/td[2]
		

		  
		WebElement element=driver.findElement(By.xpath("*//table[@id='"+ Tableid +"']//tr["+ trNo +"]/td["+ tdNo +"]"));
		element.getText();
		return element;
		
	}
	
	public void editTableData(String Tableid,String trNo,String tdNo) {
		
		
		try {
			WebElement edit= driver.findElement(By.xpath(" //table[@id='"+ Tableid +"']//tr["+ trNo +"]/td["+tdNo+"]/a[1]"));
			
			if(edit.isDisplayed()) 
			{
				edit.click();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	public void DeleteTableData(String Tableid,String trNo,String tdNo) {
		
		
		try {
			WebElement edit= driver.findElement(By.xpath(" //table[@id='"+ Tableid +"']//tr["+ trNo +"]/td["+tdNo+"]/a[2]"));
			
			if(edit.isDisplayed()) 
			{
				edit.click();
				
				
				
			}
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	public void scrollToView(String xpath) {
		
		  WebElement Element = driver.findElement(By.xpath(xpath));

	        //This will scroll the page till the element is found		
		  
		  JavascriptExecutor ex2=(JavascriptExecutor)driver;
		  ex2.executeScript("arguments[0].scrollIntoView();", Element);
		
	}
	
	
	
	public void clickUsingJavaScripter(String xpath) {
		WebElement  element=driver.findElement(By.xpath(xpath));   
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		  ex.executeScript("arguments[0].click()", element);
	}
	
	
	
	
	

	public WebElement getTableDataFromTBody(String TBodyid,String trNo,String tdNo) {
		
	
		

		  
		WebElement element=driver.findElement(By.xpath("//tbody[@id='"+ TBodyid +"']//tr["+ trNo +"]/td["+ tdNo +"]"));
		//element.getText();
		return element;
		
	}
	
	
	
	//tbody[@id='investigationBodyOwn']//tr[1]/td[6]
	
	
	public void clickOkPopup() {
		
		this.clickUsingJavaScripter("");
		
	}
	
	
	
	
	
	public void setTableDataFromTBody(String TBodyid,String trNo,String tdNo,String text) {
		
		
		WebElement ele=driver.findElement(By.xpath("//tbody[@id='"+ TBodyid +"']//tr["+ trNo +"]/td["+ tdNo +"]"));

		ele.sendKeys(text);
	


		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
