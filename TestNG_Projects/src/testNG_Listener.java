import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class testNG_Listener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("The test case is started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("The test case is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("The test case is failed");	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("The test case is skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("The test case is passed");
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("The testing is gonna start");
	}

	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println("The test case is completed");
	}

}
