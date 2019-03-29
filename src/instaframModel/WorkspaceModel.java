package instaframModel;

import gui.MainWindow;

import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.tree.DefaultMutableTreeNode;


public class WorkspaceModel extends DefaultMutableTreeNode implements Serializable {
	private static final long serialVersionUID = 5443583038166389238L;
	private String name;
	private ArrayList<CompanyModel> companies;

	
	 public  WorkspaceModel(String name) {
		 super();
	     this.name = name;
		 companies = new ArrayList<CompanyModel>();
	 }
	 
	 public ArrayList<CompanyModel> getCompanies() {
		 
			return companies;
		}

	

	public String getNaziv() {
		return name;
	}
	
	
	@Override
	public String toString() {
		return this.getNaziv();
	}

	
	public int addCompany(CompanyModel company) {
		int n = 0;
				company.setWorkspace(this);
				this.companies.add(company);
				System.out.println(companies);
				
				for(int i=0; i<this.companies.size();i++){
					CompanyModel c = this.companies.get(i);
					if((c.getNaziv().equals(company.getNaziv()))){
					n = 1;
				
				}
				if(n == 0) {
					company.setWorkspace(this);
					this.companies.add(company);
				}
			
			n = 1;
				}
	 return n;
	}
	public void removeCompany(CompanyModel company) {
		company.setWorkspace(null);
		this.companies.remove(company);
		
	}
	public CompanyModel getCompany(int i) {
		return companies.get(i);
	}
	
	public WorkspaceModel getWorkspace() {
		// TODO Auto-generated method stub
		return this;
	}
	
}
