package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

/**
 * This is a Utility class which has functionality from Selenium Library
 */

public class SeleniumUtility {

	/**
	 * This is utility method is used to maximize the browser
	 * @param driver
	 */
	
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	/**
	 * This is utility method is used to access the application
	 * @param driver
	 * @param url
	 */
	
	public void accessApplication(WebDriver driver,String url) {
		driver.get(url);
	}
	
	/**
	 * This is a utility method is used to provide Implicit wait
	 * @param driver
	 * @param maxTime
	 */
	public void implicitWait(WebDriver driver,int maxTime) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));
	}
	
	
			/**MOUSE ACTIONS**/
	
	/**
	 * This method this used to perform hover Operation
	 * @param driver
	 * @param element
	 */
	
	public void mouseHoverAction(WebDriver driver,WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	/**
	 * This method is used to perform Right Click operation
	 * @param driver
	 * @param element
	 */
	
	public void rightClick(WebDriver driver,WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick().perform();
	}
	
			/**ALERT POPUP**/
	
	/**
	 * This method is used to perform accept the alert operation
	 * @param driver
	 */
	
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	/**
	 * This method is used to perform cancel the alert operation
	 * @param driver
	 */
	public void cancelAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	
			/**FRAMES**/
	
	/**
	 * This method is used to switch the frame using frame Index
	 * @param driver
	 * @param frameIndex
	 */
	public void switchToFrameUsingIndex(WebDriver driver ,int frameIndex) {
		driver.switchTo().frame(frameIndex);
	}
	
	/**
	 * This method is used to switch the frame using Web element
	 * @param driver
	 * @param element
	 */
	public void switchToFrameUsingFrameElement(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);
	}
	
	/**
	 * This method is used to switch the frame using name or id attribute
	 * @param driver
	 * @param nameOrId
	 */
	public void switchToFrameUsingNameOrId(WebDriver driver,String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
	
	
			/**SCREENSHOT OF THE WEBPAGE**/
	
	/**
	 * This method is used to Take a screenshot of Web page
	 * @param driver
	 * @param screenshotName
	 * @return
	 * @throws IOException
	 */
	
	public String takeWebpageScreenshot(WebDriver driver,String screenshotName) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\Screenshot\\"+screenshotName+".png");
		Files.copy(src, dest);
		return dest.getAbsolutePath();
	}
	
	
			/**DROPDOWN**/
	
	/**
	 * This method is used to select a option by value attribute in Drop down
	 * @param elem
	 * @param value
	 */
	public void selectOptionByValue(WebElement elem,String value) {
		Select s = new Select(elem);
		s.selectByValue(value);
	}
	
	public void selectOptionByIndex(WebElement elem,int index) {
		Select s = new Select(elem);
		s.selectByIndex(index);
	}
	
	public void selectOptionByVisibleText(WebElement elem,String visibleText) {
		Select s = new Select(elem);
		s.selectByVisibleText(visibleText);
	}
	
	
}


