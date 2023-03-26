package ejercicio4;

import java.util.Arrays;

public class Ejercicio4_1a {
	
	public Ejercicio4_1a() {}
	
	public int[] arreglo= new int[3];
	
	public void ordenarNros(int nro1, int nro2, int nro3, char eleccion_mayuscula) {
		int arreglo[] = { nro1, nro2, nro3 };
		if (eleccion_mayuscula=='A') {

			for (int i = 0; i < arreglo.length - 1; i++) {
				int minimo = i;
				
				for (int j = i + 1; j < arreglo.length; j++) {
					if (arreglo[j] < arreglo[minimo]) {
						minimo = j;
					}

				}

				if (i != minimo) {
					
					int aux = arreglo[i];
					arreglo[i] = arreglo[minimo];

					arreglo[minimo] = aux;

				}

			}

		}
		if (eleccion_mayuscula=='D') {

			for (int i = 0; i < arreglo.length - 1; i++) {
				int maximo = i;
				
				for (int j = i + 1; j < arreglo.length; j++) {
					if (arreglo[j] > arreglo[maximo]) {
						maximo = j;
					}

				}

				if (i != maximo) {
					
					int aux = arreglo[i];
					arreglo[i] = arreglo[maximo];
					arreglo[maximo] = aux;

				}

			}

		}
		mostrar(arreglo);
		
	}
	
	public void mostrar(int[] arreglo) {
		System.out.println(Arrays.toString(arreglo));
		
		
	}

}
