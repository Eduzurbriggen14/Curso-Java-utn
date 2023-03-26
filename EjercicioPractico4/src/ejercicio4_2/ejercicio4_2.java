package ejercicio4_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ejercicio4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ruta= "C:\\EjercicioPractico4\\numeros.txt";
		String opcion= "multiplicion";
		
		opLeer(ruta, opcion);
		
	

	}
	
	public static void opLeer(String ruta, String opcion) {
		
		int suma=0;
		int multiplicacion=1;
		String [] arrayNum= new String[10];
		
		try {
			
			for (String linea : Files.readAllLines(Paths.get(ruta))) {
			
				System.out.println("Los numeros son: "+ linea + "\n");
				
				arrayNum= linea.split(" ");
				
				for (int i=0; i<arrayNum.length; i++) {
					
					if (opcion=="suma") {
						suma += Integer.parseInt(arrayNum[i]);				
					}
					else {
						multiplicacion *= Integer.parseInt(arrayNum[i]);						
					}					
			
				}
				
				if (opcion=="suma") {
					System.out.println("la suma total es: "+ suma);
					}
					else {
						System.out.println("la multiplicacion total es: "+ multiplicacion);
					}
				
			
			
			}
		
			
		}
		catch  (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

