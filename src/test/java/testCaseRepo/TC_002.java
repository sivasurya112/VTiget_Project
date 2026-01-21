package testCaseRepo;



import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;

@Listeners(genericUtility.ListenersImplemetation.class)
public class TC_002 extends  BaseClass{
	int i=1;
	@Test(groups = {"Smoke"},retryAnalyzer = genericUtility.RetryAnalyzerImplementation.class)
	public void LE_002() throws Exception {
		new HomePage(d).clickOnLeadsMenu();
		Assert.fail();
		new LeadsPage(d).clickOnCreateLead();
		
		String lName = eutil.getSingleDataFromExcel("Leads", 4, 1);
		String company= eutil.getSingleDataFromExcel("Leads", 4, 2);
		String title = eutil.getSingleDataFromExcel("Leads", 4, 3);
		String leadSource = eutil.getSingleDataFromExcel("Leads", 4, 4);
		String mob = eutil.getSingleDataFromExcel("Leads", 4, 5);
		new CreatingNewLeadPage(d).creatingNewLead(lName, company, title, leadSource, mob);
		System.out.println("TC002 excuted");
	}
}
