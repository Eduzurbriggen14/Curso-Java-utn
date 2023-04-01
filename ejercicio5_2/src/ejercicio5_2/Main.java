package ejercicio5_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Ruta = "C:\\ejercicio5_2\\archivo.txt";
		String matriz[][] = new String[5][5];

		try {
			for( int j = 0 ; j <5 ; j++) {
				String linea = Files.readAllLines(Paths.get(Ruta)).get(j);
				String a[]=linea.split(" ");
					for(int i = 0 ; i < a.length; i++) {
						matriz[j][i] = a[i];
							
					}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
			

		List <Productos> lista_prod = new ArrayList();
			
		Productos prod_1 = new Productos();
		prod_1.setNombre_prod(matriz[1][2]);
		prod_1.setCant_prod(Integer.parseInt(matriz[1][0]));
		prod_1.setPrecio_prod(Float.parseFloat(matriz[1][1]));
		lista_prod.add(prod_1);
		
		Productos prod_2 = new Productos();
		prod_2.setNombre_prod(matriz[2][2]);
		prod_2.setCant_prod(Integer.parseInt(matriz[2][0]));
		prod_2.setPrecio_prod(Float.parseFloat(matriz[2][1]));
		lista_prod.add(prod_2);
		
		Productos prod_3 = new Productos();
		prod_3.setNombre_prod(matriz[3][2]);
		prod_3.setCant_prod(Integer.parseInt(matriz[3][0]));
		prod_3.setPrecio_prod(Float.parseFloat(matriz[3][1]));
		lista_prod.add(prod_3);
		
	
		for (int h=0;h<lista_prod.size();h++) {
			System.out.println("Producto: "+ lista_prod.get(h).getNombre_prod() + " - Cantidad: " + lista_prod.get(h).getCant_prod() + " - Precio: " + lista_prod.get(h).getPrecio_prod() );
		}
		
		float Total_compra = 0;
		
		for (int y=0;y<lista_prod.size();y++) {
			float precio_total = lista_prod.get(y).Carrito_precio();
			Total_compra += precio_total;
		}
		System.out.println("La compra tiene un total de pesos "+Total_compra);

	}

}
