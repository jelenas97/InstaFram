package workSpace;

import gui.MainWindow;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.tree.DefaultMutableTreeNode;

public class SaveWorkSpace {
	
	File f = new File("workspace.txt");
	DefaultMutableTreeNode cvor = (DefaultMutableTreeNode) MainWindow.getInstance().getTree().getModel().getRoot();
	
	//DefaultMutableTreeNode cvor = (DefaultMutableTreeNode) MainWindow.getInstance().getTree().getModel().getRoot();

    int br = cvor.getChildCount();
   
    
    public SaveWorkSpace() throws FileNotFoundException, IOException {
    
   ObjectOutputStream os = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
   try {
		os.writeObject(cvor);
		//os.write(br);
	} finally {
		os.close();
	}
    }
}
