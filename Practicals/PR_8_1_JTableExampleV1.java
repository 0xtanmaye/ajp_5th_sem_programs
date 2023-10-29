import javax.swing.*;

class JTableExampleJFrame extends JFrame
{
	JTableExampleJFrame()
	{
		this.setTitle("JTable Example");
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String[] columnHeadings = {"Name Of Student", "Percentage", "Grade"};
		String[][] tableRows = {
			{"Amit", "60%", "B"},
			{"Sarthak", "85%", "Distinction"},
			{"Tanmay", "45%", "C"},
			{"Jeevan", "80%", "Distinction"},
			{"Ravan", "65%", "B"}
		};
		
		JTable studentTable = new JTable(tableRows, columnHeadings);
		JScrollPane scrollableTable = new JScrollPane(studentTable);
		this.add(scrollableTable);
		// this.add(studentTable);
		this.setVisible(true);
	}
}

public class PR_8_1_JTableExampleV1
{
	public static void main(String[] args)
	{
		new JTableExampleJFrame();
	}
}
