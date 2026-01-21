package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This POM class for LeadsPage
 * @author QSP
 * @version 25-12-22
 */
public class LeadsPage {

	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createLeadIcon;
	
	public LeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateLeadIcon() {
		return createLeadIcon;
	}
	
	/**
	 * This is business library used to click create new Lead
	 */
	
	public void clickOnCreateLead() {
		getCreateLeadIcon().click();
	}
	
}
