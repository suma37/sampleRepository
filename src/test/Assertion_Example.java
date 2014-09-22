package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Example {
	
	
	//to compare the expected and actual value and report it in the reports saying the test is a failure
	//there is a inbuilt classes called Assert. which has a many functions which can be used for reporting.
  @Test
  public void AssertionExample() {
	  System.out.println("this is Assertion with Pass values");
	  Assert.assertEquals("good", "good");
  }
  
  @Test
  public void AssertionExampleFail(){
	  System.out.println("This is assertion with FAil values");
	  Assert.assertTrue(6<1, "Error message of AssertionExampleFail");
	  System.out.println("this line will not be printed as the Assert contion is failing");
  }
  
  @Test
  public void AssertionFailandContinue(){
	  /*
	   1. if we want our testcase to proceed after an assertion fail we put the Assertion in the try and catch
	  	 block
	   2. As Assertion is an Error and not an exception we use the Throwable in the catch.
	   3. This testcases will not be reported as fail but will be reported as pass as we have caught the Error.
	   4. we need to write a code to write the error in to the report
	   5. for example consider a page which has lots of links, like quiker ans chk if the link are working.
	   	  if one link is not working we do not wnat to stp the Testcase rather we report the reeor and continue 
	   	  with the remaining code.	
	   	  so we put this entire code ie "click on link and assertion to chk if new page is opening or not" in the try catch 
	   	  and report the error in the catch, But  the Test shown as PASS in reports  just the error in the catch block
	   	  are reported but the Test is Passed.
	   	  
	   	  This above issue can be resolved using Listners. where the code continues after a failure and reports the error
	   	  as well as report the Test as FAIL.
	   	  
	   	  
	   6. 
	  	 
	  */
	  System.out.println("Before Assertion Fail in the AssertionFailedContinued");
	  try{
	  Assert.assertEquals("good", "bad");
	  //Assertion is not a Exception but an Error so will have to use throwable in the catch.
	  }catch(Throwable t){
		  System.out.println("The Error is caught in the AssertionFailedand Continued");
	  }
	  
	  System.out.println("This line will be printed after the arrertion error from AssertingFailedand Contiuned, as we have caught the error.");
  }
}
