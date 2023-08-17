import java.awt.*;

class RadioButtonFrame extends Frame {
	RadioButtonFrame() {
		this.setSize(300, 300);
		this.setLayout(new FlowLayout());
		this.setTitle("Radio Button Example");
		
		Label msg = new Label("Select your division:");
		CheckboxGroup divisions = new CheckboxGroup();
		Checkbox divA = new Checkbox("A", divisions, false);
		Checkbox divB = new Checkbox("B", divisions, false);
		Checkbox divC = new Checkbox("C", divisions, false);
		
		this.add(msg);
		this.add(divA);
		this.add(divB);
		this.add(divC);
		
		this.setVisible(true);
	}
}

public class PR_1_1_RadioButtonExample {
	public static void main(String[] args) {
		new RadioButtonFrame();
	}
}	