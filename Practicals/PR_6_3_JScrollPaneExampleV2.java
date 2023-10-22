import javax.swing.*;
import java.awt.*;

public class PR_6_3_JScrollPaneExampleV2
{
	public static void main(String[] args)
	{
		JFrame jframe = new JFrame("JScrollPane Example");
		jframe.setLayout(new BorderLayout());
		jframe.setSize(400, 400);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextArea textArea = new JTextArea(10, 20);
		JScrollPane scrollableTextArea = new JScrollPane(textArea);
		
		scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		jframe.add(scrollableTextArea);
		jframe.setVisible(true);
	}
}
