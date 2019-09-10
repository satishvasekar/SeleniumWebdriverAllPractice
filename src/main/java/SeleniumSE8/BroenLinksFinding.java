package SeleniumSE8;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BroenLinksFinding {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/download/");
		
		List<WebElement> linkslist = driver.findElements(By.tagName("href"));
		linkslist.addAll(driver.findElements(By.tagName("a")));		
		System.out.println("The no. of the broken links are--"+linkslist.size());
		
		List<WebElement> activelinks = new ArrayList<WebElement>();
		int count = linkslist.size();
		
		for(int i = 0;i<count;i++){
            System.out.println(linkslist.get(i).getAttribute("href"));
            if(linkslist.get(i).getAttribute("href")!=null ){
            	activelinks.add(linkslist.get(i));
            }
            
            HttpURLConnection connection = (HttpURLConnection) new URL(linkslist.get(i).getAttribute("href")).openConnection();
            connection.disconnect();
            String response = connection.getResponseMessage();
            System.out.println(response);
		}
		
		
		
	}
}











