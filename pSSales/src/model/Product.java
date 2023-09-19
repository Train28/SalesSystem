package model;

public abstract class Product {
	
	private int idProduct;
	private String nameProduct;
	private int priceProduct;
	private int weightProduct;
	private int ship;

	//Constructor
	public Product(int idProduct, String nameProduct, int priceProduct, int weightProduct) {
		this.idProduct = idProduct;
		this.nameProduct = nameProduct;
		this.priceProduct = priceProduct;
		this.weightProduct = 12;
		this.ship = priceProduct;
	}
	
	
	//Setters and getters

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public int getPriceProduct() {
		return priceProduct;
	}

	public void setPriceProduct(int priceProduct) {
		this.priceProduct = priceProduct;
		this.ship = priceProduct;
	}

	public int getWeightProduct() {
		return weightProduct;
	}

	public void setWeightProduct(int weightProduct) {
		this.weightProduct = weightProduct;
	}

	
	public String getShip() {
		String mensaje ;
		
		if (ship<250) {
			mensaje = "Ship have aditional cost";
		}else {
			mensaje = "Ship is free";

		}
		return mensaje;
	}

	


	
	
	
	
	
	
	
	

}
