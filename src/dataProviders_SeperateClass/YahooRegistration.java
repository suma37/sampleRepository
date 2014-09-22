package dataProviders_SeperateClass;

import org.testng.annotations.Test;

public class YahooRegistration {
	
	@Test(dataProviderClass= DataProvider_Registration.class, dataProvider = "YahooData" )
	  public void RegistrationTest(String UserName, String Passwd, String EMail) {
		  
		  System.out.println(UserName +"..." +Passwd +"..." +EMail);
		  
	  }
	  

}
