package hlf;

public class JuegoHLF {

	public static void main(String[] args) {
		Tablero t1 = new Tablero(8, '*');
		t1.setCasilla(3, 3, ' ');
		t1.setCasilla(4, 2, 'i');
		System.out.println(t1);
		System.out.println(t1.getCasilla(4, 2));
	}
}