import java.awt.*;

class BorderLFrame extends Frame {
	BorderLFrame() {
		this.setLayout(new BorderLayout());
		this.setSize(300, 300);
		this.add(new Button("North"), BorderLayout.NORTH);
		this.add(new Button("South"), BorderLayout.SOUTH);
		this.add(new Button("East"), BorderLayout.EAST);
		this.add(new Button("West"), BorderLayout.WEST);
		this.add(new Button("Center"), BorderLayout.CENTER);
		this.setTitle("Border Layout Example");
		this.setVisible(true);
	}
}

public class BorderLayoutExample {
	public static void main(String[] args) {
		new BorderLFrame();
	}
}