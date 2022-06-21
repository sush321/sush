package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginPage {

	@FindBy(xpath = "//input[@id='userid']") private WebElement userid;
	@FindBy(xpath = "//input[@id='password']") private WebElement password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement login;
	@FindBy(xpath = "//a[text()='Forgot user ID or password?']") private WebElement forgot;
	@FindBy(xpath = "//a[text()=\"Don't have an account? Signup now!\"]") private WebElement signup;
	@FindBy(xpath = "//img[@alt='Kite Android']") private WebElement downloadforAndroid;
	@FindBy(xpath = "//img[@alt='Kite iOS']") private WebElement downloadforios;
	@FindBy(xpath = "//a[@class='footer-logo']") private WebElement zerodhalogo;
	@FindBy(xpath = "//a[text() ='SEBI']") private WebElement sebisite;
	@FindBy(xpath = "//a[text() ='NSE']") private WebElement nsesite;
	@FindBy(xpath = "//a[text() ='BSE']") private WebElement bsesite;
	@FindBy(xpath = "//a[text() ='CDSL']") private WebElement cdslsite;
	@FindBy(xpath = "//a[text() ='MCX']") private WebElement mcxsite;
	@FindBy(xpath = "(//span[@class='su-message'])[1]") private WebElement erroruserid;
	
	public ZerodhaLoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getErrorText()
	{
		String text = erroruserid.getText();
		return text;
	}
	
	public void enterUserid(String user)
	{
		userid.sendKeys(user);
	}
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickOnLogin()
	{
		login.click();
	}
	
	public void clickOnForgotPassword()
	{
		forgot.click();
	}
	
	public void clickOnSignup()
	{
		signup.click();
	}
	
	public void clickOnDownloadforAndroid()
	{
		downloadforAndroid.click();
	}
	
	public void clickOnDownloadforios()
	{
		downloadforios.click();
	}
	
	public void clickOnZerodhalogo()
	{
		zerodhalogo.click();
	}
	
	public void clickOnsebisite()
	{
		sebisite.click();
	}
	
	public void clickOnnsesite()
	{
		nsesite.click();
	}
	
	public void clickOnbsesite()
	{
		bsesite.click();
	}
	
	public void clickcdslsite()
	{
		cdslsite.click();
	}
	
	public void clickmcxsite()
	{
		mcxsite.click();
	}
}
