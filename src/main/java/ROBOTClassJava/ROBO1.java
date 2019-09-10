package ROBOTClassJava;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class ROBO1 {
public static void main(String[] args) throws AWTException, IOException {
		
		Robot rb = new Robot();
		
		Runtime rt = Runtime.getRuntime();
		String str = "notepad.exe";
		rt.exec(str);
		rb.delay(1500);
		
		rb.keyPress(KeyEvent.VK_H);
		rb.keyRelease(KeyEvent.VK_H);
		rb.keyPress(KeyEvent.VK_I);
		rb.keyRelease(KeyEvent.VK_I);
		rb.delay(2000);
		
		rb.keyPress(KeyEvent.VK_SPACE);
		
		rb.keyPress(KeyEvent.VK_S);
		rb.keyRelease(KeyEvent.VK_S);
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_A);
		

		rb.keyPress(KeyEvent.VK_T);
		rb.keyRelease(KeyEvent.VK_T);
		rb.keyPress(KeyEvent.VK_I);
		rb.keyRelease(KeyEvent.VK_I);
		

		rb.keyPress(KeyEvent.VK_S);
		rb.keyRelease(KeyEvent.VK_S);
		rb.keyPress(KeyEvent.VK_H);
		rb.keyRelease(KeyEvent.VK_H);
		
		//-----To maximize the natepad------
		rb.keyPress(KeyEvent.VK_WINDOWS);
		rb.keyPress(KeyEvent.VK_UP);
		rb.keyRelease(KeyEvent.VK_UP);
		rb.keyRelease(KeyEvent.VK_WINDOWS);
		
		//-----Set mouse position--------
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double hight = screenSize.getHeight();
		
		rb.mouseMove((int) width, 0);
		rb.delay(1000);
		
		// ----click on the close button-----
		rb.mousePress(InputEvent.getMaskForButton(1));
		rb.mouseRelease(InputEvent.getMaskForButton(1));
		rb.delay(500);
		
		//-----click on the dont save button----
		rb.keyPress(KeyEvent.VK_RIGHT);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.delay(1000);
		
		//------Shutting down system-------
		rb.keyPress(KeyEvent.VK_WINDOWS);
		rb.keyRelease(KeyEvent.VK_WINDOWS);
		rb.delay(1000);
		
		rb.keyPress(KeyEvent.VK_RIGHT);
		rb.delay(100);
		rb.keyPress(KeyEvent.VK_RIGHT);
		rb.keyPress(KeyEvent.VK_DOWN);
		
		
		
		
	}

}

