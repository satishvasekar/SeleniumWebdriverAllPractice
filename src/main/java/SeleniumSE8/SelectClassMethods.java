package SeleniumSE8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelectClassMethods {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\driver2\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://uitestpractice.com/Students/Select");
	    driver.manage().window().maximize();
	    /*
  (getOptions method) 
 *      WebElement e1 = driver.findElement(By.id("countriesMultiple"));
	    Select s1 = new Select(e1);
	    List<WebElement> elements = s1.getOptions();
	    System.out.println(elements.size());
	    for (WebElement webElement : elements) {
		System.out.println(webElement.getText());
	    
	 (isMultiple method)    
	    WebElement e2=driver.findElement(By.id("countriesMultiple"));
	    Select s2 = new Select(e2);
	    boolean b = s2.isMultiple();
	    System.out.println(b);
	    
	 (selectByVisibleText)
	     WebElement e2=driver.findElement(By.id("countriesMultiple"));
	     Select s2 = new Select(e2);
	     s2.selectByVisibleText("China");
	              //------->it only select China from multiple dropdownbox
	    
	 (deselectByVisibleText) 
	     WebElement e2=driver.findElement(By.id("countriesMultiple"));
	     Select s2 = new Select(e2);
	     s2.selectByVisibleText("China");
	              //------->it only select China from multiple dropdownbox
	     Thread.sleep(2000);
	     s2.deselectByVisibleText("China");---> it deselects China from dropdownBox
	     Thread.sleep(2000);
	    
	  (select and deselect Byvalue)  
	     WebElement e2=driver.findElement(By.id("countriesMultiple"));
	     Select s2 = new Select(e2);
	     s2.selectByValue("england");
	     Thread.sleep(2000);
	     s2.deselectByValue("england");
	    
	  (getFirstSelectedOption)  
	     WebElement e2=driver.findElement(By.id("countriesMultiple"));
	     Select s2 = new Select(e2);
	     s2.selectByIndex(0);
	     s2.getFirstSelectedOption();
	     System.out.println(s2.getFirstSelectedOption().getText());
	 
	  (getAllSelectedOptions) 
	     WebElement e2=driver.findElement(By.id("countriesMultiple"));
	     Select s2 = new Select(e2);
	     s2.selectByIndex(0);
	     s2.selectByIndex(1);
	     s2.selectByIndex(2);
	     Thread.sleep(2000);
	     List<WebElement> webelements= s2.getAllSelectedOptions();
	    
	     System.out.println(webelements.size());
	     for (WebElement webElement : webelements) {
	     System.out.println(webElement.getText());
	    	 
	  (deselectAll)  
	     WebElement e2=driver.findElement(By.id("countriesMultiple"));
	     Select s2 = new Select(e2);
	     s2.selectByIndex(0);
	     s2.selectByIndex(1);
	     s2.selectByIndex(2);
	     s2.deselectAll();*/
	    	
	  }
	     
	     
}
	 
