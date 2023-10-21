import java.awt.*;

public class PR_1_5_ButtonExample {
	public static void main(String[] args) {
		Frame frame = new Frame("Button Example");
		
		Button okButton = new Button("OK");
		Button resetButton = new Button("RESET");
		Button cancelButton = new Button("CANCEL");
		
		frame.add(okButton);
		frame.add(resetButton);
		frame.add(cancelButton);
		
		frame.setLayout(new FlowLayout());
		frame.setSize(300, 100);
		frame.setVisible(true);
	}
}
