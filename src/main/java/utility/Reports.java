package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports { 
 
//	public  static  ExtentReports createReport()
//	{ 
//		ExtentSparkReporter htmlreporter = new ExtentSparkReporter("extentReport.html");
//		
//		ExtentReports reports = new ExtentReports();
//		reports.attachReporter(htmlreporter);                                            // jo bhi extentreports data lyega vo htmlreporter ko dega 
//		                                                                                // aur isme extentReport.html jakr save karega aur report publish karega
//		
//		reports.setSystemInfo("Regression", "Zerodha");                                      // testsuite , project name
//		reports.setSystemInfo("Browser", "chrome");                                          // show environment of test run 
//		//return reports;  
//		return reports;
//		
//	}
	
	public static ExtentReports createreport()
	{
		ExtentSparkReporter htmlreporter = new ExtentSparkReporter("extentReport.html");
		ExtentReports reports= new ExtentReports();
		reports.attachReporter(htmlreporter);
		reports.setSystemInfo("Regression", "Zerodha");
		reports.setSystemInfo("Browser", "chrome");
		return reports; 
		
	}
}
