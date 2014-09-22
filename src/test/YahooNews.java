package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YahooNews {
  @Test
  public void Yahoo_News() {
	  System.out.println("this is yahoo news test");
  }
  
  @BeforeTest
  public void beforeTestNews() {
	  System.out.println("this is beforetest annotation in yahoo news");
  }
  
  
}
