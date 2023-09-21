import javax.swing.*;
import java.awt.*;

class JTextFieldJFrame extends JFrame
{
	JTextFieldJFrame()
	{
		this.setTitle("JTextField Example");
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField defaultJTextField = new JTextField();
		JTextField stringJTextField = new JTextField("JTextField with String");
		JTextField columnSizeJTextField = new JTextField(30);
		JTextField stringWithColumnSizeJTextField = new JTextField("JTextField with String and column size", 60);
		
		this.add(defaultJTextField);
		this.add(stringJTextField);
		this.add(columnSizeJTextField);
		this.add(stringWithColumnSizeJTextField);
		
		this.pack();
		this.setVisible(true);
	}
}

public class JTextFieldExample
{
	public static void main(String[] args)
	{
		new JTextFieldJFrame();
	}
}