import java.awt.*;

class MenuBarFrame extends Frame {
	MenuBar mainMB;
	Menu fM, eM, hM;
	MenuItem oFMI, sFMI;
	MenuBarFrame() {
		this.setSize(400, 400);
		mainMB = new MenuBar();
		fM = new Menu("File");
		eM = new Menu("Edit");
		hM = new Menu("Help");
		
		oFMI = new MenuItem("Open File");
		sFMI = new MenuItem("Save File");
		
		fM.add(oFMI);
		fM.add(sFMI);
		
		mainMB.add(fM);
		mainMB.add(eM);
		mainMB.add(hM);
		
		this.setMenuBar(mainMB);
		this.setTitle("Menu Bar Example");
		this.setVisible(true);
	}
}

public class MenuBarExample {
	public static void main(String[] args) {
		new MenuBarFrame();
	}
}