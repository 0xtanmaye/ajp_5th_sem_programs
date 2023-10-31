import java.awt.*;
import java.awt.event.*;

public class PR_10_2_SpecialKeysFrame implements KeyListener
{	
	Label label;
	public PR_10_2_SpecialKeysFrame()
	{
		Frame frame = new Frame("Special Keys Frame");
		frame.setSize(400, 200);

		label = new Label();
		label.setAlignment(Label.CENTER);
		frame.add(label, BorderLayout.CENTER);

		frame.addKeyListener(this);
		frame.setVisible(true);
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
		new PR_10_2_SpecialKeysFrame();
	}
}
