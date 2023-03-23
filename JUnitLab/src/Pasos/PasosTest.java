package Pasos;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Operador.OperadorAritmetico;

class PasosTest {

	@Test
	void testValoracion1() {
		String esperado = "Lleva una vida sedentaria";
		Pasos carol=new Pasos(500);
		String valoracion = carol.valoracion();
		assertEquals(esperado, valoracion);
	}
	@Test
	void testValoracion2() {
		String esperado = "Lleva una vida poco activa";
		Pasos carol=new Pasos(1500);
		String valoracion = carol.valoracion();
		assertEquals(esperado, valoracion);
	}
	@Test
	void testValoracion3() {
		String esperado = "Se acerca el objetivo";
		Pasos carla=new Pasos(3800);
		String valoracion = carla.valoracion();
		assertEquals(esperado, valoracion);
	}
	@Test
	void testValoracion4() {
		String esperado = "No está mal";
		Pasos carlos=new Pasos(5000);
		String valoracion = carlos.valoracion();
		assertEquals(esperado, valoracion);
	}
	@Test
	void testValoracion5() {
		String esperado = "Así se hace";
		Pasos tomas=new Pasos(6500);
		String valoracion = tomas.valoracion();
		assertEquals(esperado, valoracion);
	}






}
