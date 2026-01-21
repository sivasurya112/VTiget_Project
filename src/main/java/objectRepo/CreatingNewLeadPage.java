package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import genericUtility.SeleniumUtility;

/**
 * This is POM class used for Creating new Leads page
 * @author QSP
 * @version 25-12-22
 */
public class CreatingNewLeadPage {

	@FindBy(name = "salutationtype")
	private WebElement firstNameDropdown;
	@FindBy(name = "firstname")
	private WebElement firstNameTextField;
	@FindBy(name = "lastname")
	private WebElement lastNameTextField;
	@FindBy(name = "company")
	private WebElement companyTextField;
	@FindBy(id = "designation")
	private WebElement titleTextField;
	@FindBy(name = "leadsource")
	private WebElement leadsourceDropdown;
	@FindBy (id = "mobile")
	private WebElement mobileTextField;
	@FindBy(id = "email")
	private WebElement emailTextField;
	@FindBy(id = "city")
	private WebElement cityTextField;
	@FindBy(id="state")
	private WebElement stateTextField;
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	public CreatingNewLeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstNameDropdown() {
		return firstNameDropdown;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getCompanyTextField() {
		return companyTextField;
	}

	public WebElement getTitleTextField() {
		return titleTextField;
	}

	public WebElement getLeadsourceDropdown() {
		return leadsourceDropdown;
	}

	public WebElement getMobileTextField() {
		return mobileTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getCityTextField() {
		return cityTextField;
	}

	public WebElement getStateTextField() {
		return stateTextField;
	}
	
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	
	public void firstName(String selectValue, String firstName) {
		Select s = new Select(getFirstNameDropdown());
		s.selectByValue(selectValue);
		getFirstNameTextField().sendKeys(firstName);
	}
	
	public void lastName(String lastName) {
		getLastNameTextField().sendKeys(lastName);
	}
	
	public void company(String companyName) {
		getCompanyTextField().sendKeys(companyName);
	}
	
	public void title(String titleName) {
		getTitleTextField().sendKeys(titleName);
	}
	
	public void leadSource(String selectValue) {
		Select s = new Select(getLeadsourceDropdown());
		s.selectByValue(selectValue);
	}
	
	public void mobile(String mobileNum) {
		getMobileTextField().sendKeys(mobileNum);
	}
	
	public void email(String emailId) {
		getEmailTextField().sendKeys(emailId);
	}
	
	public void city(String cityName) {
		getCityTextField().sendKeys(cityName);
	}
	public void state(String stateName) {
		getStateTextField().sendKeys(stateName);
	}
	
	
	/**
	 * This is business library used to creating new Lead
	 * @param fName
	 * @param lname
	 * @param company
	 */
	public void creatingNewLead(String fName,String lname,String company) {
		getFirstNameTextField().sendKeys(fName);
		getLastNameTextField().sendKeys(lname);
		getCompanyTextField().sendKeys(company);
		getSaveBtn().click();
	}
	
	/**
	 * This is business library used to creating new Lead
	 * @param lName
	 * @param company
	 * @param title
	 * @param lSource
	 * @param mobNum
	 */
	public void creatingNewLead(String lName,String company,String title,String lSource,String mobNum) {
		getLastNameTextField().sendKeys(lName);
		getCompanyTextField().sendKeys(company);
		getTitleTextField().sendKeys(title);
		SeleniumUtility s = new SeleniumUtility();
		s.selectOptionByValue(getLeadsourceDropdown(), lSource);
		getMobileTextField().sendKeys(mobNum);
		getSaveBtn().click();
	}
	
	/**
	 * This is business library used to creating new Lead
	 * @param lName
	 * @param company
	 * @param title
	 * @param mobNum
	 * @param email
	 * @param city
	 * @param state
	 */
	public void creatingNewLead(String lName,String company,String title,String mobNum,String email,String city,String state) {
		getLastNameTextField().sendKeys(lName);
		getCompanyTextField().sendKeys(company);
		getTitleTextField().sendKeys(title);
		getMobileTextField().sendKeys(mobNum);
		getEmailTextField().sendKeys(email);
		getCityTextField().sendKeys(city);
		getStateTextField().sendKeys(state);
		getSaveBtn().click();
	}
	
}
