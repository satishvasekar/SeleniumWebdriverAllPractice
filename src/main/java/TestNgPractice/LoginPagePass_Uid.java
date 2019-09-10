package TestNgPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginPagePass_Uid {
   WebDriver driver;
	
	@Test
	public void logIn() throws InterruptedException{
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("satish147");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("147612");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();	
		
}
}