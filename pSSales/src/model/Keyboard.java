package model;

public class Keyboard extends Product {
	
	
	private String typeKeyboard;

	
	public Keyboard(int idProduct, String nameProduct, int priceProduct, int weightProduct, String typeKeyboard) {
		super(idProduct, nameProduct, priceProduct, weightProduct);
		this.typeKeyboard = typeKeyboard;
	}


	public String getTypeKeyboard() {
		return typeKeyboard;
	}


	public void setTypeKeyboard(String typeKeyboard) {
		this.typeKeyboard = typeKeyboard;
	}
	
	
	@Override
	public String getShip() {
		String mensaje ;
		
		if (getPriceProduct()<250) {
			mensaje = "Ship have aditional cost";
		}else {
			mensaje = "Ship is free and aditional gift(Keyboard case)";

		}
		return mensaje;
	}


	@Override
	public String toString() {
		return "Keyboard [IdProduct=" + getIdProduct() + ", NameProduct=" + getNameProduct()
				+ ", PriceProduct=" + getPriceProduct() + ", WeightProduct=" + getWeightProduct()
				+ ", TypeKeyboard=" + getTypeKeyboard() + ", Ship()=" + getShip() + "]";
	}

	
	
	
	
	
	
	
	

}
