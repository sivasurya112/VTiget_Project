package testCaseRepo;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.time.Duration;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;
@Listeners(genericUtility.ListenersImplemetation.class)
public class TC_003 extends BaseClass{

	@Test(groups = {"Regression"})
	public void LE_003() throws Exception {
		new HomePage(d).clickOnLeadsMenu();
		new LeadsPage(d).clickOnCreateLead();
		String Lname = eutil.getSingleDataFromExcel("Leads", 7, 1);
		String company = eutil.getSingleDataFromExcel("Leads", 7, 2);
		String title = eutil.getSingleDataFromExcel("Leads", 7, 3);
		String mob = eutil.getSingleDataFromExcel("Leads", 7, 4);
		String email = eutil.getSingleDataFromExcel("Leads", 7, 5);
		String city = eutil.getSingleDataFromExcel("Leads", 7, 6);
		String state = eutil.getSingleDataFromExcel("Leads", 7, 7);
		new CreatingNewLeadPage(d).creatingNewLead(Lname, company, title, mob, email, city, state);
		System.out.println("TC003 excuted");
		
	}
	
	
}
