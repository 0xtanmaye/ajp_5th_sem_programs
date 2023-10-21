import java.awt.*;
import javax.swing.*;

public class PR_4_2_GridBagLayoutExample {
	public static void main(String[] args) {
		JFrame jframe = new JFrame("GridBag Layout Example");
		jframe.setSize(400, 400);
		jframe.setLayout(new GridBagLayout());

		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridy = 0;
		c.gridx = 0;
		jframe.add(new JButton("Button One"), c);
		c.gridx = 1;
		jframe.add(new JButton("Button Two"), c);
		c.fill = GridBagConstraints.BOTH;
		c.ipady = 20;
		c.gridy = 1;
		c.gridx = 0;
		jframe.add(new JButton("Button Three"), c);
		c.gridx = 1;
		jframe.add(new JButton("Button Four"), c);
		c.gridy = 3;
		c.gridx = 0;
		c.gridwidth = GridBagConstraints.REMAINDER;
		jframe.add(new JButton("Button Five"), c);

		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
