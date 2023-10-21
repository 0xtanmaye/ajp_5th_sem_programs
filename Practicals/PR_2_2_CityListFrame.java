import java.awt.*;

public class PR_2_2_CityListFrame {
	public static void main(String[] args) {
		Frame frame = new Frame("City List Frame");
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

		frame.add(cityList);

		frame.setLayout(new FlowLayout());
		frame.setSize(250, 200);
		frame.setVisible(true);
	}
}
