package SeleniumSE8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Functions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\driver2\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://ankpro.com");
	    driver.manage().window().maximize();
	   
/* (text() function)  
	    String s1=driver.findElement(By.xpath("//h2[text()='Our People']")).getText();
	    System.out.println(s1);
	    driver.close();
	    
	(starts-with function)    
	    driver.get("http://ankpro.com/Account/Login");
	    driver.findElement(By.xpath(".//input[starts-with(@id,'Rem')]")).click();
	    Thread.sleep(2000);
	    driver.close();
	    
	 (contains function)   
	    driver.get("http://ankpro.com/Account/Login");
	    driver.findElement(By.xpath(".//input[contains(@id,'Me')]")).click();
	    Thread.sleep(2000);
	    driver.close();
	    
	 (not() function)  
	    driver.get("http://ankpro.com/Account/Login");
	    driver.findElement(By.xpath(".//input[@type='checkbox' and not (@checked)]")).click();
	    Thread.sleep(2000);
	    
	 (last() function)  
	    driver.get("http:00//ankpro.com/Home/Training");
	    String s1= driver.findElement(By.xpath(".//tbody/tr[last()]")).getText();
	    System.out.println(s1);
	    Thread.sleep(2000);
	    
	 (last()-1 function)   
	    driver.get("http://ankpro.com/Home/Training");
	    String s1= driver.findElement(By.xpath(".//tbody/tr[last()-1]")).getText();
	    System.out.println(s1);
	    Thread.sleep(2000);
	    
	    */
	    driver.get("http://ankpro.com/Account/Register");
	    driver.findElement(By.xpath("(.//input[@type='passward'])[position()=2]")).sendKeys("123456");
	    Thread.sleep(2000);
	    driver.close();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	}
}
 