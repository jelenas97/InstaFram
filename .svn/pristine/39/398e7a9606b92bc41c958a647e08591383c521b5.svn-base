package instaframView;

import gui.MainWindow;
import gui.Tree.AddParametar;
import instaframController.ParametarController;
import instaframModel.ParametarModel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import actionListener.CancelBtnListener;
import actionListener.RemoveBtnListener;


public class ParametarView extends JPanel{
	
	
	private static final long serialVersionUID = 1884063759494311563L;

	private ParametarModel parametar;
	private ParametarController paramController;

	private JPanel pnlContent;
	private JLabel lblName;
	private JTextField tfName;
	private JLabel lblValue;
	private JTextField tfValue;

	private JPanel pnlKonacno;
	private JButton btnAdd;
	private JButton btnCancel;
	private JButton btnRemove;
	
	public ParametarView() {
		initGUI();
		constructGUI();
				
	}


	private void initGUI() {
		setLayout(new BorderLayout());

		pnlContent = new JPanel(new GridBagLayout());
		pnlContent.setBackground(Color.WHITE);
		pnlContent.setForeground(Color.WHITE);
		pnlContent.setSize(100, 200);

		lblName = new JLabel(MainWindow.getInstance().getResourceBundle().getString("lblName"));
		tfName = new JTextField(50);

		lblValue = new JLabel(MainWindow.getInstance().getResourceBundle().getString("lblValue"));
		tfValue = new JTextField(20);		

		pnlKonacno = new JPanel(new FlowLayout(FlowLayout.TRAILING));
		pnlKonacno.setBackground(Color.WHITE);
		btnAdd = new JButton(new AddParametar(MainWindow.getInstance().getResourceBundle().getString("btnAdd")));
		btnCancel = new JButton(MainWindow.getInstance().getResourceBundle().getString("btnCancel"));
		btnCancel.addMouseListener(new CancelBtnListener());
		btnRemove = new JButton(MainWindow.getInstance().getResourceBundle().getString("btnRemove"));
		btnRemove.addMouseListener(new RemoveBtnListener());
		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dodaj();
			}
		});
		
				
		btnCancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//ponisti();
			}
		});
				
				
				
				
	}

	private void constructGUI() {
		pnlContent.add(lblName, new GridBagConstraints(0, 0, 1, 1, 0, 0, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		pnlContent.add(tfName, new GridBagConstraints(1, 0, 1, 1, 100, 0, GridBagConstraints.WEST,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
		pnlContent.add(lblValue, new GridBagConstraints(0, 1, 1, 1, 0, 0, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		pnlContent.add(tfValue, new GridBagConstraints(1, 1, 1, 1, 100, 0, GridBagConstraints.WEST,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));

		pnlKonacno.add(btnAdd);
		pnlKonacno.add(btnCancel);
        pnlKonacno.add(btnRemove);
        
		add(pnlContent, BorderLayout.NORTH);
		add(pnlKonacno, BorderLayout.SOUTH);
		
	}

	public ParametarModel getParametar() {
		return parametar;
	}
	
	public void setParametar(ParametarModel parametar) {
		this.parametar = parametar;

		paramController = null;
		refreshView();
	}

	public void refreshView() {
		tfName.setText(parametar.getNaziv());
		tfValue.setText(parametar.getVrednost());
		
	}

	private void dodaj() {
		if (paramController == null) {
			paramController = new ParametarController(parametar, this);
		}
		String naziv = tfName.getText();
		String vrednost = tfValue.getText();
	

		String message = paramController.updateParametar(naziv, vrednost);

		Window parent = SwingUtilities.getWindowAncestor(this);
		JOptionPane.showMessageDialog(parent, message);
	}
	

}
