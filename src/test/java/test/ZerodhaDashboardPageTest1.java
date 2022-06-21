package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaDashboardPage1;
import utility.Parametrization;
import utility.ZerodhaDashboardOpen;

@Listeners(TestListeners.class)

public class ZerodhaDashboardPageTest1 extends BaseTest {

	//WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() throws EncryptedDocumentException, IOException, InterruptedException
	{
		driver = Browser.openBrowser();
		ZerodhaDashboardOpen.dashboardOpen(driver);
//		Thread.sleep(3000);
//		ZerodhaDashboardPage1 zerodhaDashboardPage1 = new ZerodhaDashboardPage1(driver);
//		String stockname = Parametrization.parametrization("Sheet3", 1, 0);
//		zerodhaDashboardPage1.entersearchStockName(stockname);
//		zerodhaDashboardPage1.movetoStock(driver);
//		zerodhaDashboardPage1.clickOnBuy();
//		Thread.sleep(3000);
	}
	
	
	@Test
	public void searchStockByList() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Thread.sleep(10000);
		ZerodhaDashboardPage1 zerodhaDashboardPage1 = new ZerodhaDashboardPage1(driver);
		String stockname = Parametrization.parametrization("Sheet1", 6, 1);
		zerodhaDashboardPage1.entersearchStockName(stockname);
		Thread.sleep(3000);
		zerodhaDashboardPage1.moveToParticularStock(driver);
		Thread.sleep(3000);
		zerodhaDashboardPage1.clickOnBuy();
		Thread.sleep(5000);
//		zerodhaDashboardPage1.clickOnIntraday(driver);
//		String quantity = Parametrization.parametrization("Sheet3", 1, 1);
//		zerodhaDashboardPage1.enterOnQty(quantity);
//		zerodhaDashboardPage1.clickOnMarketorder(driver);
//		zerodhaDashboardPage1.clickOnSubmit();
	}
	
	
	@Test
	public void buyINFYFromWachlist() throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		Thread.sleep(5000);
		ZerodhaDashboardPage1 zerodhaDashboardPage1 = new ZerodhaDashboardPage1(driver);
		zerodhaDashboardPage1.searchstockfromWachlist1(driver);
		zerodhaDashboardPage1.clickOnBuy1(driver);
		Thread.sleep(5000);
		zerodhaDashboardPage1.clickOnIntraday(driver);
		String quantity = Parametrization.parametrization("Sheet3", 1, 1);
		zerodhaDashboardPage1.enterOnQty(quantity);
		zerodhaDashboardPage1.clickOnMarketorder(driver);
		zerodhaDashboardPage1.clickOnSubmit();
	}
	
	@Test
	public void buyShareMisMarketOrder() throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		Thread.sleep(3000);
     	ZerodhaDashboardPage1 zerodhaDashboardPage1 = new ZerodhaDashboardPage1(driver);
		String stockname = Parametrization.parametrization("Sheet3", 1, 0);
		zerodhaDashboardPage1.entersearchStockName(stockname);
		zerodhaDashboardPage1.movetoStock(driver);
		zerodhaDashboardPage1.clickOnBuy();
	
		Thread.sleep(5000);
		zerodhaDashboardPage1.clickOnIntraday(driver);
		String quantity = Parametrization.parametrization("Sheet3", 1, 1);
		zerodhaDashboardPage1.enterOnQty(quantity);
		zerodhaDashboardPage1.clickOnMarketorder(driver);
		zerodhaDashboardPage1.clickOnSubmit();
	} 
  
	@Test
	public void buyShareMisLimitOrder() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Thread.sleep(3000);
		ZerodhaDashboardPage1 zerodhaDashboardPage1 = new ZerodhaDashboardPage1(driver);
		String stockname = Parametrization.parametrization("Sheet3", 1, 0);
		zerodhaDashboardPage1.entersearchStockName(stockname);
		zerodhaDashboardPage1.movetoStock(driver);
		zerodhaDashboardPage1.clickOnBuy();
		
		Thread.sleep(5000);
		zerodhaDashboardPage1.clickOnIntraday(driver); 
		String quantity = Parametrization.parametrization("Sheet3", 1, 1);
		zerodhaDashboardPage1.enterOnQty(quantity);
		zerodhaDashboardPage1.clickOnLimitorder(driver);
		Thread.sleep(4000);
		String price = Parametrization.parametrization("Sheet3", 1, 2);
		zerodhaDashboardPage1.enterPrice(price);
		zerodhaDashboardPage1.clickOnSubmit();
	}
	
	@Test
	public void buyShareMisSLOrder() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Thread.sleep(3000);
		ZerodhaDashboardPage1 zerodhaDashboardPage1 = new ZerodhaDashboardPage1(driver);
		String stockname = Parametrization.parametrization("Sheet3", 1, 0);
		zerodhaDashboardPage1.entersearchStockName(stockname);
		zerodhaDashboardPage1.movetoStock(driver);
		zerodhaDashboardPage1.clickOnBuy();
	
		Thread.sleep(5000);
		zerodhaDashboardPage1.clickOnIntraday(driver); 
		String quantity = Parametrization.parametrization("Sheet3", 1, 1);
		zerodhaDashboardPage1.enterOnQty(quantity);
		zerodhaDashboardPage1.clickOnSlorder(driver);
		Thread.sleep(4000);
		String price = Parametrization.parametrization("Sheet3", 1, 2);
		zerodhaDashboardPage1.enterPrice(price);
