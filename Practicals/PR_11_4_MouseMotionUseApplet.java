import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/* <applet code="PR_11_4_MouseMotionUseApplet.class" width=400 height=200> </applet> */
public class PR_11_4_MouseMotionUseApplet extends Applet implements MouseMotionListener
{
	int clickCount = 0;
	Label coordinatesLabel;

	public void init()
	{
		this.setLayout(new BorderLayout());
		coordinatesLabel = new Label("Mouse Coordinates: ");
		coordinatesLabel.setAlignment(Label.CENTER);
		this.addMouseMotionListener(this);
		this.add(coordinatesLabel, BorderLayout.NORTH);
	}
	
	public void mouseDragged(MouseEvent e)
	{
		coordinatesLabel.setText("Mouse Dragged: (" + e.getX() + ", " + e.getY() + ")");
	}

	public void mouseMoved(MouseEvent e)
	{
		coordinatesLabel.setText("Mouse Moved: (" + e.getX() + ", " + e.getY() + ")");
	}
}
