package BolsaSorpresa;
public class PruebaBolsaSorpresa {

	public static void main(String[] args) {
		BolsaSorpresa<Integer> bolsa = new BolsaSorpresa<Integer>(5);
		bolsa.put(1);
		bolsa.put(2);
		bolsa.put(3);
		bolsa.put(4);
		bolsa.put(5);
		System.out.println("¿la bolsa está vacía?: " + bolsa.isEmpty());
		System.out.println("¿la bolsa está llena?: " + bolsa.isFull());
		System.out.println("la bolsa contiene:");
		for (int i = 0; i < 5; i++) {
			System.out.println(bolsa.get(i));
		}
		System.out.println("conseguir un elemento random de la bolsa:");
		System.out.println(bolsa.getRandom());
		System.out.println("la bolsa contiene:");
		for (int i = 0; i < 5; i++) {
			System.out.println(bolsa.get(i));
		}

	}

}
