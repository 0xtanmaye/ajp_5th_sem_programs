import javax.swing.*;
import java.awt.event.*;

public class KeyListenerExample
{
	public static void main(String[] args)
	{
		JFrame jframe = new JFrame("Key Listener Example");
		jframe.setSize(200, 200);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jframe.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent ke)
			{
			}
			public void keyReleased(KeyEvent ke)
			{
				System.out.println("\ngetExtendedKeyCode(): " + ke.getExtendedKeyCode());
				System.out.println("getKeyChar(): " + ke.getKeyChar());
				System.out.println("getKeyCode(): " + ke.getKeyCode());
				System.out.println("ke.getKeyLocation(): " + ke.getKeyLocation());
				System.out.println("getKeyModifiersText(ke.getModifiers()): " + KeyEvent.getKeyModifiersText(ke.getModifiers()));
				System.out.println("getKeyText(ke.getKeyCode()): " + KeyEvent.getKeyText(ke.getKeyCode()));
				System.out.println("isActionKey(): " + ke.isActionKey());
				System.out.println("paramString(): " + ke.paramString());
			}
			public void keyTyped(KeyEvent ke)
			{
			}
		});
		jframe.setVisible(true);
	}
}
