import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PR_12_2_UserAuthenticationExample
{
	public static void main(String[] args)
	{
		JFrame jframe = new JFrame("User Authentication Example");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(300, 150);
		jframe.setLayout(new FlowLayout());

		JTextField usernameField = new JTextField(15);
		JPasswordField passwordField = new JPasswordField(15);
		JButton loginButton = new JButton("Login");

		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = usernameField.getText();
				String password = new String(passwordField.getPassword());

				if (username.equals("username") && password.equals("password")) {
					JOptionPane.showMessageDialog(jframe, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(jframe, "Login failed. Please check your credentials.", "Error", JOptionPane.ERROR_MESSAGE);
				}
				passwordField.setText("");
			}
		});

		jframe.add(new JLabel("Username: "));
		jframe.add(usernameField);
		jframe.add(new JLabel("Password: "));
		jframe.add(passwordField);
		jframe.add(loginButton);

		jframe.setVisible(true);
	}
}
