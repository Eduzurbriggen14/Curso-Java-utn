package ejercicio5_inicio;

public class ItemCarrito {

	public int cantidad;
	Producto producto;

	public ItemCarrito() {

	}

	public ItemCarrito(Producto producto, int cantidad) {

		this.producto = producto;
		this.cantidad = cantidad;
	}

	public Producto getProducto() {

		return producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/*public double tieneStock() {

		if (producto.getCantidad() > 0) {

			System.out.println("hay Stock");

		} else {
			System.out.println("no hay Stock");
		}

		return this.cantidad * producto.getPrecio();

	}*/
	
	

	public void actualizar_stock() {

		producto.setCantidad(producto.getCantidad() - cantidad);
		
	}
}



/*public double precio() {

try {
	if(Producto.stock()==true) {
		
		double precioUnidad= producto.getPrecio();
		
		return this.cantidad * precioUnidad;
		
		
	}
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}*/

