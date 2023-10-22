import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PR_6_2_JComboBoxStatesV2 implements ItemListener
{
	JComboBox<String> stateComboBox;
	JLabel msgLabel;
	PR_6_2_JComboBoxStatesV2()
	{
		JFrame jframe = new JFrame("Indian States JComboBox");
		String states[] = {"Maharashtra", "Gujarat", "Goa", "Rajasthan"};
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setLayout(new FlowLayout());
		jframe.setSize(400, 300);
		stateComboBox = new JComboBox<String>(states);
		/* stateComboBox = new JComboBox<String>();
		stateComboBox.addItem("Maharashtra");
		stateComboBox.addItem("Gujarat");
		stateComboBox.addItem("Goa");
		stateComboBox.addItem("Rajasthan"); */
		msgLabel = new JLabel();
		stateComboBox.addItemListener(this);
		jframe.add(stateComboBox);
		jframe.add(msgLabel);
		jframe.setVisible(true);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		msgLabel.setText("You selected: " + stateComboBox.getSelectedItem());
	}
	public static void main(String[] args)
	{
		new PR_6_2_JComboBoxStatesV2();
	}
}
