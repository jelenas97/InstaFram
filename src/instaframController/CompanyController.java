package instaframController;

import instaframModel.CompanyModel;
import instaframView.CompanyView;

public class CompanyController {
	
	private CompanyModel kompanija;
	private CompanyView companyView;

	public CompanyController(CompanyModel kompanija, CompanyView companyView) {
		setKompanija(kompanija);
		setKompanijaView(companyView);
	}

	public String updateKompanija(String naziv, String sediste,String broj) {
		if (naziv == null) {
			return "Input company name";
		}
		naziv = naziv.trim();
		if (naziv.isEmpty()) {
			return "Input company name";
		}

		if (sediste == null) {
			return "Input company head office";
		}
		sediste = sediste.trim();
		if (sediste.isEmpty()) {
			return "Input company head office";
		}
		if (broj == null) {
			return "Input company telephone number";
		}
		broj = broj.trim();
		if (broj.isEmpty()) {
			return "Input company telephone number";
		}

		kompanija.setNaziv(naziv);
		kompanija.setSediste(sediste);
		kompanija.setBroj(broj);
		

		companyView.refreshView();
		return "Company successfully saved";

		
		

	}

	public CompanyModel getKompanija() {
		return kompanija;
	}

	private void setKompanija(CompanyModel kompanija) {
		if (kompanija == null) {
			throw new NullPointerException();
		}
		this.kompanija = kompanija;
	}

	public CompanyView getKompanijaView() {
		return companyView;
	}

	private void setKompanijaView(CompanyView companyView) {
		if (companyView == null) {
			throw new NullPointerException();
		}
		this.companyView = companyView;
	}

}
