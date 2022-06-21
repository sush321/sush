package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {

	public static String parametrization(String Sheetname,int Rowno, int Cellno) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("D:\\Automation\\KiteZerodha\\src\\test\\resources\\Data.xlsx");
		
		String value = WorkbookFactory.create(file).getSheet(Sheetname).getRow(Rowno).getCell(Cellno).getStringCellValue();
		return value;
	}
}
