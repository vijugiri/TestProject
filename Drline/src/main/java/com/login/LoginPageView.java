package com.login;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.main.BaseClass;


public class LoginPageView extends BaseClass{
	LoginPage objLoginPage=new LoginPage();
	BaseClass objBaseClass= new BaseClass();

	String strval=null;
	String strval2=null;
	
	

	
	
	
	public void ComponentsOnLoginPage()
	
		{
		objLoginPage.headerLoginisDisplayed();
		objLoginPage.headerDrLineisDisplayed();
		objLoginPage.ForgotPasswordLinkisdisplayed();
		objLoginPage.LoginLinkisDisplayed();
		//objLoginPage.HeaderRegisterIsDisplayed();
		
		
			
		}

	
	public void loginWithoutUsenameAndPassword() throws InterruptedException	
		{
		objLoginPage.headerLoginisDisplayed();
		objLoginPage.ClickLoginLink();
		strval=	driver.findElement(By.xpath("//span[@id='errormsg']")).getText();
		strval2 ="Please enter valid mobile no.";
		Assert.assertEquals("Verified no any data is entered", strval2, strval);
		objBaseClass.refresh();
		}
	
	
	
	public void loginWithUsenameAndWithoutPassword(String userName) throws InterruptedException 
		{
		objLoginPage.headerLoginisDisplayed();
		Thread.sleep(3000);
		objBaseClass.setText("//input[@id='userName']", userName);
		objLoginPage.ClickLoginLink();
		
		strval=	driver.findElement(By.xpath("//span[@id='errormsg']")).getText();
		strval2 ="Please enter password.";
		Assert.assertEquals("Verified only mobile number is entered", strval2, strval);
		objBaseClass.refresh();
	}
	
	
	

	public void loginWithoutUsenameAndWithPassword(String Pass) throws InterruptedException 
		{
		objLoginPage.headerLoginisDisplayed();
		
		Thread.sleep(3000);
		objBaseClass.setText("//input[@id='password']", Pass);
		Thread.sleep(2000);
		objLoginPage.ClickLoginLink();
		
		strval=	driver.findElement(By.xpath("//span[@id='errormsg']")).getText();
		System.out.println(strval);
		
		strval2 ="Please enter valid mobile no.";
		Assert.assertEquals("Verified only password is entered", strval2, strval);
		objBaseClass.refresh();
	}
	
	

	public void invalidMobOrPass(String userName,String Pass) throws InterruptedException 
		{
		objLoginPage.headerLoginisDisplayed();
		Thread.sleep(3000);
		objBaseClass.setText("//input[@id='userName']", userName);
		Thread.sleep(3000);
		objBaseClass.setText("//input[@id='password']", Pass);
		Thread.sleep(2000);
		objLoginPage.ClickLoginLink();
		
		strval=	driver.findElement(By.xpath("//span[contains(text(),'Invalid credentials..!')]")).getText();
		System.out.println(strval);
		
		strval2 ="Invalid credentials..!";
		Assert.assertEquals("Verified Wrong credintial", strval2, strval);
		objBaseClass.refresh();
	}
	
	
	

	public void unrRgisteredUser(String userName) throws InterruptedException 
		{
		objLoginPage.headerLoginisDisplayed();
		Thread.sleep(3000);
		objBaseClass.setText("//input[@id='userName']", userName);
		Thread.sleep(1000);
		strval=	driver.findElement(By.xpath("//span[@id='errormsg']")).getText();
		System.out.println(strval);
		
		strval2 ="This Mobile number is not registered.";
		Assert.assertEquals("Verified mobile number is not registered", strval2, strval);
		objBaseClass.refresh();
	}
	
	

	public void LoginWithoutSelectingClinic(String userName,String Pass) throws InterruptedException 
		{
		objLoginPage.headerLoginisDisplayed();
		Thread.sleep(3000);
		objBaseClass.setText("//input[@id='userName']", userName);
		Thread.sleep(3000);
		objBaseClass.setText("//input[@id='password']", Pass);
		Thread.sleep(2000);
		objLoginPage.ClickLoginLink();
		
		strval=	driver.findElement(By.xpath("//span[@id='errormsg']")).getText();
		System.out.println(strval);
		
		strval2 ="Please select clinic.";
		Assert.assertEquals("Verified Login is unsucessful without selecting clinic", strval2, strval);
		Thread.sleep(2000);
		objBaseClass.refresh();
	}
	
	
	public void Login(String Mob,String Pass) throws InterruptedException 
	{
	objLoginPage.headerLoginisDisplayed();
	Thread.sleep(3000);
	objBaseClass.setText("//input[@id='userName']", Mob);
	
	Thread.sleep(2000);
	WebElement Eelement=driver.findElement(By.xpath("//select[@id='clinicId']"));
	
	if((Eelement.isDisplayed())) 
	{
		Thread.sleep(3000);
		//objBaseClass.selectDropDown("//select[@id='clinicId']", "vijay");
		objBaseClass.selectDropDown("//select[@id='clinicId']", "Giri Clinic");
		
		
	}
	
	WebElement Eelement1=driver.findElement(By.xpath("//select[@id='branchId']"));

	
	if((Eelement1.isDisplayed())) {
		Thread.sleep(3000);
		objBaseClass.selectDropDown("//select[@id='branchId']", "Giriiii Clinic");
		
	}
	
	
	Thread.sleep(3000);
	objBaseClass.setText("//input[@id='password']", Pass);
	Thread.sleep(2000);
	objLoginPage.ClickLoginLink();
}

	public void YesPopup() throws InterruptedException 
	{
		
		objLoginPage.loginPopUpYes();
	}
	public void NoPopup() 
	{
		objLoginPage.LoginpPopUpNo();
	}
	
	public void Logout()
	{
		objLoginPage.logout();

	}
	
	
	public void mobileplaceholderPss() 
	{
		String strval=driver.findElement(By.cssSelector("#userName")).getAttribute("placeholder");
		strval2 ="Mobile Number";
		Assert.assertEquals("Verified Lmobile number place value", strval2, strval);
	
		
		
	}

	public void passplaceholderPss() 
	{
		String strval=driver.findElement(By.cssSelector("#password")).getAttribute("placeholder");
		strval2 ="Password";
		Assert.assertEquals("Verified Lmobile number place value", strval2, strval);
	
		
		
	}
	
	public void loginByRecep() throws InterruptedException {
		Thread.sleep(3000);
		objBaseClass.setText("//input[@id='userName']", "8999100336");
		Thread.sleep(3000);
		objBaseClass.selectDropDown("//select[@id='clinicId']", "Divya Prakash Hospital");
		Thread.sleep(3000);
		objBaseClass.setText("//input[@id='password']", "12345");
		objBaseClass.mouseHover("/html/body/div[1]/div/div/div/div[2]/div/div[1]/div/form/div[6]/button");
		
		
	}
	
	
	
}
