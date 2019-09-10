package testng_listeners_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testng_listeners_practice.TestngListener.class)

public class TestNGListenerTest extends TestBase {

	@BeforeMethod
	public void LaunchBrowser() {
		SetUp();
	}

	@Test
	public void Testcase1() {
		driver.findElement(By.id("email")).sendKeys("vasekar.satish@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("satish@1476");
		driver.findElement(By.id("u_0_2")).click();
		String str = driver.getTitle();
		System.out.println(str);
		Assert.assertEquals(str, "(31) Facebook");

	}

	@AfterMethod
	public void taearDown() {
		driver.close();
	}

}