package Fillo_Class_excel;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ReadWriteExcelFilloFile {

	public static void main(String[] args) throws FilloException {
		
		Fillo fillo = new Fillo();
		
		Connection conection = fillo.getConnection("D:\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\main\\java\\Fillo_Class_excel\\FilloFileExcel.xlsx");
		
        String StrQuery = "select * from DATA";
        
        Recordset rst = conection.executeQuery(StrQuery);
        
        while(rst.next()){
        	System.out.println(rst.getField("firstname"));
        }
        rst.moveLast();
        
        System.out.println(rst.getField("firstname"));
        
	}
}
