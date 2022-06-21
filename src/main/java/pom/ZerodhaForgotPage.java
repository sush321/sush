package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaForgotPage {

	@FindBy(xpath = "(//input[@type='radio'])[1]") private WebElement rememberuserid;
	@FindBy(xpath = "(//input[@type='radio'])[2]") private WebElement forgotid;
	@FindBy(xpath = "//input[@placeholder='User ID']") private WebElement userid;  //input[@placeholder='User ID'] // (//input[@maxlength='6'])[1]
	@FindBy(xpath = "//input[@maxlength='10']") private WebElement pan;
	@FindBy(xpath = "(//input[@type='radio'])[3]") private WebElement email;
	@FindBy(xpath = "(//input[@type='radio'])[4]") private WebElement sms;
	@FindBy(xpath = "//input[@maxlength='50']") private WebElement emailorsmsid;
	@FindBy(xpath = "//input[@placeholder='Captcha']") private WebElement captcha;  // Captcha Dynamic 
	@FindBy(xpath = "//button[@type='submit']") private WebElement reset;
	@FindBy(xpath = "//a[contains(@class,'text-xsmall text-light reset-account-button')]") private WebElement backtologin;
	@FindBy(xpath = "//a[text()=\"Don't have an account? Signup now!\"]") private WebElement signup;
	
	public ZerodhaForgotPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnRememberuserid()
	{
		rememberuserid.click();
	}
	
	public void clickOnForgotid()
	{
		forgotid.click();
	}
	
	public void enterUserid(String id)
	{
		userid.sendKeys(id);
	}
	  
	public void enterPanId(String panno)
	{
		pan.sendKeys(panno);
	}
	
	public void clickOnEmail()
	{
		email.click();
	}
	
	public void clickOnSms()
	{
		sms.click();
	}
	
	public void entercaptcha(String cap)
	{
		captcha.sendKeys(cap);
	}
	
	public void clickOnBacktologin()
	{
		backtologin.click();
	}
	
	public void clickOnSignup()
	{
		signup.click();
	}
	
	public void enterEmailorSmsId(String emailsms)
	{
		emailorsmsid.sendKeys(emailsms);
	}
	
	public void clickOnReset()
	{
		reset.click();
	}
}
