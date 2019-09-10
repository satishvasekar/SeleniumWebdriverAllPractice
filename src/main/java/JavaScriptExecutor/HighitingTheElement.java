package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighitingTheElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.crmpro.com");
	  //driver.get("http://ankpro.com/Account/Register");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("satish147");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("147612");
		
		WebElement logiBttn = driver.findElement(By.xpath("//input[@type='submit']"));
	}
	
	public static void flash(WebElement element,WebDriver driver){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String bgColor = element.getCssValue("backgroungColor");
		for(int i=0;i<=50;i++){
			changeColor("#FF0000",element,driver);
			changeColor(bgColor,element,driver);
		}		
	}
	public static void changeColor(String color,WebElement element,WebDriver driver){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor='" + color + "'", element);	}
	
}
