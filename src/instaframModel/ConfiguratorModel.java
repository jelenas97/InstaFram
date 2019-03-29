package instaframModel;

import java.io.Serializable;


public class ConfiguratorModel implements Serializable{
	
	private static final long serialVersionUID = -1013562897033209124L;
	private String Izvor;
	private String Welcome;
	private String Licenca;
	private String Verzija;	
	
	public ConfiguratorModel(String izvor, String welcome, String licenca,
			String verzija) {
		this.Izvor = izvor;
		this.Welcome = welcome;
		this.Licenca = licenca;
		this.Verzija = verzija;
	}

	
	public String getIzvor() {
		return Izvor;
	}

	public void setIzvor(String Izvor) {
		if (Izvor == null) {
			throw new NullPointerException();
		}
		Izvor = Izvor.trim();
		if (Izvor.isEmpty()) {
			throw new IllegalArgumentException("Ime proizvoda nije unesesno!");
		}
		this.Izvor = Izvor;
	}

	public String getVerzija() {
		return Verzija;
	}

	public void setVerzija(String Verzija) {
		if (Verzija == null) {
			throw new NullPointerException();
		}
		Verzija = Verzija.trim();
		if (Verzija.isEmpty()) {
			throw new IllegalArgumentException("Verzija proizvoda nije unesena!");
		}
		this.Verzija = Verzija;
	}
	
	public String getLicence() {
		return Licenca;
	}

	public void setLicence(String Licenca) {
		if (Licenca == null) {
			throw new NullPointerException();
		}
		Licenca = Licenca.trim();
		if (Licenca.isEmpty()) {
			throw new IllegalArgumentException("Verzija proizvoda nije unesena!");
		}
		this.Licenca = Licenca;
				
	}
	
	public String getWelcome() {
		return Welcome;
	}

	public void setWelcome(String Welcome) {
		if (Welcome == null) {
			throw new NullPointerException();
		}
		Welcome = Welcome.trim();
		if (Welcome.isEmpty()) {
			throw new IllegalArgumentException("Welcome proizvoda nije unesena!");
		}
		this.Welcome = Welcome;
				
	}

	
	

}
