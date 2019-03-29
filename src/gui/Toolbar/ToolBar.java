package gui.Toolbar;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import actionListener.NodeListener;
import actionListener.OpenListener;
import actionListener.TBListener;

public class ToolBar extends JToolBar {

	private static final long serialVersionUID = 1L;

	public ToolBar(){
			
		super(SwingConstants.HORIZONTAL);
		JButton btnNew = new JButton();
		btnNew.setToolTipText("New");
		btnNew.setBackground(Color.WHITE);
		btnNew.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNew.setIcon(new ImageIcon("images/new_icon.png"));
		btnNew.addActionListener(new NodeListener());
		add(btnNew);
		
		addSeparator();

		JButton btnSave = new JButton();
		btnSave.setToolTipText("Save");
		btnSave.addMouseListener(new TBListener());
		btnSave.setBackground(Color.WHITE);
		btnSave.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnSave.setIcon(new ImageIcon("images/save_icon.png"));
		//btnSave.addActionListener(new SaveWorkSpaceListener());
		add(btnSave);
		
		addSeparator();
		
		JButton btnOpen = new JButton();
		btnOpen.setToolTipText("Open");
		btnOpen.setBackground(Color.WHITE);
		btnOpen.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnOpen.setIcon(new ImageIcon("images/Open-icon.png"));
		btnOpen.addActionListener(new OpenListener());
		add(btnOpen);
		
		addSeparator();
		
		JToggleButton tglBtnSaveAll=new JToggleButton();
		tglBtnSaveAll.setToolTipText("Save All");
		tglBtnSaveAll.setBackground(Color.WHITE);
		tglBtnSaveAll.setBorder(new EmptyBorder(0, 0, 0, 0));
		tglBtnSaveAll.setIcon(new ImageIcon("images/saveall_icon.png"));
		add(tglBtnSaveAll);
		
		addSeparator();
		
		JButton btnPrint = new JButton();
		btnPrint.setToolTipText("Print");
		btnPrint.setBackground(Color.WHITE);
		btnPrint.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnPrint.setIcon(new ImageIcon("images/printer.png"));
		add(btnPrint);
		
		addSeparator();
		
		JButton btnUndo = new JButton();
		btnUndo.setToolTipText("Undo");
		btnUndo.setBackground(Color.WHITE);
		btnUndo.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnUndo.setIcon(new ImageIcon("images/edit_undo.png"));
		add(btnUndo);
		
		addSeparator();
		
		JButton btnRedo = new JButton();
		btnRedo.setToolTipText("Redo");
		btnRedo.setBackground(Color.WHITE);
		btnRedo.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnRedo.setIcon(new ImageIcon("images/redo.png"));
		add(btnRedo);
		
		setFloatable(false);
		setBackground(Color.white);
	
}

}
