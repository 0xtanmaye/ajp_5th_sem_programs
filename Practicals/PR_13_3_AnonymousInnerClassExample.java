import javax.swing.*;
import java.awt.event.*;

public class PR_13_3_AnonymousInnerClassExample
{
	public static void main(String[] args)
	{
		JFrame jframe = new JFrame("Anonymous Inner Class Example");
		JButton button = new JButton("Click Me");

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(jframe, "Button clicked!");
			}
		});

		jframe.add(button);
		jframe.setSize(300, 200);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setLayout(new java.awt.FlowLayout());
		jframe.setVisible(true);
	}
}
