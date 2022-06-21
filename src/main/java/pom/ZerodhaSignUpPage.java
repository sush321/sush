package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSignUpPage {

	
	@FindBy(xpath = "//input[@name='mobile']") private WebElement mobileno;
	@FindBy(xpath = "//button[@type='submit']") private WebElement submit;
	@FindBy(xpath = "(//a[text()='Signup'])[1]") private WebElement signup;
	@FindBy(xpath = "(//a[text()='Products'])[1]") private WebElement products;
	@FindBy(xpath = "(//a[text()='Pricing'])[1]") private WebElement pricing;
	@FindBy(xpath = "(//a[text()='Support'])[1]") private WebElement support;
	@FindBy(xpath = "//div[@title='Menu']") private WebElement menu;
	@FindBy(xpath = "//a[text()='Want to open an NRI account?']") private WebElement nriaccount;
	@FindBy(xpath = "//a[text()='//a[text()='Referral programme']") private WebElement referralprogramme;
	@FindBy(xpath = "//a[text()='Careers']") private WebElement careers;
	@FindBy(xpath = "//a[text()='Zerodha.tech']") private WebElement zerodhatech;
	@FindBy(xpath = "//a[text()='Contact']") private WebElement Contact;
	@FindBy(xpath = "//a[text()='Support portal']") private WebElement supportportal;
	@FindBy(xpath = "//a[text()='Market overview']") private WebElement marketoverview;
	@FindBy(xpath = "//a[text()='Open an account']") private WebElement openanaccount;
	@FindBy(xpath = "//a[text()='Fund transfer']") private WebElement fundtransfer;
	@FindBy(xpath = "//a[text()='60 day challenge']") private WebElement day60challenge;
	
	public ZerodhaSignUpPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterMobileNo(String number)
	{
		mobileno.sendKeys(number);
	}
	
	public void clickOnSubmit()
	{
		submit.click();
	}
	
	public void clickOnSignup()
	{
		signup.click();
	}
	
	public void clickOnProducts()
	{
		products.click();
	}
	
	public void clickOnPricing()
	{
		pricing.click();
	}
	
	public void clickOnSupport()
	{
		support.click();
	}
	
	public void clickOnMenu()
	{
		menu.click();
	}
	
	public void clickOnNriaccount()
	{
		nriaccount.click();
	}
	
	public void clickOnReferralprogramme()
	{
		referralprogramme.click();
	}
	
	public void clickOnCareers()
	{
		careers.click();
	}
	
	public void clickOnZerodhatech()
	{
		zerodhatech.click();
	}
	
	public void clickOnContact()
	{
		Contact.click();
	}
	
	public void clickOnSupportportal()
	{
		supportportal.click();
	}
	
	public void clickOnMarketoverview()
	{
		marketoverview.click();
	}
	
	public void clickOnOpenanaccount()
	{
		openanaccount.click();
	}
	
	public void clickOnFundtransfer()
	{
		fundtransfer.click();
	}
	
	public void clickOnDay60challenge()
	{
		day60challenge.click();
	}
}
