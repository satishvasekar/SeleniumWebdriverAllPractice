package selenium_sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\driver2\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://html.com/input-type-file/");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("D:\\Satish Softaware Backup\\chromedriver.exe");
	          /*  this is the xpath of the browse button instead of browse it can be any
	              like "add", "attach" etc.
                  instead of clicing on the the browse button we have to sendkeys and give the of the the which we want to attach.*/	
	    driver.close();     
	}
	    
}
