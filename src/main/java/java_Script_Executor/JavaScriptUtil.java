package java_Script_Executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {

	public static void Flash(WebElement element, WebDriver driver) {

		String bgcolor = element.getCssValue("backgroundColor");

		for (int i = 0; i < 500; i++) {
			Changecolor("#000000", element, driver);
			Changecolor(bgcolor, element, driver);
		}

	}

	public static void Changecolor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].style.backgroundColor='" + color + "'", element);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
	}

	public static void DrawingBorder( WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	public static String getTitleByJs(WebDriver driver){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static void ClickOnElement(WebElement element , WebDriver driver){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
        js.executeScript("arguments[0].click();", element);		
	}
	
	public static void generateAlert(WebDriver driver ,String message){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
        js.executeScript("alert('"+message+"')");		
	}
	
	public static void scrollIntoView(WebElement element , WebDriver driver){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
        js.executeScript("arguments[0].scrollIntoView(true);", element);		
	}
	
	
	
	
	
}