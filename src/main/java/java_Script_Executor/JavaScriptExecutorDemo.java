package java_Script_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	
	public static void main(String [] args){
		
		System.setProperty("webdriver.chrome.driver",
				"\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		driver.get("http://www.uitestpractice.com/");
		
		WebElement w1 = driver.findElement(By.xpath("//*[@id='reg_form_box']/div[10]"));
		// Flashing the element
		// JavaScriptUtil.Flash(w1, driver); 
		
		//  Drawing Border Around element 
		JavaScriptUtil.DrawingBorder( w1, driver);
		
		//GetTitle
		String title1 = JavaScriptUtil.getTitleByJs(driver);
		System.out.println(title1);
		
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		// Click on Element
		JavaScriptUtil.ClickOnElement(loginBtn, driver);
		
		//Generate Alert info
		JavaScriptUtil.generateAlert(driver, "You are clicked on the login button...");
		
		
		//Scroll till found the element
		WebElement w2 = driver.findElement(By.xpath("//button[@id='toggle']"));
		JavaScriptUtil.scrollIntoView(w2, driver);
		
		driver.close();
		
		
		
	}
}
