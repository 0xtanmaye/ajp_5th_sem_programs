import java.awt.*;

class LabelFrame extends Frame {
	LabelFrame() {
		/* 
		Frame frame = new Frame("Text Frame");
		frame.add(l1);
		frame.setVisible(true); 
		*/
		Label l1 = new Label("Welcome!");
		this.setLayout(new BorderLayout());
		this.setTitle("Frame with Label");
		this.setSize(300, 300);
		this.add(l1);
		this.setVisible(true);
	}
}

public class LabelExample {
	public static void main(String[] args) {
		new LabelFrame();
	}
}