package selenium_sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDespayed_IsEnabled {
	
    public static void main(String[] args) {
	  
    	System.setProperty("webdriver.chrome.driver",
				"\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.crmpro.com");
	  //driver.get("http://ankpro.com/Account/Register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("satish147");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("147612");		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		// To check is Desplayed
		driver.switchTo().frame("mainpanel");
		WebElement w1 = driver.findElement(By.xpath("//td[@class='logo_text']"));
		boolean b = w1.isDisplayed();
		String s1 = w1.getText();
		System.out.println(b);
		System.out.println(s1);
		if(b==true)
			System.out.println("Logo is desplayed----");
		else
			System.out.println("logo is not desplayed");
		
		// to check is enabled
		boolean b2 = w1.isEnabled();
		System.out.println(b2);
	}


}
