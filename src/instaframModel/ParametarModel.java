package instaframModel;



import java.util.ArrayList;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

public class ParametarModel extends DefaultMutableTreeNode {
	
	private String naziv;
	private String vrednost;
	private Object parent;
	private boolean checked;
	private ArrayList<ParametarModel> parametar;
	
	
	public ParametarModel(String ime, String vrednost, Object parent, Boolean checked) {
		this.naziv = ime;
		this.vrednost = vrednost;
		this.parent = parent;
		this.parametar = new ArrayList<ParametarModel>();
		this.checked = checked;
	}
	
	public ParametarModel() {
		this.naziv = null;
		this.vrednost = null;
		this.parametar = new ArrayList<ParametarModel>();
		this.checked = false;
	}
	


	public ParametarModel(String string) {
		// TODO Auto-generated constructor stub
		this.naziv = string;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		if (naziv == null) {
			throw new NullPointerException();
		}
		naziv = naziv.trim();
		if (naziv.isEmpty()) {
			throw new IllegalArgumentException("Name is empty!");
		}
		this.naziv = naziv;
	}

	public String getVrednost() {
		return vrednost;
	}

	public void setVrednost(String vrednost) {
		if (vrednost == null) {
			throw new NullPointerException();
		}
		vrednost = vrednost.trim();
		if (vrednost.isEmpty()) {
			throw new IllegalArgumentException("Value is empty!");
		}
		this.vrednost = vrednost;
	}
	
	public TreeNode getParent() {
		return (TreeNode) parent;
	}

	public void setParent(Object parent) {
		this.parent = parent;
	}
	
	public void setSelected(Boolean checked) {
		this.checked = checked;
	}

	public ArrayList<ParametarModel> getParametar() {
		return parametar;
	}

	public void setParametar(ArrayList<ParametarModel> parametar) {
		this.parametar = parametar;
	}
	
	public boolean isChecked() {
		return checked;
	}

	
	/*public static DefaultMutableTreeNode add(final DefaultMutableTreeNode parent, final String text,
			final boolean checked) {
		final CheckBoxNode data = new CheckBoxNode(text, checked);
		final DefaultMutableTreeNode node = new DefaultMutableTreeNode(data);
		parent.add(node);
		return node;
	}
*/
	@Override
	public String toString() {
		return this.naziv;
	}

	

}
