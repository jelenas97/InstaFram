package gui.Tree;

import gui.MainWindow;
import instaframModel.CompanyModel;
import instaframModel.ProductModel;
import instaframModel.WorkspaceModel;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;


public class AddCompany extends AbstractAction{
	
	private static final long serialVersionUID = 1L;
	private ArrayList<CompanyModel> companies;

	
	public AddCompany() {}

	public AddCompany(String name) {
		super(name);
	}

	public AddCompany(String name, Icon icon) {
		super(name, icon);
	
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		DefaultMutableTreeNode sel = (DefaultMutableTreeNode) MainWindow
				.getInstance().getTree().getLastSelectedPathComponent();
		
        if (sel == null) {
			
			JOptionPane.showMessageDialog(null, "You must select WorkSpace first");
			
		}
        
        else if (sel.getLevel()==0)  {
			if (sel.getAllowsChildren()) {
				
				companies = new ArrayList<CompanyModel>();
				companies.add(new CompanyModel("Companu"));
				DefaultMutableTreeNode miProd = new DefaultMutableTreeNode(new CompanyModel(MainWindow.getInstance().getResourceBundle().getString("miCom")));
				
				
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
      

	
	public ArrayList<CompanyModel> getCompanies() {
		return companies;
	}
	
	public AddCompany getAC() {
		return this;
	}
    	   
	}

     
			
	
		
	


