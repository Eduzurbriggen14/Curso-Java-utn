package expresionesRegulares;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String archivo = "C:\\ExpresionesRegulares\\src\\archivo\\expresionesRegulares.txt";

		String patronRegex = "[A-Za-z]+@[a-z]+\\.[a-z]+";

		Pattern patron = Pattern.compile(patronRegex);

		try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {

			String linea;

			while ((linea = lector.readLine()) != null) {

				Matcher coincidencia = patron.matcher(linea);

				if (coincidencia.find()) {

					System.out.println("en la linea " + linea + " hay una coincidencia");
				} else {
					System.out.println("no hay coincidencia en la linea " + linea);
				}

			}

		} catch (IOException e) {
			System.out.println("se produjo un error al leer el archivo" + e.getMessage());
		}

		System.out.println("------********************************------");

		String archivo1 = "C:\\\\ExpresionesRegulares\\\\src\\\\archivo\\\\expresionesRegulares.txt";
		String patronRegex1 = "[0-9]";

		Pattern patron1 = Pattern.compile(patronRegex1);

		try (BufferedReader lector = new BufferedReader(new FileReader(archivo1))) {

			String linea1;

			while ((linea1 = lector.readLine()) != null) {
				
				Matcher coincidencia = patron1.matcher(linea1);

				if (coincidencia.find()) {

					System.out.println("en la linea " + linea1 + " hay una coincidencia");
				}
				

			}

		} catch (IOException e) {
			System.out.println("se produjo un error al leer el archivo" + e.getMessage());
		}

	}

}
