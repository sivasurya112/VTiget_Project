package practice;

import genericUtility.ExcelUtility;



public class FetchDataExcel {

	
	public static void main(String[] args) throws Exception  {

		ExcelUtility ex = new ExcelUtility();
		String value1 = ex.getSingleDataFromExcel("Leads", 1,0 );
		System.out.println(value1);
		String value2 = ex.getSingleDataFromExcel("Contacts", 1,2 );
		System.out.println(value2);
		
	}

}
