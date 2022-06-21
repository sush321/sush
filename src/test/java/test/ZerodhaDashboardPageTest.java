package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaDashboardPage;
import pom.ZerodhaLoginPage;
import pom.ZerodhaPinPage;
import utility.Parametrization;
import utility.ZerodhaDashboardOpen;

public class ZerodhaDashboardPageTest {

	WebDriver driver;
	
	@BeforeMethod
	public void openbrowser()
	{
		driver = Browser.openBrowser();
	}
	
	@Test
	public void homepageOpen() throws EncryptedDocumentException, IOException, InterruptedException
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
			
	}
	@Test
	public void searchShareBuy() throws EncryptedDocumentException, IOException, InterruptedException
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
		Thread.sleep(3000);
		ZerodhaDashboardPage zerodhaDashboardPage = new ZerodhaDashboardPage(driver);
		String stockname = Parametrization.parametrization("Sheet3", 1, 0);
		zerodhaDashboardPage.enterStockNameInSearch(stockname);
		zerodhaDashboardPage.moveToElementTatamotorStock(driver);   
		zerodhaDashboardPage.clickOnBuy(driver);	
		zerodhaDashboardPage.clearQuantity();
		String quantity = Parametrization.parametrization("Sheet3", 1, 1);	
		zerodhaDashboardPage.enterQuantity(quantity);
		zerodhaDashboardPage.clickOnBuySubmit();
	}
	
	@Test(dependsOnMethods= {"homepageOpen"})
	public void fromWachlistBuyStock() throws EncryptedDocumentException, IOException, InterruptedException
	{
//        ZerodhaLoginPage zerodhaLoginPage = new ZerodhaLoginPage(driver);	
//		String username = Parametrization.parametrization("Sheet2", 0, 1);
//		String password = Parametrization.parametrization("Sheet2", 1, 1);
//		zerodhaLoginPage.enterUserid(username);
//		zerodhaLoginPage.enterPassword(password);
//		zerodhaLoginPage.clickOnLogin();	
//		Thread.sleep(3000);
//		ZerodhaPinPage zerodhaPinPage = new ZerodhaPinPage(driver);
//		String pinnumber = Parametrization.parametrization("Sheet2", 2, 1);
//		zerodhaPinPage.enterPin(pinnumber);
//		zerodhaPinPage.clickOnSubmit();  
		Thread.sleep(3000);
		ZerodhaDashboardPage zerodhaDashboardPage = new ZerodhaDashboardPage(driver);
		Thread.sleep(3000);
		zerodhaDashboardPage.clickOnWachlist3(driver);
		String stockname = Parametrization.parametrization("Sheet3", 1, 0);
		zerodhaDashboardPage.enterStockNameInSearch(stockname);
		zerodhaDashboardPage.clickOnStock();
		Thread.sleep(5000);
		zerodhaDashboardPage.moveToElementTatamotorStock(driver);
		zerodhaDashboardPage.clickOnBuy1();
        String quantity = Parametrization.parametrization("Sheet3", 1, 1);
		zerodhaDashboardPage.enterQuantity(quantity);
		zerodhaDashboardPage.clickOnBuySubmit();
	}
	
	//@Test(dependsOnMethods= {"homepageOpen"},enabled=false)
	@Test
	public void buyShareMo() throws EncryptedDocumentException, InterruptedException, IOException
	{
		ZerodhaDashboardOpen.dashboardOpen(driver); 
		Thread.sleep(6000);
		ZerodhaDashboardPage zerodhaDashboardPage = new ZerodhaDashboardPage(driver);
		String stockname = Parametrization.parametrization("Sheet3", 1, 0);
		zerodhaDashboardPage.enterStockNameInSearch(stockname);
		zerodhaDashboardPage.moveToElementTatamotorStock(driver);   
		zerodhaDashboardPage.clickOnBuy(driver);	
	//	zerodhaDashboardPage.clearQuantity();
		String quantity = Parametrization.parametrization("Sheet3", 1, 1);	
		zerodhaDashboardPage.enterQuantity(quantity);
		Thread.sleep(3000);
		zerodhaDashboardPage.clickOnMarketOrder(driver);
		//zerodhaDashboardPage.clickOnSL();
		zerodhaDashboardPage.clickOnTarget(driver);
		//zerodhaDashboardPage.clickOnStoploss(driver);
		zerodhaDashboardPage.clickOnBuySubmit();
	}
	
	@Test
	public void slOrder() throws EncryptedDocumentException, IOException, InterruptedException
	{
		ZerodhaDashboardOpen.dashboardOpen(driver);
	}
}
