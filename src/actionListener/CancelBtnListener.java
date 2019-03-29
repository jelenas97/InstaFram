package actionListener;

import gui.MainWindow;
import instaframModel.CompanyModel;
import instaframModel.ParametarModel;
import instaframModel.ProductModel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.tree.DefaultMutableTreeNode;

public class CancelBtnListener implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		DefaultMutableTreeNode sel = (DefaultMutableTreeNode) MainWindow
				.getInstance().getTree().getLastSelectedPathComponent();
		
		if (sel != null && !sel.isRoot() &&sel.getUserObject() instanceof CompanyModel) {
		    MainWindow.getInstance().getTree().clearSelection();
		    MainWindow.getInstance().hideCompanyView((CompanyModel)sel.getUserObject());
		    
		}else if (sel != null && !sel.isRoot() && sel.getUserObject() instanceof ProductModel) {
		    MainWindow.getInstance().getTree().clearSelection();
		    MainWindow.getInstance().hideProductView((ProductModel)sel.getUserObject());
		    
		}
		else if (sel != null && !sel.isRoot() && sel.getUserObject() instanceof ParametarModel) {
		    MainWindow.getInstance().getTree().clearSelection();
		    MainWindow.getInstance().hideParametarView((ParametarModel)sel.getUserObject());
		    
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
