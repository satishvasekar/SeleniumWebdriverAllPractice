package testng_listeners_practice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestMethodFinder;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.xml.XmlTest;

public class TestngListener  extends TestBase implements ITestListener {

	public void onTestStart(ITestResult result) {
          System.out.println("The testcase is started");		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
         SreenShotTest();		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
            System.out.println("The testcase is completed");
	}


	

}
