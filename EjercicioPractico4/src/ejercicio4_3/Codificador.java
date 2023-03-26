package ejercicio4_3;

public class Codificador {

	String palabra;
	int desplazamiento;
	char[] abc= new char[]{'a','b','c', 'd','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
	
	public Codificador(String pal, int despl) {
		
		this.palabra= pal;
		this.desplazamiento=despl;
	}
		
	public String codificar() {
		
			for (int i=0; i< palabra.length(); i++) {
			
				char caracter= palabra.charAt(i);
			
				for (int j=0; j<abc.length; j++) {
				
					if (caracter==abc[j]){
					
						palabra= palabra.replace(caracter, abc[j+desplazamiento]);
					
					
				}
			}
		} return palabra;
		
	}
	
	public String decodificar() {
		
		for (int i=0; i< palabra.length(); i++) {
			
			char caracter= palabra.charAt(i);
	
			for (int j=0; j<abc.length; j++) {
		
				if (caracter==abc[j]){
			
					palabra= palabra.replace(caracter, abc[j-desplazamiento]);
				}
			}
		}
		
		return palabra;
		
	}
	
}
