import java.awt.*;
import java.awt.event.*;

public class PR_13_2_DemonstrateWindowAdapter
{
	public static void main(String[] args)
	{
		Frame frame = new Frame("Demonstrate WindowAdapter");

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				System.out.println("Window Activated");
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				System.out.println("Window Deactivated");
			}
		});

		frame.setSize(300, 200);
		frame.setVisible(true);
	}
}
