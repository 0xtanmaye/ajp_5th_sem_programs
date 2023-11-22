import java.io.*;
import java.sql.*;

public class PR_18_4_DisplayStudentTable
{
	public static void main(String[] args) throws SQLException
	{
		String filename = "Student3.accdb";
		String dbPath = new File(filename).getAbsolutePath();
		
		Connection conn = DriverManager.getConnection("jdbc:ucanaccess://" + dbPath);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM [student table] WHERE Percentage > 70");
		System.out.println("Roll Number\tName");
		while (rs.next())
			System.out.println(rs.getInt(1) + "\t\t" + rs.getString(2));
		
		rs.close();
		conn.close();
	}
}
