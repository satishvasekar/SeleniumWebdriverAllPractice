package SeleniumSE8;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Access {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\driver2\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://ankpro.com");
	    driver.manage().window().maximize();
	 /*
	  
	 (xpath using parent filter)
	    String s1= driver.findElement(By.xpath("//h2/parent::div")).getText();
	    System.out.println(s1);
	    Thread.sleep(2000);
	    driver.close();
	    
	 (xpath using child filter)
	    driver.get("http://ankpro.com/Account/Login");
	    String s1=driver.findElement(By.xpath("//footer/child::p")).getText();
	    System.out.println(s1);
	    Thread.sleep(2000);
	    driver.close();
	    
	    driver.get("http://ankpro.com/Account/Login");
	    driver.findElement(By.xpath("//div/child::input")).sendKeys("Satish");
	    Thread.sleep(2000);
	    driver.close();
	    
	 (xpath using following sibling)   
	    driver.get("http://ankpro.com/Home/Training");
	    int s1=driver.findElements(By.xpath("//tr[8]/following-sibling::tr")).size();
	    System.out.println(s1);
	    Thread.sleep(2000);
	    driver.close();
	    
	 (xpath using following )
	    driver.get("http://ankpro.com/Home/Training");
	    int l1=driver.findElements(By.xpath("//tr[6]/following::*")).size();
	    System.out.println(l1);
	    Thread.sleep(2000);
	    driver.close();
	 
	 (xpath using preceding-sibl ing)  
	    driver.get("http://ankpro.com/Home/Training");
	    int s1=driver.findElements(By.xpath("//tr[8]/preceding-sibling::tr")).size();
	    System.out.println(s1);
	    Thread.sleep(2000);
	    driver.close();
	    
	    */
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		    }
	}

