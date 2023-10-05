import java.awt.*;
import java.awt.event.*;

class FileDialogFrame extends Frame implements ActionListener {
	Button sD, lD; 
	FileDialogFrame() {
		this.setSize(200, 200);
		this.setTitle("File Dialog Example");
		this.setLayout(new FlowLayout());
		sD = new Button("Save");
		lD = new Button("Load");
		this.add(sD);
		this.add(lD);
		sD.addActionListener(this);
		lD.addActionListener(this);
		
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == sD) {
			FileDialog sFD = new FileDialog(this, sD.getLabel(), FileDialog.SAVE);
			sFD.setVisible(true);
		} else if (e.getSource() == lD) {
			FileDialog lFD = new FileDialog(this, lD.getLabel(), FileDialog.LOAD);
			lFD.setVisible(true);
		}
	}	
}

public class FileDialogExample {
	public static void main(String[] args) {
		new FileDialogFrame();
	}
}
