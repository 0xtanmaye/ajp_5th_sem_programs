import java.sql.*;

public class PR_20_2_UpdateQuery
{
	public static void main(String[] args)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // new class driver name "com.mysql.cj.jdbc.Driver"
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB", "root", "root");
			PreparedStatement st = con.prepareStatement("update student set roll_no=3 where first_name='Abhishek'");
			st.executeUpdate();
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
