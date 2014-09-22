package test;

/* 
 1.created this class by Right click on Src -> New ->other -> Testng ->Testng Class ( select the annothation  needed)
 2. there is an order in which the annothation are executed.
 3. Before Test is executed first ( and only executed only once)
*/

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class YahooTest {
  @Test
  public void ReceiveMail() {
	  //we write the selenium code for testing the page.
	  System.out.println("Test Receiving mail in yahoo test");
  }
  
  @Test
  //each of thios represent a test case
  public void testsendmail() {
	  //selenium code for testing send mail
	  System.out.println("Test send mail in yahoo test");
  }
  @BeforeMethod 
  //will be executed before every method under the Test annotation
  //generally we open browser
  public void beforeMethod() {
	  
	  System.out.println("In BeforeMethod annotation in yahoo test");
  }

  @BeforeTest
  //will be executed before executing any of the Test cases in the class. 
  //this is executed only once at the beginnig
  //generally we do some initilization or establish connection with the database
  public void beforeTest() {
	  System.out.println("In BeforeTest annotation in yahoo test");
  }
  
  @AfterMethod
  //will be executed after every method under the Test annotation.
  //generally used for closing the browser.
   public void afterMethod() {
	  System.out.println("In AfterMethod annotation in yahoo test");
	  
  }
  
  @AfterTest
  //will be execuded after the execution of all the testcases in the class.
  //close the connection with the database for example
  public void afterTest(){
	  System.out.println("In AfterTest annotation in yahoo test");
	  
  }
  
  @BeforeSuite
  //this is one of the imp annotation.
  //this will be used for eg: initilizing the selenium
  //should be executed before executiong all the testcases in the entire suite
  //To run it as a suite we put yahooNews and YahooTest in a batch file and run it.
  //   and this annotation is executed before running any of the testcases from both the files. 
  //this annothtion is present only in one of the file in the suite.
  //here yahooTest and YahooNews.java form a suite
  public void beforeSuite(){
	  System.out.println("This is before suite");
  }
  
  @AfterSuite
  //for eg : shut down selenium, like destory WebDriver object.
  public void shutDownSelenium(){
	  System.out.println("this is After Suite");
  }

}
