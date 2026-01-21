package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

/**
 * This is POM class used to store HomePage webelement
 * @author QSP
 * @version 25-12-22
 */

public class HomePage {

	@FindBy(xpath  ="//td[@class='tabUnSelected']/a[text()='Leads']")
	private WebElement leadsMEnu;
	@FindBy(xpath="//td[@class='tabUnSelected']/a[text()='Contacts']")
	private WebElement contactsMenu;
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement accountsIcon;
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOutLink;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLeadsMenu() {
		return leadsMEnu;
	}

	public WebElement getContactsMenu() {
		return contactsMenu;
	}

	public WebElement getAccountsIcon() {
		return accountsIcon;
	}

	public WebElement getSignOutLink() {
		return signOutLink;
	}
	
	/**
	 * This is business library to click on Leads Menu
	 */
	public void clickOnLeadsMenu() {
		getLeadsMenu().click();
	}
	
	/**
	 * This is business library to click on Contact Menu
	 */
	public void clickOnContactMenu() {
		getContactsMenu().click();
	}
	
	/**
	 * This is business library to perform signout operation
	 * @param driver
	 */
	public void signOutAccount(WebDriver driver) {
		new SeleniumUtility().mouseHoverAction(driver, getAccountsIcon());
		getSignOutLink().click();
	}
	
}
