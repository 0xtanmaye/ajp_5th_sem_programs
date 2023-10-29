import javax.swing.*;
import java.awt.*;
import javax.swing.tree.*;

class JTreeExampleJFrame extends JFrame
{
	JTreeExampleJFrame()
	{
		this.setLayout(new BorderLayout());
		this.setTitle("JTree Example");
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DefaultMutableTreeNode countries = new DefaultMutableTreeNode("Countries");
		DefaultMutableTreeNode india = new DefaultMutableTreeNode("India");
		DefaultMutableTreeNode usa = new DefaultMutableTreeNode("United States of America");
		countries.add(india);
		countries.add(usa);
		DefaultMutableTreeNode sMaharashtra = new DefaultMutableTreeNode("Maharashtra");
		DefaultMutableTreeNode sGujarat = new DefaultMutableTreeNode("Gujarat");
		india.add(sMaharashtra);
		india.add(sGujarat);
		DefaultMutableTreeNode sCalifornia = new DefaultMutableTreeNode("California");
		DefaultMutableTreeNode sTexas = new DefaultMutableTreeNode("Texas");
		usa.add(sCalifornia);
		usa.add(sTexas);
		DefaultMutableTreeNode cNashik = new DefaultMutableTreeNode("Nashik");
		DefaultMutableTreeNode cPune = new DefaultMutableTreeNode("Pune");
		sMaharashtra.add(cNashik);
		sMaharashtra.add(cPune);
		DefaultMutableTreeNode cAhemdabad = new DefaultMutableTreeNode("Ahemdabad");
		DefaultMutableTreeNode cSurat = new DefaultMutableTreeNode("Surat");
		sGujarat.add(cAhemdabad);
		sGujarat.add(cSurat);
		DefaultMutableTreeNode cLosAngeles = new DefaultMutableTreeNode("Los Angeles");
		DefaultMutableTreeNode cSanFrancisco = new DefaultMutableTreeNode("San Francisco");
		sCalifornia.add(cLosAngeles);
		sCalifornia.add(cSanFrancisco);
		DefaultMutableTreeNode cHouston = new DefaultMutableTreeNode("Houston");
		DefaultMutableTreeNode cDallas = new DefaultMutableTreeNode("Dallas");
		sTexas.add(cHouston);
		sTexas.add(cDallas);
		
		JTree selectLocation = new JTree(countries);
		this.add(selectLocation);
		this.setVisible(true);
	}
}

public class PR_7_1_JTreeExampleV1
{
	public static void main(String[] args)
	{
		new JTreeExampleJFrame();
	}
}	
