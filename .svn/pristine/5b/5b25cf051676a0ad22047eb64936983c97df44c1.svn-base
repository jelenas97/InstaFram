package instaframController;

import instaframModel.ProductModel;
import instaframView.ProductView;
import java.awt.Image;

public class ProductController {
	
	private ProductModel product;
	private ProductView productView;

	public ProductController(ProductModel product, ProductView productView) {
		setProizvod(product);
		setProizvodView(productView);
	}

	public String updateProizvod(String naziv,String verzija, Image photo) {
		if (naziv == null) {
			return "Input product name";
		}
		naziv = naziv.trim();
		if (naziv.isEmpty()) {
			return "Input product name";
		}

		if (verzija == null) {
			return "Input product version";
		}
		verzija = verzija.trim();
		if (verzija.isEmpty()) {
			return "Input product version";
		}

		product.setNazivP(naziv);
		product.setVerzija(verzija);
		product.setPhoto(photo);
		productView.refreshView();

		return "Model successfully saved";
	}

	public ProductModel getProizvod() {
		return product;
	}

	private void setProizvod(ProductModel proizvod) {
		if (proizvod == null) {
			throw new NullPointerException();
		}
		this.product = proizvod;
	}

	public ProductView getProizvodView() {
		return productView;
	}

	private void setProizvodView(ProductView productView) {
		if (productView == null) {
			throw new NullPointerException();
		}
		this.productView = productView;
	}


}
