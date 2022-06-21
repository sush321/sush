package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaDashboardPage1 {

	@FindBy(xpath = "//span[text()='TATAMOTORS']") private WebElement tatamotor;
	@FindBy(xpath = "//input[@icon='search']") private WebElement searchstock;
	@FindBy(xpath = "(//button[@type='button'])[1]") private WebElement buy;
	@FindBy(xpath = "//input[@label='Intraday <span>MIS</span>']") private WebElement intraday;
	@FindBy(xpath = "//button[@type='submit']") private WebElement submit;
	@FindBy(xpath = "//input[@label='Market']") private WebElement marketorder;
	@FindBy(xpath = "//input[@label='Limit']") private WebElement limitorder;
	@FindBy(xpath = "//input[@label='SL']") private WebElement slorder;
	@FindBy(xpath = "//input[@label='SL-M']") private WebElement slmorder;
	@FindBy(xpath = "//input[@label='Qty.']") private WebElement qty;
	@FindBy(xpath = "//input[@label='Price']") private WebElement price;
	@FindBy(xpath = "//input[@label='Trigger price']") private WebElement trigerprice;
	
	@FindBy(xpath = "//label[text()='Regular']") private WebElement regular;
	@FindBy(xpath = "//label[text()='Cover']") private WebElement cover;
	@FindBy(xpath = "//label[text()='AMO']") private WebElement amo;
	@FindBy(xpath = "//label[text()='Iceberg']") private WebElement iceberg;
	@FindBy(xpath = "//label[@class='su-switch-control']") private WebElement toggle;
	@FindBy(xpath = "//input[@value='BSE']") private WebElement bse;
	@FindBy(xpath = "//input[@value='NSE']") private WebElement nse;
	
	@FindBy(xpath = "//span[@class='nice-name']") private List<WebElement> element;
	
	@FindBy(xpath = "//span[@class='tradingsymbol']") private List<WebElement>  stocksfromsearch;
	
	public ZerodhaDashboardPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void moveToParticularStock(WebDriver driver) throws InterruptedException
	{
		int number= stocksfromsearch.size();
		for(int i =0; i<number;i++)
		{
			WebElement search = stocksfromsearch.get(i);
			System.out.println(search.getText());
			if(search.getText().equalsIgnoreCase("TATAPOWER"))
			{
				
				Actions action = new Actions(driver);
				action.moveToElement(search);
				action.perform();
				//Thread.sleep(3000);	
			}
//			else
//			{
//				System.out.println("Not found");
//			}
		}
	}
	
	public void searchstockfromWachlist1(WebDriver driver) throws InterruptedException
	{
		int number=element.size();
		for(int i=0; i<number; i++)
		{
			WebElement search = element.get(i);
			if(search.getText().equalsIgnoreCase("INFY"))
			{
				Actions action = new Actions(driver);
				action.moveToElement(search);
				action.perform();
				Thread.sleep(3000);			
			}
			else
			{
				System.out.println("Not found");
			}
		}
	}
	
	public void clickOnRegular(WebDriver driver) 
	{
		Actions action = new Actions(driver);
		action.moveToElement(regular).click();
		action.perform();
	}
	
	public void clickOnNse(WebDriver driver) 
	{
		Actions action = new Actions(driver);
		action.moveToElement(nse).click();
		action.perform();
	}
	
	public void clickOnBse(WebDriver driver) 
	{
		Actions action = new Actions(driver);
		action.moveToElement(bse).click();
		action.perform();
	}
	
	public void clickOnToggle(WebDriver driver) 
	{
		Actions action = new Actions(driver);
		action.moveToElement(toggle).click();
		action.perform();
	}
	
	public void clickOnCover(WebDriver driver) 
	{
		Actions action = new Actions(driver);
		action.moveToElement(cover).click();
		action.perform();
	}
	public void clickOnAmo(WebDriver driver) 
	{
		Actions action = new Actions(driver);
		action.moveToElement(amo).click();
		action.perform();
	}
	
	public void clickOnIceberg(WebDriver driver) 
	{
		Actions action = new Actions(driver);
		action.moveToElement(iceberg).click();
		action.perform();
	}
	public void entersearchStockName(String stockname)
	{
		searchstock.sendKeys(stockname); 
	}
	public void movetoStock(WebDriver driver)
	{
		Actions action = new Actions(driver);
		action.moveToElement(tatamotor);	
		action.perform();
	}
	public void clickOnBuy() 
	{
		buy.click();
	}
	public void clickOnBuy1(WebDriver driver) 
	{
//		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000)); // explicit wait
//		 wait.until(ExpectedConditions.visibilityOf(buy)); 
		Actions action = new Actions(driver);
		action.moveToElement(buy).click();
		action.perform();
	}
	public void clickOnIntraday(WebDriver driver) 
	{
		Actions action = new Actions(driver);
		action.moveToElement(intraday).click();
		action.perform();
	}
	
	public void enterOnQty(String quantity)
	{
		qty.sendKeys(quantity);
	}
	
	public void clickOnSubmit()
	{
		submit.click();
	}
	public void clickOnMarketorder(WebDriver driver)
	{
		Actions action = new Actions(driver);
		action.moveToElement(marketorder).click();
		action.perform();
	}
	public void clickOnSlorder(WebDriver driver)
	{
		Actions action = new Actions(driver);
		action.moveToElement(slorder).click();
		action.perform();
		//slorder.click();
	}
	public void clickOnSlMorder(WebDriver driver)
	{ 
		Actions action = new Actions(driver);
		action.moveToElement(slmorder).click();
		action.perform();
		//slmorder.click();
	}
	public void clickOnLimitorder(WebDriver driver)
	{ 
		Actions action = new Actions(driver);
		action.moveToElement(limitorder).click();
		action.perform();
		//slmorder.click();
	}
	public void enterPrice(String amount)
	{
		price.sendKeys(amount);
	}
	public void enterTrigerPrice(String amount1)
	{
		trigerprice.sendKeys(amount1);
	}
}
