package dataProviders_SeperateClass;

import org.testng.annotations.Test;

public class GmailRegistration {
	
	 @Test(dataProviderClass=DataProvider_Registration.class, dataProvider = "GmailData")
	  public void GmailuserRegistration(String User, String Pass, String email) {
		  
		  System.out.println(User+"...."+ Pass+"....."+email );
		  	  
	  }

}
