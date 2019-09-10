package SeleniumSE8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LounchChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\automationpractice.com");
		driver.manage().window().maximize();
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("vasekar.satish@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		//WebElement web=driver.findElement(By.className("page-heading"));
		//String str=web.getText();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement web=driver.findElement(By.className("page-heading"));
		String str=web.getText();
		System.out.println("the text heading is:"+str);
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Satish");
		driver.findElement(By.id("customer_lastname")).sendKeys("vasekar");
		driver.findElement(By.id("passwd")).sendKeys("12345");
		WebElement weblnt=driver.findElement(By.id("days"));
		Select slct=new Select(weblnt);
		slct.selectByValue("14");
		WebElement wbl=driver.findElement(By.id("months"));
		Select slt=new Select(wbl);
		slt.selectByVisibleText("July ");
		WebElement wbt= driver.findElement(By.id("years"));
		Select s1=new Select(wbt);
		s1.selectByValue("1992");
		driver.findElement(By.id("address1")).sendKeys("at/post-wagholi tal-hawely dist-pune");
		driver.findElement(By.id("city")).sendKeys("pune");
		WebElement web1=driver.findElement(By.id("id_state"));
		Select s2 = new Select(web1);
		s2.selectByVisibleText("Florida");
		driver.findElement(By.id("postcode")).sendKeys("412207");
		WebElement w3=driver.findElement(By.id("id_country"));
		Select s3=new Select(w3);
		s3.selectByVisibleText("United States");
		driver.findElement(By.id("phone_mobile")).sendKeys("9552337849");
		driver.findElement(By.id("alias")).sendKeys("at/post-wagholi tal-hawely dist-pune");
		driver.findElement(By.className("submitAccount")).submit();
		//driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}