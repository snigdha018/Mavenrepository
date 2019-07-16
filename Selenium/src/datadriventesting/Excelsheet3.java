package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet3 
{
	/**
	 * 
	 * get data back to excel sheet
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 */

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("./data/Testscriptdada.xls");
		Workbook wb =  new WorkbookFactory().create(fis);
		org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet("sheet1");
		Row row = sh.getRow(1);
		Cell cel = row.getCell(4);
		cel.setCellValue("abcd");
		FileOutputStream fos = new FileOutputStream("./data/Testscriptdada.xls");
		wb.write(fos);
		wb.close();

	}

}
