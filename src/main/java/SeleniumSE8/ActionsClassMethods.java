package SeleniumSE8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassMethods {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\driver2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.crmpro.com");
	  //driver.get("http://ankpro.com/Account/Register");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("satish147");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("147612");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");
		WebElement w1 = driver.findElement(By.xpath("//a[@title='Email']"));
		WebElement w2 = driver.findElement(By.xpath("//a[@title='Customize Email Content']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(w1).build().perform();
		action.moveToElement(w2).click().build().perform();
		
		
		
		
// ( moveToElement(WebElement target))
		/*
		 * WebElement w1 =driver.findElement(By.id("div2")); 
		 * Actions a1 = new Actions(driver); 
		 * a1.moveToElement(w1).build().perform();
		 * Thread.sleep(2000);
		 */
// (Actions moveToElement(WebElement target, int xOffset, int yOffset))
		// ---> Overloaded method of moveToelement
		/*
		 *  WebElement w1 =driver.findElement(By.id("div2"));
		 *  Actions a1 = new Actions(driver);
		 *  a1.moveToElement(w1, 20,20).contextClick().build().perform();
		 */

// (Actions click())
		/*
		 * WebElement w1= driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/button[1]")); 
		 * Actions a1 = new Actions(driver); 
		 * a1.moveToElement(w1).click().perform();
		 */
// (Actions click(WebElement target)) ----> overloading of click method
		/*
		 * Actions a1 = new Actions(driver);
		 * a1.click(driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/button[1]"))).build().perform();
		 */
// (Actions doubleClick(WebElement target))
		
		/* WebElement w1= driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/button[2]"));
		 *  Actions a1 = new Actions(driver); 
	     * Thread.sleep(2000);
	     * a1.doubleClick(w1).build().perform();
		 */
// (Actions contextClick() )
		/*
		 * WebElement w1 = driver.findElement(By.xpath("//*[@id=selectable]/li[4]"));
		 * Actions a1  = new Actions(driver);
		 * a1.contextClick().build().perform();
		 */

// ( Actions clickAndHold() )
		/*
		 * WebElement w1 = driver.findElement(By.id("draggable")); 
		 * WebElement w2 = driver.findElement(By.id("droppable")); 
		 * Actions a1 = new Actions(driver);
		 * a1.moveToElement(w1).clickAndHold();
		 * a1.moveToElement(w2).release(); a1.build().perform();
		 */
// (Actions moveByOffset(int xOffset, int yOffset))
		/*
		 * Actions a1 = new Actions(driver); a1.moveByOffset(300,
		 * 300).contextClick().build().perform();
		 */
// (Actions dragAndDrop(WebElement source, WebElement target))
		/*
		 *  WebElement w1 = driver.findElement(By.id("draggable"));
		 *  WebElement w2 = driver.findElement(By.id("droppable"));
		 *  Actions a1 = new Actions(driver);
		 *  a1.dragAndDrop(w1, w2).build().perform();
		 *  Thread.sleep(2000);
		 *  driver.close();
		 */

// (Actions dragAndDropBy(WebElement source, int xOffset, int yOffset))
		/*
		 * WebElement w1 = driver.findElement(By.id("draggable")); Actions a1 =
		 * new Actions(driver); a1.dragAndDropBy(w1, 200,200).build().perform();
		 * Thread.sleep(2000);
		 * driver.close();
		 */

// (Actions keyDown(CharSequence key))
		/*
		 * WebElement w1 =
		 * driver.findElement(By.className("ui-state-default ui-selectee"));
		 * WebElement w2 = driver.findElement(By.
		 * className("ui-state-default ui-selectee ui-selected"));
		 * WebElement w3 = driver.findElement(By.className("ui-state-default ui-selectee"));
		 * Actions a1 = new Actions(driver); 
		 * a1.keyDown(Keys.CONTROL) .click(w1).click(w2).click(w3).keyUp(Keys.CONTROL).build().perform();
		 */

// ( Actions keyDown(WebElement target, CharSequence key))
		/*
		 * WebElement w1 =
		 * driver.findElement(By.className("ui-state-default ui-selectee"));
		 * WebElement w2 = driver.findElement(By.
		 * className("ui-state-default ui-selectee ui-selected")); 
		 * WebElement w3 = driver.findElement(By.className("ui-state-default ui-selectee"));
		 * Actions a1 = new Actions(driver);
		 *  a1.keyDown(w1, Keys.CONTROL).keyDown(w2, Keys.CONTROL).keyDown(w3, Keys.CONTROL).build().perform();
		 */
// (Actions sendKeys(CharSequence... keys))
		/*
		 * Actions a1 = new Actions(driver); a1.sendKeys(Keys.END) .perform();
		 * Thread.sleep(2000); a1.sendKeys(Keys.HOME) .perform();
		 */

// (Actions sendKeys(WebElement target, CharSequence... keys))
		/*
		 * WebElement w1 = driver.findElement(By.className("click")); Actions a1
		 * = new Actions(driver); a1.sendKeys(w1, Keys.ENTER) .build()
		 * .perform(); Thread.sleep(2000); driver.close();
		 *
		 * up to 32 lecture from Ankpro training
		 *
		 */
// (sendkeys controls keys)
		/*
		 * WebElement w1 = driver.findElement(By.id("Email")); Actions a = new
		 * Actions(driver);
		 * a.click(w1).sendKeys("vasekar.satish@gmail.com"+Keys.TAB);
		 * a.sendKeys("12345"+Keys.TAB); a.sendKeys("12345"+Keys.TAB);
		 * a.build().perform(); Thread.sleep(2000); driver.close();
		 */
// (Clear text box with sendkeys and using clear method of WebElement)
		/*
		 * WebElement w1 = driver.findElement(By.id("Email")); Actions a = new
		 * Actions(driver); a.click(w1).sendKeys("vasekar.satish@gmail.com")
		 * .keyDown(Keys.CONTROL) .sendKeys("a") .keyUp(Keys.CONTROL)
		 * .sendKeys(Keys.BACK_SPACE) .build().perform();
		 * 
		 */

	}

}
