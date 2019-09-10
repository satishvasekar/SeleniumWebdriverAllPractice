package SeleniumPracticeIntQue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
				
		Set<String> windowsId = driver.getWindowHandles();
		Iterator<String> itr = windowsId.iterator();
		ArrayList<String> ids = new ArrayList<String>();
		while (itr.hasNext()) {
			ids.add(itr.next());
		}
		
		driver.switchTo().window(ids.get(0));
		
		driver.switchTo().window(ids.get(1));
		
		System.out.println(ids);
	}
}
