package selenium_sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDyanamicWebTables {

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
		driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[4]/a")).click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);

		// //*[@id='vContactsForm']/table/tbody/tr[4]/td[2]
		// //*[@id='vContactsForm']/table/tbody/tr[5]/td[2]
		// //*[@id='vContactsForm']/table/tbody/tr[6]/td[2]
		// //*[@id="vContactsForm"]/table/tbody/tr[7]/td[2]

		// Method 1
		/*String before_xpath = " //*[@id='vContactsForm']/table/tbody/tr[";
		String after_xpath = "]/td[2]";

		for (int i = 4; i <= 7; i++) {
			String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
			System.out.println(name);
			// //*[@id='vContactsForm']/table/tbody/tr[5]/td[1]
			if (name.contains("sagar shinde")) {
				driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr[" + i + "]/td[1]")).click();
			}
		}
		*/
		// Methid 2
		
		// //a[contains(text(),'sagar shinde')]/parent::td//preceding-sibling::td//input[@name='contact_id']
		driver.findElement(By.xpath("//a[contains(text(),'sagar shinde')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'priya hjsdjj')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();


	}
}