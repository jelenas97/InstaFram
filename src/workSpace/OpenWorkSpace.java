package workSpace;

import gui.MainWindow;
import gui.Tree.CellEditor;
import guiCheckBoxTree.CheckBoxNodeData;
import instaframController.ConfigurationControler;
import instaframModel.CompanyModel;
import instaframModel.ConfiguratorModel;
import instaframModel.ProductModel;
import instaframView.ConfigurationView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;

import actionListener.ExitConf;

public class OpenWorkSpace {
	
	private DefaultMutableTreeNode node;
	private JTree tree;

	public OpenWorkSpace() throws IOException, ClassNotFoundException {
		
		FileInputStream f = new FileInputStream("workspace.txt");
		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(f));
	try {

      node = (DefaultMutableTreeNode)ois.readObject();
   
	} finally {
		ois.close();
	}
	
	InitTree();
	
	}

	public void InitTree() {
		
		int broj = node.getChildCount();
		
		do {
		add(node,node.getNextNode());
			 broj--;
			 
		}while (broj > 0);
		
		DefaultTreeModel model = new DefaultTreeModel(node);
		tree = new JTree(model);
    	tree.setCellEditor(new CellEditor(tree, null));
	    tree.setEditable(true);
		
		expandNodes(tree);
		
		
	}

	
	public JTree getTreeW() {
		
		return tree;
		
	}
	
	
	private static DefaultMutableTreeNode add(final DefaultMutableTreeNode parent, DefaultMutableTreeNode child) {
		parent.add(child);
		return child;
	}
	
	public OpenWorkSpace getWorkSpace() {
		return this;
		
		
	}

	
	private void expandNodes(JTree tree) {
	    int j = tree.getRowCount();
	    int i = 0;
	    while(i < j) {
	        tree.expandRow(i);
	        i += 1;
	        j = tree.getRowCount();
	    }
	}
}
