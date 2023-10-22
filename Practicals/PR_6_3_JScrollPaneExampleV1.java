import javax.swing.*;
import java.awt.*;

class JScrollPaneJFrame extends JFrame
{
	JScrollPaneJFrame()
	{
		this.setLayout(new BorderLayout());
		this.setTitle("JScrollPane Example");
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextArea textArea = new JTextArea(10, 20);
		JScrollPane scrollableTextArea = new JScrollPane(textArea);
		
		scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		this.add(scrollableTextArea);
		this.setVisible(true);
	}
}

public class PR_6_3_JScrollPaneExampleV1
{
	public static void main(String[] args)
	{
		new JScrollPaneJFrame();
	}
}
