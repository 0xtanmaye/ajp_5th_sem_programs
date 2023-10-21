import java.awt.*;

public class PR_2_1_ListExampleFrame {
	public static void main(String[] args) {
		Frame frame = new Frame("Seasons List Example");
		
		List seasonList = new List(3, false);
		seasonList.add("Summer");
		seasonList.add("Winter");
		seasonList.add("Rainy");
		
		frame.add(seasonList);
		
		frame.setLayout(new FlowLayout());
		frame.setSize(200, 150);
		frame.setVisible(true);
	}
}
