import java.sql.*;
import java.util.*;

public class PR_20_1_DeleteRecord
{
	public static void main(String[] args)
	{
		try {
			Scanner input = new Scanner(System.in);	
			String jdbcUrl = "jdbc:mysql://localhost:3306/testDB";
			String username = "root";
			String password = "root";
			Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
			PreparedStatement pstmt = conn.prepareStatement("DELETE FROM student where roll_no=?");
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
