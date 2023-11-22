import java.sql.*;
import java.util.*;

public class PR_20_4_DeleteCondition
{
	public static void main(String[] args)
	{
		try {
			String jdbcUrl = "jdbc:mysql://localhost:3306/testDB";
			String username = "root";
			String password = "root";
			// Class.forName("com.mysql.cj.jdbc.Driver"); new class driver name "com.mysql.cj.jdbc.Driver" (Not required).
			Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
			PreparedStatement pstmt = conn.prepareStatement("DELETE FROM product WHERE price>=? AND id=?");
			pstmt.setInt(1, 500);
			pstmt.setString(2, "P1234");
			int recordsDeleted = pstmt.executeUpdate();
			System.out.println("Records deleted: " + recordsDeleted);
			pstmt.close();
			conn.close();
		} catch (SQLException sqe) {
			sqe.printStackTrace();
		}
	}
}
