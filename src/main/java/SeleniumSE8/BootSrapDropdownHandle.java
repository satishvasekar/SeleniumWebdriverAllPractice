package SeleniumSE8;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootSrapDropdownHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.jquery-az.com/jquery/demo.php?ex=152.0_1");
		driver.findElement(By.xpath("//button[@id='btndropdown']")).click();
		
		// selecting the Dropdown table which contains the elements and store it into the List
	    List<WebElement> droplist = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/label/input"));	
        System.out.println("the count of the elements is---"+droplist.size());	  
        
        int count = droplist.size();
        
        for(int i=0;i<count;i++){
        	System.out.println(droplist.get(i).getAttribute("value"));
        	
        	WebElement element = droplist.get(i);
        	
        	String s1 = element.getAttribute("value");
        		element.click();
        		Thread.sleep(2000);
        	
        	        	
        }
	 
		
		
		
	}
}
