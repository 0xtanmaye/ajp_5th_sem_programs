import javax.swing.*;
import java.awt.*;

class JProgressBarExampleJFrame extends JFrame
{
	JProgressBarExampleJFrame() throws InterruptedException
	{
		this.setLayout(new FlowLayout());
		// this.setTitle("JProgressBar Example");
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JProgressBar jPB = new JProgressBar(0, 100);
		this.add(jPB);
		
		this.setVisible(true);
		jPB.setStringPainted(true);
		for (int i = 0; i <= 100; ++i) {
			jPB.setValue(i);
			jPB.setString(i + "%");
			Thread.sleep(100);
		}
	}
}

public class PR_9_1_JProgressBarExampleV1
{
	public static void main(String[] args) throws InterruptedException
	{
		new JProgressBarExampleJFrame();
	}
}
