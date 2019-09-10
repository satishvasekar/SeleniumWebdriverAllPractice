package selenium_sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\driver2\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.crmpro.com");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Satish147");
	    driver.findElement(By.xpath("//*[@type='password']")).sendKeys("147612");
	    driver.findElement(By.xpath("//*[@type='submit']")).click();
	    
	    driver.switchTo().frame("mainpanel");
	          /* This Method will give us the access on the frame
	           * We can take the frame name by RightClick > ViewPageSource 
	           * */
	    
	    driver.findElement(By.xpath("//a[@href='https://www.crmpro.com/system/index.cfm?action=contact']")).click();
	          /*After taking the access of the frame we can find element on the frame and click it.
	            Just like we have taken the Access of the contacts on the frame*/
	    
	    driver.close();
	    
	    
	    
	    
	}

}
