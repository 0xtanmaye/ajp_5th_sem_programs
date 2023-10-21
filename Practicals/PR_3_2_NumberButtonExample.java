import java.awt.*;

public class PR_3_2_NumberButtonExample {
	public static void main(String[] args) {
		Frame frame = new Frame("Number Buttons");

		frame.setLayout(new GridLayout(4, 3));

		for (int i = 0; i < 10; i++) {
			frame.add(new Button(Integer.toString(i)));
		}

		frame.setSize(400, 400);
		frame.setVisible(true);
	}
}
