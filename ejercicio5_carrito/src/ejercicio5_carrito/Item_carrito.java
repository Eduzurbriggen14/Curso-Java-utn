package ejercicio5_carrito;

public class Item_carrito {
	
	//atributos
		public int id_item_carrito;
		public double total_item;
		public double cantidad;
		
		//constructor
		public Item_carrito() {}
		
		//metodos getter y setter
		public int getId_item_carrito() {
			return id_item_carrito;
		}

		public void setId_item_carrito(int id_item_carrito) {
			this.id_item_carrito = id_item_carrito;
		}

		public double getTotal_item() {
			return total_item;
		}

		public void setTotal_item(double total_item) {
			this.total_item = total_item;
		}

		public double getCantidad() {
			return cantidad;
		}

		public void setCantidad(double cantidad) {
			this.cantidad = cantidad;
		}
		
		//metodos de la clase
		
		public void leer_mostrar() {}
		
		public void leer_cargar(Producto objeto, double cantidad) {
			
			this.id_item_carrito= objeto.idProducto;
			this.cantidad= cantidad;		
			this.total_item= objeto.precio_unidad * cantidad;
			
		}

}
