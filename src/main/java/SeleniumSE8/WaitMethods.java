package SeleniumSE8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMethods {

	public static void main(String[] args) throws InterruptedException {
      
		System.setProperty("webdriver.chrome.driver", "\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\driver2\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);--> For implicitlyWaitMethod
	   // driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);---> For PageLoadWAitMrthod
	    driver.get("http://uitestpractice.com/Students/Contact");
	    driver.manage().window().maximize();
/*	  
// (Thread.sleep(millis);)		
	    driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/a")).click();
	    //Thread.sleep(10000);//----> (If we will not take thread method than it will throw exception saying enable to find element)
	    String w1 = driver.findElement(By.className("ContactUs")).getText();
	    System.out.println(w1.contains("Python"));
	    driver.close();
	    
	( implicitlyWait(long time, TimeUnit unit);)  
	    System.setProperty("webdriver.chrome.driver", "D:/Satish Softaware Backup\\Eclipse Worspace\\Selenium1\\src\\drivers1\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                ------>> it will wait till element is available or till the given specifide time
        driver.get("http://uitestpractice.com/Students/Contact");
        driver.manage().window().maximize();
  
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/a")).click();
        String w1 = driver.findElement(By.className("ContactUs")).getText();
        System.out.println(w1.contains("Python"));
        driver.close();
	    
	(ExplicitWaitMethod) 
	    driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/a")).click();
	    WebDriverWait wait = new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("ContactUs")));
	    String s1=driver.findElement(By.className("ContactUs")).getText();
	    System.out.println(s1.contains("Python"));
	    driver.close(); 
	    
    (FluentWaitMethod)  
	    driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/a")).click();
	    FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
	    		.withTimeout(20, TimeUnit.SECONDS)
	    		.pollingEvery(50, TimeUnit.MICROSECONDS);
	    wait1.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("ContactUs")));
	    String s1=driver.findElement(By.className("ContactUs")).getText();
	    System.out.println(s1.contains("Python"));
	    driver.close(); */
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		}

}
