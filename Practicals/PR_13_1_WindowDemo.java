import java.awt.*;
import java.awt.event.*;

public class PR_13_1_WindowDemo
{
	Frame f;
	PR_13_1_WindowDemo()
	{
		f = new Frame("Window Adapter");
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		}); // Add the missing ')'
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true); // change setVisible(false) to setVisible(true)
	}
	public static void main(String[] args)
	{
		new PR_13_1_WindowDemo();
	}
}
