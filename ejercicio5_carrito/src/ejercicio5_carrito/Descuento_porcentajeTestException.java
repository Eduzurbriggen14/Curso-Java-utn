package ejercicio5_carrito;

import org.junit.Test;

public class Descuento_porcentajeTestException {

	@Test
	public void testAplicar_descuento_porcentaje1() throws Exception {
		double total=0;
		double desc_porcentaje= 25;
		
		if(total<=0) {
			
			throw new Exception("no se puede aplicar un descuento a un carrito cuyo valor total es igual a cero");
		}
		else if(desc_porcentaje>100) {
			
			throw new Exception("no se puede aplicar un descuento mayor al 100 porciento");
		}
		else {
		
			double total_con_descuento_porcentaje= total - ((total *desc_porcentaje)/100);
		
			System.out.println("el total es: "+ total_con_descuento_porcentaje);
		}
	}
	
	
	
	@Test
	public void testAplicar_descuento_porcentaje2() throws Exception {
		double total=250;
		double desc_porcentaje= 125;
		
		if(total<=0) {
			
			throw new Exception("no se puede aplicar un descuento a un carrito cuyo valor total es igual a cero");
		}
		else if(desc_porcentaje>100) {
			
			throw new Exception("no se puede aplicar un descuento mayor al 100 porciento");
		}
		else {
		
			double total_con_descuento_porcentaje= total - ((total *desc_porcentaje)/100);
		
			System.out.println("el total es: "+ total_con_descuento_porcentaje);
		}
	}

}
