import java.io.*;
import java.util.*;
import java.sql.*;

public class JdbcPreparedStatementExample
{
	public static void main(String[] args) throws SQLException
	{
		String filename = "TestDB.accdb";
		String dbPath = new File(filename).getAbsolutePath();
		
		Connection conn = DriverManager.getConnection("jdbc:ucanaccess://" + dbPath);
		System.out.print("Enter the ID:");
		Scanner input = new Scanner(System.in);
		int inId = input.nextInt();
		PreparedStatement pStmt = conn.prepareStatement("Select * from TestTB where id=?");
		pStmt.setInt(1, inId);
		ResultSet rs = pStmt.executeQuery();
		while (rs.next())
			System.out.println("ID: " + rs.getInt(1) + " SName: " + rs.getString(2));
		
		pStmt.close();
		conn.close();
	}
}