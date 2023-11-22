import java.sql.*;

public class PR_20_3_JackToJohn
{
	public static void main(String[] args)
	{
		try {
			String jdbcUrl = "jdbc:mysql://localhost:3306/testDB";
			String username = "root";
			String password = "root";
			// Class.forName("com.mysql.cj.jdbc.Driver"); new class driver name "com.mysql.cj.jdbc.Driver" (Not required).
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB", "root", "root");
			Statement stmt = conn.createStatement();
			int recordsUpdated = stmt.executeUpdate("UPDATE student SET first_name='John' WHERE first_name='Jack'");
			if (recordsUpdated > 0)
				System.out.println("Name updated from 'Jack' to 'John' successfully");
			else
				System.out.println("Failed to update name from 'Jack' to 'John'");

			stmt.close();
			conn.close();
		} catch (SQLException sqe) {
			sqe.printStackTrace();
		}
	}
}
