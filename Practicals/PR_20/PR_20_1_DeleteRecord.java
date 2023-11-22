import java.sql.*;
import java.util.*;

public class PR_20_1_DeleteRecord
{
	public static void main(String[] args)
	{
		try {
			String jdbcUrl = "jdbc:mysql://localhost:3306/testDB";
			String username = "root";
			String password = "root";
			// Class.forName("com.mysql.cj.jdbc.Driver"); new class driver name "com.mysql.cj.jdbc.Driver" (Not required).
			Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
			PreparedStatement pstmt = conn.prepareStatement("DELETE FROM student WHERE roll_no=?");
			Scanner input = new Scanner(System.in);	
			System.out.print("Enter the roll_no of the record to delete: ");
			int r_no = input.nextInt();
			pstmt.setInt(1, r_no);
			int recordsDeleted = pstmt.executeUpdate();
			System.out.println("Records deleted: " + recordsDeleted);
			pstmt.close();
			conn.close();
		} catch (SQLException sqe) {
			sqe.printStackTrace();
		}
	}
}
