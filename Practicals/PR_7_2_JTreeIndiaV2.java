import javax.swing.*;
import java.awt.*;
import javax.swing.tree.*;

public class PR_7_2_JTreeIndiaV2
{
	public static void main(String[] args)
	{
		JFrame jframe = new JFrame();
		jframe.setLayout(new BorderLayout());
		// jframe.setTitle("JTree India");
		jframe.setSize(300, 300);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
		jframe.add(selectLocationIndia);
		jframe.setVisible(true);
	}
}
