package testCaseRepo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

@Listeners(genericUtility.ListenersImplemetation.class)
public class TC_004 extends BaseClass {

	@Test(groups = {"Smoke"})
	public void AA_001() throws Exception {
		new HomePage(d).clickOnContactMenu();
		new ContactsPage(d).clickOnCreateContact();
		String fName = eutil.getSingleDataFromExcel("Contacts", 1, 1);
		String LName = eutil.getSingleDataFromExcel("Contacts", 1, 2);
		String company = eutil.getSingleDataFromExcel("Contacts", 1, 3);
		new CreatingNewContactPage(d).creatingContactLead(fName, LName, company);
	
		System.out.println("TC004 excuted");
	}
}
