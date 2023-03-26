package ejercicio4_3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SalidaArch {
	
	String txt;
	String path;
	
	
	public SalidaArch(String text, String ruta_salida) {
		this.txt= text;
		this.path= ruta_salida;
		
		
	}
	
	public void escribirArchivo() {
		
		try {
			
			Files.writeString(Paths.get(path), txt);
			
		}
		catch (IOException e) {
			e.printStackTrace();
			
		}
	System.out.println("salio todo bien");	
	}

}
