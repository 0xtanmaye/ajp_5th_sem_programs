import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/* <applet code="PR_11_3_ClickCounterApplet.class" width=400 height=200> </applet> */
public class PR_11_3_ClickCounterApplet extends Applet implements MouseListener
{
	int clickCount = 0;
	Label countLabel;

	public void init()
	{
		this.setLayout(new BorderLayout());
		countLabel = new Label("Click Count: 0");
		countLabel.setAlignment(Label.CENTER);
		this.addMouseListener(this);
		this.add(countLabel, BorderLayout.NORTH);
	}
	
	public void mousePressed(MouseEvent e)
	{
	}

	public void mouseReleased(MouseEvent e)
	{
	}

	public void mouseEntered(MouseEvent e)
	{
	}

	public void mouseExited(MouseEvent e)
	{
	}

	public void mouseClicked(MouseEvent e)
	{
		clickCount++;
		countLabel.setText("Click count: " + clickCount);
	}
}
