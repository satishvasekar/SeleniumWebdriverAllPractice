package TestNgPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertClassUse_Validation {

     WebDriver driver;	
	
	@BeforeMethod
	public void SetUp() {
		
		System.setProperty("webdriver.chrome.driver",
				"\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\driver2\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("http://www.google.com");
	  //driver.get("http://ankpro.com/Account/Register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	@Test
	public void getGooglePageTitle(){
		String s1 = driver.getTitle();
		System.out.println(s1);
		Assert.assertEquals(s1, "Google","The validation is Failed");  // This Assert validates expected and actual values 
		
	}

	@Test
	public void googleTitleDispyed(){
		boolean b = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).isDisplayed();
		Assert.assertTrue(true);
	}
	
	@AfterMethod
	public void CloseBrowser(){
		driver.quit();;
	}
}