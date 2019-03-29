package instaframController;

import instaframModel.ParametarModel;
import instaframView.ParametarView;


public class ParametarController {
	

	private ParametarModel parametar;
	private ParametarView paramView;

	public ParametarController(ParametarModel parametar, ParametarView paramView) {
		setParametar(parametar);
		setParametarView(paramView);
	}

	public String updateParametar(String naziv, String vrednost) {
		if (naziv == null) {
			return "Input parametar name";
		}
		naziv = naziv.trim();
		if (naziv.isEmpty()) {
			return "Input parametar name";
		}

		if (vrednost == null) {
			return "Input parametar value";
		}
		vrednost = vrednost.trim();
		if (vrednost.isEmpty()) {
			return "Input parametar value";
		}

		parametar.setNaziv(naziv);
		parametar.setVrednost(vrednost);
		

    	paramView.refreshView();

		return "Model successfully saved";
	}

	public ParametarModel getParametar() {
		return parametar;
	}

	private void setParametar(ParametarModel parametar) {
		if (parametar == null) {
			throw new NullPointerException();
		}
		this.parametar = parametar;
	}

	public ParametarView getParametarView() {
		return paramView;
	}

	private void setParametarView(ParametarView paramView) {
		if (paramView == null) {
			throw new NullPointerException();
		}
		this.paramView = paramView;
	}



}
