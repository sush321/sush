package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Report;

import pojo.Browser;
import pom.ZerodhaLoginPage;
import utility.Parametrization;
import utility.Screenshot;
import utility.Reports;

@Listeners(TestListeners.class) 

public class ZerodhaLoginPageTest extends BaseTest
    {
  
	 ExtentReports reports;
	 ExtentTest test;
	 
	@BeforeTest
	public void extentReports()
	{
	  reports = Reports.createreport();
	}
	
	@BeforeMethod
	public void beforemethod()
	{
	  driver = Browser.openBrowser();
	}
	
	@Test
	public void loginWithValidCredentialsTest() throws EncryptedDocumentException, IOException
	{
		test = reports.createTest("loginWithValidCredentialsTest");
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		String username = Parametrization.parametrization("Sheet2", 0, 1);
		String password = Parametrization.parametrization("Sheet2", 1, 1);
		zerodhaLoginPage.enterUserid(username);
		zerodhaLoginPage.enterPassword(password);
		zerodhaLoginPage.clickOnLogin();
	}
	
	@Test
	public void forgotPasswordLinktest()
	{
		test = reports.createTest("forgotPasswordLinktest");
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnForgotPassword();
	}
	
	@Test
	public void signupLinkTest()
	{
		test = reports.createTest("signupLinkTest");
		ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
		zerodhaLoginPage.clickOnSignup();
	}

	

    @Test
    public void assertionHardLoginPage() throws EncryptedDocumentException, IOException
    {
    	test = reports.createTest("assertionHardLoginPage");
    	ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
    	zerodhaLoginPage.clickOnLogin();
    	String text = zerodhaLoginPage.getErrorText();
    	String expectedText = "User ID should be minimum 6 characters.";
    	//String expectedText = "User ID should be minimum  characters."; // error
    	
    	// HArd Assert are static method of Assert class
    	// When main functionality  work  check at that time hard assert are used bz it stop next execution
    	// used for blocker defect
    	
    	Assert.assertEquals(text, expectedText);    // Hard Assert
    	String username = Parametrization.parametrization("Sheet2", 0, 1);
		String password = Parametrization.parametrization("Sheet2", 1, 1);
		zerodhaLoginPage.enterUserid(username);
		zerodhaLoginPage.enterPassword(password);
		zerodhaLoginPage.clickOnLogin();
    }

    @Test
    public void softAssert() throws EncryptedDocumentException, IOException
    {
    	test = reports.createTest("softAssert");
    	//soft assert is class & class methods are non-static method 
    	//it don't tell fail, record it and continue further execution
    	// it used where functionality not important
    	// it tells last assert fails
    	// kuch validation fail huye to farkh nhi pdta then it used
    	// testng gives assertions
    	
    	ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);
     	zerodhaLoginPage.clickOnLogin();
    	String text = zerodhaLoginPage.getErrorText();
    	//String expectedText = "User ID should be minimum 6 characters.";
    	String expectedText = "User ID should be minimum  characters."; // error
    	
    	SoftAssert softassert = new SoftAssert();
    	softassert.assertEquals(text, expectedText);
    	
    	String username = Parametrization.parametrization("Sheet2", 0, 1);
		String password = Parametrization.parametrization("Sheet2", 1, 1);
		zerodhaLoginPage.enterUserid(username);
		zerodhaLoginPage.enterPassword(password);
		zerodhaLoginPage.clickOnLogin();
		
		softassert.assertAll();  // it can written @AfterMethod / @AfterClass
    }
    
	@AfterMethod
	public void aftermethod(ITestResult result) throws IOException
	{
		Screenshot.snapshot(driver);
		
		if(result.getStatus() ==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, result.getName());
		}
		else if(result.getStatus() == ITestResult.SUCCESS)
		{
			test.log(Status.PASS, result.getName());
		}
		else
		{
			test.log(Status.SKIP, result.getName());
		}
			
	}
    
	@AfterTest
	public void flushResult()
	{
		reports.flush();
	}
    }
