package ejercicio5_carrito;

public class Descuento_fijo extends Descuento {
	public double total; 
	public Descuento_fijo() {}
	
	public double aplicar_descuento_fijo(double total) {
		
		double total_con_descuento_fijo= total - ((total*15)/100);
		
		return total_con_descuento_fijo; 
		
		
	}

}
