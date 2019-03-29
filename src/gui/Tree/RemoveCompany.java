package gui.Tree;

import gui.MainWindow;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.tree.DefaultMutableTreeNode;

public class RemoveCompany extends AbstractAction {

	private static final long serialVersionUID = 1L;

	public RemoveCompany() {}
	public RemoveCompany(String name) {
		super(name);
	}
	public RemoveCompany(String name, Icon icon) {
		super(name, icon);
	}	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		DefaultMutableTreeNode sel = (DefaultMutableTreeNode) MainWindow
				.getInstance().getTree().getLastSelectedPathComponent();
		
		if (sel != null && !sel.isRoot()) {
			MainWindow.getInstance().getModel().removeNodeFromParent(sel);
			
			//ovo dodala za brisanje iz modela..al ne znam da li moze kad nigde ne vidim
			sel.removeFromParent();
			sel.setParent(null);
			
		}
	}
	
	

}
