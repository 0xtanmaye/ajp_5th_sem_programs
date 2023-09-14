import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class JComboBoxJFrame extends JFrame implements ItemListener
{
	JComboBox countryComboBox;
	JLabel msgLabel;
	JComboBoxJFrame()
	{
		this.setTitle("Countries JComboBox");
		// String countries[] = {"India", "China", "Pakistan", "Bangladesh"};
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(400, 300);
		// cityComboBox = new JComboBox(countries);
		countryComboBox = new JComboBox();
		countryComboBox.addItem("India");
		countryComboBox.addItem("China");
		countryComboBox.addItem("Pakistan");
		countryComboBox.addItem("Bangladesh");
		msgLabel = new JLabel();
		countryComboBox.addItemListener(this);
		this.add(countryComboBox);
		this.add(msgLabel);
		this.setVisible(true);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		msgLabel.setText("You selected: " + countryComboBox.getSelectedItem());
	}
}

public class PR_6_3_JComboBoxCountries
{
	public static void main(String[] args)
	{
		new JComboBoxJFrame();
	}
}