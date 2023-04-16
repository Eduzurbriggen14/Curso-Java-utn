package ejercicio5_carrito;

import static org.junit.Assert.*;

import org.junit.Test;

public class Descuento_porcentajeTest {

	@Test
	public void testAplicar_descuento_porcentaje() throws Exception {
		
		int desc_porcentaje= 21;
		
		double total_carrito=470;
		
		Descuento_porcentaje descPorcentaje = new Descuento_porcentaje();
		
		double total_con_descuento_porcentaje= descPorcentaje.aplicar_descuento_porcentaje(total_carrito, desc_porcentaje);
		
		assertEquals(371.3, total_con_descuento_porcentaje, 0.0 );
	}

}
