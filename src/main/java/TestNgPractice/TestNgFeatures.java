package TestNgPractice;

import org.testng.annotations.Test;

public class TestNgFeatures {
	
	/*Note :
	 *   1 : TestNg has a Feature of "DependsOnMethods="Method name"" by using this we can mae Test cases dependent on each other like following eg.
	 *   2 : The Methods which are dependent another Method does not get executed till this method got executed
	 *   3 : If this another Method get failed than all this dependent methods got skipped
	 *   
	 * */
	
	@Test
	public void logInTest(){
		System.out.println("LogIn Test");
		int i = 10/0;
	}
	
	@Test(dependsOnMethods="logInTest")
	public void HomePageTest(){
		System.out.println("Home page Test");
	}
	
	@Test(dependsOnMethods="HomePageTest")
	public void SearchTest(){
		System.out.println("Search Test");
	}
	
	@Test (dependsOnMethods="SearchTest")
	public void ResPageTest(){
		System.out.println("Res page Test");
	}
}
