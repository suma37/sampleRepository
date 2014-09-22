package grouping_priority;

import org.testng.annotations.Test;


/*
 1. We can specify the order in which the test( .java) files can be run in the testng.xml
   but within the test(the .java file) the order in which the testcase runs will not be Top to Bottom
   ( it can be any order which is decided by testng)
 * 
 2. in our example we have testcases Login , ChangePassword, and Logout. in this scenario we will need 
 	our testcases to run in a particular order as we cannot change password if we do not log in , or
 	we do not want to logout before changing password.( so we will have to inform the testng this order)
 	for this we will use Priority
 * 
 * 
 */
public class Priority {
	
  @Test(priority = 1)
  public void Login() {
	  
	  System.out.println("Login");
	  
  }
  
  @Test(priority = 2)
  public void ChangePassword(){
	  System.out.println("Change password");
  }
  
  @Test(priority =3)
  public void LogOut(){
	  System.out.println("Log out");
  }
}

