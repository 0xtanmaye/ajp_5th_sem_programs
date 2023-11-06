import java.sql.*;

public class MySqlJdbcExample
{
	public static void main(String[] args) throws Exception
	{
		try {
			// Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");
			Statement stmt = conn.createStatement();
			stmt.execute("CREATE DATABASE testDB");
			stmt.close();
			conn.close();
		} catch (SQLException sqe) {
			sqe.printStackTrace();
		}
	}
}
