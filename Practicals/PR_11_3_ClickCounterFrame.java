import java.awt.*;
import java.awt.event.*;

public class PR_11_3_ClickCounterFrame extends Frame implements MouseListener
{
	int clickCount = 0;
	Label countLabel;

	public PR_11_3_ClickCounterFrame()
	{
		this.setTitle("Click Counter Frame");
		this.setSize(400, 200);
		this.addMouseListener(this);

		countLabel = new Label("Click count: 0");
		countLabel.setAlignment(Label.CENTER);
		this.add(countLabel, BorderLayout.NORTH);
		this.setVisible(true);
	}

	public void mouseClicked(MouseEvent e)
	{
		clickCount++;
		countLabel.setText("Click count: " + clickCount);
	}

	public void mouseEntered(MouseEvent e)
	{
	}

	public void mouseExited(MouseEvent e)
	{
	}

	public void mousePressed(MouseEvent e)
	{
	}

	public void mouseReleased(MouseEvent e)
	{
	}

	public static void main(String[] args)
	{
		new PR_11_3_ClickCounterFrame();
	}
}
