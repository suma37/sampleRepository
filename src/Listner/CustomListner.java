package Listner;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class CustomListner extends TestListenerAdapter {
	
	public void onTestFailure(ITestResult tr){
		
		System.out.println("Fail");
	}
	
	public void onTestSkipped(ITestResult tr){
		
		System.out.println("Skip...."  +tr.getName());
	}
	
	public void onTestSuccess(ITestResult tr){
		
		System.out.println("Pass..." +tr.getName());
		
		//tr.getName will get the name of the testcase
	}

	

}
