package ejercicio5_carrito;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import org.junit.Before;
import org.junit.Test;


public class Carrito_mainTest {

	@Test
	public void testScannerClass_igual() {

		double precio_total_test = before();

		assertEquals(470, precio_total_test, 0.0);

	}
	
	@Test
	public void testScannerClass_false() {
		
		double precio_total_test = before();
		
		assertFalse(470 != precio_total_test);
	}
	
	@Test
	public void testScannerClass_true() {
		
		double precio_total_test = before();
		
		assertTrue(470 == precio_total_test);
	}

	@Before

	public double before() {

		int id = 1;
		String descripcion_producto;
		double cantidad;
		double precio;
		double totalCarrito = 0;
		String ruta = "C:\\\\Users\\\\luisz\\\\Documents\\\\A.JAVA UTN\\\\Clase 5\\\\archivoTxt.txt";
		File file = new File(ruta);
		Carrito_compra carrito = new Carrito_compra();

		try (Scanner leer = new Scanner(file, StandardCharsets.UTF_8)) {

			System.out.println("leyedo el archivo");

			while (leer.hasNextLine()) {

				String[] vector = (leer.nextLine()).split(";");

				descripcion_producto = vector[2];
				cantidad = Double.parseDouble(vector[0]);
				precio = Double.parseDouble(vector[1]);

				Producto prod = new Producto();
				prod.descripcion = descripcion_producto;
				prod.precio_unidad = precio;
				prod.idProducto = id;

				id += 1;

				Item_carrito ic = new Item_carrito();

				ic.leer_cargar(prod, cantidad);

				carrito.total(ic);

				totalCarrito = carrito.total_compra;

			}

		} catch (IOException e) {
			e.printStackTrace();

		}return totalCarrito; 
	}
}
