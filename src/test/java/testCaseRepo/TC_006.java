package testCaseRepo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

@Listeners(genericUtility.ListenersImplemetation.class)
public class TC_006 extends BaseClass {
@Test(groups = {"Regression"})
	public void AA_006() throws Exception {
		new HomePage(d).clickOnContactMenu();
		new ContactsPage(d).clickOnCreateContact();
		String lName = eutil.getSingleDataFromExcel("Contacts", 7, 1);
		String dept= eutil.getSingleDataFromExcel("Contacts", 7, 2);
		String email = eutil.getSingleDataFromExcel("Contacts", 7, 3);
		String mCity = eutil.getSingleDataFromExcel("Contacts", 7, 4);
		String mState = eutil.getSingleDataFromExcel("Contacts", 7, 5);
		String mCountry= eutil.getSingleDataFromExcel("Contacts", 7, 6);
		new CreatingNewContactPage(d).creatingNewLead(lName, dept, email, mCity, mState, mCountry);
		System.out.println("TC006 excuted");

}
}
