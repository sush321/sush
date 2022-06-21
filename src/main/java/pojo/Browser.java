package pojo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pom.ZerodhaLoginPage;
import pom.ZerodhaPinPage;
import utility.Parametrization;

public class Browser {

	//static WebDriver driver; 
	public static WebDriver openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\software\\Selenium\\Drivers\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions(); // class of selenium
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		
	//	driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS); // universal wait applicable for every instance of WebDriver  
		
		return driver;
	}
	

}