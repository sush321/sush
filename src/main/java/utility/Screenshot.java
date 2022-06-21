package utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void snapshot (WebDriver driver) throws IOException
	{
		Date time = Calendar.getInstance().getTime();

		String timestamp = time.toString().replace(":", "").replace(" ", "");
		
//		String timestamp = Calendar.getInstance().getTime().toString();//.replace(":", "").replace(" ", "");

		File snap = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
		File Location = new File(".//Screenshot10//"+timestamp+".jpg");
		
		FileHandler.copy(snap, Location);
	}
	
	public static void screenshot1(String name, WebDriver driver) throws IOException
	{
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MMM-dd-HH-mm-ss"); // format the time date and time as required
//		LocalDateTime currentTime = LocalDateTime.now();   // returns current time 
//		String d = dtf.format(currentTime); // format the given my now() method to required format and return string
		String d = DateTimeFormatter.ofPattern("yyyy-MMM-dd-HH-mm-ss").format(LocalDateTime.now());
		
		File snap = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File Location = new File(".//Screenshot10//"+name+d+".jpg");
		
		FileHandler.copy(snap, Location);
	}
	
	public static void screenshot2(String name, WebDriver driver) throws IOException
	{
		String timestamp = Calendar.getInstance().getTime().toString().replace(":", "");//.replace(" ", "");

		File snap = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
		File Location = new File(".//Screenshot10//"+name+timestamp+".jpg");
		
		FileHandler.copy(snap, Location);
	}
}
