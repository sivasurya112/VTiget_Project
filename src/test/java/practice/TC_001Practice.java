package practice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import genericUtility.PropertiesUtility;
import genericUtility.SeleniumUtility;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;
import objectRepo.LoginPage;

public class TC_001Practice extends BaseClass {

	@Test
	public  void testCase1() throws Exception {

//		WebDriver d = new ChromeDriver();
//		SeleniumUtility sl = new SeleniumUtility();
//		sl.implicitWait(d, 3);
//		sl.maximizeWindow(d);
//		PropertiesUtility prop = new PropertiesUtility();
//		String URL = prop.getDataFromPropFile("url");
//		sl.accessApplication(d, URL);
//		LoginPage lp = new LoginPage(d);
//		String UN = prop.getDataFromPropFile("username");
//		String PWD = prop.getDataFromPropFile("password");
//		lp.getLoginApplication(UN, PWD);
		HomePage hp = new HomePage(d);
		hp.clickOnLeadsMenu();
		LeadsPage l = new LeadsPage(d);
		l.clickOnCreateLead();
		CreatingNewLeadPage cnl = new CreatingNewLeadPage(d);
		ExcelUtility ex = new ExcelUtility();
		String fName = ex.getSingleDataFromExcel("Leads", 1, 1);
		String lName = ex.getSingleDataFromExcel("Leads", 1, 2);
		String company = ex.getSingleDataFromExcel("Leads",1, 3);
		cnl.creatingNewLead(fName, lName, company);
//		hp.signOutAccount(d);
//		d.quit();
		
		
		
		
	
		
		
	}

}
