import java.awt.*;
import java.awt.event.*;

public class PR_10_1_KeyPressedMessageFrame implements KeyListener
{
	Label msgLabel;
	public PR_10_1_KeyPressedMessageFrame()
	{
		Frame frame = new Frame("Key Pressed Message Frame");
		frame.setSize(400, 400);
		msgLabel = new Label();
		msgLabel.setAlignment(Label.CENTER);
		frame.add(msgLabel, BorderLayout.CENTER);
		frame.addKeyListener(this);
		frame.setVisible(true);
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
		new PR_10_1_KeyPressedMessageFrame();
	}
}
