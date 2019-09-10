package TestNgPractice;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	/*Note:
	 * 1 : Sometimes we need to execute same test case number of times 
	 * 2 : We need not write this test case that number of times just we have to use invocationCount keyword and give the number 
	 * */

	@Test(invocationCount=10)
	public void sum(){
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	
	}

}
 