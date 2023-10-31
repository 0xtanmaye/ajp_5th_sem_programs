/* <applet code="PR_11_2_BackgroundColorChangeApplet.class" width=500 height=400> </applet> */
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class PR_11_2_BackgroundColorChangeApplet extends Applet implements MouseListener
{
	public void init()
	{
		this.addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e)
	{
		changeBackgroundColor();
	}

	public void mouseEntered(MouseEvent e)
	{
		changeBackgroundColor();
	}

	public void mouseExited(MouseEvent e)
	{
		changeBackgroundColor();
	}

	public void mousePressed(MouseEvent e)
	{
	}

	public void mouseReleased(MouseEvent e)
	{
	}
	
	void changeBackgroundColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);

		Color randomColor = new Color(red, green, blue);
		this.setBackground(randomColor);
	}
}
