package selenium_sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleCalenderDatePicker {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",
				"\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\driver2\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.crmpro.com");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("satish147");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("147612");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");
		
		String date = "14-July-2019";
		String dateArr[] = date.split("-");
		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];
		
		Select select = new Select(driver.findElement(By.xpath("//select[@name='slctMonth']")));
		select.selectByVisibleText(month);
		
		Select select1 = new Select(driver.findElement(By.xpath("//select[@name='slctYear']")));
		select1.selectByVisibleText(year);
		
		//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
		//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]
		//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[6]
		
		String befoexpath = "//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
		String afterxapath = "]/td[";
		
		final int totleWeesDay = 7;
		
		boolean flag = false;
		for(int rowNum = 2 ; rowNum<=5 ; rowNum++ ){
			for(int collNum = 1 ; collNum<=totleWeesDay ; collNum++){
				
				String dayVal = driver.findElement(By.xpath(befoexpath+rowNum+afterxapath+collNum+"]")).getText();
				System.out.println(dayVal);
				if(dayVal.equals(day)  ){
					driver.findElement(By.xpath(befoexpath+rowNum+afterxapath+collNum+"]")).click();
					flag = true;
					break;
				}
			}
			if(flag){
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		

    }
}