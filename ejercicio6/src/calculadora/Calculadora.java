package calculadora;

public class Calculadora {
	
	private double n1;
	private double n2;
	private double resultado;
	
	public Calculadora() {}
	
	public Calculadora(double n1, double n2) {
		
		this.n1=n1;
		this.n2=n2;
		
	}
	
	public double sumar(double n1, double n2) {
		resultado= n1+n2;
		return resultado;
	}
	
	public double resta(double n1, double n2) {
		resultado= n1-n2;
		return resultado;
	}
	
	public double mult(double n1, double n2) {
		resultado= n1*n2;
		return resultado;
	}
	
	public double div(double n1, double n2) {
		
		if (n1!=0 && n2!=0) {
		
			 resultado= n1/n2;
		}
		return resultado;
	}
	
	
	
	
	
	
}
	
	