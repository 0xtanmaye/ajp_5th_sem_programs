// Create DSN Named as MSBTE using Administrative tool from Control Panel.
// This program uses type 1 driver JDBC ODBC bridge.

import java.sql.*;
import java.io.*;

public class PR_18_2_JdbcDemo
{
	public static void main(String[] args)
	{
		try {
			/* Can't use JDBC ODBC driver in the newer versions of JDK
			DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
			System.out.println(" Driver loaded");
			String url = "jdbc:odbc:MSBTE"; */
			String filename = "Student2.accdb";
			String dbPath = new File(filename).getAbsolutePath();
			
			// Optional steps
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			DriverManager.registerDriver(new net.ucanaccess.jdbc.UcanaccessDriver());
			System.out.println(" Driver loaded");
			
			String url = "jdbc:ucanaccess://" + dbPath;
			Connection cn = DriverManager.getConnection(url);
			System.out.println("Connection to the database created");
			Statement st = cn.createStatement();
			String str = "select * from student";
			ResultSet rs = st.executeQuery(str);
			String text = " ";
			System.out.println("Roll Number \t Name");
			while (rs.next()) {
				text = text + rs.getInt(1) + "\t" + rs.getString(2) + "\n";
			}
			System.out.print(text);
			st.close();
			cn.close();
		} catch (SQLException s) {
			System.out.println("sql error");
			s.printStackTrace();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}
}