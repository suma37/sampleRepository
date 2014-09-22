package Parameterize;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class YahooRegistration {
  @Test(dataProvider = "registerData" )
  public void RegistrationTest(String UserName, String Passwd, String EMail) {
	  
	  System.out.println(UserName +"..." +Passwd +"..." +EMail);
	  
  }
  
    
  @DataProvider
  public Object[][] registerData(){
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
