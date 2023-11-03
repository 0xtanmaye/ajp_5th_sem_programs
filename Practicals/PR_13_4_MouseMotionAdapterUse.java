import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PR_13_4_MouseMotionAdapterUse extends JFrame
{
	JLabel coordinatesLabel;

	public PR_13_4_MouseMotionAdapterUse()
	{
		this.setTitle("MouseMotionAdapter Use");
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		coordinatesLabel = new JLabel("Mouse Coordinates: ");
		coordinatesLabel.setHorizontalAlignment(JLabel.CENTER);

		this.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				coordinatesLabel.setText("Mouse Dragged: (" + e.getX() + ", " + e.getY() + ")");
			}
		});

		this.add(coordinatesLabel, BorderLayout.NORTH);
		this.setVisible(true);
	}

	public static void main(String[] args)
	{
		new PR_13_4_MouseMotionAdapterUse();
	}
}
