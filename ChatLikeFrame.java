import java.awt.*;
import java.awt.event.*;

class ChatFrame extends Frame {
	TextArea ta1;
	TextField tf1;
	ChatFrame() {
		/* 
		Frame frame = new Frame("Text Frame");
		frame.add(l1);
		frame.setVisible(true); 
		*/
		ta1 = new TextArea();
		ta1.setEditable(false);
		tf1 = new TextField(20);
		this.setLayout(new BorderLayout());
		this.setTitle("Text Frame");
		this.setSize(300, 300);
		this.add(ta1, BorderLayout.CENTER);
		this.add(tf1, BorderLayout.SOUTH);
		tf1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tf1.getText().equals("CLEAR") || tf1.getText().equals("clear")) {
					ta1.setText("");
				} else {
					ta1.append(tf1.getText()+"\n");
				}
				tf1.setText("");
			}
		});
		this.setVisible(true);
	}		
}			

public class ChatLikeFrame {
	public static void main(String[] args) {
		new ChatFrame();
	}
}