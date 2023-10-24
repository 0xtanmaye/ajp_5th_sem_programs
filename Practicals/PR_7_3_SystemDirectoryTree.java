import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.io.File;

public class PR_7_3_SystemDirectoryTree {
	public static void main(String[] args) {
		JFrame frame = new JFrame("System Directory Tree");
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		File rootDirectory = new File("/");
		DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode(rootDirectory);
		DefaultTreeModel treeModel = new DefaultTreeModel(rootNode);
		JTree tree = new JTree(treeModel);

		buildTree(rootNode, rootDirectory, 3);

		JScrollPane scrollPane = new JScrollPane(tree);
		frame.add(scrollPane);

		frame.setVisible(true);
	}

	private static void buildTree(DefaultMutableTreeNode parent, File parentDirectory, int maxDepth) {
		if (maxDepth <= 0) {
			return;
		}

		if (parentDirectory.isDirectory()) {
			File[] subFolders = parentDirectory.listFiles();
			if (subFolders != null) {
				for (File subFolder : subFolders) {
					DefaultMutableTreeNode childNode = new DefaultMutableTreeNode(subFolder);
					parent.add(childNode);
					buildTree(childNode, subFolder, maxDepth - 1);
				}
			}
		}
	}
}
