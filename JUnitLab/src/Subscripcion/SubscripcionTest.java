package Subscripcion;
import static org.junit.Assert.*;

import org.junit.Test;

public class SubscripcionTest {

	@Test
	public void testprecioPorMes() {
		double esperado = 100;
		Subscripcion s = new Subscripcion(200, 2);
		double resultado = s.precioPorMes();
		assertEquals(esperado, resultado, 0);
	}

	@Test
	public void testprecioPorMes2() {
		double esperado = 67.66666666666667;
		Subscripcion s = new Subscripcion(200, 3);
		double resultado = s.precioPorMes();
		assertEquals(esperado, resultado, 0);
	}
}
