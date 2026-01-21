package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This is an Utility class which deals with Excel File
 * @author CLASS
 * @version 25-12-13
 */

public class ExcelUtility {

	/**
	 * This is a generic method to fetch single data from Excel File
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return
	 * @throws Exception
	 */
	
	public String getSingleDataFromExcel(String sheetName,int rowIndex,int cellIndex) throws Exception {
		FileInputStream fis = new FileInputStream(IPathUtility.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Cell cell = wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex);
		DataFormatter df = new DataFormatter();
		String value = df.formatCellValue(cell);
		return value;
	}
	
	/**
	 * This is a generic method to fetch multiple data from Excel file
	 * @param sheetName
	 * @param startRowIndex
	 * @param startCellIndex
	 * @return
	 * @throws Exception
	 */
	
	public ArrayList<String> getMultipleDatFromExcel(String sheetName, int startRowIndex,int startCellIndex) throws Exception {
		FileInputStream fis = new FileInputStream(IPathUtility.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		DataFormatter df = new DataFormatter();
		ArrayList<String> al = new ArrayList<String>();
		for(int i=startRowIndex;i<=sh.getLastRowNum();i++) {
			Row r = sh.getRow(i);
			for(int j=startCellIndex;j<r.getLastCellNum();j++) {
				Cell c = r.getCell(j);
				String value = df.formatCellValue(c);
				al.add(value);
			}
		}
		return al;
	}
	
	/**
	 * This is an generic method to write data in Excel file
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @param value
	 * @throws Exception
	 */
	public void writeDatatoExcel(String sheetName,int rowIndex,int cellIndex,String value) throws Exception {
		FileInputStream fis = new FileInputStream(IPathUtility.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row r = sh.createRow(rowIndex);
		Cell c = r.createCell(cellIndex);
		c.setCellValue(value);
		FileOutputStream fos = new FileOutputStream(IPathUtility.excelPath);
		wb.write(fos);
	}
}
