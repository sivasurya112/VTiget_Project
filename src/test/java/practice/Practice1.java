package practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import genericUtility.SeleniumUtility;

public class Practice1 {

	@Test
	public void getBrokenLinkInFB() throws Exception {
		WebDriver driver = new ChromeDriver();
		SeleniumUtility sutil = new SeleniumUtility();
		sutil.implicitWait(driver, 3);
		sutil.accessApplication(driver, "https://www.facebook.com/");
		sutil.maximizeWindow(driver);
		List<WebElement> allLink = driver.findElements(By.xpath("//a"));
		for(WebElement link:allLink) {
			String href = link.getAttribute("href");
			URL url = new URL(href);
			HttpURLConnection openConnection =(HttpURLConnection) url.openConnection();
			openConnection.connect();
			int responseCode = openConnection.getResponseCode();
			if(responseCode>=400)
			{
				System.out.println("The Broken Link is :"+link.getText());
			}
			
		}
		driver.close();
	}

}
