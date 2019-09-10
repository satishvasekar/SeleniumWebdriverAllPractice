package TestNgPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {

	@Parameters({"URL","Username","Password"})
	@Test
	public void SampleClass(String url,String Uname,String Upass){
		System.out.println("My url name is:"+url);
		System.out.println("My database Username is:"+Uname);
		System.out.println("My database Password is:"+Upass);
	}
}  // Without hardcoding the values in our code we can pass these values from 
   // other place
