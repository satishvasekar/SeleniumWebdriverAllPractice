package SeleniumSE8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
	
 public static void main(String[] args) throws InterruptedException {
	   
	    System.setProperty("webdriver.chrome.driver", "\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//(get()Method :-->Get method is used t open any url or page on the browser
		driver.get("http:\\automationpractice.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	/*	
    (getTittleMethod)
		 String str = driver.getTitle();
		 System.out.println("The tittle of the page is:"+str);
	 (getCurrentUrlMethod)	
		String str = driver.getCurrentUrl();
		System.out.println("The current page url is:"+str);
		driver.close();
     (getPageSourceMethod)	
		String s1=driver.getPageSource();
		System.out.println("The pagesource of the page is:"+s1);
		driver.close();
	 (NavigateToMethod)-->Navigation interface method	
	    driver.navigate().to("http://www.ankpro.com");
        Thread.sleep(2000);
        driver.close();
	 (NavigateBackMethod)-->Navigation interface method	
		driver.navigate().to("http://www.ankpro.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.close();
     (ForwardMethod) & (RefreshMethod)  
		driver.navigate().to("http://www.ankpro.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.close();
	 	*/
	  	
		
		
		
		
 }
} 