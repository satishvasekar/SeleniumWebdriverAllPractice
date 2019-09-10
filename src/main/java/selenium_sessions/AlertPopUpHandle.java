package selenium_sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\driver2\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    driver.findElement(By.xpath("//*[@type='submit']")).click();
	    Alert alert=driver.switchTo().alert();  
	               // Here it will switch us to the the pop up   
	    System.out.println(alert.getText());
	               // it will print the text which is present on the pop up box
	    String str = alert.getText();
	    
	   if(str.equals("Please enter a valid user name")){
		   
		   System.out.println("correct alert msg");
	   }
	   else{
		   System.out.println("Incorrect alert smg");
	   }
	    
	     Thread.sleep(2000);
	    
	    alert.accept();
	               // accept method for clicking on the ok  button present on the pop up box and dismiss for cancel 
	    Thread.sleep(2000);
	    
	    driver.close();
	   
	}

}
