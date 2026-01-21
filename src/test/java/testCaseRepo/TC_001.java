package testCaseRepo;

import org.testng.annotations.Listeners;

import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

@Listeners(genericUtility.ListenersImplemetation.class)
public class TC_001 extends BaseClass{

	@Test(groups = {"Sanity","Regression"})
	public void LE_001() throws Exception {
		new HomePage(d).clickOnLeadsMenu();
		new LeadsPage(d).clickOnCreateLead();
		String fName = eutil.getSingleDataFromExcel("Leads", 1, 1);
		String lName = eutil.getSingleDataFromExcel("Leads", 1, 2);
		String company = eutil.getSingleDataFromExcel("Leads", 1, 3);
		new CreatingNewLeadPage(d).creatingNewLead(fName, lName, company);
		System.out.println("TC001 excuted");
	}
	
	
}

