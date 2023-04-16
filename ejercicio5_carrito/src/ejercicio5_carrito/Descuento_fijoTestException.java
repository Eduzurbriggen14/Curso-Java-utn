package ejercicio5_carrito;

import org.junit.Test;

public class Descuento_fijoTestException {

	@Test
	public void testAplicar_descuento_fijo() throws Exception {
		
		double total= 10;
		double desc_fijo=15;
		double total_con_descuento_fijo;
		
		if (total>0) {
			
			total_con_descuento_fijo= total - ((total*15)/100);
			
			
		}else {
			
			throw new Exception("no se puede aplicar un descuento a un carrito cuyo valor total es igual a cero");
		}
	}

}
