package java_Script_Executor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ScrollDown {
	WebDriver driver;
	@Test
	public void scrollDown(){
		System.setProperty("webdriver.chrome.driver",
				"\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\driver2\\chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("http://demo.automationtesting.in/Register.html");
	    WebElement w1 = driver.findElement(By.xpath("//div[@id='msdd']"));
	    
	    Select s1 = new Select(w1);
	    s1.selectByVisibleText("English");
	    
	    
	}

}
