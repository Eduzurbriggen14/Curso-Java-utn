package ejercicio4_3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EntradaArch {
	
	String path;
	String txtnuevo;
	
	public EntradaArch(String ruta_entrada) {
		this.path=ruta_entrada;
	}
	
	public void escribirTxt(String ingresoTxt) {
		
			try {
			
				Files.writeString(Paths.get(path), ingresoTxt);
				
			
			}
			catch (IOException e) {
				e.printStackTrace();
			
			}
	}
	
	
	public String leerArchivo() {
		
		try {
			for (String linea: Files.readAllLines(Paths.get(path))) {
				
				return linea;
			}
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
		return "";
	}
	

}
