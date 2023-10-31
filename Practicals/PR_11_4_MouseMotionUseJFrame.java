import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PR_11_4_MouseMotionUseJFrame extends JFrame implements MouseMotionListener
{
	JLabel coordinatesLabel;

	public PR_11_4_MouseMotionUseJFrame()
	{
		this.setTitle("Mouse Motion Use JFrame");
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		coordinatesLabel = new JLabel("Mouse Coordinates: ");
		coordinatesLabel.setHorizontalAlignment(JLabel.CENTER);

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
		new PR_11_4_MouseMotionUseJFrame();
	}
}
