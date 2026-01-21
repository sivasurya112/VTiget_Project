package testCaseRepo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

@Listeners(genericUtility.ListenersImplemetation.class)
public class TC_005 extends BaseClass{

	@Test(groups = {"Smoke","Sanity"},retryAnalyzer = genericUtility.RetryAnalyzerImplementation.class)
	public void AA_002() throws Exception {
		new HomePage(d).clickOnContactMenu();
		new ContactsPage(d).clickOnCreateContact();
		String LName = eutil.getSingleDataFromExcel("Contacts", 4, 1);
		String dept = eutil.getSingleDataFromExcel("Contacts", 4, 2);
		String email = eutil.getSingleDataFromExcel("Contacts", 4, 3);
		String mob = eutil.getSingleDataFromExcel("Contacts", 4, 4);
		new CreatingNewContactPage(d).creatingContactLead(LName, dept, email, mob);
	
		System.out.println("TC005 excuted");
	}
	
}
