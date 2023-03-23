package calculadora;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSumar() {
		int esperado = 8;
		int a = 5;
		int b = 3;
		int sumar = Calculadora.sumar(a, b);
		assertEquals(esperado, sumar);
	}

	@Test
	void testRestar() {
		int esperado = 2;
		int a = 5;
		int b = 3;
		int resta =  Calculadora.restar(a, b);
		assertEquals(esperado, resta);
	}

	@Test
	void testDividir() {
		int esperado = 4;
		int a = 20;
		int b = 5;
		int division = Calculadora.dividir(a, b);
		assertEquals(esperado, division);
		try {
			division = Calculadora.dividir(a, b);
			assertEquals(esperado, division);
		} catch (Exception e) {
			fail();
		}
	}

	@Test
	void testMultiplicar() {
		int esperado = 15;
		int a = 5;
		int b = 3;
		int multiplicacion =  Calculadora.multiplicar(a, b);
		assertEquals(esperado, multiplicacion);
	}

}
