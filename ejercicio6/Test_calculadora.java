package calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test_calculadora {
	
	/*double resultado;
	
	@Test
	public void test_suma() {
		double n1=80.0;
		double n2=3.0;
		
		Calculadora calc= new Calculadora();
		
		double resExp= 82.0;
		
		double resultado= calc.sumar(n1,n2);
		
		assertEquals(resExp, resultado,0.0);
		
		
		
	}
	
	@Test
	public void test_resta() {
		
		double n1= 80.0;
		double n2= 3.0;
		
		Calculadora calc1= new Calculadora();
		
		double resExp1= 83.0;
		
		double resultado= calc1.resta(n1, n2);
		
		assertEquals(resExp1, resultado, 0.0);
		
		
	}
	
	@Test
	public void test_mult() {
		
		double n1= 80.0;
		double n2= 3.0;
		
		Calculadora calc2= new Calculadora();
		
		double resExp2= 240.0;
		
		double resultado= calc2.mult(n1, n2);
		
		assertEquals(resExp2, resultado, 0.0);
		
		
	}
	
	@Test 
	public void test_div() {
		
		double n1= 80.0;
		double n2= 2.0;
		
		Calculadora calc3= new Calculadora();
		
		double resExp2= 40.0;
		
		double resultado= calc3.mult(n1, n2);
		
		assertEquals(resExp2, resultado, 0.0);
		
	}
	
	@Test
	public void test2() {
		
		double n1= 150;
		double n2= 180;
		double n3= 3;
		
		Calculadora calc= new Calculadora();
		
		double resExp= 110;
		
		double resultado= (calc.sumar(n1, n2))/n3;
		
		assertEquals(resExp, resultado, 0.0);
		
	}*/
	
	@Test
	public void test3() {
		double n1= 90;
		double n2= 50;
		double n3= 15;
		
		Calculadora calc= new Calculadora();
		
		double resExp= 605;
		
		double resultado= (calc.resta(n1, n2))*n3;
		
		assertEquals(resExp, resultado, 0.0);
		
		
	}
	
	@Test
	public void test4() {
		double n1= 70;
		double n2= 40;
		double n3= 25;
		
		Calculadora calc= new Calculadora();
		
		double resExp= 2700;
		
		double resultado= (calc.sumar(n1, n2))*n3;
		
		assertEquals(resExp, resultado, 0.0);
		
		
	}
	

}
