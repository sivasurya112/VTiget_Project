package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.ExcelUtility;
import genericUtility.PropertiesUtility;
import genericUtility.SeleniumUtility;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;
import objectRepo.LoginPage;

public class LoginVTiger {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		SeleniumUtility s = new SeleniumUtility();
		s.implicitWait(driver, 4000);
		s.maximizeWindow(driver);
		PropertiesUtility p = new PropertiesUtility();
		String URL = p.getDataFromPropFile("url");
		String UN = p.getDataFromPropFile("username");
		String PASS = p.getDataFromPropFile("password");
		
		s.accessApplication(driver,URL);
		
		LoginPage lp = new LoginPage(driver);
		lp.getLoginApplication(UN,PASS);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
//		hp.clickOnContactMenu();
//		hp.signOutAccount(driver);
		
		LeadsPage lead = new LeadsPage(driver);
		lead.clickOnCreateLead();
		
		ExcelUtility exUtil = new ExcelUtility();
		String firstName = exUtil.getSingleDataFromExcel("Leads", 1, 1);
		String lastName = exUtil.getSingleDataFromExcel("Leads", 1,2 );
		String companyName = exUtil.getSingleDataFromExcel("Leads", 1, 3);
		
		CreatingNewLeadPage cnl = new CreatingNewLeadPage(driver);
		cnl.creatingNewLead(firstName, lastName, companyName);
		
		
		
//		ContactsPage cp = new ContactsPage(driver);
//		cp.clickOnCreateContact();
		
	}

}
