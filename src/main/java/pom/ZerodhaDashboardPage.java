package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaDashboardPage 

{
	@FindBy(xpath = "//a[@href='/dashboard']") private WebElement dashboard;
	@FindBy(xpath = "//a[@class='orders-nav-item']") private WebElement order;
	@FindBy(xpath = "//a[@href='/holdings']") private WebElement holding;
	@FindBy(xpath = "//a[@href='/positions']") private WebElement positions;
	@FindBy(xpath ="//a[@href='/funds']") private WebElement fund;
	@FindBy(xpath = "//a[@href='/apps']") private WebElement apps;
	@FindBy(xpath = "//span[text()='OKP335']") private WebElement id;
	
	@FindBy(xpath = "//span[text()='View statement']") private WebElement viewstatement;
	@FindBy(xpath = "//a[@class='button button-blue']") private WebElement activatecomodity;
	@FindBy(xpath = "(//button[@type='button'])[1]") private WebElement startinvesting;
	@FindBy(xpath = "(//button[@type='button'])[2]") private WebElement getstarted;
	@FindBy(xpath = "//div[@class='promo-banner click']") private WebElement giftstock;

	@FindBy(xpath = "//input[@icon='search']") private WebElement searchstock;
	@FindBy(xpath = "(//span[text()='TATAMOTORS'])[1]") private WebElement tatamotors;
	@FindBy(xpath = "//button[@data-balloon='Buy']") private WebElement buy;
	
	@FindBy(xpath = "//input[@step='1']") private WebElement quantity;
	@FindBy(xpath = "//button[@type='submit']") private WebElement buysubmit;
	@FindBy(xpath = "(//li[@data-balloon-pos='up'])[3]") private WebElement wachlist3;
	@FindBy(xpath = "//button[@class='button-blue buy']") private WebElement buy1;
	
	@FindBy(xpath = "//div[@draggable='true']") private WebElement list ;
	@FindBy(xpath = "//input[@value='MARKET']") private WebElement marketorder ;
	@FindBy(xpath = "//input[@label='Target']") private WebElement target ;
	@FindBy(xpath = "//input[@label='Stoploss']") private WebElement stoploss ;
	@FindBy(xpath = "//input[@label='SL']") private WebElement sl ;
	
	@FindBy(xpath = "//span[text()='LICI']") private WebElement lici;
	
	public ZerodhaDashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void enterStockNameInSearch(String stockname)
	{
		searchstock.sendKeys(stockname);
	} 
	
	public void moveToElementTatamotorStock(WebDriver driver)
	{
		Actions action = new Actions(driver);
//		WebElement tatamotors = driver.findElement(By.xpath("(//span[text()='TATAMOTORS'])[1]"));
		action.moveToElement(tatamotors);
		action.perform();
	}
	
	public void clickOnBuy(WebDriver driver)
	{
		Actions action = new Actions(driver);
//		WebElement buy = driver.findElement(By.xpath("//button[@data-balloon='Buy']"));
		action.click(buy);
		action.perform();
	}
	
	public void clickOnBuy1()
	{
		buy1.click();
	}
	
	public void clearQuantity()
	{
		quantity.clear();
	}
	
	public void enterQuantity(String qty)
	{
		quantity.sendKeys(qty);
	} 
	
	public void clickOnBuySubmit()
	{
		buysubmit.click();
	}
	public void clickOnWachlist3(WebDriver driver)
	{
		Actions action = new Actions (driver);
		action.moveToElement(wachlist3).click();
		//wachlist3.click();
	}
	
	public void clickOnStock()
	{
		tatamotors.click();
	}
	
	public void clickOnMarketOrder(WebDriver driver)
	{
		Actions action = new Actions(driver);
		action.moveToElement(marketorder).click();
		action.perform();
	}
	
	public void clickOnTarget(WebDriver driver)
	{
		Actions action = new Actions(driver);
		action.moveToElement(target).click();
		action.perform();
	}
	
	public void clickOnStoploss(WebDriver driver)
	{
		Actions action = new Actions(driver);
		action.moveToElement(stoploss).click();
		action.perform();
	}
	public void clickOnSL()
	{
//		Actions action = new Actions(driver);
//		action.moveToElement(sl).click();
//		action.perform();
		sl.click();
	}
	
	
	
	
	
	
	public void clickOnDashboard()
	{
		dashboard.click();
	}
	
	public void clickOnOrder()
	{
		order.click();
	}
	
	public void clickOnHolding()
	{
		holding.click();
	}
	
	public void clickOnPositions()
	{
		positions.click();
	}
	
	public void clickOnFund()
	{
		fund.click();
	}
	
	public void clickOnApps()
	{
		apps.click();
	}
	
	public void clickOnId()
	{
		id.click();
	}
	
	public void clickOnViewStatement()
	{
		viewstatement.click();
	}
	
	public void clickOnActivateComodity()
	{
		getstarted.click();
	}
	
	public void clickOnStartInvesting()
	{
		startinvesting.click();
	}
	
	public void clickOnGiftstock()
	{
		getstarted.click();
	}
	
	public void clickOnGetStarted()
	{
		getstarted.click();
	}
}
