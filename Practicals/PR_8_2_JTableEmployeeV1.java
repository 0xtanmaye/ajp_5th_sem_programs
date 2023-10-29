import javax.swing.*;

class JTableEmployeeJFrame extends JFrame
{
	JTableEmployeeJFrame()
	{
		// this.setTitle("JTable Example");
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String[] columnHeadings = {"ID", "NAME", "SALARY"};
		String[][] tableRows = {
			{"101", "Amit", "670000"},
			{"102", "Jai", "780000"},
			{"101", "Sachin", "700000"}
		};
		
		JTable employeeTable = new JTable(tableRows, columnHeadings);
		JScrollPane scrollableTable = new JScrollPane(employeeTable);
		this.add(scrollableTable);
		// this.add(employeeTable);
		this.setVisible(true);
	}
}

public class PR_8_2_JTableEmployeeV1
{
	public static void main(String[] args)
	{
		new JTableEmployeeJFrame();
	}
}
