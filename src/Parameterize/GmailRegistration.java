package Parameterize;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GmailRegistration {
  @Test(dataProvider="gmailregistrationData")
  public void GmailuserRegistration(String User, String Pass, String email) {
	  
	  System.out.println(User+"...."+ Pass+"....."+email );
	  	  
  }
  
  @DataProvider
  public Object[][] gmailregistrationData(){
	  Object[][] data = new Object[2][3];
	  data[0][0] = "Guser1";
	  data[0][1] = "Gpass1";
	  data[0][2] = "Gemail1";
	  data[1][0] = "Guser2";
	  data[1][1] = "Gpass2";
	  data[1][2] = "Gemail2";
	  
	  return data;
  }
}
