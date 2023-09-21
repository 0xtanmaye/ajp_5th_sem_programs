import javax.swing.*;
import java.awt.*;

class JButtonJFrame extends JFrame
{
	JButtonJFrame()
	{
		// this.setSize(300, 300);
		this.setTitle("JButton Example");
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton defaultJButton = new JButton();
		JButton stringJButton = new JButton("String JButton");
		JButton iconJButton = new JButton(new ImageIcon("image.png"));
		
		this.add(defaultJButton);
		this.add(stringJButton);
		this.add(iconJButton);
		this.pack();
		this.setVisible(true);
	}
}

public class JButtonExample
{
	public static void main(String[] args)
	{
		new JButtonJFrame();
	}
}