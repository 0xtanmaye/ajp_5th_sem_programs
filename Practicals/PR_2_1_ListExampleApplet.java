/* <applet code="PR_2_1_ListExampleApplet.class" width="200" height="150"> </applet> */
import java.applet.Applet;
import java.awt.*;

public class PR_2_1_ListExampleApplet extends Applet {
	public void init() {
		List seasonList = new List(3, false);
		seasonList.add("Summer");
		seasonList.add("Winter");
		seasonList.add("Rainy");
		
		this.add(seasonList);
	}
}
