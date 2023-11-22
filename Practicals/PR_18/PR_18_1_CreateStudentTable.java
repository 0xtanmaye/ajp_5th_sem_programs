import java.io.*;
import java.sql.*;

public class PR_18_1_CreateStudentTable
{
	public static void main(String[] args) throws SQLException
	{
		String filename = "Student1.accdb";
		String dbPath = new File(filename).getAbsolutePath();
	
		Connection conn = DriverManager.getConnection("jdbc:ucanaccess://" + dbPath);
		Statement stmt = conn.createStatement();
		boolean status = stmt.execute("CREATE TABLE Student (Roll_No INTEGER, First_Name TEXT(50), Last_Name TEXT(50))");
		System.out.println("Table 'Student' created successfully");
		
		int rs = stmt.executeUpdate("INSERT INTO Student VALUES(1, 'John', 'Doe')");
		if (rs != 0)
			System.out.println("Record inserted successfully");
		else
			System.err.println("Record could not be inserted");
		
		stmt.close();
		conn.close();
	}
}
