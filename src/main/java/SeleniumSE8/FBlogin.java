package SeleniumSE8;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class FBlogin {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
	System.setProperty("webdriver.chrome.driver", "\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\driver2\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("vasekar.satish@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("satish147");
	driver.findElement(By.id("u_0_2")).click();
	Actions a1 = new Actions(driver);
	//a1.moveToElement(web1).build().perform();
	//driver.close();
	//driver.quit();
	System.out.println("the page source is:"+driver.getPageSource());
	System.out.println("the title is:"+driver.getTitle());
	System.out.println("the window hndle is:"+driver.getWindowHandle());
	
	
/*	
	Thread.sleep(10000);
	Robot rbt = new Robot();
	rbt.keyPress(KeyEvent.VK_TAB);
	rbt.keyRelease(KeyEvent.VK_TAB);
	
	rbt.keyPress(KeyEvent.VK_TAB);
	rbt.keyRelease(KeyEvent.VK_TAB);
	
	rbt.keyPress(KeyEvent.VK_ENTER);
	rbt.keyRelease(KeyEvent.VK_ENTER);
	Alert al = driver.switchTo().alert();
	al.dismiss();
	driver.findElement(By.id("mainContainer")).click();
	String str = driver.getTitle();
	System.out.println(str);
	
	String str1 = "Shortcu";
	Assert.assertTrue(str.equals(str1));
	
	driver.quit();
	System.out.println("test closure");
	*/
	}
}
