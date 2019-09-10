package selenium_sessions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AssendingOrderOfDropDown {
	
	@Test
	public void DropDown(){
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\driver2\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://uitestpractice.com/Students/Select");
		
		Select s1 = new Select(driver.findElement(By.xpath("//select[@id='countriesSingle']")));
		
		List actualArr = new ArrayList();
		List<WebElement> myData =  s1.getOptions();
		
		for (WebElement webElement : myData) {
			String str = webElement.getText();
			System.out.println(str);
			actualArr.add(str);
		}
		
		List temp = new ArrayList();	
		temp.addAll(actualArr);
		
		Collections.sort(temp);
	}

}
