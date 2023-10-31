import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PR_10_3_MultiplyNumbersJFrame implements ActionListener
{
	JTextField num1Field, num2Field;
	JButton multiplyButton;
	JLabel resultLabel;
	public PR_10_3_MultiplyNumbersJFrame()
	{
		JFrame jframe = new JFrame("Multiply Numbers JFrame");
		jframe.setSize(300, 150);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setLayout(new FlowLayout());

		num1Field = new JTextField(10);
		num2Field = new JTextField(10);
		multiplyButton = new JButton("Multiply");
		resultLabel = new JLabel("Result: ");

		multiplyButton.addActionListener(this);

		jframe.add(new JLabel("Enter Number 1:"));
		jframe.add(num1Field);
		jframe.add(new JLabel("Enter Number 2:"));
		jframe.add(num2Field);
		jframe.add(multiplyButton);
		jframe.add(resultLabel);
		jframe.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == multiplyButton) {
			try {
				double num1 = Double.parseDouble(num1Field.getText());
				double num2 = Double.parseDouble(num2Field.getText());
				double product = num1 * num2;
				resultLabel.setText("Result: " + product);
			} catch (NumberFormatException ex) {
				resultLabel.setText("Result: Invalid input");
			}
		}
	}

	public static void main(String[] args)
	{
		new PR_10_3_MultiplyNumbersJFrame();
	}
}
