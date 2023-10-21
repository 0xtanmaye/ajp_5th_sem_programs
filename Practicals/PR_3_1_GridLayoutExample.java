import java.awt.*;

public class PR_3_1_GridLayoutExample {
	public static void main(String[] args) {
		Frame frame = new Frame("Grid Layout Example");
		GridLayout gridLayout = new GridLayout(5, 5);
		frame.setLayout(gridLayout);
		for (int i = 1; i <= 25; i++) {
			frame.add(new Button("Button " + i));
		}
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
}
