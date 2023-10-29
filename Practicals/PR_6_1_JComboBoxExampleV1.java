import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class JComboBoxExampleJFrame extends JFrame implements ItemListener
{
	JComboBox<String> cityComboBox;
	JLabel msgLabel;
	JComboBoxExampleJFrame()
	{
		// this.setTitle("JComboBox Example");
		// String cities[] = {"Solapur", "Pune", "Banglore", "Mumbai"};
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(400, 300);
		// cityComboBox = new JComboBox<String>(cities);
		cityComboBox = new JComboBox<String>();
		cityComboBox.addItem("Solapur");
		cityComboBox.addItem("Pune");
		cityComboBox.addItem("Banglore");
		cityComboBox.addItem("Mumbai");
		msgLabel = new JLabel();
		cityComboBox.addItemListener(this);
		this.add(cityComboBox);
		this.add(msgLabel);
		this.setVisible(true);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		msgLabel.setText("You are in " + cityComboBox.getSelectedItem());
	}
}

public class PR_6_1_JComboBoxExampleV1
{
	public static void main(String[] args)
	{
		new JComboBoxExampleJFrame();
	}
}
