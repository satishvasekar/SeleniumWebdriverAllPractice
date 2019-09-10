package TestNgPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAndSoftAssertion {
	WebDriver driver;
	LoginPagePass_Uid login = new LoginPagePass_Uid();
	SoftAssert softassert = new SoftAssert();
	@BeforeMethod
	public void SetUp(){

		System.setProperty("webdriver.chrome.driver",
				"D:\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\drivers1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.crmpro.com");
	}
	
	@Test
	public void LoginPageTitle(){
		String title = driver.getTitle();
		System.out.println(title);
		softassert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
		softassert.assertAll();
		
	}
	
	@Test()
	public void LoginP() throws InterruptedException{
		login.logIn();
		String homePtitle = driver.getTitle();
		softassert.assertEquals(homePtitle, "CMPRO");
		softassert.assertAll();
	}
	
	@Test()
	public void IsContactsDisplayedTest() throws InterruptedException{
		login.logIn();
		driver.switchTo().frame("mainpanel");
		boolean b = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).isDisplayed();
		softassert.assertEquals(b, true);
		softassert.assertAll();
	}
	
	@Test
	public void TearDown(){
		driver.quit();
	}
	

}
