package Listner;

import java.util.List;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;
import org.testng.internal.Utils;


/*
 * 1.override the methods of IInvokedMethodListner afterInvocation and beforeInvocation.
 * 2. afterInvocation Listner is invoked after the execution of a Test. The code written
 *    here got from google.( do not worry abt the code).
 */
public class Assertion_Listner extends TestListenerAdapter implements IInvokedMethodListener {
	
public void onTestFailure(ITestResult tr){
		
		System.out.println("Fail");
	}
	
	public void onTestSkipped(ITestResult tr){
		
		System.out.println("Skip...."  +tr.getName());
	}
	
	public void onTestSuccess(ITestResult tr){
		
		System.out.println("Pass..." +tr.getName());
		
		//tr.getName will get the name of the testcase
	}
	
	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult result) {
 
		Reporter.setCurrentTestResult(result);
 
		if (method.isTestMethod()) {
 
			List verificationFailures = ErrorUtil.getVerificationFailures();
 
			//if there are verification failures...
			if (verificationFailures.size() != 0) {
 
				//set the test to failed
				result.setStatus(ITestResult.FAILURE);
 
				//if there is an assertion failure add it to verificationFailures
				if (result.getThrowable() != null) {
					verificationFailures.add(result.getThrowable());
				}
 
				int size = verificationFailures.size();
				//if there's only one failure just set that
				if (size == 1) {
					result.setThrowable((Throwable) verificationFailures.get(0));
				} else {
					//create a failure message with all failures and stack traces (except last failure)
					StringBuffer failureMessage = new StringBuffer("Multiple failures (").append(size).append("):nn");
					for (int i = 0; i <= size-1; i++) {
						failureMessage.append("Failure ").append(i+1).append(" of ").append(size).append(":n");
						Throwable t = (Throwable) verificationFailures.get(i);
						String fullStackTrace = Utils.stackTrace(t, false)[1];
						failureMessage.append(fullStackTrace).append("nn");
					}
 
					//final failure
					Throwable last = (Throwable) verificationFailures.get(size-1);
					failureMessage.append("Failure ").append(size).append(" of ").append(size).append(":n");
					failureMessage.append(last.toString());
 
					//set merged throwable
					Throwable merged = new Throwable(failureMessage.toString());
					merged.setStackTrace(last.getStackTrace());
 
					result.setThrowable(merged);
				}
			}
		}

}

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		
	}
}
