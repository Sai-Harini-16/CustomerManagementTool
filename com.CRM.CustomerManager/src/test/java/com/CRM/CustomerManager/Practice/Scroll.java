package com.CRM.CustomerManager.Practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.CRM.CustomerManager.GenericLibrary.SeleniumUtility;

public class Scroll {
	
	
	@Test
	public void scroll() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bbc.com/news");
		SeleniumUtility s = new SeleniumUtility();
		s.scroll(driver, 0, 3000);
		Thread.sleep(3000);
		s.scroll(driver, 0, -3000);
		driver.quit();
	}
}