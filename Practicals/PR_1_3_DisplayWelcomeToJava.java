import java.awt.*;

public class PR_1_3_DisplayWelcomeToJava {
	public static void main(String[] args) {
		Frame frame = new Frame("Welcome to Java");
		Label label = new Label("Welcome to Java");

		frame.add(label);
		frame.setLayout(new FlowLayout());
		frame.setSize(300, 100);
		frame.setVisible(true);
	}
}
