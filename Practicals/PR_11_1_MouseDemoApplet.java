import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/* <APPLET CODE="PR_11_1_MouseDemoApplet" WIDTH=700 HEIGHT=500> </APPLET> */
public class PR_11_1_MouseDemoApplet extends Applet implements MouseListener
{
	Label l;
	public void init()
	{
		setLayout(null);
		l = new Label("Hello Mouse");
		l.setBounds(160, 175, 380, 150); // Increase the width to accomodate the Label text
		addMouseListener(this); // Add the MouseListener to the Applet window
		add(l);
	}
	public void mousePressed(MouseEvent e)
	{
		l.setText("Mouse Pressed no. of clicks:" + e.getClickCount() + "at position" + e.getX() + "," + e.getY());
	}
	public void mouseReleased(MouseEvent e)
	{
		l.setText("Mouse Released; # of clicks:" + e.getClickCount());
	}
	public void mouseEntered(MouseEvent e)
	{
		l.setText("Mouse Entered");
	}
	public void mouseExited(MouseEvent e)
	{
		l.setText("Mouse Exited");
	}
	public void mouseClicked(MouseEvent e)
	{
		l.setText("mouse clicked(# of clicks:" + e.getClickCount());
	}
}
