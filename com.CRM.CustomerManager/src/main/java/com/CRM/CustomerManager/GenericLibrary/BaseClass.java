package com.CRM.CustomerManager.GenericLibrary;

//import java.io.FileInputStream;
import java.io.IOException;
//import java.time.Duration;
//import java.util.Properties;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;

public class BaseClass 
{
	public static WebDriver driver;
	FileUtility f = new FileUtility();
	 SeleniumUtility s = new SeleniumUtility();
	@BeforeSuite
	public void databaseConnected()
	{
		Reporter.log("database connected successfully",true);
	}
	@Parameters("browser")	//to execute in suite file we use this annotation instead @optional annotation or then we have to emove @optional annotation
	@BeforeTest
	public void launchBrowser(/*@Optional("chrome") */String BROWSER) throws IOException
	{
		if (BROWSER.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(BROWSER.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(BROWSER.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			driver = new ChromeDriver();
		}
		//SeleniumUtility s = new SeleniumUtility();
		s.maximizeBrowser(driver);
		s.implicitWait(driver);
		String URL=f.readDataFromProperty("url");
		s.navToApplication(driver, URL);
		Reporter.log("Browser launched and navigated to CMT(Customer Management Tool) application");
	}

	@BeforeMethod
	public void loginToCMT() throws IOException
	{
		String un = f.readDataFromProperty("username");
		
		String pwd = f.readDataFromProperty("password");
		LoginPage lp = new LoginPage(driver);
		lp.login(driver, un, pwd);
		Reporter.log("logged in to CMT Application Successfully",true);
	}
	
	
	@AfterMethod
	public void logout()
	{
		
		HomePage hp = new HomePage(driver);
		hp.logout(driver);
		Reporter.log("logged out successfully",true);
	}
	
	@AfterTest
	public void closeBrowser()
	{
		s.closeBrowser(driver);
		Reporter.log("Browser closed successfully",true);
	}
	
	@AfterSuite
	public void disconnectFromDataBase()
	{
		Reporter.log("database disconnected successfully",true);
	}
}
