import java.awt.*;
import java.awt.event.*;

public class PR_11_2_BackgroundColorChangeFrame extends Frame implements MouseListener
{
	public PR_11_2_BackgroundColorChangeFrame()
	{
		this.setTitle("Background Color Change Frame");
		this.setSize(500, 400);
		this.addMouseListener(this);
		this.setVisible(true);
	}
	
	public void mouseClicked(MouseEvent me)
	{
		changeBackgroundColor();
	}

	public void mouseEntered(MouseEvent me)
	{
		changeBackgroundColor();
	}

	public void mouseExited(MouseEvent me)
	{
		changeBackgroundColor();
	}

	public void mousePressed(MouseEvent me)
	{
	}
	
	public void mouseReleased(MouseEvent me)
	{
	}

	public void changeBackgroundColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);

		Color randomColor = new Color(red, green, blue);
		this.setBackground(randomColor);
	}

	public static void main(String[] args)
	{
		new PR_11_2_BackgroundColorChangeFrame();
	}
}
