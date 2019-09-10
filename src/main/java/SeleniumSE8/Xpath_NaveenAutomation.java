package SeleniumSE8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath_NaveenAutomation {
     
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\driver2\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   // driver.get("http://uitestpractice.com/Students/Form");
	    //driver.get("http://ankpro.com/Account/Login");
	    driver.get("https://www.spicejet.com/");
	    driver.manage().window().maximize();
	    /*
	    WebElement w1= driver.findElement(By.xpath("//select[@name='originStation']"));
	    Select s1 = new Select(w1);
	    s1.selectByVisibleText("Bhopal (BHO)");
	    Thread.sleep(2000);
	    driver.close();
	 (contains function)   
	    driver.findElement(By.xpath("//a[contians(text(),'RFP')]")).click();
	    Thread.sleep(2000);
	    driver.navigate().back();
	    driver.close();
	    
	    driver.findElement(By.xpath("//input[@type='text' and @id='firstname']")).sendKeys("Satish");
	    driver.findElement(By.xpath("//input[@type='text' and @id='lastname']")).sendKeys("Vasekar");
	    driver.findElement(By.xpath("//input[@type='checkbox' and @value='dance']")).click();
	    driver.findElement(By.xpath("//input[@type='checkbox' and @value='read']")).click();
     	WebElement w1=driver.findElement(By.id("sel1"));
	    Select s1 = new Select(w1);
	    s1.selectByValue("India");
	    
	    driver.findElement(By.xpath("//input[@type='radio']")).click();
	    
	    
	    driver.findElement(By.xpath("//input[@id='Email' and @name='Email']")).sendKeys("vasear.satish@gmail.com");
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
	    Thread.sleep(2000);
	   
	    driver.findElement(By.xpath("//a[text()='Ankpro Technologies']")).click();
	    String s1 = driver.findElement(By.xpath("//h1[text()='Ankpro Technologies']")).getText();
	    System.out.println(s1);
	    */
	   WebElement w1= driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
	    Select s1 = new Select(w1);
	    s1.selectByIndex(0);
	    Thread.sleep(2000);
	    driver.close();
	    
	    
	    
	    
	    
	    
	    
	    
	 
	    
	    
	}   
}

