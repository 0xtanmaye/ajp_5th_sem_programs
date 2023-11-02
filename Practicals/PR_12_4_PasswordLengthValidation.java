import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PR_12_4_PasswordLengthValidation
{
	public static void main(String[] args)
	{
		JFrame jframe = new JFrame("Password Length Validation");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setLayout(new FlowLayout());

		JPasswordField passwordField = new JPasswordField(15);
		JButton submitButton = new JButton("Submit");

		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String passwordText = new String(passwordField.getPassword());
				if (passwordText.length() < 6) {
					JOptionPane.showMessageDialog(jframe, "Password Length must be >6 characters", "Error", JOptionPane.ERROR_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(jframe, "Password accepted!", "Success", JOptionPane.INFORMATION_MESSAGE);
				}
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
