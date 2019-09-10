package ReTestFailedTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class mytests {

	@Test
	public void Test1(){
		System.out.println("This is the test 1");
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void Test2(){
		System.out.println("This the test ");
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void Test3(){
		System.out.println("This the test 3");
		Assert.assertEquals(true, true);
	}
}       /* - we can execute the faied test cases at the test level but here is the limitation is that 
             if we have 100 tests and to retest them we need to define (retryAnalyzer = ReTestFailedTests.RetryAnalyzer.class )
             in frontt of the @Test.and it is the time consuming
           - But we can retest the failed tests at run time also
             by implementing the IAnnotationtransformer interface which contains the transform method  
             
             *
             *
             */
