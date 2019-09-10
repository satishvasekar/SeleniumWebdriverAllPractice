package AskeedInterviewQuetionsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferanceExeption {

	public static void main(String []args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",
				"\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://uitestpractice.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//a[@href='/Students/Form']"));
		
		element.click();
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		try {
			element.click();
		} 
		catch (StaleElementReferenceException e) {
            element = driver.findElement(By.xpath("//a[@href='/Students/Form']"));
			element.click();

		}	
    }
}
