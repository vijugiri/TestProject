package com.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.main.BaseClass;

public class LoginPage extends BaseClass{
	BaseClass objBaseClass= new BaseClass();
	
	
	String url = new String ("http://demo.drline.in/drline-webapp-demo/");
	
	
	

	
	
	@BeforeTest
	public void browserStart() throws Exception 
	{
		objBaseClass.LocalBrowserInit(url);	
	}

	public void headerLoginisDisplayed() 
	{
		
		WebElement  hdrLogin=   driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		 hdrLogin.isDisplayed();
	}

	public void ClickHeaderRegisterLink() 
	{
		WebElement  element=driver.findElement(By.xpath("//a[contains(text(),'Register')]"));   
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		  ex.executeScript("arguments[0].click()", element);
		
	
	}
	public void HeaderRegisterIsDisplayed() 
	{
		
		WebElement  hdrRegister=   driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
		hdrRegister.isDisplayed();
	}
	public void headerDrLineisDisplayed()
	{
		WebElement  hdrLogin=   driver.findElement(By.xpath("//h2[contains(text(),'Drline')]"));
		 hdrLogin.isDisplayed();
	}
	

	public void LoginLinkisDisplayed()
	{
		WebElement  linktext=   driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		linktext.isDisplayed();
	}
	

	public void ClickLoginLink()
	{	WebElement  element=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div[1]/div/form/div[6]/button"));   
	JavascriptExecutor ex=(JavascriptExecutor)driver;
	  ex.executeScript("arguments[0].click()", element);
		
	}

	public void ForgotPasswordLinkisdisplayed()
	{
		WebElement  ForgotPasswordLink=   driver.findElement(By.xpath("//a[contains(text(),'Forgot password?')]"));
		ForgotPasswordLink.isDisplayed();
	}
	public void ClickForgotPasswordLink()
	{
		WebElement  ClickForgotPasswordLink=   driver.findElement(By.xpath("//a[contains(text(),'Forgot password?')]"));
		ClickForgotPasswordLink.click();
	}
	
	public void loginPopUpYes() throws InterruptedException {
		
	
		
	WebElement yespopup=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div/div/div/div/button[1]"));	
	if(yespopup.isDisplayed())
		{Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement  element=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div/div/div/div/button[1]"));   
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		  ex.executeScript("arguments[0].click()", element);
		
		
		
		
	
		}
	}

	public void LoginpPopUpNo() 
	{
		WebElement Nopopup =driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div/div/div/div/button[2]"));
		if(Nopopup.isDisplayed()) 
		{
			Nopopup.click();
		}

	}
	public void logout() 
	{
		
		
		
		
		WebElement  element=driver.findElement(By.xpath("/html/body/div[3]/div/nav/div[2]/ul/li[3]/a"));   
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		  ex.executeScript("arguments[0].click()", element);
		 
	
		  WebElement  element2=driver.findElement(By.xpath("/html/body/div[3]/div/nav/div[2]/ul/li[3]/div/a[3]"));   
			JavascriptExecutor ex1=(JavascriptExecutor)driver;
			  ex1.executeScript("arguments[0].click()", element2);
		  
		 // WebElement LogoutButton = driver.findElement(By.xpath("/html/body/div[3]/div/nav/div[2]/ul/li[3]/div/a[3]"));
			
//		  Actions action = new Actions(driver);
//			  action.moveToElement(LogoutButton).click().perform();
		  
		 
		  
	}
	
	

	
}
	
	
	
	
	
	
	
	
	
	
	
