import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PR_10_2_SpecialKeysJFrame implements KeyListener
{	
	JLabel label;
	public PR_10_2_SpecialKeysJFrame()
	{
		JFrame jframe = new JFrame("Special Keys JFrame");
		jframe.setSize(400, 200);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setLayout(new FlowLayout());

		label = new JLabel();
		jframe.add(label);

		jframe.addKeyListener(this);
		jframe.setVisible(true);
	}

	public void keyTyped(KeyEvent ke)
	{
	}

	public void keyPressed(KeyEvent ke)
	{
		String message = "Key Pressed: " + KeyEvent.getKeyText(ke.getKeyCode());
		label.setText(message);
	}

	public void keyReleased(KeyEvent ke)
	{
		label.setText("");
	}

	public static void main(String[] args)
	{
		new PR_10_2_SpecialKeysJFrame();
	}
}
