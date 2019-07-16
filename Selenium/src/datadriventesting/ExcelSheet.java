package datadriventesting;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;






public class ExcelSheet 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{    
		FileInputStream fis = new FileInputStream("./data/Testscriptdada.xls");
		Workbook wb =  new WorkbookFactory().create(fis);
		org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet("sheet1");
		Row row = sh.getRow(1);
		Cell cel = row.getCell(2);
		String tc_01 = cel.getStringCellValue();
		System.out.println(tc_01);
		
		
	}

}
