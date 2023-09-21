import javax.swing.*;
import java.awt.*;

class JLabelJFrame extends JFrame
{
	JLabelJFrame()
	{
		// this.setSize(300, 300);
		this.setTitle("JLabel Example");
		this.setLayout(new GridLayout(4, 1));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel defaultJLabel = new JLabel();
		JLabel stringJLabel = new JLabel("String JLabel");
		JLabel iconJLabel = new JLabel(new ImageIcon("image.png"));
		JLabel stringWithIconJLabel = new JLabel("String with Icon JLabel", new ImageIcon("image.png"), JLabel.CENTER);
		
		this.add(defaultJLabel);
		this.add(stringJLabel);
		this.add(iconJLabel);
		this.add(stringWithIconJLabel);
		
		this.pack();
		this.setVisible(true);
	}
}

public class JLabelExample
{
	public static void main(String[] args)
	{
		new JLabelJFrame();
	}
}