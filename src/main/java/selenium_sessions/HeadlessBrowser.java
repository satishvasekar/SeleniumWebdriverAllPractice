package selenium_sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeadlessBrowser {

	@Test
	public void veryfyfacebookPageTitle(){
		System.setProperty("webdriver.chrome.driver", "\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\driver2\\chromedriver.exe");
	    WebDriver driver = new HtmlUnitDriver();
	    
	    driver.get("http://www.facebook.com");
	    String str = driver.getTitle();
	    System.out.println(str);
	    
	    Assert.assertTrue(str.contains("Facebook")); // pass the testcase
	    
	}
	@Test
	public void veryfyfacebookPageTitle1(){
		System.setProperty("webdriver.chrome.driver", "D:/Satish Softaware Backup\\Eclipse Worspace\\Selenium1\\src\\drivers1\\chromedriver.exe");
	    WebDriver driver = new HtmlUnitDriver();
	    
	    driver.get("http://www.facebook.com");
	    String str = driver.getTitle();
	    System.out.println(str);
	    
	    Assert.assertTrue(str.contains("selenium")); // fails the test case

	}
}
