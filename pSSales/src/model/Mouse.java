package model;

public class Mouse extends Product {

	private String sensor;

	//Constructor
	public Mouse(int idProduct, String nameProduct, int priceProduct, int weightProduct, String sensor) {
		super(idProduct, nameProduct, priceProduct, weightProduct);
		this.sensor = sensor;
	}

	
	//Setters and getters
	public String getSensor() {
		return sensor;
	}


	public void setSensor(String sensor) {
		this.sensor = sensor;
	}


	@Override
	public String toString() {
		return "Mouse [Id Product()=" + getIdProduct() + ", Name Product()="
				+ getNameProduct() + ", Price Product()=" + getPriceProduct() + ", Weight Product()="
				+ getWeightProduct() + ", Ship()=" + getShip() + ", Sensor()=" + getSensor() + "]";
	}
	
	
	
	
	
}
