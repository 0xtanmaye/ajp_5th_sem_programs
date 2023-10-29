import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class PR_9_2_JProgressBarOnButtonClickV2 implements ActionListener
{
	int i;
	JButton jB;
	JProgressBar jPB;
	Timer delayTimer; 
	PR_9_2_JProgressBarOnButtonClickV2() throws InterruptedException
	{
		JFrame jframe = new JFrame("JProgressBar on JButton Click Example");
		jframe.setLayout(new FlowLayout());
		jframe.setSize(300, 300);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jB = new JButton("Start");
		jB.addActionListener(this);
		
		jPB = new JProgressBar(0, 100);
		jPB.setStringPainted(true);
		
		jframe.add(jPB);
		jframe.add(jB);
		
		jframe.setVisible(true);
		
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
	public static void main(String[] args) throws InterruptedException
	{
		new PR_9_2_JProgressBarOnButtonClickV2();
	}
}
