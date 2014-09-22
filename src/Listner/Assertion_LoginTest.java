package Listner;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_LoginTest {
	
	/* Without Listners if a Assertion Fails and if it is caught in the try and catch, the error will be reported
	 * but the TestCase is shown as Passed . So Listen come for Help. 
	 * 
	 * 
	 * 1. copy the ErrorUtil.java in to package.
	 * In the catch block we call the function ErrorUtil.addVerificationFailure(Throwable t), this function
	 * acts like a bag and collects all the Errors. 
	 * 
	 * 2.once the test is over the afterInvocation Listner is innovked which it will take all the collected Errors.
	 * and depending if any errors collected in ErrorUtil.getVerificationFailure the Test is FAILED in the report, 
	 * if there are no errors collected in the test is PASSED in the report.
	 * 
	 */
	
	
	 @Test
	  public void AssertionExampleFail(){
		  System.out.println("This is assertion with FAil values");
		  try{
		  Assert.assertTrue(6<1, "Error message of AssertionExampleFail");
		  }catch(Throwable t){
			ErrorUtil.addVerificationFailure(t);  
		  }
		 System.out.println("this line will be printed even though Assert condition is failing as we have caught the error.");
	  }

}
