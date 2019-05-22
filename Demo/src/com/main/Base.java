package com.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Base {

	public static WebDriver driver;

/*	@Test(priority = 1)
	public void BrowserInit() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser initialized");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.drline.in/drline-webapp-demo/global_register/add-external-patient");

	}
*/
	@DataProvider(name = "patientData")
	public Object[][] PatientDataProvider() throws InterruptedException, IOException {

		File path = new File("D:\\patientData.xlsx");
		
		//File path = new File("D:\\DrlineAutomation\\Demo\\TestData\\AddpatientData.xlsx");
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rows = sheet.getLastRowNum() - sheet.getFirstRowNum();
		rows=rows+1;
		System.out.println("======================"+rows);
		/*rows=rows+1;*/
		Object[][] data = new Object[rows-1][5];
		Integer k=0;
		for (int i = 1; i <rows; i++) {
			
			 for(int j=0; j<5; j++) {
			 System.out.println("Dara======================"+sheet.getRow(i).getCell(j).getStringCellValue());
			data[k][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			
		}
			 k++;
		}
		
		return data;
		

	}

	/*@Test(priority = 2, dataProvider = "patientData")
	public void close(String Clinicid,String BranchId,String PatientName,String MobileNo) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   
  		driver.findElement(By.xpath("//input[@id='clinicId']")).sendKeys(Clinicid);
  		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  		driver.findElement(By.xpath("//input[@id='branchId']")).sendKeys(BranchId);
  		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  		
  		driver.findElement(By.xpath("//input[@id='fullName']")).sendKeys(PatientName);
  		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(MobileNo);
  		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  		  
  		  
  		 driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/div[2]/div/div/button")).click();;
	}
	
	*/
	

	public void LocalBrowserInit(String Url) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser initialized");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Url);

	}
	
	  public void TearDown() 
	  {
		  driver.close();
		  }
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  

}
