package instaframController;

import instaframModel.ConfiguratorModel;
import instaframView.ConfigurationView;

public class ConfigurationControler {

	private ConfiguratorModel conf;
	private ConfigurationView confView;

	public  ConfigurationControler(ConfiguratorModel conf, ConfigurationView confView) {
		setConf(conf);
		setConfView(confView);
	}

	public String updateConf(String Izvor,String verzija, String wel, String lic) {
		if (Izvor == null) {
			return "Input product name";
		}
		Izvor = Izvor.trim();
		if (Izvor.isEmpty()) {
			return "Input product name";
		}

		if (verzija == null) {
			return "Input product version";
		}
		verzija = verzija.trim();
		if (verzija.isEmpty()) {
			return "Input product version";
		}
		
		if (wel == null) {
			return "Input product version";
		}
		wel = wel.trim();
		if (wel.isEmpty()) {
			return "Input product version";
		}
		
		if (lic == null) {
			return "Input product version";
		}
		lic = lic.trim();
		if (lic.isEmpty()) {
			return "Input product version";
		}

		conf.setIzvor(Izvor);
		conf.setVerzija(verzija);
		conf.setLicence(lic);
		conf.setWelcome(wel);
		confView.refreshView();

		return "Model successfully saved";
	}

	public ConfiguratorModel getConfModel() {
		return conf;
	}

	private void setConf(ConfiguratorModel conf) {
		if (conf == null) {
			throw new NullPointerException();
		}
		this.conf = conf;
	}

	public ConfigurationView getConfView() {
		return confView;
	}

	private void setConfView(ConfigurationView confView) {
		if (confView == null) {
			throw new NullPointerException();
		}
		this.confView = confView;
	}

	
	
}
