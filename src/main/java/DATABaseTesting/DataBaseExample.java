package DATABaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		                        // Load and register driver 
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","147612");
		                       //  create connection from java app to the database
		
		Statement smt = con.createStatement();
		                       // creating the statement object
		
		ResultSet rs = smt.executeQuery("select * from employees");
		                       // send query and store it into the resultSet
		while(rs.next())
		{
			String EmpID = rs.getString(1);
			
			System.out.println("EMP ID is--"+rs.getString(1)+"EMPname is the --"+rs.getString(2));
		}
		
		
	}  
}
