package genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import objectRepo.HomePage;
import objectRepo.LoginPage;
@Test
public class BaseClass {
	public static WebDriver sDriver;//used for Listeners class
	 public SeleniumUtility s = new SeleniumUtility();
	 public PropertiesUtility p = new PropertiesUtility();
	 public ExcelUtility eutil=new ExcelUtility();
	public WebDriver d;
	
	
	@BeforeSuite(alwaysRun = true)
	public void dbConnection() {
		System.out.println("DataBase connection executed");
	}
	
	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void bcConfic(@Optional("chrome") String browser) throws IOException  {
		if(browser.equals("chrome"))
			d=new ChromeDriver();
		else if(browser.equals("edge"))
			d=new EdgeDriver();
		else if(browser.equals("FireBox"))
			d=new FirefoxDriver();
		else
			d=new ChromeDriver();
		
		sDriver=d; //Initialize the static driver used for Listeners Class
		
		String URL = p.getDataFromPropFile("url");
		s.accessApplication(d, URL);
		System.out.println("Application Opened");
	}
	@BeforeMethod(alwaysRun = true)
	public void bmConfic() throws IOException {
		LoginPage lp = new LoginPage(d);
		String UN = p.getDataFromPropFile("username");
		String PWD = p.getDataFromPropFile("password");
		lp.getLoginApplication(UN,PWD);
		System.out.println("Login executed");
	}
	
	@AfterMethod(alwaysRun = true)
	public void amConfic() {
		HomePage hp = new HomePage(d);
		hp.signOutAccount(d);
		System.out.println("Logout excuted");
	}
	@AfterClass(alwaysRun = true)
	public void acConfic() {
		d.quit();
		System.out.println("Browser Closed");
	}
	@AfterSuite(alwaysRun = true)
	public void asConfic() {
		System.out.println("DB connection closed");
	}
	
	
	
}
