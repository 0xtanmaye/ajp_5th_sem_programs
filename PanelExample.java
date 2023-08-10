import java.awt.*;
import javax.swing.*;

class PanelFrame extends Frame {
	JPanel bP, rP, gP, yP, oP;
	PanelFrame() {
		this.setLayout(new BorderLayout());
		this.setSize(500, 500);
		
		bP = new JPanel();
		rP = new JPanel();
		gP = new JPanel();
		yP = new JPanel();
		oP = new JPanel();
		
		bP.setBackground(Color.BLUE);
		rP.setBackground(Color.RED);
		gP.setBackground(Color.GREEN);
		yP.setBackground(Color.YELLOW);
		oP.setBackground(Color.ORANGE);
		
		/*
		bP.setPreferredSize(new Dimension(100, 100));
		rP.setPreferredSize(new Dimension(100, 100));
		gP.setPreferredSize(new Dimension(100, 100));
		yP.setPreferredSize(new Dimension(100, 100));
		oP.setPreferredSize(new Dimension(100, 100))
		*/		
		
		this.add(rP, BorderLayout.NORTH);
		this.add(bP, BorderLayout.SOUTH);
		this.add(gP, BorderLayout.EAST);
		this.add(yP, BorderLayout.WEST);
		this.add(oP, BorderLayout.CENTER);

		this.setVisible(true);
	}
}

public class PanelExample {
	public static void main(String[] args) {
		new PanelFrame();
	}
}