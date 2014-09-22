import org.testng.annotations.Test;

/*
 1. to run , right click on the samp,eTest_annotation.java and select Run As -> Testng Test
 2. on running this both the test methods get executed( even though the main method is not present)
 3. the very good advantage of testng is right click on Mod 10_sele (the java project) and refresh the project , a folder called 
    test-output is created , which has the html reports are generated.This feature is not present in junit . in junit if we 
    want these reports to be generated we need to do it using ANT. but in Testng it automatically gets generated on running the script.
    
 4. Old reports are lost once we refresh it.
  
 */
public class SampleTest_anotation {

	@Test
	//Test is an annotation function which is inbuilt in Testng
	//it represent that this testapp is an testcase
	public void testapp()
	{
	}
	
	@Test
	//this is a send testcase
	public void LoginTest()
	{
	
	}
	
	@Test 
	public void g(){
		
	}
	
	}



