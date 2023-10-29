import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PR_6_1_JComboBoxExampleV2 implements ItemListener
{
	JComboBox<String> cityComboBox;
	JLabel msgLabel;
	public PR_6_1_JComboBoxExampleV2()
	{
		JFrame jframe = new JFrame();
		// jframe.setTitle("JComboBox Example");
		String[] cities = {"Solapur", "Pune", "Banglore", "Mumbai"};
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setLayout(new FlowLayout());
		jframe.setSize(400, 300);
		cityComboBox = new JComboBox<String>(cities);
		/* cityComboBox = new JComboBox<String>();
		cityComboBox.addItem("Solapur");
		cityComboBox.addItem("Pune");
		cityComboBox.addItem("Banglore");
		cityComboBox.addItem("Mumbai"); */
		msgLabel = new JLabel();
		cityComboBox.addItemListener(this);
		jframe.add(cityComboBox);
		jframe.add(msgLabel);
		jframe.setVisible(true);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		msgLabel.setText("You are in " + cityComboBox.getSelectedItem());
	}
	public static void main(String[] args)
	{
		new PR_6_1_JComboBoxExampleV2();
	}
}
