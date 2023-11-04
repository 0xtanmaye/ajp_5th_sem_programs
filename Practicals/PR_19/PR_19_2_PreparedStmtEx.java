import java.sql.*;

public class PR_19_2_PreparedStmtEx
{
	public static void main(String[] args)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // new class driver name "com.mysql.cj.jdbc.Driver" 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB", "root", "root"); //keep "" empty if not given during installation
			PreparedStatement stmt = con.prepareStatement("insert into student values(?, ?, ?)");
			stmt.setInt(1, 101);
			//1 specifies the first paramaeter(1st ? symbol) in the query
			stmt.setString(2, "Abhishek");
			//2 specifies the second parameter(2nd ? symbol) in the query
			stmt.setString(3, "Yadav");
			//3 specifies the thired parameter(3rd ? symbol) in the query
			int i = stmt.executeUpdate();
			System.out.println(i + " records inserted");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
