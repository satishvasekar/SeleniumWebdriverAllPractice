package selenium_sessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\driver2\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		
		List<WebElement> dd_menu = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
		int count = dd_menu.size();
		
		for(int i=0;i<count;i++){
			WebElement element = dd_menu.get(i);
			
			String innerhtml = element.getAttribute("innerHTML");
			if(innerhtml.contentEquals("JavaScript")){
				element.click();
				Thread.sleep(2000);
				break;
			}
			else
				System.out.println("JavaScript doesnt contain");
			
			System.out.println("values from drop down are=="+innerhtml);			
		}
		driver.quit();
		
		
		
		
		
		
		
		
	}
	
}
