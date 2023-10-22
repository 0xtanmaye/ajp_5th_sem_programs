import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class JComboBoxJFrame extends JFrame implements ItemListener
{
	JComboBox<String> stateComboBox;
	JLabel msgLabel;
	JComboBoxJFrame()
	{
		this.setTitle("Indian States JComboBox");
		// String states[] = {"Maharashtra", "Gujarat", "Goa", "Rajasthan"};
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(400, 300);
		// cityComboBox = new JComboBox<String>(states);
		stateComboBox = new JComboBox<String>();
		stateComboBox.addItem("Maharashtra");
		stateComboBox.addItem("Gujarat");
		stateComboBox.addItem("Goa");
		stateComboBox.addItem("Rajasthan");
		msgLabel = new JLabel();
		stateComboBox.addItemListener(this);
		this.add(stateComboBox);
		this.add(msgLabel);
		this.setVisible(true);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		msgLabel.setText("You selected: " + stateComboBox.getSelectedItem());
	}
}

public class PR_6_2_JComboBoxStatesV1
{
	public static void main(String[] args)
	{
		new JComboBoxJFrame();
	}
}
