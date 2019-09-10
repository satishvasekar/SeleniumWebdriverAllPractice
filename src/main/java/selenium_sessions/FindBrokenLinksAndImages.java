package selenium_sessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLinksAndImages {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\driver2\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get("https://makemysushi.com/404?");

		driver.get("https://www.crmpro.com");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("satish147");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("147612");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");
		
		//  Links---//a href<http://www.google.com>
		//  images--//imf href<http://www.test.com>
		
		// 1. get list of all the links and images
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		linksList.addAll(driver.findElements(By.tagName("img")));
		System.out.println("size of the links and images--->"+linksList.size());
		
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		
		//2.iterate linkList : exlude all the links/images - doest have any href attribute
		for(int i=0;i<linksList.size();i++){
			System.out.println(linksList.get(i).getAttribute("href"));
			if(linksList.get(i).getAttribute("href")!=null && (! linksList.get(i).getAttribute("href").contains("javascript")))
				activeLinks.add(linksList.get(i));
		}
		// get the size of the active links
		System.out.println("the size of the active links is---"+activeLinks.size());		
		
		//Check the href conecton with the Httpconnectin api
		for(int j =0;j<activeLinks.size();j++){
			
		HttpURLConnection connection = 	(HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
		connection.connect();
		
		String response = connection.getResponseMessage();
		connection.disconnect();
		System.out.println(activeLinks.get(j).getAttribute("href")+"---->"+response);
			
			
			
		}
		
	}
		
}
