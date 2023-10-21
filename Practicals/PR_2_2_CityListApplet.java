/* <applet code="PR_2_2_CityListApplet.class" width="250" height="200"> </applet> */
import java.applet.Applet;
import java.awt.*;

public class PR_2_2_CityListApplet extends Applet {
	public void init() {
		List cityList = new List(5, false);
		cityList.add("Mumbai");
		cityList.add("Delhi");
		cityList.add("Bangalore");
		cityList.add("Kolkata");
		cityList.add("Chennai");
		cityList.add("Hyderabad");
		cityList.add("Pune");
		cityList.add("Ahmedabad");
		cityList.add("Jaipur");
		cityList.add("Lucknow");
		this.add(cityList);
	}
}
