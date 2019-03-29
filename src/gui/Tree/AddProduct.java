package gui.Tree;

import gui.MainWindow;
import instaframModel.ProductModel;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

import actionListener.NodeListener;

public class AddProduct extends AbstractAction{
	

	private static final long serialVersionUID = 1L;

	
	public AddProduct() {
	}

	public AddProduct(String name) {
		super(name);
	}

	public AddProduct(String name, Icon icon) {
		super(name, icon);
	
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		DefaultMutableTreeNode sel = (DefaultMutableTreeNode) MainWindow
				.getInstance().getTree().getLastSelectedPathComponent();
		
		
		
       if (sel == null) {
			
			JOptionPane.showMessageDialog(null, "You must select WorkSpace first");
			
		}
		
       else if (sel.getLevel()==1)  {
			if (sel.getAllowsChildren()) {
				DefaultMutableTreeNode miProd = new DefaultMutableTreeNode(new ProductModel(MainWindow.getInstance().getResourceBundle().getString("miProd")));
				
				 
				MainWindow.getInstance().getModel()
						.insertNodeInto(miProd, sel, sel.getChildCount());

				if (miProd.getPath().length > 3) {
					miProd.setAllowsChildren(false);
				}

				MainWindow.getInstance().getTree()
						.setSelectionPath(new TreePath(miProd.getPath()));
				MainWindow.getInstance().getTree()
						.scrollPathToVisible(new TreePath(miProd.getPath()));
			}
			
		}
       
    	   
	}

}

