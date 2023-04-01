package ejercicio5_inicio;

public class Producto {
	
	private String nombre;
	private int id;
	private double precio;
	private String descripcion;
	private int cantidad; 
	
	
	public Producto() {}
	
	
	public Producto(String nombre, int id, double precio, String descripcion, int cantidad) {
		
		this.nombre= nombre;
		this.id= id;
		this.precio= precio;
		this.descripcion=descripcion;
		this.cantidad=cantidad;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public int getCantidad() {
		return cantidad;
	}



	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	public boolean stock() {
		
		boolean stock= cantidad>0 ? true:false;
		
		return stock;
	}
	
	
	

	

}
