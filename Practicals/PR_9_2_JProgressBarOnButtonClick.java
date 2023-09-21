import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.*;
class JProgressBarJFrame extends JFrame implements ActionListener
{
	int i;
	SwingWorker sw;
	JButton jB;
	JProgressBar jPB;
	Timer delayTimer; 
	JProgressBarJFrame() throws InterruptedException
	{
		this.setLayout(new FlowLayout());
		this.setTitle("JProgressBar on JButton Click Example");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jB = new JButton("Start");
		jB.addActionListener(this);
		jPB = new JProgressBar(0, 100);
		jPB.setStringPainted(true);
		this.add(jPB);
		this.add(jB);
		this.setVisible(true);
		delayTimer = new Timer(100, new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (i <= 100) {
					++i;
					jPB.setValue(i);
					jPB.setString(i + "%");
				} else {
					delayTimer.stop();
					i = 0;
					jPB.setValue(i);
					jPB.setString(i + "%");
				}
			}
		});
	}
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource() == jB) {
			i = 0;
			delayTimer.start();
		}
	}
}

public class PR_9_1_JProgressBarOnButtonClick
{
	public static void main(String[] args) throws InterruptedException
	{
		new JProgressBarJFrame();
	}
}