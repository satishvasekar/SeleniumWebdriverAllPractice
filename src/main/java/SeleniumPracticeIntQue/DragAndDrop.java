package SeleniumPracticeIntQue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://uitestpractice.com/");
		
		
		 WebElement w1 = driver.findElement(By.id("draggable"));
		 WebElement w2 = driver.findElement(By.id("droppable"));
		 Actions action = new Actions(driver);
		 action.dragAndDrop(w1, w2).build().perform();
	}
}
