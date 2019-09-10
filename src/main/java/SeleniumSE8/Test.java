package SeleniumSE8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws Exception  {

		File src = new File("D:\\Satish Softaware Backup\\Backup\\ExelData\\TestData.xlsx");

		FileInputStream Fis = new FileInputStream(src);
				
		XSSFWorkbook ws = new XSSFWorkbook(Fis);
		
		XSSFSheet sheet1 = ws.getSheetAt(0);
		//List<String> l1 = (List<String>) sheet1.getCellComment(1,1);
		//System.out.println(l1);
		

	}

}
