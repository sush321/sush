package utility;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import pom.ZerodhaLoginPage;
import pom.ZerodhaPinPage;

public class ZerodhaDashboardOpen {

	
	public  static void dashboardOpen(WebDriver driver) throws EncryptedDocumentException, IOException, InterruptedException
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
}
