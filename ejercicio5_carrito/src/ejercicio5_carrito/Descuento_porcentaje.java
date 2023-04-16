package ejercicio5_carrito;

public class Descuento_porcentaje extends Descuento {	
	
	public Descuento_porcentaje() {}
	
	public double aplicar_descuento_porcentaje(double total, int desc_porcentaje) throws Exception{
		
		if(total<=0) {
			
			throw new Exception("no se puede aplicar un descuento a un carrito cuyo valor total es igual a cero");
		}
		else if(desc_porcentaje>100) {
			
			throw new Exception("no se puede aplicar un descuento mayor al 100 porciento");
		}
		else {
		
		double total_con_descuento_porcentaje= total - ((total *desc_porcentaje)/100);
		
		return total_con_descuento_porcentaje;
		}
		
	}

}
