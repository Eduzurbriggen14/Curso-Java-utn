package ejercicio5_carrito;

import static org.junit.Assert.*;

import org.junit.Test;

public class Descuento_fijoTest {

	@Test
	public void testAplicar_descuento_fijo() {
		
		double total_carrito= 470;
		
		Descuento_fijo descFijo = new Descuento_fijo();
		
		double total_con_descuento_fijo= descFijo.aplicar_descuento_fijo(total_carrito);
		
		assertEquals(399.5, total_con_descuento_fijo,0.0);
	}

}
