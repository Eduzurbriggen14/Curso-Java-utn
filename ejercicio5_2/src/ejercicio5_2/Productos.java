package ejercicio5_2;

public class Productos {
	
	private String nombre_prod;
	private int cant_prod;
	private float precio_prod;
	float precio_total = 0;
	
	public Productos() {}
	
	public String getNombre_prod() {
		return nombre_prod;
	}
	public void setNombre_prod(String nombre_prod) {
		this.nombre_prod = nombre_prod;
	}
	public int getCant_prod() {
		return cant_prod;
	}
	public void setCant_prod(int cant_prod) {
		this.cant_prod = cant_prod;
	}
	public float getPrecio_prod() {
		return precio_prod;
	}
	public void setPrecio_prod(float precio_prod) {
		this.precio_prod = precio_prod;
	}
	
	
	public float Carrito_precio() {
		float precio_total = cant_prod*precio_prod;
		return precio_total;
	}
}
}
