package genericlib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filelib 

{

public String getpropertyfiledata1(String key) throws Throwable
{
	
	FileInputStream fobj = new FileInputStream("./data/commomdata.properties");
	
       Properties	p1 = new Properties();
       p1.load(fobj);
	   String value = p1.getProperty(key);
	   return value;
	   }
public String Getexceldata(String Sheetname,int rownum,int celnum) throws EncryptedDocumentException, IOException
{
	FileInputStream fis = new FileInputStream("./data/Testscriptdada.xls");
	Workbook wb =  new WorkbookFactory().create(fis);
	Sheet sh = wb.getSheet("Sheet1");
	Row row = sh.getRow(rownum);
	String data = row.getCell(celnum).getStringCellValue();
	return data;
}

}