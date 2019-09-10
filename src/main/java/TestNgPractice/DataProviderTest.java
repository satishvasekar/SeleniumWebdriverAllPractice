package TestNgPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	
    @Test(dataProvider="Mydata1")
    public void testcase1(String Uname,String Upass){
    	System.out.println("testcase1 shouold run for 4 sets of data");
    	System.out.println(Uname); 
    	System.out.println(Upass);
    }
	
	@DataProvider(name="Mydata1")
	public Object[][] Data(){
		Object[][] obj = new Object[4][2];
		obj[0][0] = "user1";
		obj[0][1] = "Password1";
		obj[1][0] = "user2";
		obj[1][1] = "Password2";
		obj[2][0] = "user3";
		obj[2][1] = "Password3";
		return obj;
		
	}
}
	