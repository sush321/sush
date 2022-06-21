package test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaLoginPage;
import pom.ZerodhaSignUpPage;
import utility.Parametrization;
import utility.Screenshot;

public class ZerodhaSignUpPageTest {

     WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		driver = Browser.openBrowser();
	}
	
	@Test
	public void clickOnContinue() throws EncryptedDocumentException, IOException
	{
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnSignup();
		Set<String> addresses = driver.getWindowHandles(); 
		Iterator<String> i = addresses.iterator();
		while(i.hasNext())
		{	
			String address = i.next();
			driver.switchTo().window(address);
			String currentTitle = driver.getTitle();	
			if(currentTitle.equals("Signup and open a Zerodha trading and demat account online and start investing – Zerodha"))
			{
				ZerodhaSignUpPage zerodhaSignUpPage = new ZerodhaSignUpPage(driver);
				String no = Parametrization.parametrization("Sheet1", 3, 1);
				zerodhaSignUpPage.enterMobileNo(no);
				zerodhaSignUpPage.clickOnSubmit();
			}
		}
	}
	
	@BeforeMethod
	public void screenshot() throws IOException
	{
		Screenshot.snapshot(driver);
	}
	
}
