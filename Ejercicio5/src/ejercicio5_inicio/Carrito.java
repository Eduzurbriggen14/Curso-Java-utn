package ejercicio5_inicio;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
	
	private List <ItemCarrito> items = new ArrayList<>();
	Producto producto;
	
	
	
	public Carrito(){
		
	}
	
	public void agregar_item(Producto producto) {
		
		if (producto.stock()) {
			
			System.out.println("hay Stock");
			items.addAll(producto);
		}
		else {
			System.out.println("No hay stock disponible del producto" + producto.getNombre());
		}
		
	}
	
	
		
	public void montoTotal(ItemCarrito items) {
		
		for (ItemCarrito precio: items) {
				
			
		}
	}
	
	

}
