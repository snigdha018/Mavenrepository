package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.collections4.Get;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.sun.org.apache.xpath.internal.operations.And;
/**
 * 
 * @author snigdha
 * read all the row data from 0th col and 1st col
 *
 */

public class Excelsheet1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./data/Testscriptdada.xls");
		Workbook wb = WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet("Sheet1");
		 int lastrownum =sh.getLastRowNum();
		 //get all the data from all the rows
		 //And then 1st and 2nd col in excel
		 for(int i=1;i<=lastrownum;i++)
		 {
			 Row row = sh.getRow(i);
			 String col_0_data = row.getCell(0).getStringCellValue();
			 String col_1_data = row.getCell(1).getStringCellValue();
			 System.out.println(col_0_data + "\t"+ col_1_data);
		 }
		
		
		

	}

}
