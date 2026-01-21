package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import genericUtility.PropertiesUtility;

public class Practice {

	public static void main(String[] args) throws IOException {

		
	    PropertiesUtility p = new PropertiesUtility();
	    String URL = p.getDataFromPropFile("url");
	    System.out.println(URL);
	    String UN = p.getDataFromPropFile("admin");
	    System.out.println(UN);
	    String PASS = p.getDataFromPropFile("password");
	    System.out.println(PASS);
	    
	  
	   
	    
	}

}
