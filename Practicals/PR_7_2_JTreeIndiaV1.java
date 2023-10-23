import javax.swing.*;
import java.awt.*;
import javax.swing.tree.*;

class JTreeJFrame extends JFrame
{
	JTreeJFrame()
	{
		this.setLayout(new BorderLayout());
		this.setTitle("JTree India");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DefaultMutableTreeNode india = new DefaultMutableTreeNode("India");
		DefaultMutableTreeNode sMaharashtra = new DefaultMutableTreeNode("Maharashtra");
		DefaultMutableTreeNode sGujarat = new DefaultMutableTreeNode("Gujarat");
		india.add(sMaharashtra);
		india.add(sGujarat);
		DefaultMutableTreeNode cMumbai = new DefaultMutableTreeNode("Mumbai");
		DefaultMutableTreeNode cPune = new DefaultMutableTreeNode("Pune");
		DefaultMutableTreeNode cNashik = new DefaultMutableTreeNode("Nashik");
		DefaultMutableTreeNode cNagpur = new DefaultMutableTreeNode("Nagpur");
		sMaharashtra.add(cMumbai);
		sMaharashtra.add(cPune);
		sMaharashtra.add(cNashik);
		sMaharashtra.add(cNagpur);
		
		JTree selectLocationIndia = new JTree(india);
		this.add(selectLocationIndia);
		this.setVisible(true);
	}
}

public class PR_7_2_JTreeIndia
{
	public static void main(String[] args)
	{
		new JTreeJFrame();
	}
}	
