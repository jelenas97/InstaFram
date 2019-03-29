package gui.Tree;

import gui.MainWindow;
import instaframModel.ParametarModel;
import instaframModel.ProductModel;

import java.awt.Checkbox;
import java.awt.event.ActionEvent;
import java.util.Vector;

import javax.swing.AbstractAction;
import javax.swing.JCheckBox;
import javax.swing.JViewport;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class AddParametar extends AbstractAction {
	private static final long serialVersionUID = 1L;
	
	public AddParametar() {}

	public AddParametar(String name) {
		super(name);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		DefaultMutableTreeNode sel = (DefaultMutableTreeNode) MainWindow
				.getInstance().getTree().getLastSelectedPathComponent();

		if (sel.getLevel()==2) {
			if (sel.getAllowsChildren()) {
				
				DefaultMutableTreeNode miPar = new DefaultMutableTreeNode(new ParametarModel(MainWindow.getInstance().getResourceBundle().getString("miPar")));
				
				MainWindow.getInstance().getModel()
						.insertNodeInto(miPar, sel, sel.getChildCount());

				if (miPar.getPath().length > 4) {
					miPar.setAllowsChildren(false);
				}

				MainWindow.getInstance().getTree()
						.setSelectionPath(new TreePath(miPar.getPath()));
				MainWindow.getInstance().getTree()
						.scrollPathToVisible(new TreePath(miPar.getPath()));
			}
		}
		
		else if (sel.getLevel()>2) {
			if (sel.getAllowsChildren()) {
				DefaultMutableTreeNode miSub = new DefaultMutableTreeNode(new ParametarModel(MainWindow.getInstance().getResourceBundle().getString("miSub")));

				MainWindow.getInstance().getModel()
						.insertNodeInto(miSub, sel, sel.getChildCount());

				if (miSub.getPath().length > 100) {
					miSub.setAllowsChildren(false);
				}

				MainWindow.getInstance().getTree()
						.setSelectionPath(new TreePath(miSub.getPath()));
				MainWindow.getInstance().getTree()
						.scrollPathToVisible(new TreePath(miSub.getPath()));
			}
		} 
	}
	
	

}
