import java.sql.*;
import java.util.*;

public class PR_19_4_UpdateTable
{
	public static void main(String[] args)
	{
		try {
			Scanner input = new Scanner(System.in);	
			String jdbcUrl = "jdbc:mysql://localhost:3306/testDB";
			String username = "root";
			String password = "root";
			Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
			PreparedStatement pstmt = conn.prepareStatement("UPDATE student SET first_name=? where first_name=?");
			System.out.print("Enter the current first_name: ");
			String old_fname = input.nextLine();
			System.out.print("Enter the new first_name: ");
			String new_fname = input.nextLine();
			pstmt.setString(1, new_fname);
			pstmt.setString(2, old_fname);
			int recordsUpdated = pstmt.executeUpdate();
			System.out.println("Records updated: " + recordsUpdated);
			pstmt.close();
			conn.close();
		} catch (SQLException sqe) {
			sqe.printStackTrace();
		}
	}
}
