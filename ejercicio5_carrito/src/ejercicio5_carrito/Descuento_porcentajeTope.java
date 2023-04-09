package ejercicio5_carrito;

import java.util.Scanner;

public class Descuento_porcentajeTope extends Descuento {
	
	public Descuento_porcentajeTope() {}
	
	public double desc_tope=35;
	
	int desc_auxiliar=0;

	
	public int getDesc_auxiliar() {
		return desc_auxiliar;
	}


	public void setDesc_auxiliar(int desc_auxiliar) {
		this.desc_auxiliar = desc_auxiliar;
	}


	public double aplicar_descuento_porcentajeTope(double valor , double descuento_porcentaje) {
		
		double total_con_descuento_tope = 0;
		
		do {
			if (descuento_porcentaje <desc_tope) {
				
				total_con_descuento_tope= valor - ((valor*descuento_porcentaje)/100);
				
			}
			else {
				System.out.println("no se puede efectuar un descuento mayor al 35% \nIngrese un nuevo descuento");
				
				Scanner ingreso= new Scanner(System.in);
				descuento_porcentaje= ingreso.nextDouble();
				descuento_porcentaje= desc_auxiliar;
				
				
			}

		}while(descuento_porcentaje>35);
		
		return total_con_descuento_tope;
		
	}
}
