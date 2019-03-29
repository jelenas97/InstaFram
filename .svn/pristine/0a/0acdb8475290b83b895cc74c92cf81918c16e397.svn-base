package actionListener;

import gui.MainWindow;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class RemoveBtnListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		DefaultMutableTreeNode sel = (DefaultMutableTreeNode) MainWindow
				.getInstance().getTree().getLastSelectedPathComponent();
	   

		if (sel == null) {
		     MainWindow.getInstance().transferFocusBackward();
		     return; 
		}
		
	    if (sel != null && !sel.isRoot()) {
		    MainWindow.getInstance().getModel().removeNodeFromParent(sel);
		    sel.removeFromParent();
		    sel.setParent(null);
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
			}
	

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
		
	}


