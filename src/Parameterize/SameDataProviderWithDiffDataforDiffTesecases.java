package Parameterize;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


/*
 * There could be a situation where we may want to 
 */
public class SameDataProviderWithDiffDataforDiffTesecases {

	@Test(dataProvider = "GetUser")
	public void Test1(String username){
		
		System.out.println("Test1 username is : " +username);
		
	}
	
	@Test(dataProvider = "GetUser")
	public void Test2(String username){
		
		System.out.println("Test2 username is : " +username);
	}
	
	@DataProvider
	public Object[][] GetUser(Method M){
		Object[][] obj = new Object[1][1];
		obj[0][0] = "default"; //if none then obj=default.
		if (M.getName().equals("Test1"))
		{
			obj[0][0] = "Test1 Suma";
				
				}
		if (M.getName().equals("Test2"))
		{
			obj[0][0] = "Test2 Vish";
			
		}
		
		return obj;
	}

}
