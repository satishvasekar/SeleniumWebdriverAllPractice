package TestNgPractice;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
	
	
	@Test(invocationTimeOut=10)
	public void infiniteLoop(){
		int i = 10;
		while(i==10){
			System.out.println("the value of i is:"+i);
		}
	}
	
    @Test(expectedExceptions=NumberFormatException.class)   //  Here we can handle any Exception without using try-catch block 
    public void test(){
    	String x= "100A";
    	Integer.parseInt(x);
    }

}
