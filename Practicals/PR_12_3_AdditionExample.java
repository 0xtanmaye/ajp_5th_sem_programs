import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PR_12_3_AdditionExample
{
	public static void main(String[] args)
	{
		JFrame jframe = new JFrame("Addition Example");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(250, 150);
		jframe.setLayout(new FlowLayout());

		JTextField num1Field = new JTextField(10);
		JTextField num2Field = new JTextField(10);

		JButton addButton = new JButton("Add");
		JLabel resultLabel = new JLabel("Result: ");

		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double num1 = Double.parseDouble(num1Field.getText());
					double num2 = Double.parseDouble(num2Field.getText());
					double result = num1 + num2;
					resultLabel.setText("Result: " + result);
				} catch (NumberFormatException ex) {
					resultLabel.setText("Result: Invalid input");
				}
			}
		});

		jframe.add(new JLabel("Number 1: "));
		jframe.add(num1Field);
		jframe.add(new JLabel("Number 2: "));
		jframe.add(num2Field);
		jframe.add(addButton);
		jframe.add(resultLabel);

		jframe.setVisible(true);
	}
}
