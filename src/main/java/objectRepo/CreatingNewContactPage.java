package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This POM class for Creating new Contact Page
 * @author QSP
 * @version 25-12-22
 */

public class CreatingNewContactPage {
	
	//Loacate Web elemnts
	@FindBy(name = "salutationtype")
	private WebElement firstNameDropdown;
	@FindBy(name = "firstname")
	private WebElement firstNameTextField;
	@FindBy(name = "lastname")
	private WebElement lastNameTextField;
	@FindBy(id = "title")
	private WebElement titleTextField;
	@FindBy(id = "department")
	private WebElement deptTextField;
	@FindBy(id = "email")
	private WebElement emailTextField;
	@FindBy(id = "mobile")
	private WebElement mobTextField;
	@FindBy (id = "mailingcity")
	private WebElement mailingCityTextField;
	@FindBy(id="mailingstate")
	private WebElement mailingStateTextField;
	@FindBy(id = "mailingcountry")
	private WebElement mailingCountryTextField;
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;
	
	//Initializing
	public CreatingNewContactPage(WebDriver driver) {
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
	public WebElement getTitleTextField() {
		return titleTextField;
	}
	public WebElement getDeptTextField() {
		return deptTextField;
	}
	public WebElement getEmailTextField() {
		return emailTextField;
	}
	public WebElement getMobTextField() {
		return mobTextField;
	}
	public WebElement getMailingCityTextField() {
		return mailingCityTextField;
	}
	public WebElement getMailingStateTextField() {
		return mailingStateTextField;
	}
	public WebElement getMailingCountryTextField() {
		return mailingCountryTextField;
	}
	
	public WebElement getSaveBtn() {
		return saveBtn;
	}

	
	//Utilizing
	
	/**
	 * This is business library used to creating new Contact
	 * @param fName
	 * @param lname
	 * @param title
	 */
	public void creatingContactLead(String fName,String lname,String title) {
		getFirstNameTextField().sendKeys(fName);
		getLastNameTextField().sendKeys(lname);
		getTitleTextField().sendKeys(title);
		getSaveBtn().click();
		
	}
	
	/**
	 * This is business library used to creating new Contact
	 * @param lName
	 * @param dept
	 * @param email
	 * @param mobNum
	 */
	public void creatingContactLead(String lName,String dept,String email,String mobNum) {
		getLastNameTextField().sendKeys(lName);
		getDeptTextField().sendKeys(dept);
		getEmailTextField().sendKeys(email);
		getMobTextField().sendKeys(mobNum);
		getSaveBtn().click();
	}
	
	/**
	 * This is business library used to creating new Contact
	 * @param lName
	 * @param dept
	 * @param email
	 * @param city
	 * @param state
	 * @param country
	 */
	public void creatingNewLead(String lName,String dept,String email,String city,String state,String country) {
		getLastNameTextField().sendKeys(lName);
		getDeptTextField().sendKeys(dept);
		getEmailTextField().sendKeys(email);
		getMailingCityTextField().sendKeys(city);
		getMailingStateTextField().sendKeys(state);
		getMailingCountryTextField().sendKeys(country);
		getSaveBtn().click();
		
	}
	
	
}
