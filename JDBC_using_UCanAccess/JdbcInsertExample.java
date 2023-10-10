import java.io.*;
import java.sql.*;

public class JdbcInsertExample
{
	public static void main(String[] args) throws SQLException
	{
		String filename = "TestDB.accdb";
		String dbPath = new File(filename).getAbsolutePath();
		
		Connection conn = DriverManager.getConnection("jdbc:ucanaccess://" + dbPath);
		Statement stmt = conn.createStatement();
		int rs = stmt.executeUpdate("Insert into TestTB values(5, 'NotTest')");
		if (rs != 0)
			System.out.println("Record inserted successfully");
		else
			System.err.println("Record could not be inserted");
		
		conn.close();
	}
}