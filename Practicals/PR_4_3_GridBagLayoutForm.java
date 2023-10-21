import java.awt.*;
import javax.swing.*;

public class PR_4_3_GridBagLayoutForm {
	public static void main(String[] args) {
		JFrame jframe = new JFrame("GridBagLayout in Java Example");
		jframe.setSize(400, 300);
		jframe.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(5, 0, 0, 0);
		jframe.add(new Label("Name"), c);
		c.gridx = 1;
		jframe.add(new TextField(10), c);
		c.gridy = 1;
		c.gridx = 0;
		jframe.add(new Label("Comments"), c);
		c.gridx = 1;
		jframe.add(new TextArea(6, 14), c);
		c.gridy = 2;
		c.gridx = 1;
		jframe.add(new Button("Submit"), c);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
