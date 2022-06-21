package test;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaLoginPage;
import pom.ZerodhaPinPage;
import utility.Parametrization;
import utility.Screenshot;

public class ZerodhaPinPageTest {

	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		driver = Browser.openBrowser();
	}
	
	@Test
	public void enterPinnumber() throws EncryptedDocumentException, IOException, InterruptedException
	{
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		String username = Parametrization.parametrization("Sheet2", 0, 1);
		String password = Parametrization.parametrization("Sheet2", 1, 1);
		zerodhaLoginPage.enterUserid(username);
		zerodhaLoginPage.enterPassword(password);
		zerodhaLoginPage.clickOnLogin();
		Thread.sleep(3000);     
		ZerodhaPinPage zerodhaPinPage = new ZerodhaPinPage(driver);
		String pinnumber = Parametrization.parametrization("Sheet2", 2, 1);
		zerodhaPinPage.enterPin(pinnumber);
		zerodhaPinPage.clickOnSubmit();
		Thread.sleep(5000);     
		 String homepage = driver.getTitle();
		 String requiredTitle = "Dashboard / Kite";
		 Assert.assertEquals(homepage, requiredTitle);
		 
	} 
	
	@AfterMethod
	public void screenshot() throws IOException
	{
		Screenshot.snapshot(driver);
	}
	
}
