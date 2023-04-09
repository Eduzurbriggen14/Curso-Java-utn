package ejercicio5_carrito;

public class Carrito_compra {
	
	//atributos
	public int id_carrito_compra;
	public String fecha_compra;
	public double total_compra;
	
	//contructor
	public Carrito_compra() {}
	
	//metodos getter y setter
	public int getId_carrito_compra() {
		return id_carrito_compra;
	}

	public void setId_carrito_compra(int id_carrito_compra) {
		this.id_carrito_compra = id_carrito_compra;
	}

	public String getFecha_compra() {
		return fecha_compra;
	}

	public void setFecha_compra(String fecha_compra) {
		this.fecha_compra = fecha_compra;
	}

	public double getTotal_compra() {
		return total_compra;
	}

	public void setTotal_compra(double total_compra) {
		this.total_compra = total_compra;
	}
	
	//metodos de la clase
	
	public double total(Item_carrito objeto) {
		
		return this.total_compra += objeto.total_item;
		
		
	}
	
	
	
	

}
