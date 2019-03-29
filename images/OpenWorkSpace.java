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

import actionListener.ExitConf;

public class OpenWorkSpace {
	
	
	private DefaultMutableTreeNode node;
	private int broj;
	private JTree tree;

	public OpenWorkSpace() throws IOException, ClassNotFoundException {
		
		FileInputStream f = new FileInputStream("workspace.txt");
		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(f));
	try {

      node = (DefaultMutableTreeNode)ois.readObject();
     //  broj = ois.read();
   
	} finally {
		ois.close();
	}
	
	InitTree();
	
	
	}

	public void InitTree() {
		

		int broj = node.getChildCount();
		System.out.println("Radim li imam toliko djece " + broj);
		
		//do {
			// final DefaultMutableTreeNode sledeci = add(node,new DefaultMutableTreeNode(new CompanyModel("Company")));
			//broj--;
		
		//}while (broj > 0);
		
		DefaultTreeModel model = new DefaultTreeModel(node);
		tree = new JTree(model);
		tree.setCellEditor(new CellEditor(tree, null));
		tree.setEditable(true);
		
		
		
	}
	
	public JPanel getPanel() {
		JPanel pan = new JPanel();
		pan.setPreferredSize(new Dimension(500,500));
		pan.add(tree);
		return pan;
		
	}
	
	
	private static DefaultMutableTreeNode add(final DefaultMutableTreeNode parent, DefaultMutableTreeNode child) {
		parent.add(child);
		return child;
	}
	
	public OpenWorkSpace getWorkSpace() {
		return this;
		
		
	}
	
}
