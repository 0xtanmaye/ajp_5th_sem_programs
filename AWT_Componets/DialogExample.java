import java.awt.*;
import java.awt.event.*;

class DialogFrame extends Frame implements ActionListener {
	Button hDB, bDB;
	DialogFrame() {
		this.setSize(200, 200);
		this.setTitle("Dialog Example");
		this.setLayout(new FlowLayout());
		hDB = new Button("Hello");
		bDB = new Button("Bye");
		this.add(hDB);
		this.add(bDB);
		hDB.addActionListener(this);
		bDB.addActionListener(this);
		
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == hDB) {
			Dialog hD = new Dialog(this, hDB.getLabel(), false);
			hD.setVisible(true);
		} else if (e.getSource() == bDB) {
			Dialog bD = new Dialog(this, bDB.getLabel(), false);
			bD.setVisible(true);
		}
	}	
}

public class DialogExample {
	public static void main(String[] args) {
		new DialogFrame();
	}
}
