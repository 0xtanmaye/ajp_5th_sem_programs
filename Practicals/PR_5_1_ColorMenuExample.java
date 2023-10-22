import java.awt.*;

public class PR_5_1_ColorMenuExample {
	public static void main(String[] args) {
		Frame frame = new Frame("Color Menu Example");
		frame.setSize(300, 200);

		MenuBar menuBar = new MenuBar();
		frame.setMenuBar(menuBar);

		Menu colorMenu = new Menu("Colors");
		menuBar.add(colorMenu);

		String[] colors = {"Red", "Green", "Blue", "Black", "Yellow", "Purple", "Orange"};

		for (String color : colors) {
			MenuItem colorItem = new MenuItem(color);
			if ("Black".equals(color)) {
				colorItem.setEnabled(false);
			}
			colorMenu.add(colorItem);
		}
		frame.setVisible(true);
	}
}
