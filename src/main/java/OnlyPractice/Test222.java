package OnlyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test222 {
	
	public static void main(String []args){
	System.setProperty("webdriver.chrome.driver",
			"\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\driver2\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		
	driver.get("http://www.crmpro.com");
  //driver.get("http://ankpro.com/Account/Register");
	
	driver.manage().window().maximize();

	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("satish147");
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("147612");
     
	}
}
