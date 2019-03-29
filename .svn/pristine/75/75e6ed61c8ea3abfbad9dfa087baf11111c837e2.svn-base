package gui.Tree;

import java.io.IOException;

import gui.MainWindow;
import instaframModel.CompanyModel;
import instaframModel.ParametarModel;
import instaframModel.ProductModel;
import instaframModel.WorkspaceModel;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

import workSpace.OpenWorkSpace;

public class MySelectListener implements TreeSelectionListener {

	@Override
	public void valueChanged(TreeSelectionEvent arg0) {
		
		DefaultMutableTreeNode sel = (DefaultMutableTreeNode) MainWindow
				.getInstance().getTree().getLastSelectedPathComponent();

		if (sel == null) {
		     MainWindow.getInstance().transferFocusBackward();
		     return;
		     
		}
		
		
		else if (sel.getUserObject() instanceof CompanyModel) {
			MainWindow.getInstance().showCompanyView((CompanyModel) sel.getUserObject());		
		}
		
		else if (sel.getUserObject() instanceof ProductModel) {
			MainWindow.getInstance().showProductView((ProductModel) sel.getUserObject());

		}
		
		else if (sel.getUserObject() instanceof ParametarModel) {
		    MainWindow.getInstance().showParametarView((ParametarModel) sel.getUserObject());
		} 
		
	}
	}


