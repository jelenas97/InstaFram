package instaframView;

import gui.MainWindow;
import gui.Tree.AddProduct;
import gui.Tree.RemoveCompany;
import instaframController.CompanyController;
import instaframController.ConfigurationControler;
import instaframModel.ConfiguratorModel;

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
import java.io.File;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.text.JTextComponent;

import actionListener.CancelBtnListener;
import actionListener.ExportListener;
import actionListener.RemoveBtnListener;

public class ConfigurationView extends JPanel {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4938950903266769355L;
	private ConfiguratorModel conf;
	private ConfigurationControler conController;

	private JPanel pnlContent;
	private JLabel lblIzvor;
	private JTextField tfIzvor;
	private JLabel lblVer;
	private JTextField tfVer;
	private JLabel lblWel;
	private JTextPane tp1;
	private JTextField tfWel;
	private JLabel lblLic;
	private JTextField tfLic;
	private File selFile;

	
	private JPanel pnlKonacno;
	private JButton btnEx;
	private JButton btnCancel;
	private JButton btnLoad;
	
	
	public ConfigurationView(ConfiguratorModel conf) {
		initGUI();
		constructGUI();
		setConf(conf);
	}
	
	public  ConfigurationView() {
		initGUI();
		constructGUI();
		
		
	}
	
	private void initGUI() {
	
		setLayout(new BorderLayout());
	
		pnlContent = new JPanel(new GridBagLayout());
		pnlContent.setBackground(Color.WHITE);
		pnlContent.setForeground(Color.WHITE);
		
		lblIzvor= new JLabel(MainWindow.getInstance().getResourceBundle().getString("lblIzvor"));
		tfIzvor= new JTextField(42);
		tfIzvor.setPreferredSize(new Dimension(20,33));

		lblWel = new JLabel(MainWindow.getInstance().getResourceBundle().getString("lblWel"));
		tfWel = new JTextField(20);
		tfWel.setPreferredSize(new Dimension(pnlContent.getSize().width,140));
		tp1=new JTextPane();
		tp1.setSize(tfWel.getSize());
		tfWel.add(tp1);
		
		
		lblLic = new JLabel(MainWindow.getInstance().getResourceBundle().getString("lblLic"));
		tfLic = new JTextField(20);
		tfLic.setPreferredSize(new Dimension(pnlContent.getSize().width,140));
		tfLic.add(tp1);
		
		lblVer = new JLabel(MainWindow.getInstance().getResourceBundle().getString("lblVer"));
		tfVer= new JTextField(20);
		tfVer.setPreferredSize(new Dimension(pnlContent.getSize().width,35));
		
		
		pnlKonacno = new JPanel(new FlowLayout(FlowLayout.TRAILING));
		pnlKonacno.setBackground(Color.WHITE);
		pnlKonacno.setForeground(Color.WHITE);
		
		btnEx = new JButton(MainWindow.getInstance().getResourceBundle().getString("btnEx"));
		btnEx.addMouseListener(new ExportListener());
		btnEx.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dodaj();
				
			}
		});
		btnCancel = new JButton(MainWindow.getInstance().getResourceBundle().getString("btnCancel"));
		btnCancel.addMouseListener(new CancelBtnListener());
		
	    
	}

	private void constructGUI() {
		
		btnLoad = new JButton("...");
		btnLoad.setPreferredSize(new Dimension(80,31));
		btnLoad.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				uploadZip();
			
			    }
				
				
			
		});
			
	    pnlContent.add(lblIzvor, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		pnlContent.add(tfIzvor, new GridBagConstraints(1, 0, 1, 1, 100, 0, GridBagConstraints.WEST,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
		
		pnlContent.add(btnLoad);
		
		pnlContent.add(lblWel, new GridBagConstraints(0, 1, 1, 1, 0, 0, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		pnlContent.add(tfWel, new GridBagConstraints(1, 1, 1, 1, 100, 0, GridBagConstraints.WEST,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
		pnlContent.add(lblLic, new GridBagConstraints(0, 2, 0, 0, 0, 0, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		pnlContent.add(tfLic, new GridBagConstraints(1, 2, 1, 1, 100, 0, GridBagConstraints.WEST,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
		pnlContent.add(lblLic, new GridBagConstraints(0, 2, 0, 0, 0, 0, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		pnlContent.add(tfLic, new GridBagConstraints(1, 2, 1, 1, 100, 0, GridBagConstraints.WEST,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
		pnlContent.add(lblVer, new GridBagConstraints(0, 3, 0, 0, 0, 0, GridBagConstraints.WEST,
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));
		pnlContent.add(tfVer, new GridBagConstraints(1, 3, 1, 1, 100, 0, GridBagConstraints.WEST,
				GridBagConstraints.HORIZONTAL, new Insets(5, 5, 5, 5), 0, 0));
    
	
		JPanel panC = new JPanel();
		JPanel panE = new JPanel();

		panC.setBackground(Color.white);
		panC.setPreferredSize(new Dimension(100,100));
		panE.setBackground(Color.white);
		panE.setPreferredSize(new Dimension(100,100));
	    
		pnlKonacno.add(btnEx);
		pnlKonacno.add(btnCancel);

		
		add(pnlContent,BorderLayout.NORTH);
		add(pnlKonacno, BorderLayout.SOUTH);
		add(panC,BorderLayout.CENTER);
		add(panE,BorderLayout.EAST);
		
		
		
	}
		

	public ConfiguratorModel getConf() {
		return conf;
	}

	public void setConf(ConfiguratorModel conf) {
		this.conf = conf;
		conController = null;
		refreshView();
	}

	public void refreshView() {
		tfIzvor.setText(conf.getIzvor());
		tfVer.setText(conf.getVerzija());
		tfLic.setText(conf.getLicence());
		tfWel.setText(conf.getWelcome());
	}
	
	
	public File uploadZip() {
		JFileChooser fc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		fc.setDialogTitle("Open");
		fc.setAcceptAllFileFilterUsed(false);
		FileNameExtensionFilter extension = new FileNameExtensionFilter("zip files", "zip");
		fc.addChoosableFileFilter(extension);
		
		
		if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
			
			 selFile = fc.getSelectedFile();
			 tfIzvor.setText(selFile.getAbsolutePath());
		  
	     	}
		
		return selFile;
		
		
	}
	
	private void dodaj() {
		if (conController == null) {
			conController = new ConfigurationControler(conf, this);
		}
		
		String izvor = tfIzvor.getText();
		String ver = tfVer.getText();
		String wel = tfWel.getText();
		String lic = tfLic.getText();
	    conController.updateConf(izvor,ver, wel, lic);
	
	    }
	
	

	
	
}

	
