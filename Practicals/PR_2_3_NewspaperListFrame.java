import java.awt.*;

public class PR_2_3_NewspaperListFrame {
	public static void main(String[] args) {
		Frame frame = new Frame("Select Newspapers Frame");
		List newspaperList = new List(4, true);
		newspaperList.add("The Times of India");
		newspaperList.add("Hindustan Times");
		newspaperList.add("The Indian Express");
		newspaperList.add("Dainik Bhaskar");
		frame.setLayout(new FlowLayout());
		frame.add(newspaperList);
		frame.setSize(300, 200);
		frame.setVisible(true);
	}
}
