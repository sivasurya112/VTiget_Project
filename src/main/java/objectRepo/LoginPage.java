package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * This is POM class for LoginPage
 * @author QSP
 * @version 25-12-22
 */
public class LoginPage {
	

	//Loacate Web elements
	@FindBy(name="user_name")
	private WebElement usernameTextField;
	@FindBy(name="user_password")
	private WebElement PasswordTextField;
	@FindBy(id="submitButton")
	private WebElement loginBtn;
	
	//Initializing the web elements
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	//Getter methods
	public WebElement getUsernameField() {
		return usernameTextField;
	}
	public WebElement getpasswordField() {
		return PasswordTextField;
	}
	public WebElement getloginBtn() {
		return loginBtn;
	}
	
	
	//utilizing
	
	/**
	 * This is business library used to perform Login
	 * @param username
	 * @param password
	 */
	public void getLoginApplication(String username,String password) {
		getUsernameField().sendKeys(username);
		getpasswordField().sendKeys(password);
		getloginBtn().click();
	}
	
	
}
