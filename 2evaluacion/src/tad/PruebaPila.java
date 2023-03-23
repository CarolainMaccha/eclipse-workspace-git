package tad;

public class PruebaPila {

	public static void main(String[] args) {
		PilaDeObjetos pila = new PilaEstática();
		for (int i = 0; i < 10; i++) {
			pila.push(i);
		}
		while (!pila.isEmpty()) {
			Object o = pila.pop();
			System.out.print(o);
		}
	}

}
