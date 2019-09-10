
package TestNgPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;

	@BeforeMethod
	public void SetUp() { // ---preferanves (1),(4)

		System.setProperty("webdriver.chrome.driver",
				"\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\driver2\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	
	/*note :
	 *   1 : Each and every test is independent on each other 
	 *   2 : For sequence execution of test cases we have set Priority immediately after Test like @Test(Priority=...)
	 *   3 : Groups is one more good feature by using this we can create groups of test cases or any 
	 *   4 : After execution of test cases TestNg create a Normal report which is created in Test-output > index.html > right click > copy path on any browser
	 *   5 : TestNg does't contain main method
	 */
	
	/*
	 * @Test public void getGoolgeLogo() { driver.findElement(By.           ----it fails the test case(query)
	 * xpath("//div[@id='logo-default' or @class='show-logo']")).click(); }
	 */

	@Test(priority=1,groups="Link text") // (2)
	public void getLnkText() {
		boolean b = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).isDisplayed();
	}

	@Test(priority=2,groups="get Title") // (5)
	public void getTitle() {
		String s1 = driver.getTitle();
		System.out.println(s1);
	}
	
	@Test(priority=3,groups="Test")
	public void m1(){
		System.out.println("the method name is m1");
	}
	
	@Test(priority=4,groups="Test") 
	public void m2(){
		System.out.println("the method name is m2");
	}
	

	@AfterMethod // (3),(6)
	public void tearDown() {
		driver.quit();
	}

}
