/* <applet code="PR_2_3_NewspaperListApplet.class" width="300" height="200"> </applet> */
import java.applet.Applet;
import java.awt.*;

public class PR_2_3_NewspaperListApplet extends Applet {
	public void init() {
		List newspaperList = new List(4, true);
		newspaperList.add("The Times of India");
		newspaperList.add("Hindustan Times");
		newspaperList.add("The Indian Express");
		newspaperList.add("Dainik Bhaskar");
		this.add(newspaperList);
	}
}
