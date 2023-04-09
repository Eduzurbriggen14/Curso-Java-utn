package ejercicio5_carrito;

public class Descuento_porcentaje extends Descuento {	
	
	public Descuento_porcentaje() {}
	
	public double aplicar_descuento_porcentaje(double total, int desc_porcentaje) {
		
		double total_con_descuento_porcentaje= total - ((total *desc_porcentaje)/100);
		
		return total_con_descuento_porcentaje;
		
		
	}

}
