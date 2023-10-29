import javax.swing.*;
import java.awt.*;

public class PR_9_1_JProgressBarExampleV2
{
	public static void main(String[] args) throws InterruptedException
	{
		JFrame jframe = new JFrame();
		jframe.setLayout(new FlowLayout());
		// jframe.setTitle("JProgressBar Example");
		jframe.setSize(300, 200);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JProgressBar jPB = new JProgressBar(0, 100);
		jframe.add(jPB);
		
		jframe.setVisible(true);
		jPB.setStringPainted(true);
		for (int i = 0; i <= 100; ++i) {
			jPB.setValue(i);
			jPB.setString(i + "%");
			Thread.sleep(100);
		}
	}
}
