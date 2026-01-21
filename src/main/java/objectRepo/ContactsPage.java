package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This POM class for ContactsPage
 * @author QSP
 * @version 25-12-22
 */
public class ContactsPage {

	@FindBy(xpath = "//img[contains(@alt,'Create Conta')]")
	private WebElement createContactIcon;
	
	public ContactsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateContactIcon() {
		return createContactIcon;
	}
	
	/**
	 * This is business library used to click create New Contact Icon
	 */
	
	public void clickOnCreateContact() {
		getCreateContactIcon().click();
	}
}