//		String trigerprice = Parametrization.parametrization("Sheet3", 1, 3);
//		zerodhaDashboardPage1.enterTrigerPrice(trigerprice);
		zerodhaDashboardPage1.clickOnSubmit();
	
	}
	
	@Test
	public void buyshareMisSLMorder() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Thread.sleep(3000);
		ZerodhaDashboardPage1 zerodhaDashboardPage1 = new ZerodhaDashboardPage1(driver);
		String stockname = Parametrization.parametrization("Sheet3", 1, 0);
		zerodhaDashboardPage1.entersearchStockName(stockname);
		zerodhaDashboardPage1.movetoStock(driver);
		zerodhaDashboardPage1.clickOnBuy();

	
		Thread.sleep(5000);
		zerodhaDashboardPage1.clickOnIntraday(driver); 
		String quantity = Parametrization.parametrization("Sheet3", 1, 1);
		zerodhaDashboardPage1.enterOnQty(quantity);
		zerodhaDashboardPage1.clickOnSlMorder(driver);
		Thread.sleep(4000);
		
//		String trigerprice = Parametrization.parametrization("Sheet3", 1, 3);
//		zerodhaDashboardPage1.enterTrigerPrice(trigerprice); // trigerprice> price
		zerodhaDashboardPage1.clickOnSubmit();
	}
	
	@Test
	public void coverMarketOrder() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Thread.sleep(3000);
		ZerodhaDashboardPage1 zerodhaDashboardPage1 = new ZerodhaDashboardPage1(driver);
		String stockname = Parametrization.parametrization("Sheet3", 1, 0);
		zerodhaDashboardPage1.entersearchStockName(stockname);
		zerodhaDashboardPage1.movetoStock(driver);
		zerodhaDashboardPage1.clickOnBuy();

		Thread.sleep(5000);
		zerodhaDashboardPage1.clickOnCover(driver);
		String quantity = Parametrization.parametrization("Sheet3", 1, 1);
		zerodhaDashboardPage1.enterOnQty(quantity);
		zerodhaDashboardPage1.clickOnMarketorder(driver);
		zerodhaDashboardPage1.clickOnSubmit();
	}
	@Test
	public void coverLimitOrder() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Thread.sleep(3000);
		ZerodhaDashboardPage1 zerodhaDashboardPage1 = new ZerodhaDashboardPage1(driver);
		String stockname = Parametrization.parametrization("Sheet3", 1, 0);
		zerodhaDashboardPage1.entersearchStockName(stockname);
		zerodhaDashboardPage1.movetoStock(driver);
		zerodhaDashboardPage1.clickOnBuy();

		Thread.sleep(5000);
		zerodhaDashboardPage1.clickOnCover(driver);
		String quantity = Parametrization.parametrization("Sheet3", 1, 1);
		zerodhaDashboardPage1.enterOnQty(quantity);
		Thread.sleep(4000);
		String price = Parametrization.parametrization("Sheet3", 1, 2);
		zerodhaDashboardPage1.enterPrice(price);
		zerodhaDashboardPage1.clickOnSubmit();
	}
	
	@Test
	public void amoOrder() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Thread.sleep(3000);
		ZerodhaDashboardPage1 zerodhaDashboardPage1 = new ZerodhaDashboardPage1(driver);
		String stockname = Parametrization.parametrization("Sheet3", 1, 0);
		zerodhaDashboardPage1.entersearchStockName(stockname);
		zerodhaDashboardPage1.movetoStock(driver);
		zerodhaDashboardPage1.clickOnBuy();
		Thread.sleep(3000);
		zerodhaDashboardPage1.clickOnAmo(driver);
		String quantity = Parametrization.parametrization("Sheet3", 1, 1);
		zerodhaDashboardPage1.enterOnQty(quantity);
		Thread.sleep(4000);
		zerodhaDashboardPage1.clickOnIntraday(driver); 
		zerodhaDashboardPage1.clickOnMarketorder(driver);
		zerodhaDashboardPage1.clickOnSubmit();
	}
	@Test
	public void toggleRegularmarketOrder() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Thread.sleep(3000);
		ZerodhaDashboardPage1 zerodhaDashboardPage1 = new ZerodhaDashboardPage1(driver);
		String stockname = Parametrization.parametrization("Sheet3", 1, 0);
		zerodhaDashboardPage1.entersearchStockName(stockname);
		zerodhaDashboardPage1.movetoStock(driver);
		zerodhaDashboardPage1.clickOnBuy();
		Thread.sleep(3000);
		zerodhaDashboardPage1.clickOnToggle(driver);
		zerodhaDashboardPage1.clickOnRegular(driver);
		zerodhaDashboardPage1.clickOnIntraday(driver);
		Thread.sleep(4000);
		String quantity = Parametrization.parametrization("Sheet3", 1, 1);
		zerodhaDashboardPage1.enterOnQty(quantity);
		zerodhaDashboardPage1.clickOnMarketorder(driver);
		zerodhaDashboardPage1.clickOnSubmit();
	}
	
	
}
