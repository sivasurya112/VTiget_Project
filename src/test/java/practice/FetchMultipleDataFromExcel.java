package practice;

import java.util.ArrayList;

import genericUtility.ExcelUtility;

public class FetchMultipleDataFromExcel {

	public static void main(String[] args) throws Exception {
//		FileInputStream fis = new FileInputStream("C:\\Users\\sivasuryag\\OneDrive\\Desktop\\property_files\\dat.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet("Bird");
//		DataFormatter df = new DataFormatter();
//		for(int i=0;i<=sh.getLastRowNum();i++) {
//		Row r = sh.getRow(i);
//		for(int j=0;j<r.getLastCellNum();j++) {
//			Cell c = r.getCell(j);
//			String value = df.formatCellValue(c);
//			System.out.print(value+" ");
//			
//			}
//		System.out.println();
//	}
		ExcelUtility ex = new ExcelUtility();
		ArrayList<String> datas = ex.getMultipleDatFromExcel("Contacts", 0, 0);
		System.out.println(datas);
}
}