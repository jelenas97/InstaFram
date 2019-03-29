package gui.menu;

import gui.MainWindow;
import gui.Tree.AddCompany;
import gui.Tree.AddParametar;
import gui.Tree.AddProduct;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Locale;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import actionListener.AddBtnListener;


public class MenuBar extends JMenuBar implements ActionListener, MouseListener{
	
	private static final long serialVersionUID = 1L;
	
	JCheckBoxMenuItem srp;
	JCheckBoxMenuItem eng;
	JMenu cl;
	JMenu file;
	JMenu edit;
	JMenu miNew;
	JMenu search;
	JMenu source;
	JMenu view;
	JMenu win;
	JMenu help;
	JMenu Editor;
	 
	
public MenuBar(){
	    
		
		cl = new JMenu(MainWindow.getInstance().getResourceBundle().getString("cl"));
		file = new JMenu(MainWindow.getInstance().getResourceBundle().getString("file"));
		miNew = new JMenu(MainWindow.getInstance().getResourceBundle().getString("miNew"));
		edit = new JMenu(MainWindow.getInstance().getResourceBundle().getString("edit"));
		search = new JMenu(MainWindow.getInstance().getResourceBundle().getString("search"));
		source = new JMenu(MainWindow.getInstance().getResourceBundle().getString("source"));
		view = new JMenu(MainWindow.getInstance().getResourceBundle().getString("view"));
		win = new JMenu(MainWindow.getInstance().getResourceBundle().getString("win"));
		help = new JMenu(MainWindow.getInstance().getResourceBundle().getString("help"));
		Editor = new JMenu(MainWindow.getInstance().getResourceBundle().getString("Editor"));

		srp = new JCheckBoxMenuItem(MainWindow.getInstance().getResourceBundle().getString("srp"));
		
	    srp.addActionListener(new ActionListener() {
			
				@Override
				public void actionPerformed(ActionEvent arg0) {
					Locale.setDefault(new Locale("sr","RS"));
					MainWindow.getInstance().changeLanguage();
					
					
				}
			});
		
		
		eng = new JCheckBoxMenuItem(MainWindow.getInstance().getResourceBundle().getString("eng"));
		eng.setSelected(true);
             eng.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Locale.setDefault(new Locale("en","US"));
				MainWindow.getInstance().changeLanguage();
				
				
			}
		});


		
		edit.addMouseListener(new EditBtnListener());

		
		add(file);
		add(edit);
		add(view);
		add(source);
		add(search);
		add(win);
		add(help);
		add(Box.createHorizontalGlue());
		add(cl);
		cl.add(eng);
		cl.add(srp);
		
	
		ButtonGroup bg=new ButtonGroup();
		bg.add(eng);
		bg.add(srp);
		
		
		JMenuItem miCompany=new JMenuItem(new AddCompany(MainWindow.getInstance().getResourceBundle().getString("miCompany")));
		JMenuItem miProduct=new JMenuItem(new AddProduct(MainWindow.getInstance().getResourceBundle().getString("miProduct")));
		JMenuItem miParametar=new JMenuItem(new AddParametar(MainWindow.getInstance().getResourceBundle().getString("miParametar")));
		miNew.add(miCompany);
		miCompany.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,KeyEvent.SHIFT_MASK));
		miCompany.addMouseListener(new AddBtnListener());
		miNew.addSeparator();
		miProduct.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.SHIFT_MASK));
		miProduct.addMouseListener(new AddBtnListener());
		miNew.add(miProduct);
		miNew.addSeparator();
		miParametar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,KeyEvent.SHIFT_MASK));
		miParametar.addMouseListener(new AddBtnListener());
		miNew.add(miParametar);
		
		JMenuItem miOpen =new JMenuItem(MainWindow.getInstance().getResourceBundle().getString("miOpen"));
		JMenuItem miClose =new JMenuItem(MainWindow.getInstance().getResourceBundle().getString("miClose"));
		JMenuItem miCloseAll =new JMenuItem(MainWindow.getInstance().getResourceBundle().getString("miCloseAll"));
		JMenuItem newWind =new JMenuItem(MainWindow.getInstance().getResourceBundle().getString("newWind"));
		JMenuItem HideT =new JMenuItem(MainWindow.getInstance().getResourceBundle().getString("HideT"));
		JMenuItem clone =new JMenuItem(MainWindow.getInstance().getResourceBundle().getString("clone"));
				
		file.add(miNew);
		file.addSeparator();
		file.add(miOpen);
		file.addSeparator();
		file.add(miClose);
		file.add(miCloseAll);
		

		win.add(newWind);
		win.addSeparator();
		win.add(Editor);
		win.addSeparator();
		win.add(HideT);
		
		Editor.add(clone);
				
}



@Override
public void mouseClicked(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
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



@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}



public void initComponents() {
	// TODO Auto-generated method stub

	cl.setText(MainWindow.getInstance().getResourceBundle().getString("cl"));
	eng.setText(MainWindow.getInstance().getResourceBundle().getString("eng"));
    srp.setText(MainWindow.getInstance().getResourceBundle().getString("srp"));
 	file.setText(MainWindow.getInstance().getResourceBundle().getString("file"));
 	edit.setText(MainWindow.getInstance().getResourceBundle().getString("edit"));
 	miNew.setText(MainWindow.getInstance().getResourceBundle().getString("miNew"));
 	view.setText(MainWindow.getInstance().getResourceBundle().getString("view"));
 	search.setText(MainWindow.getInstance().getResourceBundle().getString("search"));
 	source.setText(MainWindow.getInstance().getResourceBundle().getString("source"));
 	win.setText(MainWindow.getInstance().getResourceBundle().getString("win"));
 	help.setText(MainWindow.getInstance().getResourceBundle().getString("help"));
 	Editor.setText(MainWindow.getInstance().getResourceBundle().getString("Editor"));
}


}
