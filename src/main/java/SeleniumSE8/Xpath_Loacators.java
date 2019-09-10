package SeleniumSE8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Loacators {
    
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\driver2\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	 //   driver.get("http://ankpro.com/Account/Register");
	    driver.get("http://ankpro.com/Home/Training");
	    driver.manage().window().maximize();
/*
	( By_Absolute_Xpath_Locators)   
	    String str=driver.findElement(By.xpath("html/body/div[2]/footer/p")).getText();
	    System.out.println(str);
	    
	(Relative_Xpath_forAll The elements)    
	    int size1 = driver.findElements(By.xpath(".//*")).size();
	    System.out.println(size1);
	    driver.close();
	    
	 (Relative_Xpath using tagName)   
	    int size1 = driver.findElements(By.xpath(".//input")).size();
	    System.out.println(size1);
	    Thread.sleep(2000);
	    driver.close();
	   
	 (Relative_Xpath using attribute) 
	    driver.findElement(By.xpath(".//input[@id='Email']")).sendKeys("vasekar.satish@gamil.com");
	    Thread.sleep(2000);  
	    
	 (Relative_Xpath using Multiple_attribute)
	     driver.findElement(By.xpath(".//input[@id='Email'][@name='Email']")).sendKeys("a@aa.com");
	     driver.close();
	     
	 (Relative_Xpath using and )
	    driver.findElement(By.xpath(".//input[@id='Email' and @name='Email']")).sendKeys("a@aa.com");
	    driver.close();
	    
	 (Relative_Xpath using or )
	    driver.findElement(By.xpath(".//input[@id='Eamail' or @id='Password']")).sendKeys("a@aa.com");
	    Thread.sleep(2000);
	    driver.close();
	    
	 (Relative_Xpath using index )   
	    String s1=  driver.findElement(By.xpath("//tr[2]/td[2]")).getText();
	    System.out.println(s1);
	    Thread.sleep(2000);
	    driver.close();
 */
	     
	    
	     
	     
	}
}
