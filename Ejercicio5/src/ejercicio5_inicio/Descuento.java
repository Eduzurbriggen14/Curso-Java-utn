package ejercicio5_inicio;

public class Descuento {
	
	private String tipo;
	
	public Descuento() {}
	
	public Descuento(String tipo) {
		this.tipo=tipo;
		
		System.out.println("El tipo de descuento es: " + tipo);
	}
	
	
public static class desc_tarjeta extends Descuento {
	
	private double desc;
	
	public desc_tarjeta() {}
	
	public desc_tarjeta(double desc, String tipo) {
		this.desc=desc;
		
		
	}
	
	public double calcular_desc() {
		
		double Total= 
	}
	
	
	
}
	
}
