import javax.swing.*;

public class PR_8_2_JTableEmployeeV2
{
	public static void main(String[] args)
	{
		JFrame jframe = new JFrame();
		// jframe.setTitle("JTable Example");
		jframe.setSize(400, 400);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String[] columnHeadings = {"ID", "NAME", "SALARY"};
		String[][] tableRows = {
			{"101", "Amit", "670000"},
			{"102", "Jai", "780000"},
			{"101", "Sachin", "700000"}
		};
		
		JTable employeeTable = new JTable(tableRows, columnHeadings);
		JScrollPane scrollableTable = new JScrollPane(employeeTable);
		jframe.add(scrollableTable);
		// jframe.add(employeeTable);
		jframe.setVisible(true);
	}
}
