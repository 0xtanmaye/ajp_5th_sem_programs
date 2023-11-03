import java.awt.*;
import java.awt.event.*;

public class WindowListenerExample
{
	public static void main(String[] args)
	{
		Frame frame = new Frame("WindowListener Example");

		frame.addWindowListener(new WindowListener() {
			@Override
			public void windowActivated(WindowEvent e) {
				System.out.println("Window Activated");
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				System.out.println("Window Deactivated");
			}

			@Override
			public void windowIconified(WindowEvent e) {
				System.out.println("Window Iconified");
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				System.out.println("Window Deiconified");
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				System.out.println("Window Closed");
			}
			
			@Override
			public void windowOpened(WindowEvent e) {
				System.out.println("Window Opened");
			}

			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("Window Closing");
				frame.dispose();
			}
		});

		frame.setSize(300, 200);
		frame.setVisible(true);
	}
}
