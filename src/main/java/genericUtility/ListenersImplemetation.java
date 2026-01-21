package genericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplemetation implements ITestListener{

	ExtentReports reports;
	ExtentTest test;
	String dateTimeStamp = new JavaUtility().getCalendarDetail("dd-MM-YYYY hh-mm-ss");
	@Override
	public void onTestStart(ITestResult result) {
		
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+" On Test Start executed");
		
		Reporter.log(methodName+" On Test Start Executed");
		
		//creating fields in generated report for every @Test method executing
		test=reports.createTest(methodName);
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+" On TestSuccess executed");
		
		Reporter.log(methodName+" On test Success Executed");
		test.log(Status.PASS, methodName+" Passed");
			
	
	}

	@Override
	public void onTestFailure(ITestResult result) {

		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+" On Test Failure executed");
		Reporter.log(methodName+ " On Test Failure executed");
		
		test.log(Status.FAIL, methodName+ " Failed" );
		test.log(Status.INFO,result.getThrowable());
		
		String scShotName=methodName +"-"+dateTimeStamp;
		SeleniumUtility sutil = new SeleniumUtility();
		try {
			sutil.takeWebpageScreenshot(BaseClass.sDriver, scShotName);
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+" On Test Skipped executed");
		
		Reporter.log(methodName+" On Test Skipped executed");
		
		test.log(Status.SKIP,methodName+" Skipped" );
	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
	}

	
	@Override
	public void onStart(ITestContext context) {
		System.out.println(" On start executed");
		Reporter.log(" On start Executed");
		
		//Configuring the report
		ExtentSparkReporter reporter = new ExtentSparkReporter(".\\Extent Reports\\"+dateTimeStamp+".html");
		
		reporter.config().setDocumentTitle("VTiger report");
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setReportName("Vtiger");
		
		//Generating an empty report
		reports= new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("Base Url", "http://localhost:8888");
		reports.setSystemInfo("Base Platform", "Windows");
		reports.setSystemInfo("Base Browser", "Chrome");
		reports.setSystemInfo("Test Eng", "Siva");

	}
	
	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println(" On finish executed");
		Reporter.log(" On finish Executed");
		
		//Flushing out the report
		reports.flush();
	}
	
	
	

}
