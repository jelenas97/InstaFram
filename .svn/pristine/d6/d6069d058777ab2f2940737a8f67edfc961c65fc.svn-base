package actionListener;

import gui.MainWindow;
import instaframModel.CompanyModel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class AddBtnListener implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getClickCount()==1) 
			
		{
			DefaultMutableTreeNode sel = (DefaultMutableTreeNode) MainWindow
					.getInstance().getTree().getLastSelectedPathComponent();
				
		
			if (sel.getLevel()==0) {
				if (sel.getAllowsChildren()) {
					DefaultMutableTreeNode nNode = new DefaultMutableTreeNode(new CompanyModel());

					MainWindow.getInstance().getModel()
							.insertNodeInto(nNode, sel, sel.getChildCount());

					if (nNode.getPath().length > 3) {
						nNode.setAllowsChildren(false);
					}

					MainWindow.getInstance().getTree()
							.setSelectionPath(new TreePath(nNode.getPath()));
					MainWindow.getInstance().getTree()
							.scrollPathToVisible(new TreePath(nNode.getPath()));
				}
			}
			
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
