package model;

public class PC extends Product{
	
	private boolean isGaming;

	

	
	public PC(int idProduct, String nameProduct, int priceProduct, int weightProduct, boolean isGaming) {
		super(idProduct, nameProduct, priceProduct, weightProduct);
		this.isGaming = isGaming;
	}


	


	public boolean getIsGaming() {
		return isGaming;
	}




	public void setGaming(boolean isGaming) {
		this.isGaming = isGaming;
	}





	@Override
	public String getShip() {
		String mensaje ;
		
		if (getPriceProduct()>250 && getIsGaming()==true) {
			mensaje = "Ship is free and aditional  gift (LED Light)";
			
			
		}else if(getPriceProduct()>250) {
			
			mensaje = "Ship is free";

		}else {
			mensaje = "Ship have aditional cost";

		}
		
		
		return mensaje;
	}





	@Override
	public String toString() {
		return "PC [IdProduct=" + getIdProduct() + ", NameProduct=" + getNameProduct()
				+ ", PriceProduct=" + getPriceProduct() + ", WeightProduct=" + getWeightProduct()
				+ ", IsGaming()=" + getIsGaming() + ", Ship()=" + getShip() + "]";
	}











	
	
	
	

	

}
