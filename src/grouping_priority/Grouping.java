package grouping_priority;

import org.testng.Assert;
import org.testng.annotations.Test;
/*
 1. thre are situation where one testcase is dependent on other for example
    if login testcase fail we will not beable to change password or logout
    in such cases we need to skip change password and logout testcases. this 
    can be achieved by adding the KEYWORD : dependsOnMethods, and this is called testcas grouping
 */
public class Grouping {
	@Test(priority = 1)
	  public void Login() {
		  
		Assert.assertEquals("a","b");
		  System.out.println("Login");
		  
		  
	  }
	  
	  @Test(priority = 2, dependsOnMethods = {"Login"})
	  public void ChangePassword(){
		  System.out.println("Change password");
	  }
	  
	  @Test(priority =3, dependsOnMethods = {"Login", "ChangePassword"})
	  public void LogOut(){
		  System.out.println("Log out");
	  }
}
