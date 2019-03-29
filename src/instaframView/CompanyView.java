package instaframView;

import gui.MainWindow;
import gui.Tree.AddCompany;
import gui.Tree.RemoveCompany;
import instaframController.CompanyController;
import instaframModel.CompanyModel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import actionListener.CancelBtnListener;
import actionListener.RemoveBtnListener;


public class CompanyView extends JPanel{


	private static final long serialVersionUID = 1884063759494311563L;

	private CompanyModel company;
	private CompanyController compController;

	private JPanel pnlContent;
	private JLabel lblName;
	private JTextField tfName;
	private JLabel lblNumber;
	private JTextField tfNumber;
	private JLabel lblHeadOffice;
	private JTextField tfHeadOffice;

	private JPanel pnlKonacno;
	private JButton btnAdd;
	private JButton btnCancel;
	private JButton btnRemoveCompany;
	
	

	public CompanyView() {
		initGUI();
		constructGUI();
				
	}


	public  void initGUI() {
		setLayout(new BorderLayout());

		pnlContent = new JPanel(new GridBagLayout());
		pnlContent.setBackground(Color.WHITE);
		pnlContent.setForeground(Color.WHITE);

		lblName = new JLabel(MainWindow.getInstance().getResourceBundle().getString("lblName"));
		tfName = new JTextField(10);
		
		lblNumber = new JLabel(MainWindow.getInstance().getResourceBundle().getString("lblNumber"));
		tfNumber = new JTextField(10);

		lblHeadOffice = new JLabel(MainWindow.getInstance().getResourceBundle().getString("lblHeadOffice"));
		tfHeadOffice = new JTextField(10);		

		pnlKonacno = new JPanel(new FlowLayout(FlowLayout.TRAILING));
		pnlKonacno.setBackground(Color.WHITE);
		btnAdd = new JButton(new AddCompany(MainWindow.getInstance().getResourceBundle().getString("btnAdd")));
		btnAdd.setMnemonic('S');
		btnRemoveCompany = new JButton(new RemoveCompany(MainWindow.getInstance().getResourceBundle().getString("btnRemoveCompany")));
		btnRemoveCompany.setMnemonic('R');
		btnRemoveCompany.addMouseListener(new RemoveBtnListener());
		btnCancel = new JButton(MainWindow.getInstance().getResourceBundle().getString("btnCancel"));
		btnCancel.setMnemonic('C');
		btnCancel.addMouseListener(new CancelBtnListener());
		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dodaj();
			}
		});
							
				
	}

	private void constructGUI() {
		pnlContent.add(lblName, new GridBagConstraints(0, 0, 1, 1, 0, 0, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		pnlContent.add(tfName, new GridBagConstraints(1, 0, 1, 1, 100, 0, GridBagConstraints.WEST,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
		pnlContent.add(lblHeadOffice, new GridBagConstraints(0, 1, 1, 1, 0, 0, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		pnlContent.add(tfHeadOffice, new GridBagConstraints(1, 1, 1, 1, 100, 0, GridBagConstraints.WEST,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
		pnlContent.add(lblNumber, new GridBagConstraints(0, 2, 1, 1, 0, 0, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		pnlContent.add(tfNumber, new GridBagConstraints(1, 2, 1, 1, 100, 0, GridBagConstraints.WEST,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));

		pnlKonacno.add(btnAdd);
		pnlKonacno.add(btnCancel);
		pnlKonacno.add(btnRemoveCompany);
		pnlKonacno.setPreferredSize(new Dimension(500,500));

		add(pnlContent, BorderLayout.NORTH);
		add(pnlKonacno, BorderLayout.SOUTH);
		
		
	
		
	}

	public CompanyModel getKompanija() {
		return company;
	}
	
	
	public void setKompanija(CompanyModel kompanija) {
		this.company = kompanija;
		compController = null;
		refreshView();
	}

	public void refreshView() {
		tfName.setText(company.getNaziv());
		tfHeadOffice.setText(company.getSediste());
		tfNumber.setText(company.getBroj());
		
	}

	private void dodaj() {
		if (compController == null) {
			compController = new CompanyController(company, this);
		}
		String naziv = tfName.getText();
		String sediste = tfHeadOffice.getText();
		String broj = tfNumber.getText();
		String message = compController.updateKompanija(naziv, sediste,broj);
		Window parent = SwingUtilities.getWindowAncestor(this);
		JOptionPane.showMessageDialog(parent, message);
	
	    }
	
	

	
	
}
