package com.CRM.CustomerManager.Practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.CRM.CustomerManager.GenericLibrary.BaseClass;
import com.CRM.CustomerManager.GenericLibrary.FileUtility;
import com.CRM.CustomerManager.GenericLibrary.JavaUtility;
import com.CRM.CustomerManager.GenericLibrary.SeleniumUtility;

import ObjectRepository.HomePage;
import ObjectRepository.OrganizationPage;

public class CreateOrgPractice2 extends BaseClass {
	WebDriver driver;
	SeleniumUtility s = new SeleniumUtility();
	@Test
	public void createOrg2() throws EncryptedDocumentException, IOException, InterruptedException
	{	
		
		HomePage hp = new HomePage(driver);
		hp.getOrgelement().click();
		OrganizationPage op = new OrganizationPage(driver);
		op.getPlusicon().click();
		
		
		FileUtility f = new FileUtility();
		String orgname = f.readDataFromExcelStringData("OrgDetails", 2, 1);
		op.getOrgname().sendKeys(orgname);
		
		
		JavaUtility j = new JavaUtility();
		int number = j.getRandomNumber(50);
		op.getOrgname().sendKeys(orgname+number);
		
		
		String email = f.readDataFromExcelStringData("OrgDetails", 1, 2);
		op.getEmailtxtbox().sendKeys(email);
		
		WebElement address = op.getIndustrytype();
		s.selectOptionByContainsText(address,"Technology");
		
		WebElement type = op.getTypedrop();
		s.selectOptionByContainsText(type, "Customer");
		
		String billingaddress = f.readDataFromExcelStringData("OrgDetails", 1, 3);
		String shipingaddress = f.readDataFromExcelStringData("OrgDetails", 1, 4);
		String billingcity = f.readDataFromExcelStringData("OrgDetails", 1, 5);
		String shippingcity = f.readDataFromExcelStringData("OrgDetails", 1, 6);
		String billingstate = f.readDataFromExcelStringData("OrgDetails", 1, 7);
		String shippingstate = f.readDataFromExcelStringData("OrgDetails", 1, 8);
		String billingcountry = f.readDataFromExcelStringData("OrgDetails", 1, 9);
		String shippingcountry = f.readDataFromExcelStringData("OrgDetails", 1, 10);
		String desp = f.readDataFromExcelStringData("OrgDetails", 1, 11);
		op.getBilladdress().sendKeys(billingaddress);
		op.getShipaddress().sendKeys(shipingaddress);
		op.getBillcity().sendKeys(billingcity);
		op.getShipcity().sendKeys(shippingcity);
		op.getBillstate().sendKeys(billingstate);
		op.getShipstate().sendKeys(shippingstate);
		op.getBillcountry().sendKeys(billingcountry);
		op.getShipcountry().sendKeys(shippingcountry);
		op.getDesp().sendKeys(desp);
		op.getSavebtn().click();
		Thread.sleep(5000);
		
	}
	@Test
	public void createOrg() throws EncryptedDocumentException, IOException, InterruptedException
	{	
		
		HomePage hp = new HomePage(driver);
		hp.getOrgelement().click();
		OrganizationPage op = new OrganizationPage(driver);
		op.getPlusicon().click();
		
		
		FileUtility f = new FileUtility();
		String orgname = f.readDataFromExcelStringData("OrgDetails", 2, 1);
		op.getOrgname().sendKeys(orgname);
		
		
		JavaUtility j = new JavaUtility();
		int number = j.getRandomNumber(50);
		op.getOrgname().sendKeys(orgname+number);
		
		
		String email = f.readDataFromExcelStringData("OrgDetails", 1, 2);
		op.getEmailtxtbox().sendKeys(email);
		
		WebElement address = op.getIndustrytype();
		s.selectOptionByContainsText(address,"Technology");
		
		WebElement type = op.getTypedrop();
		s.selectOptionByContainsText(type, "Customer");
		
		String billingaddress = f.readDataFromExcelStringData("OrgDetails", 1, 3);
		String shipingaddress = f.readDataFromExcelStringData("OrgDetails", 1, 4);
		String billingcity = f.readDataFromExcelStringData("OrgDetails", 1, 5);
		String shippingcity = f.readDataFromExcelStringData("OrgDetails", 1, 6);
		String billingstate = f.readDataFromExcelStringData("OrgDetails", 1, 7);
		String shippingstate = f.readDataFromExcelStringData("OrgDetails", 1, 8);
		String billingcountry = f.readDataFromExcelStringData("OrgDetails", 1, 9);
		String shippingcountry = f.readDataFromExcelStringData("OrgDetails", 1, 10);
		String desp = f.readDataFromExcelStringData("OrgDetails", 1, 11);
		op.getBilladdress().sendKeys(billingaddress);
		op.getShipaddress().sendKeys(shipingaddress);
		op.getBillcity().sendKeys(billingcity);
		op.getShipcity().sendKeys(shippingcity);
		op.getBillstate().sendKeys(billingstate);
		op.getShipstate().sendKeys(shippingstate);
		op.getBillcountry().sendKeys(billingcountry);
		op.getShipcountry().sendKeys(shippingcountry);
		op.getDesp().sendKeys(desp);
		op.getSavebtn().click();
		Thread.sleep(5000);
		
	}

	@Test
	public void createOrg1() throws EncryptedDocumentException, IOException, InterruptedException
	{	
		
		WebDriver driver = null;
		HomePage hp = new HomePage(driver);
		hp.getOrgelement().click();
		OrganizationPage op = new OrganizationPage(driver);
		op.getPlusicon().click();
		
		
		FileUtility f = new FileUtility();
		String orgname = f.readDataFromExcelStringData("OrgDetails", 2, 1);
		op.getOrgname().sendKeys(orgname);
		
		
		JavaUtility j = new JavaUtility();
		int number = j.getRandomNumber(50);
		op.getOrgname().sendKeys(orgname+number);
		
		
		String email = f.readDataFromExcelStringData("OrgDetails", 1, 2);
		op.getEmailtxtbox().sendKeys(email);
		
		WebElement address = op.getIndustrytype();
		s.selectOptionByContainsText(address,"Technology");
		
		WebElement type = op.getTypedrop();
		s.selectOptionByContainsText(type, "Customer");
		
		String billingaddress = f.readDataFromExcelStringData("OrgDetails", 1, 3);
		String shipingaddress = f.readDataFromExcelStringData("OrgDetails", 1, 4);
		String billingcity = f.readDataFromExcelStringData("OrgDetails", 1, 5);
		String shippingcity = f.readDataFromExcelStringData("OrgDetails", 1, 6);
		String billingstate = f.readDataFromExcelStringData("OrgDetails", 1, 7);
		String shippingstate = f.readDataFromExcelStringData("OrgDetails", 1, 8);
		String billingcountry = f.readDataFromExcelStringData("OrgDetails", 1, 9);
		String shippingcountry = f.readDataFromExcelStringData("OrgDetails", 1, 10);
		String desp = f.readDataFromExcelStringData("OrgDetails", 1, 11);
		op.getBilladdress().sendKeys(billingaddress);
		op.getShipaddress().sendKeys(shipingaddress);
		op.getBillcity().sendKeys(billingcity);
		op.getShipcity().sendKeys(shippingcity);
		op.getBillstate().sendKeys(billingstate);
		op.getShipstate().sendKeys(shippingstate);
		op.getBillcountry().sendKeys(billingcountry);
		op.getShipcountry().sendKeys(shippingcountry);
		op.getDesp().sendKeys(desp);
		op.getSavebtn().click();
		Thread.sleep(5000);
		
	}
	

}

