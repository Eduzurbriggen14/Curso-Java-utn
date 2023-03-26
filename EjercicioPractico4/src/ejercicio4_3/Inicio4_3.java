package ejercicio4_3;

import java.util.Scanner;

public class Inicio4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ruta_entrada= "C:\\EjercicioPractico4\\src\\ejercicio4_3\\.entrada.txt";
		String ruta_salida= "C:\\EjercicioPractico4\\src\\ejercicio4_3\\.salida.txt";
		
		
		String ingresoTxt;
		/*String ingresoTxtdecodificar;*/
		
		
		
		
		
		
		
		System.out.println("ingrese tipo de operacion: C para Codificacion o D para Decodificacion");
		Scanner entrada= new Scanner(System.in);
		char elec= (entrada.nextLine()).charAt(0);		
		char eleccionMayusc= Character.toUpperCase(elec);
		
		
		System.out.println("ingrese el numero de desplazamiento: ");
		Scanner entrada1= new Scanner(System.in);
		int desplazamiento= entrada1.nextInt();
		
		
		
		if (eleccionMayusc=='C') {
			
			System.out.println("ingrese un texto:");
			Scanner entrada3= new Scanner(System.in);
			ingresoTxt= entrada3.nextLine();
			System.out.println("estoy aca");
		
			EntradaArch entr= new EntradaArch(ruta_entrada);
			entr.escribirTxt(ingresoTxt);
			
			Codificador cod= new Codificador(entr.leerArchivo(), desplazamiento);
			
			SalidaArch salid_cod= new SalidaArch(cod.codificar(),ruta_salida);
			
			salid_cod.escribirArchivo();
			
		}
			
		else if(eleccionMayusc=='D') {
			
			System.out.println("ingrese un texto:");		
			Scanner entrada4= new Scanner(System.in);
			ingresoTxt= entrada4.nextLine();			
			
			EntradaArch entr= new EntradaArch(ruta_entrada);
			entr.escribirTxt(ingresoTxt);
			
			Codificador decod= new Codificador(entr.leerArchivo(), desplazamiento);
			
			SalidaArch salid_decod= new SalidaArch(decod.decodificar(),ruta_salida);
			
			salid_decod.escribirArchivo();
			
		}
		
		else {
			
			System.out.println("opcion incorrecta, no existe");
		}
			
			
			
			
			
				
			
	}
}

		
		
		
		
		
		
		

	


