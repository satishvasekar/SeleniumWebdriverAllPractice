 package TestNgPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg_Basics_ {
	@BeforeSuite
	public void setPropertis (){
		System.out.println("@BeforeSuite--set up properties for chrome");
	}
	
	@BeforeTest
	public void launchBrowser(){
		System.out.println("@BeforeTest--launchbrowser");
	}
	
	@BeforeClass
	public void enterURL(){
		System.out.println("@BeforeClass--ernter URL");
	}
	
	@BeforeMethod
	public void logIn(){
	 System.out.println("@BeforeMethod--log in to page");
	}
	
	@Test(priority=1)   // -------->  Here we can set priority for sequence of execution of test cases
	public void getGoogleTitle(){
		System.out.println("@test--get the google title");
	}
	
	@Test(priority=0)
	public void searchBox(){
		System.out.println("@Test---search box on the page");
	}
	
	@Test(priority=2)
	public void googleLogo(){
		System.out.println("@Test---googlelogo");
	}
	
	@AfterMethod
	public void logOut(){
		System.out.println("@Aftermethod---logOut");
	}
	
	@AfterClass
	public void closeBrowser(){
		System.out.println("@AfterClass----CloseBrowser");
	}
	
	@AfterClass
	public void deleteAllCookies(){
		System.out.println("@afterTest---delete all cookies");
	}
	
	
	
	

	

	
	}
	


