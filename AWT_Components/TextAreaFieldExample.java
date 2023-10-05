import java.awt.*;
import java.awt.event.*;


class TextFrame extends Frame {
	TextArea ta1;
	TextField tf1;
	TextFrame() {
		/* 
		Frame frame = new Frame("Text Frame");
		frame.add(l1);
		frame.setVisible(true); 
		*/
		ta1 = new TextArea();
		ta1.setEditable(true);
		tf1 = new TextField(20);
		this.setLayout(new BorderLayout());
		this.setTitle("Text Frame");
		this.setSize(300, 300);
		this.add(ta1, BorderLayout.CENTER);
		this.add(tf1, BorderLayout.SOUTH);
		this.setVisible(true);
	}		
}			

public class TextAreaFieldExample {
	public static void main(String[] args) {
		TextFrame tf = new TextFrame();
	}
}