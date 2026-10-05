package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.CustomerManager.GenericLibrary.SeleniumUtility;

public class HomePage 
{
	
	//declaration
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
			private WebElement profileelement;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signoutelement;
	
	@FindBy(xpath = "//a[text()='Organizations']/parent::td[@class='tabUnSelected']")
	private WebElement orgelement;
	
	@FindBy(xpath = "//a[text()='Calendar']")
	private WebElement calendar;
	
	@FindBy(xpath = "//a[text()='Leads']")
	private WebElement leads;
	
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contacts;
	
	@FindBy(xpath = "//a[text()='Opportunities']/parent::td[@class='tabUnSelected']")
	private WebElement opportunities;
	
	@FindBy(xpath = "//a[text()='Products']")
	private WebElement products;
	
	@FindBy(xpath = "//a[text()='Documents']")
	private WebElement documents;
	
	@FindBy(xpath = "//a[text()='Email']")
	private WebElement email;
	
	@FindBy(xpath = "//a[text()='Trouble Tickets']/parent::td[@class='tabUnSelected']")
	private WebElement tickets;
	
	@FindBy(xpath = "//a[text()='Dashboard']")
	private WebElement dashboard;
	
	@FindBy(xpath = "//a[text()='More']")
	private WebElement more;
	
	@FindBy(xpath = "//a[contains(text(),'Home')]")
	private WebElement home;
	
	
	
	//initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	//utilization
	
	public WebElement getProfileelement() {
		return profileelement;
	}

	public WebElement getSignoutelement() {
		return signoutelement;
	}

	public WebElement getOrgelement() {
		return orgelement;
	}


	public WebElement getCalendar() {
		return calendar;
	}


	public WebElement getLeads() {
		return leads;
	}


	public WebElement getContacts() {
		return contacts;
	}


	public WebElement getOpportunities() {
		return opportunities;
	}


	public WebElement getProducts() {
		return products;
	}


	public WebElement getDocuments() {
		return documents;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getTickets() {
		return tickets;
	}


	public WebElement getDashboard() {
		return dashboard;
	}


	public WebElement getMore() {
		return more;
	}


	public WebElement getHome() {
		return home;
	}

	//business logic
	public void logout(WebDriver driver)
	{
		HomePage hp = new HomePage(driver);
		WebElement address = hp.getProfileelement();		//address of profile logo
		SeleniumUtility s = new SeleniumUtility();
		s.mouseHover(driver, address);
		hp.getSignoutelement();
	}
}