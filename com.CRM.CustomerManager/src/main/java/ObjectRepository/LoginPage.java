package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//declaration
	@FindBy(name = "user_name")
	private WebElement usernamebtx;
	
	@FindBy(name = "user_password")
	private WebElement pwtbx;
	
	@FindBy(id = "submitButton")
	private WebElement lgbtn;
	
	@FindBy(xpath = "//img[@alt='Outlook Plugin']")
	private WebElement outlookelement;
	
	@FindBy(xpath = "//img[@alt='Exchange Connector']")
	private WebElement excelement;
	
	@FindBy(xpath = "//img[@src='test/logo/vtiger-crm-logo.gif']")
	private WebElement qrcode1;
	
	@FindBy(xpath = "//img[@src='include/images//AppStoreQRCode.png']")
	private WebElement qrcode2;
	
	@FindBy(xpath = "//img[@src='include/images//AppStore.png']")
	private WebElement iphone1;
	
	@FindBy(xpath = "//img[@src='include/images//GooglePlay.png']")
	private WebElement android1;
	
	@FindBy(xpath = "//img[@alt='Facebook']")
	private WebElement facebook;
	
	@FindBy(xpath = "//img[@alt='Twitter']")
	private WebElement twitter;
	
	@FindBy(xpath = "//img[@alt='Linkedin']")
	private WebElement linkedln;
	
	@FindBy(xpath = "//img[@alt='Videos']")
	private WebElement youtube;
	
	@FindBy(xpath = "//img[@alt='Manuals']")
	private WebElement manuals;
	
	@FindBy(xpath = "//img[@alt='Forums']")
	private WebElement forums;
	
	@FindBy(xpath = "//img[@alt='Blogs']")
	private WebElement blogs;
	
	@FindBy(xpath = "//a[text()='Read License']")
	private WebElement rlicence;
	
	@FindBy(xpath = "//a[text()='Privacy Policy']")
	private WebElement policy;
	
	
	
	
	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	//utilization
	public WebElement getUsernamebtx() {
		return usernamebtx;
	}

	public WebElement getPwtbx() {
		return pwtbx;
	}

	public WebElement getLgbtn() {
		return lgbtn;
	}


	public WebElement getOutlookelement() {
		return outlookelement;
	}


	public WebElement getExcelement() {
		return excelement;
	}


	public WebElement getQrcode1() {
		return qrcode1;
	}


	public WebElement getQrcode2() {
		return qrcode2;
	}


	public WebElement getIphone1() {
		return iphone1;
	}


	public WebElement getAndroid1() {
		return android1;
	}


	public WebElement getFacebook() {
		return facebook;
	}


	public WebElement getTwitter() {
		return twitter;
	}


	public WebElement getLinkedln() {
		return linkedln;
	}


	public WebElement getYoutube() {
		return youtube;
	}


	public WebElement getManuals() {
		return manuals;
	}


	public WebElement getForums() {
		return forums;
	}


	public WebElement getBlogs() {
		return blogs;
	}


	public WebElement getRlicence() {
		return rlicence;
	}


	public WebElement getPolicy() {
		return policy;
	}
	
	
	//BUSINESS LOGIC
	public void login(WebDriver driver,String un, String pwd)
	{
		LoginPage lp = new LoginPage(driver);
		lp.getUsernamebtx().sendKeys(un);
		lp.getPwtbx().sendKeys(pwd);
		lp.getLgbtn().click();
	}
	
	

}
