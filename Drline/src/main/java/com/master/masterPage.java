package com.master;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import com.login.LoginPage;
import com.main.BaseClass;

public class masterPage extends BaseClass {
	
	LoginPage objLoginPage=new LoginPage();
	BaseClass objBaseClass= new BaseClass();


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

	
	
	
	
	
	
	
	
	
}
