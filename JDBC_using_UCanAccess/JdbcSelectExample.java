import java.io.*;
import java.sql.*;

public class JdbcSelectExample
{
	public static void main(String[] args) throws SQLException
	{
		String filename = "TestDB.accdb";
		String dbPath = new File(filename).getAbsolutePath();
		
		Connection conn = DriverManager.getConnection("jdbc:ucanaccess://" + dbPath);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from TestTB");
		while (rs.next())
			System.out.println(rs.getString(2));
		
		rs.close();
		conn.close();
	}
}