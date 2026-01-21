package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;

public class WritingDataToExcel {

	public static void main(String[] args) throws Exception {

//		FileInputStream fis = new FileInputStream("C:\\\\Users\\\\sivasuryag\\\\OneDrive\\\\Desktop\\\\property_files\\\\dat.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet("Places");
//		Row r = sh.createRow(1);
//		Cell c = r.createCell(0);
//		c.setCellValue("Chennai");
//		FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\sivasuryag\\\\OneDrive\\\\Desktop\\\\property_files\\\\dat.xlsx");
//		wb.write(fos);
		
		ExcelUtility ex = new ExcelUtility();
		ex.writeDatatoExcel("Places", 2, 0, "Madurai");
		
	
	}

}
