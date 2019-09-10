package SeleniumPracticeIntQue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InmplicitAndExplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
      //wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath("")));
	}
}
