package test;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.Screenshot;

public class TestListeners extends BaseTest implements ITestListener  {

	public void onTestStart(ITestResult result)
	{
		System.out.println(result.getName() +" Test has Started");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println(result.getName() +" Test is failed");
		
		try {
			Screenshot.screenshot2(result.getName(),driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println(result.getName()+ " Test Success");
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println(result.getName()+ " Test Skipped");
	}
}
