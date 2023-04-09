package ejercicio5_carrito;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Carrito_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ruta = "C:\\\\Users\\\\luisz\\\\Documents\\\\A.JAVA UTN\\\\Clase 5\\\\archivoTxt.txt";
		System.out.println("inicio ejercicio 5 Carrito de compra");

		ScannerClass(ruta);

	}

	public static void ScannerClass(String ruta) {

		int id = 1;
		String descripcion_producto;
		double cantidad;
		double precio;
		double totalCarrito = 0;

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

				System.out.println(ic.cantidad + "  " + prod.precio_unidad + "   " + prod.descripcion);

			}
			System.out.println("precio total de la compra :" + totalCarrito);
			
			System.out.println(" ");

			System.out.println("El cliente tiene algun tipo de descuento?? Ingrese Si o No");

			Scanner opcion = new Scanner(System.in);
			String eleccion = opcion.nextLine();
			String eleccion_mayuscula = eleccion.toUpperCase();

			/*
			 * char eleccion = (opcion.nextLine()).charAt(0); char eleccion_mayuscula =
			 * Character.toLowerCase(eleccion);
			 */

			do {
				if (eleccion_mayuscula.equals("NO")) {

					System.out.println("no se realizara ningun descuento");
					break;

				} else if (eleccion_mayuscula.equals("SI")) {

					System.out.println("ha ingresado la opcion para realizar un descuento");
					System.out.println(
							"ingrese una opcion:\n1-Descuento Fijo\n2-Descuento con porcentaje\n3-Descuento con porcentaje con tope");

					Scanner t_descuento = new Scanner(System.in);
					int tipo_descuento = t_descuento.nextInt();

					switch (tipo_descuento) {

					case 1:
						System.out.println("elegiste Descuento Fijo");

						Descuento_fijo descFijo = new Descuento_fijo();

						double total_con_descuento_fijo = descFijo.aplicar_descuento_fijo(totalCarrito);

						System.out.println("El total a pagar aplicando Descuento Fijo es: " + total_con_descuento_fijo);
						break;

					case 2:
						System.out.println("elegiste Descuento con Porcentaje");

						Descuento_porcentaje descPorcentaje = new Descuento_porcentaje();

						System.out.println("ingrese el valor del descuento: ");

						Scanner d_porcentaje = new Scanner(System.in);

						int desc_porcentaje = d_porcentaje.nextInt();

						double total_con_descuento_porcentaje = descPorcentaje
								.aplicar_descuento_porcentaje(totalCarrito, desc_porcentaje);

						System.out.println("El total a pagar aplicando el Descuento con Porcentaje es de: "
								+ total_con_descuento_porcentaje);
						break;

					case 3:
						System.out.println("elegiste Descuento con Porcentaje con Tope");

						Descuento_porcentajeTope d_porcentajeTope = new Descuento_porcentajeTope();

						System.out.println("ingrese el valor del descuento: ");

						Scanner d_porcentajeTope1 = new Scanner(System.in);

						int desc_porcentaje_con_tope = d_porcentajeTope1.nextInt();

						double total_con_descuento_porcentaje_tope = d_porcentajeTope
								.aplicar_descuento_porcentajeTope(totalCarrito, desc_porcentaje_con_tope);

						int desc_auxiliar = d_porcentajeTope.getDesc_auxiliar();
						
						if(desc_auxiliar !=0) {
							
							total_con_descuento_porcentaje_tope= d_porcentajeTope.aplicar_descuento_porcentajeTope(desc_auxiliar, total_con_descuento_porcentaje_tope);
							System.out.println("El total a pagar aplicando Descuento con Porcentaje con tope es: "+ total_con_descuento_porcentaje_tope);
							
						}
						else {
							System.out.println("El total a pagar aplicando el Descuento con Porcentaje con tope es:"+ total_con_descuento_porcentaje_tope);
						}
						
						
						break;

					}
				

				}
				else {
					System.out.println("Palabra incorrecta, debe ingresar SI o NO");
					break;
				}

			} while ((!(eleccion_mayuscula == "NO")) && (!(eleccion_mayuscula == "SI")));

		} catch (IOException e) {
			e.printStackTrace();

		}

	}
}
