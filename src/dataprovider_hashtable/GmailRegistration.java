package dataprovider_hashtable;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GmailRegistration {
  @Test(dataProvider="gmailregistrationData")
  public void GmailuserRegistration(Hashtable<String, String> t) {
	  
	  System.out.println(t.get("UserName")+"...."+ t.get("Password")+"....."+t.get("Email") );
	  	  
  }
  
  @DataProvider
  public Object[][] gmailregistrationData(){
	  Object[][] data = new Object[2][1];
	  Hashtable<String, String> table = new Hashtable<String,String>();
	  Hashtable<String, String> table1 = new Hashtable<String,String>();
	  table.put("UserName", "Guser1");
	  table.put("Password", "GPass1");
	  table.put("Email", "Gemail1");
	  data[0][0] = table;
	  table1.put("UserName", "Guser2");
	  table1.put("Password", "GPass2");
	  table1.put("Email", "Gemail2");
	  data[1][0] =table1;
	  return data;
  }
}
