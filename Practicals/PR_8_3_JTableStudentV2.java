import javax.swing.*;

public class PR_8_3_JTableStudentV2
{
	public static void main(String[] args)
	{
		JFrame jframe = new JFrame("JTable Student");
		jframe.setSize(400, 400);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
		jframe.add(scrollableTable);
		// jframe.add(studentTable);
		jframe.setVisible(true);
	}
}
