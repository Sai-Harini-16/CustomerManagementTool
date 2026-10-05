package com.CRM.CustomerManager.Practice;

import org.testng.annotations.Test;

import com.CRM.CustomerManager.GenericLibrary.BaseClass;

import ObjectRepository.HomePage;

public class Demo extends BaseClass{
	
	@Test
	public void DemoScript()
	{
		HomePage hp = new HomePage(driver);
		hp.getOrgelement().click();
	}

}
