
package gui;
import guiCheckBoxTree.CheckBoxNodeData;
import guiCheckBoxTree.CheckBoxNodeEditor;
import guiCheckBoxTree.CheckBoxNodeRenderer;
import instaframController.ConfigurationControler;
import instaframModel.ConfiguratorModel;
import instaframView.ConfigurationView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import actionListener.ExitConf;

public class Configurator extends JDialog{

	private static final long serialVersionUID = 4407567186632858640L;

	private JTextField txtIzvor;
	private JTextArea txtWelcome;
	private JTextArea txtLicenca;
	private JTextField txtVerzija;
	private CheckBoxNodeRenderer renderer;

	DefaultMutableTreeNode rootofOurModel;
	DefaultTreeModel treeModel;
	private JTree tree;


	public Configurator() {
		
		DefaultMutableTreeNode sel = (DefaultMutableTreeNode)MainWindow.getInstance().getTree().getLastSelectedPathComponent();
		
		if(sel.getNextNode() != null) {
		InitTree();
		InitCenterPanel();
		}else {
			JOptionPane.showMessageDialog(null, "Product must have one or more parametars");
		}
		
	}

	private void InitTree() {
		
		
		final DefaultMutableTreeNode root = new DefaultMutableTreeNode(MainWindow.getInstance().getTree().getLastSelectedPathComponent());
		DefaultMutableTreeNode child = (DefaultMutableTreeNode) MainWindow.getInstance().getTree().getLastSelectedPathComponent();
		int brojacGl = 0;
		rootofOurModel = new DefaultMutableTreeNode();
		rootofOurModel = root;
		brojacGl = child.getDepth();
		int brojac = 0;
		DefaultMutableTreeNode unuk = child.getNextNode();
		brojac = unuk.getDepth();
		
		do {
		final DefaultMutableTreeNode sledeci = add(child,child.getNextNode().toString(),true);
		root.add(sledeci);
		
		brojacGl--;
		child = child.getNextNode();
	
		}while (brojacGl > 0);

		
		final DefaultTreeModel treeModel = new DefaultTreeModel(root);
		 tree = new JTree(treeModel);
		
		renderer = new CheckBoxNodeRenderer();
		tree.setCellRenderer(renderer);

		final CheckBoxNodeEditor editor = new CheckBoxNodeEditor(tree);
		tree.setCellEditor(editor);
		tree.setEditable(true);
		
		
		expandNodes(tree);
	}

	public void InitCenterPanel() {
		
		
		JFrame frame = new JFrame("Configurator");
		frame.setSize(new Dimension(900,590));
		frame.setLocationRelativeTo(null);
			
		DefaultMutableTreeNode sel = (DefaultMutableTreeNode) MainWindow
				.getInstance().getTree().getLastSelectedPathComponent();
		
		    JScrollPane scrollPane = new JScrollPane(tree,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
					JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		    scrollPane.setPreferredSize(new Dimension(200,200));
		    
		    JPanel pan = new JPanel();
		    pan.setPreferredSize(new Dimension(500,400));
		    pan.setBackground(Color.white);
		    
		    ConfigurationView cv = new ConfigurationView();
		    ConfiguratorModel cm = new ConfiguratorModel("Choose","Type","Type","Type");
		    ConfigurationControler con = new ConfigurationControler(cm, cv);
		    
		    MainWindow.getInstance().setControler(con);
		    
		    cv.setConf(cm);
		    pan.add(cv);
		    
		    JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,scrollPane,pan );
		    
		    frame.getContentPane().add(splitPane, BorderLayout.CENTER);
		    
		    setModel(tree);
		   
		    addWindowListener(new ExitConf());
		   
		    frame.setVisible(true);
		    

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

	public JTextField getTxtIzvor() {
		return txtIzvor;
	}

	public JTextArea getTxtWelcome() {
		return txtWelcome;
	}

	public JTextArea getTxtLicenca() {
		return txtLicenca;
	}

	public JTextField getTxtVerzija() {
		return txtVerzija;
	}
	
	
	private static DefaultMutableTreeNode add(final DefaultMutableTreeNode parent, final String text,
			final boolean checked) {
		final CheckBoxNodeData data = new CheckBoxNodeData(text, checked);
		final DefaultMutableTreeNode node = new DefaultMutableTreeNode(data);
		parent.add(node);
		return node;
	}
	
	public JTree getTreeCh() {
		return tree;
	}
	
	public CheckBoxNodeRenderer getRenderer() {
		return renderer;
		
		
	}
	
	public void setModel(JTree t) {
		this.tree = t;
	}
	
	public DefaultTreeModel getModel() {
		return treeModel;
	}
	
	public String getNameR() {
		return rootofOurModel.toString();
		
	}
	
	public DefaultMutableTreeNode getNode() {
		return rootofOurModel.getNextNode();
		
	}
	
	public Boolean isCheck() {
		return true;
	}
	
  public int getNum() {
	  return rootofOurModel.getChildCount();
  }
}
