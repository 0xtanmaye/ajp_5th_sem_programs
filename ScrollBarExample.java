import java.awt.*;
import java.awt.event.*;
class ScrollFrame extends Frame implements AdjustmentListener {
	Scrollbar sV;
	Scrollbar sH;
	Label lV, lH;
	ScrollFrame() {
		this.setLayout(new BorderLayout());
		lV = new Label();
		lH = new Label();
		sV = new Scrollbar(Scrollbar.VERTICAL, 50, 50, 1, 100);
		sH = new Scrollbar(Scrollbar.HORIZONTAL, 50, 0, 1, 100);
		sV.addAdjustmentListener(this);
		sH.addAdjustmentListener(this);
		//sV.setUnitIncrement(5);
		//sH.setUnitIncrement(10);
		//sV.setBlockIncrement(20);
		//sH.setBlockIncrement(20);
		this.add(sV, BorderLayout.EAST);
		this.add(sH, BorderLayout.SOUTH);
		this.add(lV, BorderLayout.NORTH);
		this.add(lH, BorderLayout.CENTER);
		this.pack();
		this.setVisible(true);
	}
	
	public void adjustmentValueChanged(AdjustmentEvent ae) {
		if (ae.getSource() == sV) {
			lV.setText("V =" + ae.getValue());
		} else if (ae.getSource() == sH) {
			lH.setText("H =" + ae.getValue());
		}
	}
}

public class ScrollBarExample {
	public static void main(String[] args) {
		new ScrollFrame();
	}
}