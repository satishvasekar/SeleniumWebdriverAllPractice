package AskeedInterviewQuetionsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementExeption1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.crmpro.com");
		// driver.get("http://ankpro.com/Account/Register");
		driver.manage().window().maximize();

		WebElement w1 = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement w2 = driver.findElement(By.xpath("//input[@type='password']"));

		w1.sendKeys("satish147");
		w2.sendKeys("147612");

		driver.navigate().refresh();
		
		w1.sendKeys("satish147");
		w2.sendKeys("147612");
	}

}