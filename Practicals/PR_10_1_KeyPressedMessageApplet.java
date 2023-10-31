/* <applet code="PR_10_1_KeyPressedMessageApplet.class" height="400" width="400"> </applet> */
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class PR_10_1_KeyPressedMessageApplet extends Applet implements KeyListener
{
	String msg = "";
	public void init()
	{
		this.addKeyListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawString(msg, 150, 200);
	}
	public void keyPressed(KeyEvent ke)
	{
		msg = "Key Pressed";
		repaint();
	}
	public void keyReleased(KeyEvent ke)
	{
		msg = "";
		repaint();
	}
	public void keyTyped(KeyEvent ke)
	{
	}
}
