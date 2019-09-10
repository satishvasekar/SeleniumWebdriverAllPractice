package Fillo_Class_excel;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class SelectWithWhere {

	public static void main(String[] args) throws FilloException {
		
Fillo fillo = new Fillo();
		
		Connection conection = fillo.getConnection("D:\\Satish Softaware Backup\\Eclipse Worspace\\SeleniumWebDriver\\src\\main\\java\\Fillo_Class_excel\\FilloFileExcel.xlsx");
		
       // String StrQuery = "select * from DATA where firstname='satish'";
        
        Recordset rst = conection.executeQuery("select * from DATA").where("firstname='satish'");
        
        while(rst.next()){
        	System.out.println(rst.getField("firstname")+"--"+rst.getField("lastname")+"--"+rst.getField("compony")+"--"+rst.getField("product"));
        }
	}
	
}
