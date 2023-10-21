import java.awt.*;

public class PR_1_4_LanguageSelection {
	public static void main(String[] args) {
		Frame frame = new Frame("Language Selection");
		Checkbox marathiCheckbox = new Checkbox("Marathi");
		Checkbox hindiCheckbox = new Checkbox("Hindi");
		Checkbox englishCheckbox = new Checkbox("English");
		Checkbox sanskritCheckbox = new Checkbox("Sanskrit");

		Label label = new Label("Select Languages Known:");

		frame.add(label);
		frame.add(marathiCheckbox);
		frame.add(hindiCheckbox);
		frame.add(englishCheckbox);
		frame.add(sanskritCheckbox);

		frame.setLayout(new FlowLayout());
		frame.setSize(300, 200);
		frame.setVisible(true);
	}
}
