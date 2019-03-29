package actionListener;

import gui.Configurator;
import gui.MainWindow;
import instaframModel.ProductModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;


public class NodeListener implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = -684122996862102110L;



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		DefaultMutableTreeNode sel = (DefaultMutableTreeNode) MainWindow
				.getInstance().getTree().getLastSelectedPathComponent();
	
	
		
	  if (sel.getUserObject() instanceof ProductModel) {
		  Configurator conf = new Configurator();
		  MainWindow.getInstance().setC(conf);
		 
	  }
		
	}

}
