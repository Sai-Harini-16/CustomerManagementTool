package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
		//declaration
		@FindBy(xpath = "//img[@title='Create Organization...']")
		private WebElement plusicon;
		
		@FindBy(name = "accountname")
		private WebElement orgname;
		
		@FindBy(name = "industry")
		private WebElement industrytype;
		
		@FindBy(name = "accounttype")
		private WebElement typedrop;
		
		@FindBy(xpath="//td[text()='Email ']/following-sibling::td/child::input") 
		private WebElement emailtxtbox;
		
		@FindBy(name="bill_street") 
		private WebElement billaddress;
		
		@FindBy(name="ship_street") 
		private WebElement shipaddress;
		
		@FindBy(name="bill_city") 
		private WebElement billcity;
		
		@FindBy(name="ship_city")
		private WebElement shipcity;
		
	    @FindBy(id="bill_state") 
	    private WebElement billstate;
		
		@FindBy(id="ship_state") 
		private WebElement shipstate;
		
	    @FindBy(id="bill_country") 
	    private WebElement billcountry;
		
		@FindBy(id="ship_country") 
		private WebElement shipcountry;
		
		@FindBy(name="description")
		private WebElement desp;

		@FindBy(name="button")
		private WebElement savebtn;
		
		@FindBy(name="//input[@title='Cancel [Alt+X]']") 
		private WebElement cancelbtn;
		
		
	
	//initialization
	public OrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

	
	//utilization

	public WebElement getPlusicon() {
		return plusicon;
	}

	public WebElement getOrgname() {
		return orgname;
	}

	public WebElement getIndustrytype() {
		return industrytype;
	}

	public WebElement getTypedrop() {
		return typedrop;
	}

	public WebElement getEmailtxtbox() {
		return emailtxtbox;
	}

	public WebElement getBilladdress() {
		return billaddress;
	}


	public WebElement getShipaddress() {
		return shipaddress;
	}

	public WebElement getBillcity() {
		return billcity;
	}

	public WebElement getShipcity() {
		return shipcity;
	}

	public WebElement getBillstate() {
		return billstate;
	}

	public WebElement getShipstate() {
		return shipstate;
	}

	public WebElement getBillcountry() {
		return billcountry;
	}

	public WebElement getShipcountry() {
		return shipcountry;
	}

	public WebElement getDesp() {
		return desp;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getCancelbtn() {
		return cancelbtn;
	}
	
}
