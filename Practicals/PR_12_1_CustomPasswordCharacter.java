import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PR_12_1_CustomPasswordCharacter
{
	public static void main(String[] args)
	{
		JFrame jframe = new JFrame("Custom Password Character");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setLayout(new FlowLayout());

		JPasswordField passwordField = new JPasswordField(15);
		passwordField.setEchoChar('#');

		JButton submitButton = new JButton("Submit");

		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String passwordText = new String(passwordField.getPassword());
				System.out.println("Entered Password: " + passwordText);
				passwordField.setText("");
			}
		});

		jframe.add(new JLabel("Enter password:"));
		jframe.add(passwordField);
		jframe.add(submitButton);
		jframe.pack();
		jframe.setVisible(true);
	}
}
