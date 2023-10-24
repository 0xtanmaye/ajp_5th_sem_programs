import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;

public class FileTree implements TreeExpansionListener
{
	JTree tree;
	DefaultTreeModel treeModel;
	public FileTree()
	{
		JFrame jframe = new JFrame("File Tree");
		jframe.setSize(400, 400);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode(new FileNode(new File("/")));
		treeModel = new DefaultTreeModel(rootNode);
		tree = new JTree(treeModel);
		buildTree(rootNode, 2);	
		tree.addTreeExpansionListener(this);

		JScrollPane scrollableTree = new JScrollPane(tree);
		jframe.add(scrollableTree);
		jframe.setVisible(true);

	}

	public void treeExpanded(TreeExpansionEvent tee)
	{
		DefaultMutableTreeNode node = (DefaultMutableTreeNode) tee.getPath().getLastPathComponent();
		System.out.println("tree expanded event: " + node);
		buildTree(node, 2);
	}

	public void treeCollapsed(TreeExpansionEvent tee)
	{
	}

	public static void main(String[] args)
	{
		new PR_7_3_FileTree();
	}
	public void buildTree(DefaultMutableTreeNode node, int maxDepth)
	{
		if (maxDepth <= 0)
			return;

		FileNode fileNode = (FileNode) node.getUserObject();
		File file = fileNode.getFile();

		if (file.isDirectory()) {
			File[] subFiles = file.listFiles();
			@SuppressWarnings("unchecked")
			Enumeration<DefaultMutableTreeNode> existingChildren = node.children();
			Set<DefaultMutableTreeNode> existingSet = new HashSet<>(Collections.list(existingChildren));

			if (subFiles != null) {
				for (File child : subFiles) {
					boolean allowsChildren = child.isDirectory() ? true : false;
					boolean existing = false;
					DefaultMutableTreeNode childNode = new DefaultMutableTreeNode(new FileNode(child), allowsChildren);
					if (allowsChildren) {
						childNode.add(new DefaultMutableTreeNode(new FileNode(new File(child.getAbsolutePath(), "."))));
					}
					Iterator<DefaultMutableTreeNode> it = existingSet.iterator();
					while (it.hasNext()) {
						DefaultMutableTreeNode e = it.next();
						if ((e.toString()).equals(child.getName())) {	
							existing = true;
							childNode = e;
							break;
						}
					}
					if (!existing) {
						treeModel.insertNodeInto(childNode, node, node.getChildCount());
					}
					// tree.scrollPathToVisible(new TreePath(childNode.getPath()));
					buildTree(childNode, maxDepth - 1);
				}
			}
		}
	}
}

class FileNode
{
	private final File file;
	public FileNode(File file)
	{
		this.file = file;
	}

	public File getFile()
	{
		return file;
	}

	@Override
	public String toString()
	{
		return file.getName();
	}
}
