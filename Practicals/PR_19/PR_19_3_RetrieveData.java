import java.sql.*;

public class PR_19_3_RetrieveData
{
	public static void main(String[] args)
	{
		try {
			String jdbcUrl = "jdbc:mysql://localhost:3306/testDB";
			String username = "root";
			String password = "root";
			Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM student");
			while (rs.next()) {
				int rno = rs.getInt("roll_no");
				String fname = rs.getString("first_name");
				String lname = rs.getString("last_name");
				System.out.println("Roll No: " + rno + "\tFirst Name: " + fname + "\tLast Name: " + lname);
			}
			stmt.close();
			conn.close();
		} catch (SQLException sqe) {
			sqe.printStackTrace();
		}
	}
}
