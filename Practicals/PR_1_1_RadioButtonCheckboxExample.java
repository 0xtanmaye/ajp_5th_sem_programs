import java.awt.*;

public class PR_1_1_RadioButtonCheckboxExample {
	public static void main(String[] args) {
		Frame frame = new Frame("Radio Buttons and Checkboxes Demo");

		CheckboxGroup divisionGroup = new CheckboxGroup();

		Checkbox divisionA = new Checkbox("Division A", divisionGroup, false);
		Checkbox divisionB = new Checkbox("Division B", divisionGroup, false);

		Checkbox mathCheckbox = new Checkbox("Math", false);
		Checkbox scienceCheckbox = new Checkbox("Science", false);
		Checkbox historyCheckbox = new Checkbox("History", false);

		frame.add(new Label("Select Division:"));
		frame.add(divisionA);
		frame.add(divisionB);

		frame.add(new Label("Select Subjects:"));
		frame.add(mathCheckbox);
		frame.add(scienceCheckbox);
		frame.add(historyCheckbox);

		frame.setLayout(new FlowLayout());
		frame.setSize(300, 200);
		frame.setVisible(true);
	}
}
