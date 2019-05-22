package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.main.Base;
import com.util.Utility;

public class AddpatientScreeshot extends Base {
	Base objBase= new Base();
	Utility objUtility= new Utility();
	@Test
	public void captureScreenshot() throws InterruptedException, IOException {
		
	
		objBase.LocalBrowserInit("https://www.facebook.com/");
		Utility.capturescreenshotofpatient("Browser started");
	
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("8888085560");
	
		Utility.capturescreenshotofpatient("login fail");
		

		

}
}