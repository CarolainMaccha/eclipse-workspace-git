package tad;

public class PruebaPilaE {

	public static void main(String[] args) {
		Pila<String> pila = new PilaE<String>();
		for (int i = 0; i < 10; i++) {
			String a="hola"+i;
			pila.push(a);
		}
		while (!pila.isEmpty()) {
			Object o = pila.pop();
			System.out.print(o);
		}

	}

}
