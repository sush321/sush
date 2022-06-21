package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaForgotPage;
import pom.ZerodhaLoginPage;
import utility.Parametrization;
import utility.Screenshot;

@Listeners(TestListeners.class) 

public class ZerodhaForgotPageTest {

	WebDriver driver;
	
	@BeforeMethod
	public void beforemethod()
	{
		driver = Browser.openBrowser();
	}
	
	@AfterMethod
	public void aftermethod() throws IOException
	{
		Screenshot.snapshot(driver);
	}
	
	@Test
	public void rememberuserid() throws EncryptedDocumentException, IOException
	{
		ZerodhaLoginPage  zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnForgotPassword();
		
		ZerodhaForgotPage  zerodhaForgotPage = new ZerodhaForgotPage(driver);
		zerodhaForgotPage.clickOnRememberuserid();
		String userid = Parametrization.parametrization("Shet1", 4, 1);
		String pancardno = Parametrization.parametrization("Shet1", 5, 1);
		String mobileno = Parametrization.parametrization("Shet1", 3, 1);
		zerodhaForgotPage.enterUserid(userid);
		zerodhaForgotPage.enterPanId(pancardno);
		zerodhaForgotPage.clickOnSms();
		zerodhaForgotPage.enterEmailorSmsId(mobileno);
		zerodhaForgotPage.clickOnReset();
	}
	
	@Test
	public void forgotuserid() throws EncryptedDocumentException, IOException
	{
		ZerodhaLoginPage  zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnForgotPassword();
		ZerodhaForgotPage  zerodhaForgotPage = new ZerodhaForgotPage(driver);
		zerodhaForgotPage.clickOnForgotid();
		String pancardno = Parametrization.parametrization("Shet1", 5, 1);
		String mobileno = Parametrization.parametrization("Shet1", 3, 1);
		zerodhaForgotPage.enterPanId(pancardno);
		zerodhaForgotPage.clickOnSms();
		zerodhaForgotPage.enterEmailorSmsId(mobileno);
		zerodhaForgotPage.clickOnReset();
	}
}
