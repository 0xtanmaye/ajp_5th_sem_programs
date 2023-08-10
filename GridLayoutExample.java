import java.awt.*;

class GridLFrame extends Frame {
	GridLFrame() {
		this.setLayout(new GridLayout(3, 2));
		this.setSize(300, 300);
		for (int i=1;i<=5;i++) {
			this.add(new Button("Button " + i));
		}
		this.setTitle("Grid Layout Example");
		this.setVisible(true);
	}
}

public class GridLayoutExample {
	public static void main(String[] args) {
		new GridLFrame();
	}
}		