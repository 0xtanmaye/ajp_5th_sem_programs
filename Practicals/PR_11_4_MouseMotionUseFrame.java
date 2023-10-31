import java.awt.*;
import java.awt.event.*;

public class PR_11_4_MouseMotionUseFrame extends Frame implements MouseMotionListener
{
	Label coordinatesLabel;

	public PR_11_4_MouseMotionUseFrame()
	{
		this.setTitle("Mouse Motion Use Frame");
		this.setSize(300, 200);

		coordinatesLabel = new Label("Mouse Coordinates: ");
		coordinatesLabel.setAlignment(Label.CENTER);

		this.addMouseMotionListener(this);
		this.add(coordinatesLabel, BorderLayout.NORTH);
		this.setVisible(true);
	}

	public void mouseDragged(MouseEvent e)
	{
		coordinatesLabel.setText("Mouse Dragged: (" + e.getX() + ", " + e.getY() + ")");
	}

	public void mouseMoved(MouseEvent e)
	{
		coordinatesLabel.setText("Mouse Moved: (" + e.getX() + ", " + e.getY() + ")");
	}

	public static void main(String[] args)
	{
		new PR_11_4_MouseMotionUseFrame();
	}
}
