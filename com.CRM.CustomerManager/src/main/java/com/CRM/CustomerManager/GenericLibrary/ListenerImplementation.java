package com.CRM.CustomerManager.GenericLibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

public class ListenerImplementation extends BaseClass implements ITestListener{
	
	ExtentReports report;
	ExtentTest test;
	@Override
	public void onTestStart(ITestResult result)
	{
		String name = result.getName();
		report.createTest(name);
		
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		String name = result.getName();
		test.log(Status.PASS, name+"---test passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name = result.getName();			//it will give the name of the test script
		TakesScreenshot t = (TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		JavaUtility j = new JavaUtility();
		 String dateandtime = j.getDateAndTime("dd-MM-yyyy hh-mm-ss");
		File dest = new File("C:\\Users\\Sai Harini\\eclipse-workspace\\Automation\\com.CRM.CustomerManager\\ScreenShots"+name+" "+dateandtime+".png");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		test.log(Status.PASS, name+"---test failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		String name = result.getName();
		test.log(Status.SKIP, name+"---test skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) 
	{
		ExtentSparkReporter reporter = new ExtentSparkReporter("./Reports/executionReport.html");
		reporter.config().setDocumentTitle("vtiger");
		reporter.config().setReportName("vtiger Execution Report");
		reporter.config().setTheme(Theme.DARK);
		
		report = new ExtentReports();
		report.attachReporter(reporter);
		
		report.setSystemInfo("URL", "http//localhost:8888");
		report.setSystemInfo("OS", "windows10");
		report.setSystemInfo("browser", "chrome");
		report.setSystemInfo("Automation TE", "Harini :)");
	}

	@Override
	public void onFinish(ITestContext context)
	{
		report.flush();
	}	
}