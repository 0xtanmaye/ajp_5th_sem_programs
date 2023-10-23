import javax.swing.*;
import java.awt.*;
import javax.swing.tree.*;

public class PR_7_1_JTreeExampleV2
{
	public static void main(String[] args)
	{
		JFrame jframe = new JFrame("JTree Example");
		jframe.setLayout(new BorderLayout());
		jframe.setSize(600, 600);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
		jframe.add(selectLocation);
		jframe.setVisible(true);
	}
}
