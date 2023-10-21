import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PR_4_1_CardLayoutExample extends JFrame implements ActionListener {
	CardLayout card;
	JButton b1, b2, b3;
	Container c;
	PR_4_1_CardLayoutExample() {
		c = getContentPane();
		card = new CardLayout(40, 30);
		//create CardLayout object with 40 horizontal space and 30 vertical space
		c.setLayout(card);
		b1 = new JButton("Apple");
		b2 = new JButton("Boy");
		b3 = new JButton("Cat");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		c.add("a", b1);
		c.add("b", b2);
		c.add("c", b3);
	}
	public void actionPerformed(ActionEvent e) {
		card.next(c);
	}
	public static void main(String[] args) {
		PR_4_1_CardLayoutExample c1 = new PR_4_1_CardLayoutExample();
		c1.setSize(400, 400);
		c1.setVisible(true);
		c1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
