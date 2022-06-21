package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaPinPage {

	@FindBy(xpath = "//input[@type='password']") private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']") private  WebElement submit;
	@FindBy(xpath = "//a[text()='Forgot 2FA?']") private WebElement forgotpin;
	@FindBy(xpath = "//a[text() =\"Don't have an account? Signup now!\"]") private  WebElement signup;
	
	public ZerodhaPinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterPin(String pinno)
	{
//		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000)); // explicit wait
//		 wait.until(ExpectedConditions.visibilityOf(pin)); // will recheck the element in 500 ms
		 
		// Fluent wait
//		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
//		wait.withTimeout(Duration.ofMillis(40000)); // tTotal wait time
//		wait.pollingEvery(Duration.ofMillis(4000)); // polling time or recheking
//		wait.ignoring(Exception.class);             // exception ignore
//		wait.until(ExpectedConditions.visibilityOf(pin));
		
		pin.sendKeys(pinno);
	}
	
	public  void clickOnSubmit()
	{
		submit.click();
	}
	
	public void clickOnForgotPin()
	{
		forgotpin.click();
	}
	
	public   void clickOnSignup()
	{
		signup.click();
	}
	
}
