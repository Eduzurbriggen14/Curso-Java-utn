package ejercicio5_carrito;

public class Descuento_fijo extends Descuento {
	public double total; 
	public Descuento_fijo() {}
	
	
	
	public double aplicar_descuento_fijo(double total) throws Exception {
		double total_con_descuento_fijo;
		
		if (total>0) {
			
			total_con_descuento_fijo= total - ((total*15)/100);
			
			
		}else {
			
			throw new Exception("no se puede aplicar un descuento a un carrito cuyo valor total es igual a cero");
		}
		return total_con_descuento_fijo;
	}

}