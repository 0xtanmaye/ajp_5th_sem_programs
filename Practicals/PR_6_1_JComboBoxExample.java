import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class JComboBoxJFrame extends JFrame implements ItemListener
{
	JComboBox cityComboBox;
	JLabel msgLabel;
	JComboBoxJFrame()
	{
		// this.setTitle("JComboBox Example");
		// String cities[] = {"Solapur", "Pune", "Banglore", "Mumbai"};
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(400, 300);
		// cityComboBox = new JComboBox(cities);
		cityComboBox = new JComboBox();
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

public class PR_6_1_JComboBoxExample
{
	public static void main(String[] args)
	{
		new JComboBoxJFrame();
	}
}