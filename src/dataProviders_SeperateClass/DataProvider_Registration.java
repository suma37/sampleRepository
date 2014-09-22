package dataProviders_SeperateClass;

import org.testng.annotations.DataProvider;

/*
 * it is a good design to have all the Dataproviders in a separate class rather than in the same
 * as the that of the testcases
 * 
 * the only extra thing we need to do is to provide the name for the data provider.
 * 
 * we will make the methods static so that it can be accessed using the class name and the method  itself without creating the object
 */

public class DataProvider_Registration {
	
	@DataProvider(name = "GmailData")
	  public static Object[][] GmailregistrationData(){
		  Object[][] data = new Object[2][3];
		  data[0][0] = "Guser1";
		  data[0][1] = "Gpass1";
		  data[0][2] = "Gemail1";
		  data[1][0] = "Guser2";
		  data[1][1] = "Gpass2";
		  data[1][2] = "Gemail2";
		  
		  return data;
	  }
	
	 @DataProvider(name = "YahooData")
	  public static Object[][] YahooregisterData(){
		  Object[][] data = new Object[2][3] ;
				  //number of rows will tell the number of times the test has to be executed
				  //number of columns represent the data 
				  
			data[0][0] = "YUser1";
		  	data[0][1] = "Ypass1";
		  	data[0][2] = "Yemail1";
		  	
		  	data[1][0] = "Yuser2";
		  	data[1][1] = "Ypass2";
		  	data[1][2] = "Yemail2";
		  			
		  			return data;
	  }

}
