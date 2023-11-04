import java.io.*;
import java.sql.*;

public class PR_18_3_CreateEmployeeTable
{
	public static void main(String[] args) throws SQLException
	{
		String filename = "Employee1.accdb";
		String dbPath = new File(filename).getAbsolutePath();
	
		Connection conn = DriverManager.getConnection("jdbc:ucanaccess://" + dbPath);
		Statement stmt = conn.createStatement();
		boolean status = stmt.execute("CREATE TABLE employee (emp_id INTEGER, emp_name TEXT(50))");
	
		System.out.println("Table 'employee' created successfully");
		stmt.close();
		conn.close();
	}
}