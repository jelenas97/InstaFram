package gui.menu;

import gui.MainWindow;
import instaframModel.CompanyModel;
import instaframModel.ParametarModel;
import instaframModel.ProductModel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;

public class EditBtnListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent arg0) {
		DefaultMutableTreeNode sel = (DefaultMutableTreeNode) MainWindow
				.getInstance().getTree().getLastSelectedPathComponent();
		
		if (sel == null) {
			JOptionPane.showMessageDialog(null, "You must select something to edit!");
		}
		
		else if (sel.getUserObject() instanceof CompanyModel) {
			MainWindow.getInstance().showEditCompanyView((CompanyModel) sel.getUserObject());
		
		}else if (sel.getUserObject() instanceof ProductModel) {
			MainWindow.getInstance().showEditProductView((ProductModel) sel.getUserObject());
		
		}else if (sel.getUserObject() instanceof ParametarModel) {
		    MainWindow.getInstance().showEditParametarView((ParametarModel) sel.getUserObject());
		}

	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
