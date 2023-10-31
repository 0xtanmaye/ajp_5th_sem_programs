import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PR_10_1_KeyPressedMessageJFrame implements KeyListener
{
	JLabel msgLabel;
	public PR_10_1_KeyPressedMessageJFrame()
	{
		JFrame jframe = new JFrame("Key Pressed Message Frame");
		jframe.setSize(400, 400);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// jframe.setLayout(new FlowLayout());
		msgLabel = new JLabel();
		jframe.add(msgLabel);
		jframe.addKeyListener(this);
		jframe.setVisible(true);
	}
	public void keyPressed(KeyEvent ke)
	{
		msgLabel.setText("Key Pressed");
	}
	public void keyReleased(KeyEvent ke)
	{
		msgLabel.setText("");
	}
	public void keyTyped(KeyEvent ke)
	{
	}
	public static void main(String[] args)
	{
		new PR_10_1_KeyPressedMessageJFrame();
	}
}
