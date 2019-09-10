package SeleniumSE8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumPractice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://uitestpractice.com/");
		Actions a1 =new Actions(driver);
		
		WebElement w1 =driver.findElement(By.id("draggable"));
		WebElement w2 = driver.findElement(By.id("droppable"));
		
		a1.moveToElement(w1).clickAndHold();
		a1.moveToElement(w2).release().build().perform();
		Thread.sleep(2000);
		driver.close();
	}
}
