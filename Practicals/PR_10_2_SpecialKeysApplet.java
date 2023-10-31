/* <applet code="PR_10_2_SpecialKeysApplet.class" height="200" width="400"> </applet> */
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class PR_10_2_SpecialKeysApplet extends Applet implements KeyListener
{
	String msg = "";
	public void init()
	{
		this.addKeyListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawString(msg, 130, 100);
	}
	public void keyPressed(KeyEvent ke)
	{
		msg = "Key Pressed: " + KeyEvent.getKeyText(ke.getKeyCode());
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
