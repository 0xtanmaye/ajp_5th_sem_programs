import java.sql.*;
import java.util.Scanner;

public class PR_19_1_UpdateRowStudent
{
	public static void main(String[] args)
	{
		try {
			// Class.forName("com.mysql.cj.jdbc.Driver"); new class driver name "com.mysql.cj.jdbc.Driver" (Not required). 
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MSBTE", "root", "root");
			PreparedStatement pstmt = conn.prepareStatement("UPDATE student SET firstname=?, lastname=? WHERE roll_no = ?");
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the roll_no: ");
			int r_no = input.nextInt();
			pstmt.setInt(3, r_no);
			input.nextLine(); // Clear the buffer containing newline character after reading int
			System.out.print("Enter the firstname (new): ");
			String new_fname = input.nextLine();
			pstmt.setString(1, new_fname); 
			System.out.print("Enter the lastname (new): ");
			String new_lname = input.nextLine();
			pstmt.setString(2, new_lname); 
			int recordsUpdated = pstmt.executeUpdate();
			System.out.println("Records updated: " + recordsUpdated);
			pstmt.close();
			conn.close();
		} catch (SQLException sqe) {
			sqe.printStackTrace();
		}
	}
}
