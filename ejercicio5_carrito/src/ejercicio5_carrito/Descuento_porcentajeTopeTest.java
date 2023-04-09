package ejercicio5_carrito;

import static org.junit.Assert.*;

import org.junit.Test;

public class Descuento_porcentajeTopeTest {

	@Test
	public void testAplicar_descuento_porcentajeTope() {
		
		Descuento_porcentajeTope d_porcentajeTope = new Descuento_porcentajeTope();
		
		double total_carrito= 470;
		
		int desc_porcentaje_tope=15;
		
		double total_con_descuento_porcentaje = d_porcentajeTope.aplicar_descuento_porcentajeTope(total_carrito, desc_porcentaje_tope);
		
		assertEquals(399.5, total_con_descuento_porcentaje,0.0);
	}

}
