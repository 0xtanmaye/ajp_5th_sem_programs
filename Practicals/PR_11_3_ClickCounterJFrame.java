import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PR_11_3_ClickCounterJFrame extends JFrame implements MouseListener
{
	int clickCount = 0;
	JLabel countLabel;

	public PR_11_3_ClickCounterJFrame()
	{
		this.setTitle("Click Counter JFrame");
		this.setSize(400, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addMouseListener(this);

		countLabel = new JLabel("Click count: 0");
		countLabel.setHorizontalAlignment(JLabel.CENTER);
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
		new PR_11_3_ClickCounterJFrame();
	}
}
