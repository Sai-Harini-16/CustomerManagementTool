package com.CRM.CustomerManager.GenericLibrary;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
/**
 * @author Harini
 * this class is a generic class which is having generic methods for selenium
 */
public class SeleniumUtility {
	/**
	 * this method is a generic method used to maximize the browser
	 * @param d
	 */
	public void maximizeBrowser(WebDriver d)
	{
		d.manage().window().maximize();
	}
	/**
	 * this method is a generic method used to wait for the element until it is present
	 * @param driver
	 */
	public void implicitWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	/**
	 * this method is a generic method used to navigate to an application
	 * @param driver
	 * @param url
	 */
	public void navToApplication(WebDriver driver, String url)
	{
		driver.get(url);
	}
	/**
	 *this method is a generic method used to handle mouse action and used to hover on element
	 * @param driver
	 * @param element
	 */
	public void mouseHover(WebDriver driver, WebElement element)
	{
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	/**
	 * this method is a generic method used to perform double click
	 * @param driver
	 * @param element
	 */
	
	public void doubleClick(WebDriver driver, WebElement element)
	{
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}
	
	/**
	 * this method is a generic method used to perform right click
	 * @param driver
	 * @param element
	 */
	public void rightClick(WebDriver driver, WebElement element)
	{
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
	}
	/**
	 * this method is a generic method used to perform drag and drop
	 * @param driver
	 * @param src
	 * @param dest
	 */
	public void dragAndDrop(WebDriver driver, WebElement src,WebElement dest)
	{
		Actions a = new Actions(driver);
		a.dragAndDrop(src,dest).perform();
	}
	
	/**
	 * this method is a generic method used to perform scroll action
	 * @param driver
	 * @param xaxis
	 * @param yaxis
	 */
	public void scroll(WebDriver driver, int xaxis, int yaxis)
	{
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
	}
	/**
	 * this method is a generic method used to select option from dropdown
	 * @param address
	 * @param text
	 */
	public void selectOptionByContainsText(WebElement address, String text)
	{
		Select s = new Select(address);
		s.selectByContainsVisibleText(text);
	}
	
	/**
	 * this method is a generic method used to close the browser
	 * @param driver
	 */
	
	public void alertPopupForOK(WebDriver driver)
	{
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	
	public void alertPopupForCancel(WebDriver driver)
	{
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}
	public void closeBrowser(WebDriver driver)
	{
		driver.quit();
	}
}
