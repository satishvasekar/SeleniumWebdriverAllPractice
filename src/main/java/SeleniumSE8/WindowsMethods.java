package SeleniumSE8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsMethods {

	public static void main(String[] args) {
		
		   System.setProperty("webdriver.chrome.driver", "\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\driver2\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//(get()Method :-->Get method is used t open any url or page on the browser
			driver.get("http:\\automationpractice.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			/*	
		 (  WindowInterfaceMethods )
			
	     (FullScreenMethod--WindowMethod) 
		    driver.manage().window().fullScreen();
		    Thread.sleep(2000);
			
	     (MaximizeWindowMethod--WindowMethod)
			driver.manage().window().maximize();
			driver.close();
		
		 (setPosition)	
			driver.manage().window().setPosition(new Point(200, 200));
			Thread.sleep(3000);
			driver.close();
		
		 (getPosition--return type is point)
			Point p=driver.manage().window().getPosition();
			System.out.println(p);
			
		 (getSize--return type is dimension)	
			 Dimension d=driver.manage().window().getSize();
			System.out.println(d);
			
		 (setSize)	
			driver.manage().window().setSize(new Dimension(200, 200));
			
			*/
		
	}

}
