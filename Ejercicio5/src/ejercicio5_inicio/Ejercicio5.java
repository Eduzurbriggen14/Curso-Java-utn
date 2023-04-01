package ejercicio5_inicio;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Producto> ListaProductos= new ArrayList<>();//creamos una lista de arreglos donde agregaremos los productos
		
		// creamos tres prodcutos
		Producto p1= new Producto("chicle", 1, 50, "chicle sabor frutilla", 20);
	
		
		Producto p2= new Producto("alfajor", 2, 150, "añfajor de chocolate", 15);
		
		
		Producto p3= new Producto("gaseosa", 3, 200, "gaseosa sabor lima-limon", 50);
		
		// agregamos los productos a la lista de arreglos
		ListaProductos.add(p1);
		ListaProductos.add(p2);
		ListaProductos.add(p3);
		
		double montoTotal= 0.0;
		
		for(Producto precio: ListaProductos) {
			
			montoTotal= precio.getPrecio();
			
			
			
			
			
			
			
		}
			
	}

}
