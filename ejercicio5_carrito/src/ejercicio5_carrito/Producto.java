package ejercicio5_carrito;

public class Producto {

	// atributos o propiedades
	public int idProducto;
	public double precio_unidad;
	public String descripcion;

	// contructor
	public Producto() {}

	// metodos geter y setter
	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public double getPrecio_unidad() {
		return precio_unidad;
	}

	public void setPrecio_unidad(double precio_unidad) {
		this.precio_unidad = precio_unidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	// metodos de la clase

	public void leer_mostrar(int idProducto, double precio_unidad, String descripcion) {

		this.idProducto = idProducto;
		this.precio_unidad = precio_unidad;
		this.descripcion = descripcion;

	}

}
