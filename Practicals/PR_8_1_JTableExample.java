import javax.swing.*;
import java.awt.*;

class JTableJFrame extends JFrame
{
	JTableJFrame()
	{
		this.setLayout(new FlowLayout());
		this.setTitle("JTable Example");
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String[] columnHeadings = {"Name Of Student", "Percentage", "Grade"};
		String[][] tableRows = {
			{"Amit", "60%", "B"},
			{"Sarthak", "85%", "Distinction"},
			{"Tanmay", "45%", "C"},
			{"Jeevan", "80%", "Distinction"},
			{"Ravan", "65%", "B"},
			{"Durgesh", "82%", "Distinction"},
			{"Shreyas", "85%", "Distinction"},
			{"Om", "90%", "Distinction"},
			{"Roshan", "75%", "A"},
			{"Gaurav", "88%", "Distinction"}
		};
		
		JTable studentTable = new JTable(tableRows, columnHeadings);
		JScrollPane scrollableTable = new JScrollPane(studentTable);
		this.add(scrollableTable);
		// this.add(studentTable);
		this.setVisible(true);
	}
}

public class PR_8_1_JTableExample
{
	public static void main(String[] args)
	{
		new JTableJFrame();
	}
}