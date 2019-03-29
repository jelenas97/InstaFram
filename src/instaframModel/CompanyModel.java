package instaframModel;

import java.io.Serializable;
import java.util.ArrayList;


public class CompanyModel implements Serializable {
	
	private static final long serialVersionUID = 5443583038166389238L;
	private String name;
	private String headoffice;
	private String number;
	private WorkspaceModel workspace;
	private ArrayList<ProductModel> products;
	
	
	
	 public CompanyModel() {
	     setNaziv("Type company name..");
		 setSediste("Type comany head office..");
		 setNaziv(getNaziv());
		 setBroj("Type company telephone number...");
		 products = new ArrayList<ProductModel>();
		 
	 }
	
     public CompanyModel(String name,String headoffice) {
		 setNaziv("Type company name..");
		 setSediste("Type comany head office..");
		 setBroj("Type company telephone number...");
	}
	
	 public CompanyModel(String name) {
		 setNaziv(name);
		 setSediste("Type company head office..");
		 setBroj("Type company telephone number...");
	     	 
		 
	}

	public String getNaziv() {
		return name;
	}

	public void setNaziv(String name) {
		if (name == null) {
			throw new NullPointerException();
		}
		name = name.trim();
		if (name.isEmpty()) {
			throw new IllegalArgumentException("Name is empty!");
		}
		this.name = name;
	}

	public String getSediste() {
		return headoffice;
	}
	
	public void setWorkspace(WorkspaceModel ws) {
		this.workspace = ws;
	}
	
	public WorkspaceModel getWorkspace() {
		return workspace;
	}

	public void setSediste(String headoffice) {
		if (headoffice == null) {
			throw new NullPointerException();
		}
		headoffice = headoffice.trim();
		if (headoffice.isEmpty()) {
			throw new IllegalArgumentException("Head office is empty!");
		}
		this.headoffice = headoffice;
	}
	
	public void setBroj(String number) {
		this.number = number;
		
	}

	public String getBroj() {
		return number;
		
	}
	
	public ArrayList<ProductModel> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<ProductModel> products) {
		this.products = products;
	}
	
	@Override
	public String toString() {
		return this.name ;
	}

	
	

}
