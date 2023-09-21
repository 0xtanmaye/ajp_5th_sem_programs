import javax.swing.*;
import java.awt.*;

class JTextAreaJFrame extends JFrame
{
	JTextAreaJFrame()
	{
		this.setTitle("JTextArea Example");
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JTextArea defaultJTextArea = new JTextArea();
		JTextArea stringJTextArea = new JTextArea("JTextArea with String");
		JTextArea rowColumnJTextArea = new JTextArea(30, 50);
		JTextArea stringWithRowColumnJTextArea = new JTextArea("JTextArea with String, row and column size", 60, 30);
		
		this.add(defaultJTextArea);
		this.add(stringJTextArea);
		this.add(rowColumnJTextArea);
		this.add(stringWithRowColumnJTextArea);
		
		this.pack();
		this.setVisible(true);
	}
}

public class JTextAreaExample
{
	public static void main(String[] args)
	{
		new JTextAreaJFrame();
	}
}