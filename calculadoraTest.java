package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculadoraTest {

	@Test
	void sumarTest() {
		double resultado = calculadora.sumar(2, 2);
		assertEquals(resultado, 4);
		
	}
	
	@Test
	void restarTest() {
		double resultado = calculadora.restar(4, 20);
		assertEquals(resultado,-16);
		
	}
	
	@Test
	void dividirTest() {
		double resultado = calculadora.dividir(4, 2);
		assertEquals(resultado, 2);
		
	}
	
	@Test
	void multiplicarTest() {
		double resultado = calculadora.multiplicar(80, 3);
		assertEquals(resultado, 240);
		
	}
	
	@Test
	void operacionEspecilATest() {
		double resultadosuma = calculadora.sumar(180, 150);
		double resultadoFinal = calculadora.dividir(resultadosuma,3);
		assertEquals(resultadoFinal, 110);
		
	}
	
	@Test
	void operacionEspecilBTest() {
		double resultadosuma = calculadora.sumar(180, 150);
		double resultadoFinal = calculadora.dividir(resultadosuma,3);
		assertEquals(resultadoFinal, 110);
		
	}
	
	@Test
	void operacionEspecilCTest() {
		double resultadoresta = calculadora.restar(90,50);
		double resultadoFinal = calculadora.multiplicar(resultadoresta,3);
		assertFalse(resultadoFinal== 605);
		
	}
	
	@Test
	void operacionEspecilDTest() {
		double resultadosumar = calculadora.sumar(70, 40);
		double resultadoFinal = calculadora.multiplicar(resultadosumar,25);
		assertFalse(resultadoFinal== 2700);
		
	}

}
