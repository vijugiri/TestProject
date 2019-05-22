package com.main;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.util.Screenshot;

public class Listenertest implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("Test Method Started :"+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Method Success :"+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		
	Screenshot.capturescreenshot(result.getName());
	System.out.println("Test Method Failed :"+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Method Skipped :"+result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		System.out.println("Test Suite Started :"+context.getName());
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test Suite Finished :"+context.getName());
		
	}

}
