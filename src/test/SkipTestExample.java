package test;

import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class SkipTestExample {
  @Test
  public void SkiptheTest() {
	  
	  System.out.println("This is an example of skip a test");
	  
  }
  
  @Test(enabled=false)//this will ignore the testcase but will not be mentioned the report its like this test not present at all..
  public void WhySkipTest(){
	  
	  System.out.println("why we need to skip the test");
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is before test in SkipTestExample");
	  /*this will skip the entire Test. ( as in this test we have 2 test cases and one testcsse is 
	   * disabled the no of skips will be 1) but if it enabled = true, the the number of skips would have displayed as 2.
	  */
	  throw new SkipException("Skipping this test "); 
	 												
  }

}
