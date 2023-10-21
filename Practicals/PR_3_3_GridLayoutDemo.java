import java.awt.*;

public class PR_3_3_GridLayoutDemo {
	public static void main(String[] args) {
		Frame frame = new Frame("GridLayout Demo");
		frame.setLayout(new GridLayout(3, 2, 4, 4));
		frame.setSize(300, 300);
		for (int i=1;i<=5;i++) {
			frame.add(new Button("Button " + i));
		}
		frame.setVisible(true);
	}
}
