package testng_listeners_practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;

	public void SetUp() {

		System.setProperty("webdriver.chrome.driver",
				"\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\driver2\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
	}

	public void SreenShotTest() {
		
		TakesScreenshot ts = (TakesScreenshot)driver; // TypeCasting 
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
	    try {
			FileUtils.copyFile(source, new File(".//ScreenShots//Screenshot.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
